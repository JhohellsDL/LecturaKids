package com.jdlstudios.lecturakids.ui.screens

import android.content.ContentValues
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Canvas
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.Environment
import android.provider.MediaStore
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback
import com.jdlstudios.lecturakids.LecturaApplication
import com.jdlstudios.lecturakids.R
import com.jdlstudios.lecturakids.data.entities.ReadingEntity
import com.jdlstudios.lecturakids.databinding.FragmentEndReadingBinding
import com.jdlstudios.lecturakids.domain.utils.Utils
import com.jdlstudios.lecturakids.ui.viewmodels.InformationViewModel
import com.jdlstudios.lecturakids.ui.viewmodels.InformationViewModelFactory
import java.io.IOException
import java.io.OutputStream

@RequiresApi(Build.VERSION_CODES.O)
class EndReadingFragment : Fragment() {

    private lateinit var binding: FragmentEndReadingBinding
    private var mInterstitialAd: InterstitialAd? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentEndReadingBinding.inflate(inflater)

        MobileAds.initialize(requireContext()) {}
        val adRequest = AdRequest.Builder().build()
        binding.adView6.loadAd(adRequest)


        InterstitialAd.load(requireContext(),"ca-app-pub-8897050281816485/3800456004", adRequest, object : InterstitialAdLoadCallback() {
            override fun onAdFailedToLoad(adError: LoadAdError) {
                mInterstitialAd = null
            }

            override fun onAdLoaded(interstitialAd: InterstitialAd) {
                mInterstitialAd = interstitialAd
            }
        })


        val safeArgs: EndReadingFragmentArgs by navArgs()

        val score: Int = safeArgs.endingItem.score
        val title: String = safeArgs.endingItem.title
        val time: Int = safeArgs.endingItem.time
        val level: Int = safeArgs.endingItem.level
        val percentage: Int = safeArgs.endingItem.percentage
        val answersCorrect: Int = safeArgs.endingItem.answersCorrect
        val image: Int = safeArgs.endingItem.image


        when (score) {
            in 81..100 -> {
                binding.txtMessageCongratulations.setText(R.string.message_congratulations)
                binding.txtMessage.setText(R.string.message_completion_correct)
            }

            in 61..80 -> {
                binding.txtMessageCongratulations.setText(R.string.message_felicitations)
                binding.txtMessage.setText(R.string.message_completion)
            }

            else -> {
                binding.txtMessageCongratulations.setText(R.string.message_attention)
                binding.txtMessage.setText(R.string.message_retry)
            }
        }

        binding.readingImage.setImageResource(image)
        binding.textScore.text = String.format("%d pts", score)
        binding.txtTitleReading.text = title
        binding.textTime.text = Utils.convertSecondsTime(time)
        binding.textAnswerCorrects.text = answersCorrect.toString()

        //--------------------------------- Para el VIEWMODEL --------------------------------------------------------------
        val application = requireNotNull(this.activity).application

        val viewModel: InformationViewModel by viewModels {
            InformationViewModelFactory((application as LecturaApplication).repository)
        }
        //-------------------------------------------------------------------------------------------------------------------

        val readingEntity: ReadingEntity = Utils.toReadingEntity(
            title = title,
            date = Utils.getDateCurrentTime(),
            time = Utils.convertSecondsTime(time),
            level = level,
            percentage = percentage,
            answersCorrect = answersCorrect,
            score = score,
            image = image
        )

        binding.btnTerminar.setOnClickListener {

            if (mInterstitialAd != null) {
                mInterstitialAd?.show(requireActivity())
            } else {
                Log.d("TAG", "The interstitial ad wasn't ready yet.")
            }

            viewModel.insert(readingEntity)
            it.findNavController().navigate(R.id.action_endReadingFragment_to_informationFragment)
        }

        binding.layoutShared.setOnClickListener {
            captureAndSaveImage()
        }

        return binding.root
    }

    private fun captureAndSaveImage() {

        var message =
            "¡Hoy tuve una increíble sesión de lectura en mi app! Mejoré mi comprensión de lectura. ¡Siento cómo mi habilidad está creciendo día a día! #Lectura #Mejora #Aprendizaje\n\n¡Echa un vistazo a esta increíble aplicación\n"
        message += "https://play.google.com/store/apps/details?id=com.jdlstudios.lecturakids"

        val screenshot = captureFragmentScreen(requireParentFragment())
        val imagePath = screenshot?.let {
            saveImage(it)
        }
        if (imagePath != null) {
            shareImage(imagePath, message)
        } else {
            Toast.makeText(requireContext(), "Oops!", Toast.LENGTH_SHORT).show()
        }
    }

    private fun captureFragmentScreen(fragment: Fragment): Bitmap? {

        val view = fragment.view

        val bitmap =
            view?.let { Bitmap.createBitmap(it.width, view.height - 500, Bitmap.Config.ARGB_8888) }

        val canvas = bitmap?.let { Canvas(it) }
        if (view != null) {
            view.draw(canvas)
        } else {
            Log.i("asd", "-- no hay captura dentro!")
        }

        return bitmap
    }

    private fun saveImage(image: Bitmap): Uri? {
        val contentValues = ContentValues().apply {
            put(MediaStore.MediaColumns.DISPLAY_NAME, "screenshot.jpg")
            put(MediaStore.MediaColumns.MIME_TYPE, "image/jpeg")
            put(
                MediaStore.MediaColumns.RELATIVE_PATH,
                Environment.DIRECTORY_PICTURES + "/MyAppScreenshots"
            )
        }

        val resolver = requireContext().contentResolver
        var outputStream: OutputStream? = null
        val imageUri: Uri?
        try {
            val contentUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            imageUri = resolver.insert(contentUri, contentValues)
            imageUri?.let {
                outputStream = resolver.openOutputStream(it)
                image.compress(Bitmap.CompressFormat.JPEG, 90, outputStream)
                outputStream?.flush()
            }
        } catch (e: IOException) {
            e.printStackTrace()
            return null
        } finally {
            try {
                outputStream?.close()
            } catch (e: IOException) {
                e.printStackTrace()
            }
        }

        return imageUri
    }

    private fun shareImage(imagePath: Uri, message: String) {
        val intent = Intent(Intent.ACTION_SEND_MULTIPLE)
        intent.type = "image/jpeg"
        intent.putExtra(Intent.EXTRA_STREAM, imagePath)
        intent.putExtra(Intent.EXTRA_TEXT, message)
        startActivity(Intent.createChooser(intent, "Compartir imagen"))
    }

}
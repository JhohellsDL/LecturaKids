package com.jdlstudios.lecturakids.domain.usescases

import android.util.Log
import com.jdlstudios.lecturakids.data.repositories.provider.ReadingBeginnerProvider
import com.jdlstudios.lecturakids.domain.models.ReadingItem

class GetRandomReadingBeginnerUseCase(
    private val readingBeginnerRepository: ReadingBeginnerProvider
) {
    operator fun invoke(): ReadingItem {

        val size: Int = readingBeginnerRepository.loadReadingBeginner().size
        val numberRandom = (0 until size).random()

        Log.i("lectura", "Size: $numberRandom")

        return readingBeginnerRepository.loadReadingBeginner()[numberRandom]
    }
}
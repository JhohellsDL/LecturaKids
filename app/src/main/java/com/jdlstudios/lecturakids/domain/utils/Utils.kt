package com.jdlstudios.lecturakids.domain.utils

import android.os.Build
import androidx.annotation.RequiresApi
import com.jdlstudios.lecturakids.data.entities.ReadingEntity
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

object Utils {
    @RequiresApi(Build.VERSION_CODES.O)
    fun getDateCurrentTime(): String {
        val formato = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm")
        return LocalDateTime.now().format(formato)
    }

    fun toReadingEntity(
        title: String,
        date: String,
        answersCorrect: Int,
        time: String,
        score: Int
    ): ReadingEntity {
        return ReadingEntity(
            title = title,
            date = date,
            time = time,
            answerCorrects = answersCorrect,
            score = score
        )
    }

    fun convertSecondsTime (seconds: Int): String {
        val hours = seconds / 3600
        val minutes = (seconds % 3600) / 60
        val secondsRemaining = seconds % 60
        return String.format ("%02d:%02d:%02d", hours, minutes, secondsRemaining)
    }

}
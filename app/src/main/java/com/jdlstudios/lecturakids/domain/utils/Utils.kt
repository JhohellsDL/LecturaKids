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
        time: String,
        level: Int,
        percentage: Int,
        answersCorrect: Int,
        score: Int
    ): ReadingEntity {
        return ReadingEntity(
            title = title,
            date = date,
            time = time,
            level = level,
            percentage = percentage,
            answerCorrects = answersCorrect,
            score = score
        )
    }

    fun convertSecondsTime(seconds: Int): String {
        val hours = seconds / 3600
        val minutes = (seconds % 3600) / 60
        val secondsRemaining = seconds % 60
        return String.format("%02d:%02d:%02d", hours, minutes, secondsRemaining)
    }

    fun getDifficult(valor: Int): String {
        return when (valor) {
            1 -> "Fácil"
            2 -> "Intermedio"
            3 -> "Avanzado"
            else -> "valor inválido"
        }
    }

    fun getPercentage(valor: Int): Int {
        return valor * 25
    }

    fun getScore(time: Int, answersCorrect: Int): Int {
        val score: Int
        var timeAux = 60

        score = if (time < 60) {
            (answersCorrect * 10) + (timeAux)
        } else {
            timeAux -= (time - 60)
            if (timeAux < 0) {
                answersCorrect * 10
            } else {
                answersCorrect * 10 + timeAux
            }

        }

        return score
    }

}
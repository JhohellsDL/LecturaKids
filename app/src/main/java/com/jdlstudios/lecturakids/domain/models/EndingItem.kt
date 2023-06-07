package com.jdlstudios.lecturakids.domain.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class EndingItem(
    val title: String = "",
    val level: Int = 1,
    val percentage: Int = 0,
    val answersCorrect: Int = 0,
    val time: Int = 0,
    val score: Int = 0
) : Parcelable
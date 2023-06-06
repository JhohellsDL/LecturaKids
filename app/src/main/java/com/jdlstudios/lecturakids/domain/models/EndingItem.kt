package com.jdlstudios.lecturakids.domain.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class EndingItem(
    val title: String = "",
    val answersCorrect: Int = 0,
    val time: Int = 0,
    val score: Int = 0
) : Parcelable
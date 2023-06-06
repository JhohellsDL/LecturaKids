package com.jdlstudios.lecturakids.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "readings")
data class ReadingEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val title: String,
    val date: String,
    val time: String,
    val answerCorrects: Int,
    val score: Int
)


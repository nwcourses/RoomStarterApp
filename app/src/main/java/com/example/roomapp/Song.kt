package com.example.roomapp

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="songs")
data class Song (
    @PrimaryKey(autoGenerate = true) val id: Int,
    val title: String,
    val artist: String,
    val year: Int
)
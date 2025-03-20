package com.example.roomapp

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface SongDao {
    @Query("SELECT * FROM songs ORDER BY id")
    fun getAllSongs(): List<Song>

    @Query("SELECT * FROM songs WHERE id=:id")
    fun getSongById(id: Int) : Song?

    @Insert
    fun insert(song: Song) : Long

    @Update
    fun update(song: Song) : Int

    @Delete
    fun delete(song: Song) : Int
}
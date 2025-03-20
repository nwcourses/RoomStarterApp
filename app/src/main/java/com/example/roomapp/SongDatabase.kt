package com.example.roomapp

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Song::class), version = 1, exportSchema = false)
abstract class SongDatabase: RoomDatabase() {
    abstract fun songDao(): SongDao

    companion object {
        private var instance: SongDatabase? = null

        fun getDatabase(ctx:Context) : SongDatabase {
            var tmpInstance = instance
            if(tmpInstance == null) {
                tmpInstance = Room.databaseBuilder(
                    ctx.applicationContext,
                    SongDatabase::class.java,
                    "songDatabase"
                ).build()
                instance = tmpInstance
            }
            return tmpInstance
        }
    }
}
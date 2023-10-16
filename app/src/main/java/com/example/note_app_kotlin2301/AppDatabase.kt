package com.example.note_app_kotlin2301

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [User::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    //just testing the remote
    abstract fun userDao(): UserDao
}

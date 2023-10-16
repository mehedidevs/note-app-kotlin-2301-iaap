package com.example.note_app_kotlin2301

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    @PrimaryKey(autoGenerate = true)
    val uid: Int = 0,
    @ColumnInfo(name = "NAME")
    var names: String,
    @ColumnInfo(name = "MOBILE")
    var mobile: String,
    @ColumnInfo(name = "EMAIL")
    var email: String

)
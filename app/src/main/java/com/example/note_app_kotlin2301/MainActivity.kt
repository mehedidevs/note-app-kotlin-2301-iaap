package com.example.note_app_kotlin2301

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room
import com.example.note_app_kotlin2301.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            "contact-db"
        ).allowMainThreadQueries().build()


        binding.submitBtn.setOnClickListener {
            val name = binding.name.text.toString().trim()
            val email = binding.email.text.toString().trim()
            val mobile = binding.mobile.text.toString().trim()

            val user = User(names = name, email = email, mobile = mobile)
            db.userDao().insert(user)


        }


    }
}
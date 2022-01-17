package com.example.task1

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.task1.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val pref = getSharedPreferences("User1" , Context.MODE_PRIVATE)

        var sum = ""
        sum += "\nFirst Name : "
        sum += pref.getString("FName" , "null")
        sum += "\nLast Name : "
        sum += pref.getString("LName" , "null")
        sum += "\nUser Name : "
        sum += pref.getString("UserName" , "null")
        sum += "\nEducation : "
        sum += pref.getString("Education" , "null")
        sum += "\nCity : "
        sum += pref.getString("City" , "null")
        sum += "\nWork : "
        sum += pref.getString("Work" , "null")
        sum += "\nDate Of Birth : "
        sum += pref.getString("DOB" , "null")
        sum += "\nGender : "
        sum += pref.getString("Gender" , "null")

        binding.textViewgender.text = sum
    }
}
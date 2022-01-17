package com.example.task1

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import com.example.task1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val toSecondActivity =  Intent(this , DetailsActivity::class.java)
        val myPref = getSharedPreferences("User1" , Context.MODE_PRIVATE)
        val editor = myPref.edit()


        binding.buttonSubmit.setOnClickListener {
            var selectedGender = "No Gender Selected"
            val x: Int = binding.radioGroupGender.checkedRadioButtonId
            if (x != -1) {
                val selectedOption: RadioButton = findViewById(x)
                selectedGender = selectedOption.text.toString()
            }

            editor.apply{
                putString("Gender" , selectedGender)
                putString("FName" , binding.etFName.text.toString())
                putString("Education" , binding.etEducation.text.toString())
                putString("LName" , binding.etLName.text.toString())
                putString("Work" , binding.etWork.text.toString())
                putString("DOB" , binding.etDOB.text.toString())
                putString("City" , binding.etCity.text.toString())
                putString("UserName" , binding.etUserName.text.toString())
                apply()
            }

            startActivity(toSecondActivity)
            finish()
        }






    }
}
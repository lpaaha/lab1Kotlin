package com.example.animal


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView


class Activity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        var animalPicture2: ImageView = findViewById(R.id.imageView2)
        var animalDescription2: TextView = findViewById(R.id.textViewDescription2)
        var animalName2: TextView = findViewById(R.id.TextViewName2)

        var passName = intent.getStringExtra("passName")
        var passDescription = intent.getStringExtra("passDet")

        val bundle: Bundle? = intent.extras
        val passImage2: Int = bundle!!.getInt("passImage2")


        animalDescription2.text = passDescription
        animalName2.text = passName
        animalPicture2.setImageResource(passImage2)


    }
}

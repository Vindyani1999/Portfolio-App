package com.example.portfolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonSkills = findViewById<Button>(R.id.btnSkills)
        buttonSkills.setOnClickListener {
            intent = Intent(this,SkillsActivity::class.java )
            startActivity(intent)  //click the button, new page will be open up
        }

        val buttonWork = findViewById<Button>(R.id.btnWork)
        buttonWork.setOnClickListener {
            intent = Intent(this,WorkActivity::class.java)
            startActivity(intent)
        }

        val buttonEducation = findViewById<Button>(R.id.btnEducation)
        buttonEducation.setOnClickListener {
            intent = Intent(this,EducationActivity::class.java)
            startActivity(intent)
        }

        val buttonAchivement = findViewById<Button>(R.id.btnAchivements)
        buttonAchivement.setOnClickListener {
            intent = Intent(this,AchivementActivity::class.java)
            startActivity(intent)
        }

    }
}
package com.demo.fragmen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment1Button =findViewById<Button>(R.id.btn1)
        val fragment2Button= findViewById<Button>(R.id.btn2)

        val firstFragment=FirstFragment()
        val secondFragment=SecondFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fcl,firstFragment)
            commit()
        }

        fragment1Button.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fcl,firstFragment)
                addToBackStack(null)
                commit()
            }

        }

        fragment2Button.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fcl,secondFragment)
                addToBackStack(null)
                commit()
            }

        }

    }
}
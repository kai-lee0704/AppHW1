package com.example.hw1

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameEditText = findViewById<EditText>(R.id.editTextTextPersonName)
        val sexEditText = findViewById<EditText>(R.id.editTextTextPersonName2)


        val submit = findViewById<Button>(R.id.button)
        submit.setOnClickListener()
        {
            val bundle = Bundle()
            val intent = Intent(this, MainActivity2::class.java)
            startActivityForResult(intent, 1)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        data?.extras?.let {
            if (requestCode == 1 && resultCode == Activity.RESULT_OK) {
                findViewById<TextView>(R.id.textView5).text = "尺寸:  ${it.getString("size")}"
                findViewById<TextView>(R.id.textView6).text = "顏色:  ${it.getString("color")}"
            }
        }
    }
}
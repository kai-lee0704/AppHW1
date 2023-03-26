package com.example.hw1

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val submit = findViewById<Button>(R.id.button2)
        val sizeEditText =findViewById<EditText>(R.id.editTextTextPersonName3)
        val colorEditText =findViewById<EditText>(R.id.editTextTextPersonName4)



        submit.setOnClickListener()
        {
                val bundle = Bundle()
                bundle.putString("size",sizeEditText.text.toString())
                bundle.putString("color",colorEditText.text.toString())

                val intent = Intent()
                setResult(Activity.RESULT_OK,intent.putExtras(bundle))
                finish()
        }

    }
}
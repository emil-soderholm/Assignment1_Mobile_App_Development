package com.example.example2_1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editFirstName = findViewById<EditText>(R.id.edit_first_name)
        val editLastName = findViewById<EditText>(R.id.edit_last_name)
        val editPhone = findViewById<EditText>(R.id.edit_phone)
        val editComment = findViewById<EditText>(R.id.edit_comment)
        val buttonSend = findViewById<Button>(R.id.button_send)
        val buttonReset = findViewById<Button>(R.id.button_reset)

        buttonReset.setOnClickListener {
            editFirstName.text.clear()
            editLastName.text.clear()
            editPhone.text.clear()
            editComment.text.clear()
        }

        buttonSend.setOnClickListener {
            Toast.makeText(this, "Feedback Sent", Toast.LENGTH_SHORT).show()
            // Optional: clear fields after sending
            editFirstName.text.clear()
            editLastName.text.clear()
            editPhone.text.clear()
            editComment.text.clear()
        }
    }
}
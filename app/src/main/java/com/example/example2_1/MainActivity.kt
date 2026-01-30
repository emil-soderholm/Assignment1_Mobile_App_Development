package com.example.example2_1

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var lastTime: Long = 0

    private fun logElapsedTime(event: String) {
        val currentTime = System.currentTimeMillis()
        if (lastTime != 0L) {
            val elapsed = currentTime - lastTime
            Log.d("LifecycleLog", "$event: Elapsed time since last event: ${elapsed}ms")
        } else {
            Log.d("LifecycleLog", "$event: First event")
        }
        lastTime = currentTime
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        logElapsedTime("onCreate")
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

    override fun onStart() {
        super.onStart()
        logElapsedTime("onStart")
    }

    override fun onResume() {
        super.onResume()
        logElapsedTime("onResume")
    }

    override fun onPause() {
        super.onPause()
        logElapsedTime("onPause")
    }

    override fun onStop() {
        super.onStop()
        logElapsedTime("onStop")
    }

    override fun onRestart() {
        super.onRestart()
        logElapsedTime("onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        logElapsedTime("onDestroy")
    }
}
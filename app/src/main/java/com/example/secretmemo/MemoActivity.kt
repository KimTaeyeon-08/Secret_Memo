package com.example.secretmemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MemoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memo)

        val sharingButton = findViewById<FloatingActionButton>(R.id.floatingActionButton)
        val memo = findViewById<EditText>(R.id.memoline)

        sharingButton.setOnClickListener{
            val send = Intent().apply{
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT,memo.text.toString())
                type="text/plain"
            }
            val share = Intent.createChooser(send,null)
            startActivity(share)
        }


    }
}
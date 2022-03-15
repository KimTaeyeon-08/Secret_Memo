package com.example.secretmemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = Intent(this,MemoActivity::class.java)
        val msg = findViewById<TextView>(R.id.textView)

        val email = findViewById<TextView>(R.id.email)
        val password = findViewById<EditText>(R.id.pw)


        findViewById<Button>(R.id.button1).setOnClickListener{
            val emailText=email.text.toString()
            val passwordText = password.text.toString()

            if(emailText=="hi@naver.com"){
                if(passwordText=="12345678"){
                    Log.d("secret memo","통과")
                    startActivity(intent)
                    this.finish()
                }else{
                    Log.d("secret memo","비밀번호가 틀렸습니다")
                    msg.text="비밀번호가 틀렸습니다. 다시 입력 하세요."
                }

            }else{
                Log.d("secret memo","이메일이 틀렸습니다.")
                msg.text="이메일이 틀렸습니다. 다시 입력 하세요."

            }
        }

    }
}
package com.gpaststudio.kotlin_0930

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Myname : String // val : value의 줄임말, 상수
        var Myage : Int // var : variable 의 줄임말, 변수
        val Mysex : Boolean


        Log.e("변수값","Myname")


        clickBtn.setOnClickListener {

            Log.d("메인화로그", "클릭용 버튼 눌림")
            Log.e("메인화면로그","에러용메시지")
        }

        smallBtn.setOnClickListener {


            Toast.makeText(this, "작은 버튼 눌림", Toast.LENGTH_SHORT).show()
        }

    }
}
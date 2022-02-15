package com.neppplus.kotilnbasic_20220215

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        btnLog가 눌리면 어떤 코드를 실행할지, 할일을 설정.
        btnLog.setOnClickListener {

//            로그를 찍어보는 기능 실행. => btnLog가 클릭 될 때 마다 실행.
            Log.d("메인화면","로그 버튼 눌림")
            Log.d("메인화면", "추가 로그 찍어보기")
            Log.e("메인화면", "e로 로그 찍기")

        }

        btnToast.setOnClickListener {

            Toast.makeText(this, "토스트 자동완성 활용", Toast.LENGTH_SHORT).show()

        }

        btnVariable.setOnClickListener {

//            변수에 대한 문법 연습용 코드

//            본인의 이름을 변수에 담아보자. => 토스트로 띄우자.

            var myName : String
            myName = "이진실"
            myName = "김강사"

            val friendName : String
            friendName = "이선생"
//            friendName = "김선생"   val에는 새 값 교체 불가.

            Toast.makeText(this, friendName, Toast.LENGTH_SHORT).show()

            var myBirthYear : Int
            myBirthYear = 1994

            var myHeight : Double
            myHeight = 150.3


        }


    }
}
package com.example.asignment5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
                var number = textnum.text.toString().toInt()

                ADD.setOnClickListener {
                    if(number in 0..8){
                        number += 1
                        textnum.setText(number.toString())
                    }else{
                        Toast.makeText(applicationContext,"ไม่สามารถเพิ่มค่าได้แล้ว",Toast.LENGTH_SHORT).show()
                    }
                }
                MINUS.setOnClickListener{
                    if(number in 1..9) {
                        number -= 1
                        textnum.setText(number.toString())
                    }else if(number == 0){
                        Toast.makeText(applicationContext,"ไม่สามารถลดค่าได้แล้ว",Toast.LENGTH_SHORT).show()
                    }
                }
                RESET.setOnClickListener {
                    number = 0
                    textnum.setText(number.toString())

                }
            }
        }

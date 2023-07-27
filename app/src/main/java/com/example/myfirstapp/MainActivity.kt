package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button : Button = findViewById(R.id.btn)
        var txt2 : TextView = findViewById(R.id.txt_view)
        var count = 0
        button.setOnClickListener{
            count++
            txt2.text=count.toString()
            Toast.makeText(this@MainActivity,"I have been Clicked $count times",Toast.LENGTH_SHORT).show()
        }
        Log.d("Hello","MainActivity")
        //Variables and Datatypes
        //task1
//        var str:String = "Android MasterClass"
//        var float:Float = 13.37F
//        var double:Double = 3.14159265358979
//        var int1:Int = 25
//        var int2:Int = 2020
//        var int3:Long = 18881234567
//        var boolean:Boolean = true
//        var char:Char = 'a'
        //task2
//        val age = 19
//        if(age>=16&&age<=18){
//            println("You can Drive")
//        }else if(age>18&&age<=21){
//            println("You can Vote")
//        }else if(age>21&&age<=25){
//            println("You can Drink")
//        }else{
//           println("You Can Marry")
//        }
        //task 3
//        var age = 21
//        when(age){
//            in 21..100 -> println("AboveAge")
//            in 18..20 -> println("justMature")
//            16,17 -> println("You can drive now")
//            else -> println("you are to young")
//        }
        //task4
//        var number:Any = 13.33
//        when(number){
//            is String -> print("$number is a String")
//            else-> println("$number is a Do")
//        }
        //task5
//        var number = 100
//        while(number>=0){
//            if(number%2==0){
//                Log.d("Hello",number.toString())
//            }
//            number--
//        }
        //task6
//        for(num in 0..10000){
//            if(num==9001){
//                print("Hello"+"IT'S OVER 9000!!!")
//            }
//        }
        //task7
//        var humidityLevel = 80;
//        var humidity = "humid"
//        while(humidity=="humid"){
//            humidityLevel-=5
//            Log.d("Hel","Decreased")
//            if(humidityLevel==60){
//                Log.d("Hello","Its comfy now")
//                humidity=="Comfy"
//            }
//        }
        //Hello How are you Doing
    }
}


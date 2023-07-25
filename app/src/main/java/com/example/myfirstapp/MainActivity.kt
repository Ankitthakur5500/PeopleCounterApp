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
        var str:String = "Android MasterClass"
        var float:Float = 13.37F
        var double:Double = 3.14159265358979
        var int1:Int = 25
        var int2:Int = 2020
        var int3:Long = 18881234567
        var boolean:Boolean = true
        var char:Char = 'a'
    }
}
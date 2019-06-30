package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var date = Date(7, 12, 1997)
        var date2 = Date(345, 14, 97)
        var dateDescription: String = date.getDate()
        var dateDescription2: String = date2.getDate()


        var dayString: String = date.getDayOfWeeks(dayOfWeek = 1)
        Log.d("TESTSTRING1", dayString)
        dayString = date.getDayOfWeeks(dayOfWeek = 2)
        Log.d("TESTSTRING2", dayString)
        dayString = date.getDayOfWeeks(dayOfWeek = 3)
        Log.d("TESTSTRING3", dayString)
        dayString= date.getDayOfWeeks(dayOfWeek = 4)
        Log.d("TESTSTRING4", dayString)
        dayString =  date.getDayOfWeeks(dayOfWeek = 5)
        Log.d("TESTSTRING5", dayString)
        dayString = date.getDayOfWeeks(dayOfWeek = 6)
        Log.d("TESTSTRING6", dayString)
        dayString = date.getDayOfWeeks(dayOfWeek = 7)
        Log.d("TESTSTRING7", dayString)

        var date01: Date = Date(20, 12, 1997)
        var date02: Date = Date(18, 2, 1998)


        var speicel : String = date.getSpeicelDate(speicelDate = date01 )
        Log.d("TEST23", speicel )
        speicel = date02.getSpeicelDate(speicelDate = date02)
        Log.d("TEST23", speicel)

    }
}



package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//
//        var date = Date(7, 12, 1997)
//        var date2 = Date(345, 14, 97)
//        var dateDescription: String = date.getDate()
//        var dateDescription2: String = date2.getDate()
//
//
//        var dayString: String = date.getDayOfWeeks(dayOfWeek = 1)
//        Log.d("TESTSTRING1", dayString)
//        dayString = date.getDayOfWeeks(dayOfWeek = 2)
//        Log.d("TESTSTRING2", dayString)
//        dayString = date.getDayOfWeeks(dayOfWeek = 3)
//        Log.d("TESTSTRING3", dayString)
//        dayString= date.getDayOfWeeks(dayOfWeek = 4)
//        Log.d("TESTSTRING4", dayString)
//        dayString =  date.getDayOfWeeks(dayOfWeek = 5)
//        Log.d("TESTSTRING5", dayString)
//        dayString = date.getDayOfWeeks(dayOfWeek = 6)
//        Log.d("TESTSTRING6", dayString)
//        dayString = date.getDayOfWeeks(dayOfWeek = 7)
//        Log.d("TESTSTRING7", dayString)

        var date01: Date = Date(20, 12, 1997)
        var date02: Date = Date(18, 2, 1998)

        var contactNumber01 = ContactNumber("047483", "Dani", Date(20, 2, 1987))
        var contactNumber02 = ContactNumber("038637", "Sani", Date(18, 4, 1978))


        val date3 = date01.getLaterDate(date01, date02)
        Log.d("TEST2354", date01.getDateDescription())

//        var speicel : String = date01.getSpeicelDate(speicelDate = date01 )
//        Log.d("TEST23", speicel )
//        speicel = date02.getSpeicelDate(speicelDate = date02)
//        Log.d("TEST23", speicel)
//
//    }

        for (i in 0 until 101)
            Log.d("TEST_LOOP", "$i")

        var dateArray: ArrayList<Date> = arrayListOf()
    }


}


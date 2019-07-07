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


        //exsmplev
        fun checkShapeArray() {
            var circle1 = Circle()
            var circle2 = Circle()
            var circle3 = Circle()
            var square1 = Square()
            var square2 = Square()
            var square3 = Square()
            var triangle1 = Triangle()
            var triangle2 = Triangle()


            var shapeArrayList: ArrayList<Shape> = arrayListOf()
            shapeArrayList.add(circle1)
            shapeArrayList.add(circle2)
            shapeArrayList.add(circle3)
            shapeArrayList.add(square1)
            shapeArrayList.add(square2)
            shapeArrayList.add(square3)
            shapeArrayList.add(triangle1)
            shapeArrayList.add(triangle2)

            for (i in 0 until shapeArrayList.size){
                var value: Shape = shapeArrayList[i]
                Log.d ("TEST_SHAPE", value.getArea())
            }

        }

        var teacher1 = Teacher("Yossi", 32456755 , 26)
        var student11 = Student("bar", 16, 9)
        var student12 = Student("gal", 16 , 9)
        var student13 = Student("Tal", 16 , 9)

        var teacherStudentList:ArrayList<Person> = arrayListOf(student11, student12 , student13)

        teacher1.studentList.addAll(teacherStudentList)

        for (i in 0 until teacherStudentList.size){
            var value: Person = teacherStudentList[i]
            Log.d("TEST_TEACHER" , value.getDescription())
        }



    }


}


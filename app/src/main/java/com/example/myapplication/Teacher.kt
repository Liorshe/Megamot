package com.example.myapplication

import com.example.myapplication.Person

class Teacher() : Person() {

    var teachesGrade: String = ""
    var iq: Int = 0
    var degree: String = ""
    var studentList = ArrayList<Student>()


    override fun getDescription(): String {
        return "teacher named: $name"
    }

    constructor(name: String, id: Int, age: Int) : this() {

    }

    fun setStudentMark(index: Int , average: Double){
        if (index <0 || index >= studentList.size) return
    }

    fun getMathStudent(): ArrayList<Student>{
        var list = ArrayList(studentList)
        for (i in 0 until studentList.size)

    }
}
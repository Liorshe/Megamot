package com.example.myapplication

class Student(): Person() {

    var grade: Int = 0
    var subject: String = ""
    var average: Double = 0.0

    override fun getDescription(): String {
        return "student named : $name"
    }

    constructor(name: String, age: Int, grade: Int) : this() {

    }
}
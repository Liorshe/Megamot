package com.example.myapplication

class Person() {

    var name: String = ""
    var age: Int = 0
    var id: Int = 0
    var address: String = ""
    var fatherName: String = ""
    var motherName: String = ""
    var grade: String = ""


    fun haveSameName(person1: Person, person2: Person): Boolean {
        if (person1.name == person2.name) {
            return true
        } else {
            return false

        }


    }

    fun haveSameAge(person1: Person, person2: Person): Boolean {
        if (person1.age == person2.age) {
            return true
        } else {
            return false
        }
    }

    fun getOldPerson(person1: Person, person2: Person): Person {
        if (person1.age > person2.age) {
            return person1
        } else {
            return person2
        }
    }

    fun getMotherName(person1: Person): String {
        return motherName
    }

    fun getAddressName(person1: Person): String {
        return address
    }

    fun setGrade(person: Person): String {
        when {
            (person.age >= 0 && person.age <= 7) -> {
                grade = "Gan"
            }
            (person.age > 7 && person.age < 12)->{
                grade = "School"
            }
            (person.age > 12 && person.age < 18)->{
                grade = "High School"
            }
            (person.age > 18 && person.age < 21)->{
                grade = "Army"
            }
            (person.age > 21)->{
                grade = "Citizen"
            }
        }
        return grade
    }

}

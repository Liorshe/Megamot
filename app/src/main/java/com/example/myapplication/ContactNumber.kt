package com.example.myapplication

import android.telephony.PhoneNumberFormattingTextWatcher

class ContactNumber() {

    var phoneNunber: String = ""
    var name: String = ""
    var date: Date = Date()
    var age: Int = 0

    constructor(phoneNumber: String, name: String, date: Date) : this() {

    }

//    fun getOlderContactNumber(contactNum1: ContactNumber, contactNum2: ContactNumber): ContactNumber{
//        if (contactNum1.date == contactNum2.date){
//            return contactNum1
//            }else{
//            return contactNum2
//        }


    fun isOlderThan(contactName: ContactNumber, age: Int): Boolean {
        if (contactName.age > age) {
            return true
        } else {
            return false
        }
    }

    fun isYoungerThan(contactName: ContactNumber, age: Int): Boolean {
        if (contactName.age < age) {
            return true
        } else {
            return false
        }
    }

    fun areContactSameAge(contactNum1: ContactNumber, contactNum2: ContactNumber): Boolean {
        if (contactNum1.age == contactNum2.age) {
            return true
        } else {
            return false
        }
    }

    fun getDateOfOlder(contactNum1: ContactNumber, contactNum2: ContactNumber): Date {
        var laterDate = contactNum1.date.getLaterDate(contactNum1.date, contactNum2.date)
        return laterDate
    }

    fun getNameOfOlderContact(contactNum1: ContactNumber, contactNum2: ContactNumber): String {
       var earlyDate = contactNum1.date.getEarlyDate(contactNum1.date, contactNum2.date)
        return name
    }

}


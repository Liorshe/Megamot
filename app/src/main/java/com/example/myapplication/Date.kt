package com.example.myapplication

class Date() {

    var day: Int = 0
    var month: Int = 0
    var year: Int = 0
    var dayOfWeek: Int = 0


companion object{
    const val DAYS_IN_YEAR = 365
    const  val DAYS_IN_MONTH = 30

}


    constructor(day: Int, month: Int, year: Int): this() {


        if (day>0 && day < 32) {
            this.day = day

        }else {
            this.day = 1
        }
        if (month>0 && month<13)
            this.month = month
        else
            this.month = 1

        if (year> 1900 && year< 2019)
            this.year = year
        else
            this.year = 1901
//
//            this.day = day
//            this.month = month
//            this.year = year

    }

    fun getDate(): String{
        return "$day/$month/$year"
    }


    fun convertDateToDays(date:Date ): Int{
        val yearsToDays : Int = date.year*DAYS_IN_YEAR
        val monthsToDays : Int = date.month*DAYS_IN_MONTH
        val total : Int = yearsToDays+monthsToDays+date.day
        return total
    }


    fun convertDaysToDate(days: Int): Date{
        val daysToYears : Int = days/DAYS_IN_YEAR
        val remainingDaysFromYear : Int = days%DAYS_IN_YEAR
        val daysToMonth : Int = (remainingDaysFromYear/DAYS_IN_MONTH)+1
        val remainingDays : Int = remainingDaysFromYear%DAYS_IN_MONTH

        val final = Date(remainingDays, daysToMonth , daysToYears)
        return final

   }

    fun getMidDate(date1: Date , date2: Date): Date{
        val totalDate1Days: Int = convertDateToDays(date1) //x1
        val totalDate2Days: Int = convertDateToDays(date2) //x2
        val addedDays: Int = totalDate1Days+totalDate2Days //x1+x2
        val average: Int= addedDays/2 //(x1+x2)/2
        val averageDate: Date = convertDaysToDate(average)
        return averageDate

    }

    fun getDayOfWeeks(dayOfWeek: Int): String{
        var dayOfWeekString: String = "ERROR"
        when (dayOfWeek) {
            1 -> {
                dayOfWeekString = "Sunday"
            }
            2 -> {
                dayOfWeekString = "Monday"
            }
            3 -> {
                dayOfWeekString = "Tuesday"
            }
            4 -> {
                dayOfWeekString = "Wednesday"
            }
            5 -> {
                dayOfWeekString = "Thursday"
            }
            6 -> {
                dayOfWeekString = "Friday"
            }
            7 -> {
                dayOfWeekString = "Saturday"
            }
        }
        return dayOfWeekString
    }

    fun getSpeicelDate(speicelDate: Date): String {
        var speicelDateString: String = "ERROR!"
        when (speicelDate){
            Date(20, 12, 1997)->{
               speicelDateString = "my birthday"
            }
            Date(18, 7 ,2014)->{
                speicelDateString = "the date!"
            }
            Date(18, 2, 1998)->{
                speicelDateString = "birthday my wife"
            }


        }
       return speicelDateString
    }
}
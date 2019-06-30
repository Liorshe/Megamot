package com.example.myapplication

class Point {
    var x: Int = 0
    var y: Int = 0

    fun getXDistance(point1: Point, point2: Point): Int {
        return point1.x - point2.x
    }

    fun getYDistance(point1: Point, point2: Point): Int {
        return point1.y - point2.y
    }

    fun getDistance(point1: Point, point2: Point): Int {
        return (((point1.x - point2.x) * (point1.x - point2.x)) + ((point1.y - point2.y) * (point1.y - point2.y)))
    }

    fun getHigher(point1: Point, point2: Point): Point {
        if (point1.y > point2.y) {
            return point1
        } else {
            return point2
        }
    }

    fun getRighter(point1: Point, point2: Point): Point {
        if (point1.x < point2.x) {

            //just trying out a comment
            return point2
        } else {
            return point1
        }
    }


}

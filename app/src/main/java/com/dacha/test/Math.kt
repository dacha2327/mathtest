package com.dacha.test

class Math {

    fun add(a : String , b : String): String{
        val result:String
        if (a.contains("-") || b.contains("-")) {
            result = "Отрицательное указывать нельзя"
        } else if (a.contains(".") || b.contains(".")) {
            result = (a.toFloat() + b.toFloat()).toString()
        } else if (a.contains(Regex("[a-z]"))||b.contains(Regex("[a-z]"))) {
            result = "Символ вводить нельзя"
        } else {
            result = (a.toInt() + b.toInt()).toString()
        }
        return result
    }


    fun divide(num1: String, num2: String): String {
        val result:String
        if (num2 == "0") {
            result = "Делить на ноль нельзя"
        } else {
            result = (num1.toInt() / num2.toInt()).toString()
        }
        return result
    }
}
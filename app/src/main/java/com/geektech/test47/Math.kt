package com.geektech.test47

class Math {
    fun add(a: String, b: String): String {
        var result :String
        if (a.contains("-") || b.contains("-")) {
            result = "Нельзя закидывать отрицательное"
        } else if (a.isEmpty() || b.isEmpty()) {
            result = "Поле не заполнено"
        } else if (a.contains(".") || b.contains(".")) {
            result = (a.toFloat() + b.toFloat()).toString()
        } else if (a.contains(Regex("[a-z]"))||b.contains(Regex("[a-z]"))) {
            result = "буквы не складываются"
        } else {
            result = (a.trim().toInt() + b.trim().toInt()).toString()
        }
        return result
    }

    fun divide(num1: String, num2: String): String {
        val result:String
        if (num2 == "0") {
            result = "Делить на ноль нельзя"
        } else {
            result = (num1.trim().toInt() / num2.trim().toInt()).toString()
        }
        return result
    }

}
package com.example.caltesk

open class DoubleCalculator2 (){

    fun case2(firstInput: Int, secondInput: Double,operator: String?){

        var num1 = firstInput
        var num2 = secondInput

        result(num1, num2, operator)
    }

    fun result(num1: Int, num2: Double, operator: String?) {
        var result = when (operator) {
            "+" -> num1 + num2
            "-" -> num1 - num2
            "*" -> num1 * num2
            "/" -> num1 / num2
            "%" -> num1 % num2
            else -> {
                return
            }
        }

        println("결과는 ${result}")
    }

}
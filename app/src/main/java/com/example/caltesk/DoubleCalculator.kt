package com.example.caltesk

open class DoubleCalculator {
    fun doubleCal(firstInput: String) {
        val canCalculater = listOf("+", "-", "*", "/", "%")

        var num1 = firstInput.toDouble()



            //숫자가 맞는지 확인하는 코드


            println("원하는 연산자를 입력하세요")

            var operator = readln()

            while (operator !in canCalculater) {
                println("+ - * / %중에 하나를 입력하세요")
                operator = readln()
            }

            //올바른 연산자가 맞는지 확인하는 코드

            println("다음 숫자를 입력해주세요")
            var num2 = readln().toDoubleOrNull()

            while (num2 == null) {
                println("두 번째 숫자를 입력하세요")
                num2 = readln().toDoubleOrNull()
            }

            //숫자가 맞는지 확인하는 코드


            result(num1, num2, operator)
            //결과가 도출되는 코드
        }

    }


    fun result(num1: Double, num2: Double, operator: String?) {
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


//Log.d
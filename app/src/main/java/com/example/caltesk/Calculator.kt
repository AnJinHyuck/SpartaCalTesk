package com.example.caltesk

open class Calculator() {
    fun cal() {
        val canCalculater = listOf("+", "-", "*", "/", "%")
        while (true) {

            println("숫자를 입력해주세요. (종료를 원하시면 '종료'를 입력하세요)")
            val firstInput = readln()

            if (firstInput == "종료") {
                break
            } else if (firstInput.contains(".")) {
                DoubleCalculator().doubleCal(firstInput)
                continue
            }

            var num1 = firstInput.toIntOrNull()

            while (num1 == null) {
                println("숫자를 입력하세요")
                num1 = readln().toIntOrNull()
            }
            //숫자가 맞는지 확인하는 코드


            println("원하는 연산자를 입력하세요")

            var operator = readln()

            while (operator !in canCalculater) {
                println("+ - * / %중에 하나를 입력하세요")
                operator = readln()
            }

            //올바른 연산자가 맞는지 확인하는 코드

            println("다음 숫자를 입력해주세요")
            val secondInput = readln()

            if (secondInput == "종료"){
                break
            }else if (secondInput.contains('.')){
                DoubleCalculator2().case2(firstInput.toInt(),secondInput.toDouble(),operator)
                continue
            }
            // 수정전 : continue가 없어서 무한 반복이 안됨.

            var num2 = secondInput.toIntOrNull()
            // 수정 전: var num2 = readln.toIntorNull()

            while (num2 == null) {
                println("두 번째 숫자를 입력하세요")
                num2 = readln().toIntOrNull()
            }

            result(num1, num2, operator)
            //결과가 도출되는 코드
        }
    }

}


fun result(num1: Int, num2: Int, operator: String?) {
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

// 소수 + 소수 무한반복됨 V
// 정수 + 정수 = 2번째 값에서 다시 입력해야하는 오류 V
// 소수 + 정수 = 무한반복 됨 V
// 정수 + 소수 = 한번만 계산 후 꺼짐 V
// 세컨 더블 칼을 만들어서 정수 + 다른 계산식 만들기 V
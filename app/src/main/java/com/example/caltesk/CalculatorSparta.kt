package com.example.caltesk


/*fun main() {
    val calculator = Calculator()

    val (num1, num2, operator) = calculator.inPutNum()
    calculator.result(num1, num2, operator)
}

class Calculator() {
    fun inPutNum(): Triple<Int?, Int?, String?> {
        val canCalculator = listOf("+", "-", "*", "/")

        var num1: Int? = null
        var num2: Int? = null
        var operator: String? = null

        println("숫자를 입력해주세요.(종료를 원하시면 '종료'를 입력하세요)")
        val exit = readln()

        if (exit == "종료") {
            return Triple(null, null, null)
        }
        num1 = exit.toIntOrNull()

        while (num1 == null) {
            println("숫자를 입력하세요")
            num1 = readln().toIntOrNull()
        }

        println("원하는 연산자를 입력하세요")
        operator = readln()

        while (operator !in canCalculator) {
            println("+ - * / 중에 하나를 입력하세요")
            operator = readln()
        }

        println("다음 숫자를 입력해주세요")
        num2 = readln().toIntOrNull()

        while (num2 == null) {
            println("두 번째 숫자를 입력하세요")
            num2 = readln().toIntOrNull()
        }

        return Triple(num1, num2, operator)
    }

    fun result(num1: Int?, num2: Int?, operator: String?) {
        var result = when (operator) {
            "+" -> num1!! + num2!!
            "-" -> num1!! - num2!!
            "*" -> num1!! * num2!!
            "/" -> num1!! / num2!!
            else -> {
                return
            }
        }

        println("결과: $result")
    }
}
*/
fun main() {

    var resultOfCal = Calculator()


    resultOfCal.cal()

}


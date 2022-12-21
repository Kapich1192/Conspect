package org.example.Kotlin.learn.task4

fun main(args : Array<String>) {
    val num1 : Double
    val num2 : Double
    var result : Double
    var temp : String?
    println("Input num1: ")
    temp = readLine()
    try{
        num1 = temp.toString().toDouble()
    } catch (e : NumberFormatException) {
        println("Uncorrected value")
        return
    }
    println("Input num2: ")
    temp = readLine()
    try{
        num2 = temp.toString().toDouble()
    } catch (e : NumberFormatException) {
        println("Uncorrected value")
        return
    }

    result = sum(num1, num2)
    println("Sum = $result")

    result = multiply(num1, num2)
    println("Multiply = $result")

    result = difference(num1, num2)
    println("Difference = $result")

    result = division(num1, num2)
    println("Division = $result")

}

fun sum(a: Double, b: Double) : Double {
    return a + b
}

fun multiply(a:Double, b: Double) : Double{
    return a * b
}

fun difference(a : Double, b : Double) : Double {
    return a - b
}

fun division(a : Double, b : Double) : Double {
    return a / b
}
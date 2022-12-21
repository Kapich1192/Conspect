package org.example.Kotlin.StepicKotlin.task2

/*
* Жители созвездия Жука были приятно удивлены вежливостью землян.
*  В благодарность за столь теплый прием их лидер согласился ответить
*  на любые вопросы землян. Однако необходимость строго следовать букве
*  этикета никуда не делась, поэтому землянам вновь необходим инструмент
* для формулирования вежливых обращений.
*
* Напишите программу, принимающую от пользователя (через readLine)
*  его имя, например Ivan, и выводящую на экран текст вежливого обращения
* к правителю созвездия Жука:
*
* Oh mighty ruler of Bug Kingdom, the earthling called Ivan seeks for your wisdom!
* ----------------
* Input:
* Ivan
* ----------------
* Output:
* Oh mighty ruler of Bug Kingdom, the earthling called Ivan seeks for your wisdom!
*
* */

fun main(args : Array<String>) {
    var name : String
    println("Input your name:")
    name = readLine().toString()
    println("Oh mighty ruler of Bug Kingdom, the earthling called ${name} seeks for your wisdom!")
}
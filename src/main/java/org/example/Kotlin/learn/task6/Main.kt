package org.example.Kotlin.learn.task6
/*
*  Релизация всех видов циклов в Котлин
*
* */
fun main(args : Array<String>) {
    var x: Int = 0
    println("while ()")
    while (x < 5) {
        print("x-->$x; ")
        x++
    }
    println("\n\ndo {} while ()")

    var y :Int = 0
    do {
        print("y-->$y; ")
        y++
    } while(y < 5)

    println("\n\nfor(i in _ .. _)")
    for (i in 0 .. 5) {
        print("i-->$i; ")
    }
    println("\n\nfor(i in _ .. _ step _)")
    for (i in 0 .. 10 step 2) {
        print("i--> ${i}; ")
    }
    println("\n\nfor(i in _ downTo _)")
    for(i in 5 downTo 0) {
        print("i-->$i; ")
    }
    println("\n\nfor(i in _ downTo _ step _)")
    for(i in 10 downTo 0 step 2) {
        print("i-->${i}; ")
    }
    println("\n\nfor(i in _ until _)")
    for (i in 0 until 5) {
        print("i-->$i; ")
    }

}
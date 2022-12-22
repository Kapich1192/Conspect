package org.example.Kotlin.learn.task6

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

}
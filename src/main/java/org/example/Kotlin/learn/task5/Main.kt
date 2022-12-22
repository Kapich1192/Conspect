package org.example.Kotlin.learn.task5

fun main(args : Array<String>) {
    var x : Int = 5

    when {
        x==5 -> {
            println("This x == 5")
            x--
        }
        x == 4 -> {
            println("This x == 4")
        }
    }
}
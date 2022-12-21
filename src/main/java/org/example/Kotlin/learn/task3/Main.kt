package org.example.Kotlin.learn.task3

fun main(args : Array<String>) {
    my_func();

}

fun my_func(){
    var name: String
    var lastname : String
    println("Input your name:")
    name = readLine().toString()
    println("Input your lastname: ")
    lastname = readLine().toString()

    println("Hello ${name} ${lastname}")
}
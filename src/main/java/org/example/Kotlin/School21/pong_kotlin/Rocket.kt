package org.example.Kotlin.School21.pong_kotlin

class Rocket (var x: Int, var y: Int, var upp: Char, var down: Char, var marker: Char) {

    fun moveRocketUpp() {
        y++
    }

    fun moveRocketDown() {
        y--
    }
}
package org.example.Kotlin.learn.task7.repeat1
/*
* Нужно создать прямоугольник который задается шириной и высотой
* вывести на экран
* */
fun main(args : Array<String>){
    var rect : Rectangle = Rectangle(10,20)
    var s : Int = rect.getS()
    println("rect s = $s")
    rect.printRectangle()
}

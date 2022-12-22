package org.example.Kotlin.learn.task7.repeat1

class Rectangle(h:Int, w:Int) {
    private var s:Int = h * w
    var marcker:Char = 'O'

    var h:Int = 0
    var w:Int = 0

    var lh:Dote = Dote(0,0)
    var ld:Dote = Dote(0,0)
    var rh:Dote = Dote(0,0)
    var rd:Dote = Dote(0,0)

    init{
        this.h = h
        this.w = w
    }

    fun getS() : Int {
        return s
    }

    fun printRectangle() {
        var fStr:String = ""
        fStr = "lh(x = ${lh.x}, y + ${lh.y})"
        for(i in 0 .. w step 2) {
            fStr += " "
        }
        fStr+="rh(x = ${rh.x}, y + ${rh.y})"
        println(fStr)

        for(i in 0 .. h) {
            for (j in 0 .. w) {
                if(i == 0 || i == h || j == 0 || j == w)
                    print(marcker)
                else
                    print(" ")
            }
            println()
        }
    }
}
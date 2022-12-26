package org.example.Kotlin.School21.pong_kotlin

class GameField {
    var bool : Bool = Bool(40,12,1, 'o')
    var rocket1 : Rocket = Rocket(10,12,'a','z','O')
    var rocket2 : Rocket = Rocket(70,12,'k','m','O')
    var fieldH : Char = '|'
    var fieldW : Char = '-'
    var weight : Int = 80
    var height : Int = 25
    var message : String = " Press 'q' for exit.\n Controller Player1 'a' - upp, 'z' - down;\n Controller Player2 'k' - upp, 'm' - down;"
    var clickMarker:Char = 'o'

    fun printGameField() {
        for (y in 0 .. height) {
            for (x in 0 .. weight) {
                if(y == 0 || y == height) {
                    print(fieldW)
                } else if (x == 0 || x == weight) {
                    print(fieldH)
                } else if (y == bool.y && x == bool.x) {
                    print(bool.marker)
                } else if ((y == rocket1.y && x == rocket1.x) ||
                        (y == rocket1.y+1 && x == rocket1.x) ||
                        (y == rocket1.y-1 && x == rocket1.x)) {
                    print(rocket1.marker)
                } else if ((y == rocket2.y && x == rocket2.x)||
                        (y == rocket2.y + 1 && x == rocket2.x)||
                        (y == rocket2.y - 1 && x == rocket2.x)) {
                    print(rocket2.marker)
                }
                else {
                    print(' ')
                }

            }
            println()
        }
    }

    fun printDeadpool() {
        println("-----------------------")
        println("|Player1: ; Player2: ;|")
        println("-----------------------")
    }

    fun printInfo() {
        println(message)
    }

    fun listenClick() : Boolean {
        clickMarker = readLine().toString().toCharArray()[0]
        if (clickMarker == 'q') {
            return false
        }
        return true;
    }

    fun clear() {
       // print("\e[1;1H\e[2J");
    }

    fun step() {
        if (clickMarker == rocket1.upp) {
            rocket1.moveRocketUpp()
        }
        if (clickMarker == rocket1.down) {
            rocket1.moveRocketDown()
        }
        if (clickMarker == rocket2.upp) {
            rocket2.moveRocketUpp()
        }
        if (clickMarker == rocket2.down) {
            rocket2.moveRocketDown()
        }
    }

    fun gameAction() {
        do {
            clear()
            step()
            printInfo()
            printGameField()
            printDeadpool()
        } while (listenClick())
    }
}
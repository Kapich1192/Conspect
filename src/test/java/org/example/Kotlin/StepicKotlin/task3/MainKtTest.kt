package org.example.Kotlin.StepicKotlin.task3

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class MainKtTest {
    @DisplayName("calkChairs() --> test 44 / 66")
    @Test
    fun test_1() {
        val value = 44.0
        val ac : Int = calcChairs(value)
        val ex = 66
        assertEquals(ac,ex)
    }

    @DisplayName("calkChairs() --> test 6 / 9")
    @Test
    fun test_2() {
        val value = 6.0
        val ac = calcChairs(value)
        val ex = 9
        assertEquals(ac,ex)
    }

    @DisplayName("calkChairs() --> test 70 / 105")
    @Test
    fun test_3() {
        val value = 70.0
        val ac = calcChairs(value)
        val ex = 105
        assertEquals(ac,ex)
    }

    @DisplayName("calkChairs() --> test 12 / 18")
    @Test
    fun test_4() {
        val value = 12.0
        val ac = calcChairs(value)
        val ex = 18
        assertEquals(ac,ex)
    }

}
package com.geektech.test47

import junit.framework.Assert.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test

class MathTest {
    var math: Math? = null
var divide:Math? = null
    @Before
    fun setup() {
        math = Math()
    }

    @Test
    fun AddTest() {
        assertEquals("4", math?.add("2", "2"))
    }

    @Test
    fun addEmptyTest() {
        assertEquals("Поле не заполнено", math?.add("2", ""))
    }
    @Test
    fun symbolAddTest() {
        assertEquals("буквы не складываются",math?.add("2","2aa"))
    }
        @Test
        fun zeroDoubleTest() {
            assertEquals("0.6", math?.add("0.2", "0.4"))
        }
        @Test
    fun negativeAddTest(){
        assertEquals("Нельзя закидывать отрицательное", math?.add("2", "-2"))
        }

            @Test
    fun divideTest() {
        assertEquals("3", math?.divide("6", "2"))
        }
        @Test
    fun  divideOnZero(){
         assertEquals("Делить на ноль нельзя", math?.divide("6", "0"))

        }

        @After
        fun detach() {
            math = null
        }
    }
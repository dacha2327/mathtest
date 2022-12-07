package com.dacha.test

import junit.framework.TestCase.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test

class MathTest {
        var math: Math? = null

        @Before
        fun init(){
            math = Math()
        }

        @Test
        fun minusAdd(){
            assertEquals("Отрицательное указывать нельзя",math?.add("2","---2"))
        }
        @Test
        fun floatAdd(){
            assertEquals("4.5",math?.add("2","2.5f"))
        }
        @Test
        fun simpleDivide(){
            assertEquals("3",math?.divide("6","2"))
        }
        @Test
        fun divideOnZero(){
            assertEquals("Делить на ноль нельзя",math?.divide("6","0"))
        }

        @Test
        fun simpleAdd(){
            assertEquals("4" , math?.add("2" , "2"))
        }
        @Test
        fun symbolAdd(){
            assertEquals("Символ вводить нельзя" , math?.add("asas" , "2"))
        }

        @After
        fun detach(){
            math = null

        }

}
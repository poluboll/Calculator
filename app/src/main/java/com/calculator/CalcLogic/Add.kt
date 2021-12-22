package com.example.homework

import java.math.BigDecimal

class Add (val operandFirst: BigDecimal,val operandSecond: BigDecimal) {
    fun execute():BigDecimal {
        return operandFirst.add(operandSecond)
    }
}
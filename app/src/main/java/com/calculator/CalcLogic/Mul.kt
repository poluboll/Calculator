package com.example.homework

import java.math.BigDecimal

class Mul (val operandFirst: BigDecimal,val operandSecond: BigDecimal) {
    fun execute(): BigDecimal {
        return operandFirst.multiply(operandSecond)
    }
}
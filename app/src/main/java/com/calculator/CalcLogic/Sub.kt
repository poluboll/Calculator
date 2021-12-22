package com.example.homework

import java.math.BigDecimal

class Sub (val operandFirst: BigDecimal,val operandSecond: BigDecimal) {
     fun execute(): BigDecimal {
        return operandFirst.subtract(operandSecond)
    }
}
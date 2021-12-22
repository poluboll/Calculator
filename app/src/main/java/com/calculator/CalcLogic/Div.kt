package com.example.homework

import java.math.BigDecimal

class Div (val operandFirst: BigDecimal,val operandSecond: BigDecimal) {
     fun execute():BigDecimal {
        return operandFirst.div(operandSecond)
    }
}
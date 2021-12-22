package com.example.homework

import java.math.BigDecimal

abstract class Command constructor(val operandFist:BigDecimal,
                                   val operandSecond:BigDecimal){
        abstract fun execute():BigDecimal


}
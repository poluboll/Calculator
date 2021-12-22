package com.example.homework

import java.math.BigDecimal

class Calculator (){
    var register:BigDecimal= BigDecimal(0)



    fun add(operandFirst:BigDecimal,operandSecond: BigDecimal){
        register+=Add(operandFirst,operandSecond).execute()
    }
    fun sub(operandFirst:BigDecimal,operandSecond: BigDecimal){
        register+=Sub(operandFirst,operandSecond).execute()
    }
    fun div(operandFirst:BigDecimal,operandSecond: BigDecimal){
        register+=Div(operandFirst,operandSecond).execute()
    }
    fun mul(operandFirst:BigDecimal,operandSecond: BigDecimal){
        register+=Mul(operandFirst,operandSecond).execute()
    }

    fun resetRegister(){
        register=BigDecimal(0)
    }
}
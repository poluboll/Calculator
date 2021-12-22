package com.calculator.CalcLogic

import com.example.homework.Calculator

fun Regex.findFirstMatching(){

}
private const val MUL_SEPARATOR_REGEX = "[\\d]+\\*[\\d]+"
private const val DIV_SEPARATOR_REGEX = "[\\d]+\\/[\\d]+"
private const val ADD_SEPARATOR_REGEX = "[\\d]+\\+[\\d]+"
private const val SUB_SEPARATOR_REGEX = "[\\d]+\\-[\\d]+"

fun parse(strInput: String, calculator: Calculator) {
    var str = strInput
    var boolean = true
    var operation = ""
    var firstNumber = ""
    var secondNumber = ""
    while (boolean) {
        when {
            (Regex(MUL_SEPARATOR_REGEX).find(str)!=null) -> {
                operation = Regex(MUL_SEPARATOR_REGEX).find(str)?.groups?.get(0)?.value!!
                firstNumber =
                        Regex("[\\d]+\\*").find(operation!!)!!.groups[0]!!.value.replace("*", "")
                secondNumber =
                        Regex("\\*[\\d]+").find(operation!!)!!.groups[0]!!.value.replace("*", "")
                calculator.resetRegister()
                calculator.mul(firstNumber.toBigDecimal(), secondNumber.toBigDecimal())
                str = str.replace(operation, calculator.register.toString())

            }
            (Regex(DIV_SEPARATOR_REGEX).find(str)!=null) -> {
                operation = Regex(DIV_SEPARATOR_REGEX).find(str)?.groups?.get(0)?.value!!
                firstNumber =
                        Regex("[\\d]+\\/").find(operation!!)!!.groups[0]!!.value.replace("/", "")
                secondNumber =
                        Regex("\\/[\\d]+").find(operation!!)!!.groups[0]!!.value.replace("/", "")
                calculator.resetRegister()
                calculator.div(firstNumber.toBigDecimal(), secondNumber.toBigDecimal())
                str = str.replace(operation, calculator.register.toString())
            }
            (Regex(SUB_SEPARATOR_REGEX).find(str)!=null) -> {
                operation = Regex(SUB_SEPARATOR_REGEX).find(str)?.groups?.get(0)?.value!!
                firstNumber =
                        Regex("[\\d]+\\-").find(operation!!)!!.groups[0]!!.value.replace("-", "")
                secondNumber =
                        Regex("\\-[\\d]+").find(operation!!)!!.groups[0]!!.value.replace("-", "")
                calculator.resetRegister()
                calculator.sub(firstNumber.toBigDecimal(), secondNumber.toBigDecimal())
                str = str.replace(operation, calculator.register.toString())
            }

            (Regex(ADD_SEPARATOR_REGEX).find(str)!=null) -> {
                operation = Regex(ADD_SEPARATOR_REGEX).find(str)?.groups?.get(0)?.value!!
                firstNumber =
                        Regex("[\\d]+\\+").find(operation!!)!!.groups[0]!!.value.replace("+", "")
                secondNumber =
                        Regex("\\+[\\d]+").find(operation!!)!!.groups[0]!!.value.replace("+", "")
                calculator.resetRegister()
                calculator.add(firstNumber.toBigDecimal(), secondNumber.toBigDecimal())
                str = str.replace(operation, calculator.register.toString())
            }
            else -> {
                boolean = false
            }

        }
    }

}
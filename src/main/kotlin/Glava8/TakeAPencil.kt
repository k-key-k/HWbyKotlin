package Glava8

import java.lang.Exception

fun main(){
    //    val test: String = "No"
    val test: String = "Yes"
    try {
        println("Start try")
        riskyCode(test)
        println("End try")
    } catch (e: BadException){
        println("BadException")
    } finally {
        println("finally")
    }

    println("end of main")
}

class BadException : Exception()

fun riskyCode(test: String){
    println("Start risky code")

    if (test == "Yes") {
        throw BadException()
    }

    println("End risky code")
}
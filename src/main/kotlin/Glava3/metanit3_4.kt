package Glava3

fun square(x: Int) = x * x

fun compareAge(age1: Int, age2: Int){
    fun ageIsValid(age: Int) = age > 0 && age < 111

    if (!ageIsValid(age1) || !ageIsValid(age2)) {
        println("Invalid age")
        return
    }

    when {
        age1 == age2 -> println("age1 == age2")
        age1 > age2 -> println("age1 > age2")
        age1 < age2 -> println("age1 < age2")
    }
}

fun main(){
    val a = square(5)
    val b = square(3)
    println("$a, $b")

    compareAge(30, 20)
    compareAge(-2, 3)
    compareAge(3, -10)
    compareAge(20, 20)
}
package Glava3

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun checkAge(age: Int) {
    if (age < 0 || age > 110){
        println("Invalid age")
        return
    }
    println("age is valid")
}
fun main(){
    val a = sum(5, 3)
    val b = sum(10, 2)
    val c = sum(6, 9)
    println("$a, $b, $c")

    checkAge(-100)
    checkAge(5)
}




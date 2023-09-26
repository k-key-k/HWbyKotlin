fun printStrings(vararg strings: String){
    for(str in strings)
        println(str)
}

fun sum(vararg numbers: Int){
    var result = 0
    for(n in numbers)
        result += n
    println("sum = $result")
}

fun printUserGroup(count: Int, vararg users: String){
    println("Count: $count")
    for (user in users)
        println(user)
}

fun changeNumbers(vararg numbers: Int, koef: Int){
    for (num in numbers)
        println(num * koef)
}
fun main(){
    printStrings("A", "B", "C")
    printStrings("Hello", ", ", "World")

    println()

    sum(1, 2, 3, 4)
    sum(10, 20, 25, 1)

    println()

    printUserGroup(3, "Aren", "Almert", "Misata")

    println()

    val nums = intArrayOf(1, 2, 3, 4)
    changeNumbers(*nums, koef = 2)
}
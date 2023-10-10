package Glava6

data class Person(val name: String, val age: Int){
    override fun toString(): String {
        return "Name: $name  Age: $age"
    }
}

fun main() {
    val alice: Person = Person("Alice", 24)
    val kate = alice.copy(name = "Kate")

    val (username, userage) = alice
    println("Name: $username  Age: $userage")
    println(alice.toString())
    println(kate.toString())
}
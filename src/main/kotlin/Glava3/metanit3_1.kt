package Glava3

fun displayUser(name: String, age: Int = 18, position: String = "Unemployement"){
    println("Name: $name Age: $age Position: $position")
}

fun displayUser2(age: Int = 18, name: String) {
    println("\nName: $name Age: $age")
}

fun double(nums: IntArray){
    nums[0] = nums[0] * 2
    println("\nЗначение в функции double: ${nums[0]}")
}
fun main() {

    displayUser("Danis", 18, "Manager")
    displayUser("Jade", 40)
    displayUser("Emil")

    displayUser2(name = "Jambo", age = 13)

    var nums = intArrayOf(4, 5, 6)
    double(nums)
    println("\nЗначение в функции main: ${nums[0]}")
}
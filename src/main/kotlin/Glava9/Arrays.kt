package Glava9

import javax.print.attribute.SetOfIntegerSyntax

fun main(){
    println("About arrays and List:")
    var array = arrayOf(1, 3, 2)

    var nullArray: Array<String?> = arrayOfNulls(2)

    val size = array.size

    array.reverse()

    val isIn = array.contains(1)

    val sum = array.sum()

    val average = array.average()

    array.min()
    array.max()

    array.sort()

    val shopping = listOf("Tea", "Eggs", "Milk")
    val shopping1: List<String>
    shopping1 = listOf("Tea", "Eggs", "Milk")

    if (shopping.size > 0){
        println(shopping.get(0))
    }

    for (item in shopping) println(item)

    if (shopping.contains("Milk")) {
        println(shopping.indexOf("Milk"))
    }

    val mShopping = mutableListOf("Tea", "Eggs")
    //mShopping.add("Milk")
    mShopping.add(1, "Milk")

    if (mShopping.contains("Milk")){
        mShopping.remove("Milk")
    }
    if (mShopping.size > 0){
        mShopping.removeAt(1)
    }
    if (mShopping.size > 0){
        mShopping.set(0, "Coffee")
    }

    mShopping.sort()
    mShopping.reverse()
    mShopping.shuffle()

    val toAdd = listOf("Cookies", "Sugar")
    mShopping.addAll(toAdd)

    val toRemove = listOf("Milk", "Sugar")
    mShopping.removeAll(toRemove)

    val toRetain = listOf("Milk", "Sugar")
    mShopping.retainAll(toRetain)

    mShopping.clear()

    val shoppingCopy = mShopping.toList()

    println("\nAbout Set:")

    val friendSet = setOf("Jim", "Sue", "Sue", "Nick", "Nick")

    val isFredGoing = friendSet.contains("Fred")

    for (item in friendSet) println(item)

    val mFriendSet = mutableSetOf("Jim", "Sue")
    mFriendSet.add("Nick")
    mFriendSet.remove("Nick")

    val toAddSet = setOf("Joe", "Mia")
    mFriendSet.addAll(toAddSet)

    mFriendSet.clear()

    val friendSetCopy = mFriendSet.toSet()
    val friendList = mFriendSet.toList()

    val shoppingSet = mShopping.toSet()
    if (mShopping.size > mShopping.toSet().size){
        println("True")
    }

    println("\nAbout Map:")
}
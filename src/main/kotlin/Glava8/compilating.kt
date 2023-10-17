package Glava8

class Cat(var name: String? = ""){
    fun Meow() { println("Meow!")
    }
}

class Cat1(var name: String? = null){
    fun Meow() { println("Meow!")}
}

class Cat2(var name: String? = null){
    fun Meow() { println("Meow!")}
}

class Cat3(var name: String = ""){
    fun Meow() { println("Meow!")}
}
fun main(){
    println("A")
    var myCats = arrayOf(Cat("Misty"), null, Cat("Socks"))

    for (cat in myCats) {
        if (cat != null) {
            print("${cat.name}: ")
            cat.Meow()
        }
    }

    println("B")
    var myCats1 = arrayOf(Cat("Misty"), Cat(null), Cat("Socks"))

    for (cat in myCats1) {
        print("${cat.name}: ")
        cat.Meow()
    }

    println("C")
    var myCats2 = arrayOf(Cat("Misty"), null, Cat("Socks"))

    for (cat in myCats2) {
        print("${cat?.name}: ")
        cat?.Meow()
    }

    println("D")
    var myCats3 = arrayOf(Cat("Misty"), Cat(null), Cat("Socks"))

    for (cat in myCats3) {
        if (cat != null) {
            print("${cat?.name}: ")
            cat?.Meow()
        }
    }
}
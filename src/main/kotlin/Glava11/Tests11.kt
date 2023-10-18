package Glava11

fun main() {
    { x: Int -> x + 5 }
    { x: Int, y: Int -> x + y }
    { "Pow!" }
    val addFive = { x: Int -> x + 5 }
    var addFive1 = { x: Int -> x + 5}
    addFive1 = { y: Int -> y + 5}
    val addInts = { x: Int, y: Int -> x + y }
    val result = addInts.invoke(6, 7)
    val result1 = addInts(6, 7)

    // (parameters) -> return_type
    val msg = { x: Int -> "Type value is $x"}
    // (Int) -> String

    val add: (Int, Int) -> Int
    add = { x: Int, y: Int -> x + y}

    val greeting: () -> String
    greeting = { "Hello!" }
    // val greeting: () -> String = { "Hello!" )

    // val addFive: (Int) -> Int = { x: Int -> x + 5 }
    val addFive2: (Int) -> Int = { x -> x + 5 }

    val addFive3: (Int) -> Int = { it + 5 }

    // val addfive = { it + 5 } => компилятор не может определить тип параметра

    val calculation: (Int, Int) -> Int
    // calculation = { x: Double, y: Double -> x + y} => не работает, х и у явно заданы как Double

    val calculation1: (Int, Int) -> Unit = { x, y -> x + y} // нельзя получить доступ к (x + y)

    val farenheit = convert1(20.0, { c: Double -> c * 1.8 + 32 })

    convert1(20.0) { c: Double -> c * 1.8 + 32}

    convertFive1 { it * 1.8 + 32}

    val pounds = getConversionLambda("KgToPounds")(2.5)
    convert(20.0, getConversionLambda("CentigrateToFahrenheit"))

    val kgsToPounds = { x: Double -> x * 2.2 }
    val poundsToUSTons = { x: Double -> x / 2000.0 }

    val kgsToUSTons = combine1(kgsToPounds, poundsToUSTons)

    val usTons = kgsToUSTons(1000.0)
}

fun convert1(x: Double,
            converter: (Double) -> Double) : Double {
    val result = converter(x)
    println("$x is converted to $result")
    return result
}

fun convertFive1(converter: (Int) -> Double) : Double {
    val result = converter(5)
    println("5 is converted to $result")
    return result
}

fun getConversionLambda1(str: String): (Double) -> Double {
    if (str == "CentigradeToFahrenheit") {
        return { it * 1.8 + 32 }
    } else if (str == "KgToPounds") {
        return { it * 2.2 }
    } else if (str == "PoundsToUSTons") {
        return { it / 2000.0 }
    } else {
        return { it }
    }
}

fun combine1(lambda1: (Double) -> Double,
            lambda2: (Double) -> Double) : (Double) -> Double {
                return { x: Double -> lambda2(lambda1(x)) }
            }
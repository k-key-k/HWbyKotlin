package Glava11

typealias DoubleConversion = (Double) -> Double
fun convert(x: Double,
            converter: DoubleConversion) : Double {
    val result = converter(x)
    println("$x is converted to $result")
    return result
}

//fun convertFive(converter: (Int) -> Double) : Double {
//    val result = converter(5)
//    println("5 is converted to $result")
//    return result
//}

fun getConversionLambda(str: String): DoubleConversion {
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

fun combine(lambda1: DoubleConversion,
            lambda2: DoubleConversion) : DoubleConversion {
    return { x: Double -> lambda2(lambda1(x)) }
}

fun main() {
    var addFive = { x: Int -> x + 5 }
    println("Pass 6 to addFive: ${addFive(6)}")

    val addInts = { x: Int, y: Int -> x + y }
    val result = addInts.invoke(6, 7)
    println("Pass 6 and 7 to addInts: $result")

    val intLambda: (Int, Int) -> Int = { x, y -> x * y }
    println("Pass 10, 11 to intLambda: ${intLambda(10, 11)}")

    val addSeven: (Int) -> Int = { it + 7 }
    println("Pass 12 to addSeven: ${addSeven(12)}")

    val myLambda: () -> Unit = { println("Hi!") }
    myLambda()

    convert(20.0) { it * 1.8 + 32}
//    convertFive { it * 1.8 + 32 }

    println("Convert 2.5kg to Pounds: ${getConversionLambda("KgToPounds")(2.5)}")

    val kgToPoundsLambda = getConversionLambda("KgToPounds")
    val poundsToUSTonsLambda = getConversionLambda("PoundsToUSTons")

    val kgToUSTonsLambda = combine(kgToPoundsLambda, poundsToUSTonsLambda)

    val value = 17.4
    println("$value kgs is ${convert(value, kgToUSTonsLambda)} US Tons")
}
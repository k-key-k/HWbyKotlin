package Glava8

class BadException1 : Exception()

fun myFunction (test: String) {
    try{
        print("t")
        riskyCode1(test)
        print("o")
    } catch (e: BadException) {
        print("a")
    } finally {
        print("w")
    }
    print("s")
}

fun riskyCode1(test: String){
    print("h")
    if (test == "Yes"){
        throw BadException()
    }
    print("r")
}

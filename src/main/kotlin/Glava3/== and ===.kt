package Glava3

class A () {
    fun test () {
        var a = 2
    }
}

fun main() {
    val test1 = A()
    val test2 = test1   // Присвоили значение ссылки
    val test3 = A()
    val test4 = A()

    if (test1 === test2)
        println("Тест1: Две ссылки ссылаются на один и тот же объект")
    if (test1 !== test2)    // Не выполнится
        println("test1 !== test2")


    if (test3 === test4)    // Не выполнится
        println("test3 === test4")
    if (test3 !== test4)
        println("Тест2: Две ссылки ссылаются на разные объекты")

    val num1 = 2
    val num2 = num1
    val num3 = 3
    val num4 = 3
    val num5 = 4

    if (num1 === num2)
        println("Тест3: Две ссылки с числовыми значениями ссылаются на один и тот же объект, если использовать присваивание ссылок")

    if (num3 === num4)
        println("Тест4: Две переменные с одинаковыми числовыми значениями имеют одинаковые ссылки")

    if (num3 === num5)
        println("num3 === num5") // не выполнится
    if (num3 !== num5)
        println("Тест5: Две переменные с разными числовыми значениями имеют разные ссылки")
}
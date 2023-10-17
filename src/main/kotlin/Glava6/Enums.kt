package Glava6

enum class Day {
    MO, TU, WE, TH, FR, ST, SN
}

enum class DayNum(val num: Int){
    MO(1), TU(2), WE(3), TH(4), FR(5), ST(6), SN(100500)
}

fun main(){
    val day: Day = Day.FR
    println(day)
    println(Day.MO)

    val daynum: DayNum = DayNum.FR
    println(daynum.num)
    println(DayNum.MO.num)

    println(day.name)
    println(day.ordinal)

    for (day in Day.values())
        println(day)
    println(Day.valueOf("FR"))
}

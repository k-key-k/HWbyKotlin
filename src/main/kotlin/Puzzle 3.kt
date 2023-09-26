fun main() {
    var x = 0
    var y = 20
    for (outer in 1..3){
        for (inner in 4 downTo 2){
            /*x += 6*/

            /*x--*/

            /*y = x + y*/

            /*y = 7*/

            /*x = x + y
            y = x - 7*/

            /*x = y
            y++*/

            y++
            x += 3
        }
        y -= 2
    }
    println("$x $y")
}

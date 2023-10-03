class Song (val title: String, val artist: String){
    fun play(){
        println("Playing the song $title by $artist")
    }
    fun stop(){
        println("Stopped playing $title")
    }
}

fun main() {
    val songOne = Song("Unsainted", "Slipknot")
    val songTwo = Song("Hotel California", "Eagles")
    val songThree = Song("Oboro", "Dir En Grey")
    songTwo.play()
    songTwo.stop()
    songThree.play()
}
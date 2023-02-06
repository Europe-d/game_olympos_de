open class Player(var name: String) {

    var score = 0


    constructor(name: String, score: Int) : this(name) {
        this.name = name
        this.score = score
    }


    fun playScore(): Int {
        println("$name has $score points.")
        return score
    }


    open fun alterVonplayer1() {

        println("${this.name} Geben sie Ihre alt ein : ")
        var alter: Int = readln().toInt()
        try {
            if (alter > 700) {
                println("let's go!")

            } else {
                println("Sorry, kein Einlass zur Hier..versuchen sie wieder... ")
                alterVonplayer1()
            }
        } catch (ex: Exception) {
            ex.message
            println("Error: Bitte gib eine gültige Alter ein.")
            alterVonplayer1()
        }


    }


}







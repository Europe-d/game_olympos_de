import kotlin.system.exitProcess

fun main(){
    println("möchten sie weiter ja oder nein ")
    spieleWeiter()

println("weiter machen ")

}

fun spieleWeiter() {

    when (readln().trim().uppercase()) {
        "NEIN" -> {
            println("Das Spiel wird beendet. Schade, dass du nicht weiter spielen willst.")
            exitProcess(0)

        }
    }
}
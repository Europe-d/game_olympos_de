import kotlin.random.Random

var welcome = "Willkommen im Olympus-Planet spiel "

var welcometext1 = """Bevor wir mit dem Spiel beginnen,wir erklären 
                      diese planet ist mehr als 10.000 jahren ,
                      gibt keine wasser und wir essen nur pommes ..
    
                      Nicht vergessen alle die hier leben ,die sind über 1000 jahr 
                      und die dürfen kommen hier nur wenn jemand  über 700 jahr alt ist
                      hier wir wollen immer lachen und wenn du glück hast  die richtige antworten 
                      zu finden mit eine Quiz .ist gut.. wenn jemand verloren  schauen mal was passiert"""


fun main() {

    // todo welcome von usere spiel
    println(welcome)
    println(welcometext1)


    //todo hier ich habe meine Planet jede class eine var

    var merkur = Merkur("Merkur", 0.382, 1, 0)
    var venus = Venus("Venus", 0.949, 2, 0)
    var erde = Erde("Erde", 1.00, 3, 1)
    var mars = Mars("Mars", 0.532, 4, 2)
    var jupiter = Jupiter("Jupiter", 80.0, 5, 80)
    var saturn = Saturn("Saturn", 9.449, 6, 83)
    var uranus = Uranus("Uranus", 4.007, 7, 27)
    var neptun = Neptun("Neptun", 3.883, 8, 14)


    var lassPlanet: MutableMap<String, Int> =
        mutableMapOf(
            "Merkur" to 1,
            "Venus" to 2,
            "Erde" to 3,
            "Mars" to 4,
            "Jupiter" to 5,
            "Saturn" to 6,
            "Uranus" to 7,
            "Neptun" to 8,
        )
    // todo name von vogel
    var joker = Witz("Spaßvogel")
    //todo mit dass rufe ich meine frage
    var frage = Fragen("Moderator", 0)
    //todo liste von player 1 und 2

    var spielern: MutableList<Player> = mutableListOf()

    for (i in 1..2) {
        println("Bitte geben Sie den Name des $i Spieler ein : ")
        spielern.add(Player(readln(), 0))
    }

    //todo hier die geben ihre alter
    spielern[0].alterVonplayer1()
    spielern[1].alterVonplayer1()

    //todo das ist von die aktuelleplayer weil die würfeln auch
    var gewinner: Player
    var verloren: Player
    var aktuellePlayer: Player
    println()

    //todo bewegen und vorstellen von user mit jahre
    println("So welcome ${spielern[0].name} und  ${spielern[1].name} bitte fest halten ... ")
    saturn.bewegen()

    //todo ersten wir würfeln dann wir anschaeun wer spielen anfagen
    println()
    println(".. wer als Erster mit den Würfeln beginnt.")
    Thread.sleep(4000)
    gewinner = wuerfeln(spielern[0], spielern[1])
    aktuellePlayer = gewinner
    if (spielern[0] == gewinner) {
        verloren = spielern[1]
    } else {
        verloren = spielern[0]

    }
    println()
    Thread.sleep(3000)

    println("wir anfangen mit erste frage...oou oou oou .. ")

    mars.bewegen()
    Thread.sleep(2000)
    mars.nichtBewegen(spielern[0])

    println("i see you ..")
    Thread.sleep(5000)

    println("jetzt dürfen wir die frage stellen")
    println()
    Thread.sleep(5000)
    //todo erste frage

    if (!frage.ersteFrage(aktuellePlayer)) {
        aktuellePlayer = wechselSpieler(aktuellePlayer, spielern)
        println(aktuellePlayer.name)

    }



    Thread.sleep(5000)
    println()
    println("biete warten ..")
    // todo planet  bewegen...
    neptun.bewegen()
    println()
    venus.bewegenLinks()

    Thread.sleep(5000)
    //todo zweite frage
    println()
    println("zweite Frage jetzt können wir weiter spielen:")

    if (!frage.zweiteFrage(aktuellePlayer)) {
        aktuellePlayer = wechselSpieler(aktuellePlayer, spielern)
        println(aktuellePlayer.name)
    }
    println()


    mars.polizei()
    joker.gerauscht()
    Thread.sleep(5000)

    joker.witz1()
    joker.gerauscht()

    println("Wenn ich dich fange, ich mache dich Grillen . ")
    Thread.sleep(5000)
    println()
    println("pssssssssssss Ruhe , jemand bewegt :")

    //todo planet aktion
    saturn.meteoriten()
    Thread.sleep(5000)
    uranus.blauFarbe()


    //todo tritte frage planet ruft
    println()
    mars.polizeiWieder()

    if (!frage.tritteFrage(aktuellePlayer)) {
        aktuellePlayer = wechselSpieler(aktuellePlayer, spielern)
        println(aktuellePlayer.name)
    }


    Thread.sleep(5000)
    println("pzzzzzzzziiiiiii....pzzzzziiii")
    println("ooooo ein Planet  ruft uns an ..wer ist : ")
    saturn.luft(mars)
    println()
    Thread.sleep(5000)
    println("tok tok ..")
    println("wer ist wieder ich möchte die vierte Frage stellen ???? ")
    Thread.sleep(5000)
    joker.witz2()


    println(" ${lassPlanet.keys.random()} sagt Achtung : ")
    println("Erdbeben, SOS , Erdbeben , ...")

    Thread.sleep(5000)
    //todo planet bewegen
    merkur.dunkel()

    Thread.sleep(5000)
    //todo vierte  frage 3 witz
    println()
    println("ooookkkk ...wo wir geblieben ....cool .. ich bin neugierig  was du antworten")


    if (!frage.vierteFrage(aktuellePlayer)) {
        aktuellePlayer = wechselSpieler(aktuellePlayer, spielern)
        println(aktuellePlayer.name)
    }

    println()
    Thread.sleep(5000)
    venus.glamour()
    joker.gerauscht()
    Thread.sleep(5000)
    joker.witz3()

    //todo willst du weiter spielen ?
    erde.back()
    println("Möchten Sie das Spiel fortsetzen? (Ja / Nein)")
    frage.spieleWeiter()


    //todo fünfte Frage
    println("soo...... du hast kraft und Geduld das ist sehr gut ?ok  wir frage weiter ")
    Thread.sleep(5000)
    if (frage.feunfteFrage(aktuellePlayer) == false) {
        aktuellePlayer = wechselSpieler(aktuellePlayer, spielern)
        println(aktuellePlayer.name)
    }
    println()
    Thread.sleep(5000)
    venus.bewegen()
    println()
    jupiter.masseVonDias()
    println()
    Thread.sleep(5000)

    // todo sechste Frage
    if (frage.sechsteFrage(aktuellePlayer) == false) {
        aktuellePlayer = wechselSpieler(aktuellePlayer, spielern)
        println(aktuellePlayer.name)
    }
    Thread.sleep(5000)
    uranus.platz
    saturn.meteoriten()

    println()
    neptun.bewegen()
    jupiter.bin()
    Thread.sleep(5000)


    //todo siebte Frage
    if (frage.siebteFrage(aktuellePlayer) == false) {
        aktuellePlayer = wechselSpieler(aktuellePlayer, spielern)
        println(aktuellePlayer.name)
    }
    Thread.sleep(5000)
    merkur.umlaufgeschwindigkeit
    neptun.atmen()
    Thread.sleep(5000)


    //todo achte Frage
    if (frage.achteFrage(aktuellePlayer) == false) {
        aktuellePlayer = wechselSpieler(aktuellePlayer, spielern)
        println(aktuellePlayer.name)
    }
    Thread.sleep(5000)
    println("die Planeten schicken uns zurück zur Erde, weil sie sich beruhigen wollen  ")
    println("und natürlich haben wir im Moment keine andere Frage ")
    println()
    println("aber........")
    println()
    Thread.sleep(5000)
    joker.gerauscht()
    joker.witz4()
    Thread.sleep(5000)
    println("jetzt ...Ich habe dich ..... jetzt wirst du sehen (Here is your end.) ..!!!")
    println("tzi....tzi... ou u :( ")
    Thread.sleep(2000)
    println()
    Thread.sleep(2000)
    println("Danke, dass Sie bis zum Ende gespielen haben. ! wir sehen jetzt wer gewonnen hat :P")


    //todo  the end
    Thread.sleep(5000)
    frage.gewonnen()
    Thread.sleep(5000)

    spielern[0].playScore()
    spielern[1].playScore()

    if (spielern[0].playScore() == spielern[1].playScore()) {
        println(
            "Unsere Playern haben gleich punkte deswegen wir würfeln noch ein mal " +
                    "um zu sehen wer der Gewinner ist : "
        )
        wuerfeln2(spielern[0], spielern[1])


    }
    println("unsere plane sind : ${lassPlanet.entries}".trimMargin())


    println(
        """die sagen alle ${lassPlanet.keys.sorted().size} zusammen : das Geschenk des Gewinners : 
            |
            |ist Natürlich  "POMMES" Guten Appetit.""".trimMargin()
    )

    println("                                                       THE END")
}


fun wuerfeln(player1: Player, player2: Player): Player {

    var gewinner = player1

    var player1Roll = Random.nextInt(1, 6)
    println("${player1.name}: Du hast  $player1Roll gewürfelt")
    var player1Roll2 = Random.nextInt(1, 6)
    println("${player2.name}: Du hast  $player1Roll2 gewürfelt")


    if (player1Roll > player1Roll2) {
        gewinner = player1
        println("${player1.name} hat gewonnen er spielt weiter")


    } else if (player1Roll < player1Roll2) {
        gewinner = player2
        println("${player2.name} hat gewonnen er spielt weiter")


    } else {
        println("versuchen sie wieder ")
        wuerfeln(player1, player2)

    }
    return gewinner
}

fun wuerfeln2(player1: Player, player2: Player): Player {

    var gewinner: Player = player1

    var player1Roll = Random.nextInt(1, 6)
    println("${player1.name}: Du hast  $player1Roll gewürfelt")
    var player1Roll2 = Random.nextInt(1, 6)
    println("${player2.name}: Du hast  $player1Roll2 gewürfelt")


    if (player1Roll > player1Roll2) {
        gewinner = player1
        println("${player1.name} noch ein punkte dazu .. du hast gewonnen ")


    } else if (player1Roll < player1Roll2) {
        gewinner = player2
        println("${player2.name} noch ein punkte dazu .. du hast gewonnen ")


    } else {
        println("echt jetzt : versuchen sie wieder ")
        wuerfeln(player1, player2)

    }
    return gewinner
}

fun wechselSpieler(aktuellespielern: Player, spielern: MutableList<Player>): Player {

    if (aktuellespielern == spielern[0]) {
        return spielern[1]
    } else {
        return spielern[0]
    }

}
import kotlin.random.Random
import java.time.*

//todo liste von player 1 und 2
var spielern: MutableList<Player> = mutableListOf()

var startSpiele = LocalTime.now()
//var endSpiele = LocalTime.now().plusMinutes(15)

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

var welcome = "Willkommen im Olympus-Planet spiel "

var welcomeText1 = """Bevor wir mit dem Spiel beginnen,wir erklären 
                      diese planet ist mehr als 10.000 jahren ,
                      gibt keine wasser und wir essen nur pommes ..
    
                      Nicht vergessen alle die hier leben ,die sind über 1000 jahr 
                      und die dürfen kommen hier nur wenn jemand  über 700 jahr alt ist
                      hier wir wollen immer lachen und wenn du glück hast  die richtige antworten 
                      zu finden mit eine Quiz .ist gut.. wenn jemand verloren  schauen mal was passiert"""


//todo hier ich habe meine Planet jede class von ein Plante

val merkur = Merkur("Merkur", 0.382, 1, 0)
val venus = Venus("Venus", 0.949, 2, 0)
val erde = Erde("Erde", 1.00, 3, 1)
val mars = Mars("Mars", 0.532, 4, 2)
var jupiter = Jupiter("Jupiter", 80.0, 5, 80)
var saturn = Saturn("Saturn", 9.449, 6, 83)
var uranus = Uranus("Uranus", 4.007, 7, 27)
var neptun = Neptun("Neptun", 3.883, 8, 14)

fun main() {

    // todo welcome von usere spiel
    println(welcome)
    println(welcomeText1)







    // todo name von vogel im Class
    var joker = Witz("Spaßvogel")
    //todo mit dass rufe ich meine frage von class
    var frage = Fragen("Moderator", 0)

    //todo speichern die name von spieler
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
    println(".. mit  Würfeln sehen uns wer mit  frage anfangen kann.")
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

    println("""wir anfangen mit erste frage...oou oou oou warten. """)
    println()
    mars.nichtBewegen(spielern[0])
    println("i see you ..... ok")
    println()
    Thread.sleep(3000)

    println("ja, jetzt dürfen wir die frage stellen : ")
    println()
    Thread.sleep(2000)
    //todo erste frage

    if (!frage.ersteFrage(aktuellePlayer)) {
        aktuellePlayer = wechselSpieler(aktuellePlayer, spielern)
        println(aktuellePlayer.name)

    }

    Thread.sleep(2000)
    println()
    println("biete warten ..")
    // todo planet  bewegen...
    println()
    //neptun.bewegen()
    Thread.sleep(2000)
    println()
    venus.bewegenLinks()

    Thread.sleep(2000)
    //todo zweite frage
    println()
    println(
        """2️⃣:
zweite Frage jetzt können wir weiter spielen:""".trimMargin()
    )


    if (!frage.zweiteFrage(aktuellePlayer)) {
        aktuellePlayer = wechselSpieler(aktuellePlayer, spielern)
        println(aktuellePlayer.name)
    }
    println()


    mars.polizei()
    println("ooo nein und den Vogel auch ... ")
    joker.gerauscht()


    joker.witz1()
    Thread.sleep(2000)
    joker.gerauscht()

    println("Wenn ich dich fange, ich mache dich Grillen . ")
    Thread.sleep(2000)
    println()
    println("pssssssssssss Ruhe , jemand bewegt :")

    //todo planet aktion
    saturn.meteoriten()
    println()
    Thread.sleep(2000)
    uranus.blauFarbe()


    //todo tritte frage planet ruft
    println()
    Thread.sleep(2000)
    mars.polizeiWieder()
    println()

    println(
        """3️⃣:
tritte Frage jetzt können wir weiter spielen:""".trimMargin())
    if (!frage.tritteFrage(aktuellePlayer)) {
        aktuellePlayer = wechselSpieler(aktuellePlayer, spielern)
        println(aktuellePlayer.name)
    }


    Thread.sleep(2000)
    println("pzzzzzzzziiiiiii....pzzzzziiii")
    println("""ooooo ein Planet ☎️ ruft uns an ..wer ist : """)
    saturn.luft(mars)
    println()
    Thread.sleep(2000)
    println("tok tok ..")
    println("wer ist wieder ich möchte die vierte Frage stellen ???? ")
    Thread.sleep(2000)
    //todo vogel witz 2
    joker.gerauscht()
    joker.witz2()
    joker.gerauscht()

    Thread.sleep(2000)
    //todo planet bewegen
    merkur.dunkel()
    Thread.sleep(2000)

    //todo vierte  frage
    println()
    println("ooookkkk ..cool ...wo wir geblieben ._? a ja bei vierte Frage.. ich bin neugierig  was du antworten..jetzt..")

    println("""4️⃣
vierte Frage jetzt können wir weiter spielen:""".trimMargin())
    if (!frage.vierteFrage(aktuellePlayer)) {
        aktuellePlayer = wechselSpieler(aktuellePlayer, spielern)
        println(aktuellePlayer.name)
    }

    println()
    Thread.sleep(2000)
    venus.glamour()
    // todo vogel 3 witz
    joker.gerauscht()
    Thread.sleep(2000)
    joker.witz3()
    println()
    joker.gerauscht()
    println()

    //todo willst du weiter spielen ?
    println(""" ${lassPlanet.keys.random()} sagt Achtung 📢  : """)
    println("Erdbeben, SOS , Erdbeben ...")
    erde.back()
    println("Möchten Sie das Spiel fortsetzen? (Ja / Nein)")
    frage.spieleWeiter()


    //todo fünfte Frage
    println("soo...... du hast kraft und Geduld das ist sehr gut ?ok  wir frage weiter ")
    Thread.sleep(2000)
    println()

    println("""5️⃣:
fünfte Frage jetzt können wir weiter spielen:""".trimMargin())
    if (frage.feunfteFrage(aktuellePlayer) == false) {
        aktuellePlayer = wechselSpieler(aktuellePlayer, spielern)
        println(aktuellePlayer.name)
    }
    println()
    Thread.sleep(2000)
    venus.bewegen()
    println()
    jupiter.masseVonDias()
    println()
    Thread.sleep(2000)

    // todo sechste Frage
    println()
    println("""6️⃣:
sechste Frage jetzt können wir weiter spielen:""".trimMargin())
    if (frage.sechsteFrage(aktuellePlayer) == false) {
        aktuellePlayer = wechselSpieler(aktuellePlayer, spielern)
        println(aktuellePlayer.name)
    }
    Thread.sleep(2000)
    uranus.platz
    saturn.meteoriten()

    println()
    neptun.bewegen()
    jupiter.bin()
    Thread.sleep(2000)


    //todo siebte Frage
    println()
    println("""7️⃣:
Siebte Frage jetzt können wir weiter spielen:""".trimMargin())
    if (frage.siebteFrage(aktuellePlayer) == false) {
        aktuellePlayer = wechselSpieler(aktuellePlayer, spielern)
        println(aktuellePlayer.name)
    }
    Thread.sleep(2000)
    merkur.umlaufgeschwindigkeit
    neptun.atmen()
    Thread.sleep(2000)


    //todo achte Frage

    println()
    println("""8️⃣:
achte Frage jetzt können wir weiter spielen:""".trimMargin())
    if (frage.achteFrage(aktuellePlayer) == false) {
        aktuellePlayer = wechselSpieler(aktuellePlayer, spielern)
        println(aktuellePlayer.name)
    }
    Thread.sleep(2000)
    println("die Planeten schicken uns zurück zur Erde, weil sie sich beruhigen wollen  ")
    println("und natürlich haben wir im Moment keine andere Frage ")
    println()

    Thread.sleep(2000)
    joker.gerauscht()
    joker.witz4()
    joker.gerauscht()
    Thread.sleep(4000)
    println("jetzt komm ..hier.. jetzt wirst du sehen (Here is your end.) ..!!!")
    println("trillern....trillern.. ")
    Thread.sleep(1000)
    println()
    Thread.sleep(1000)
    println("Danke, dass Sie bis zum Ende gespielen haben. ! wir sehen jetzt wer gewonnen hat :P")


    //todo  the end
    Thread.sleep(5000)
    frage.gewonnen()
    Thread.sleep(5000)

    theEnd()

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
        wuerfeln2(player1, player2)

    }
    return gewinner


}

fun theEnd() {
    var playAgain1 = spielern[0].playScore()
    var playAgain2 = spielern[1].playScore()

    if (playAgain1 == playAgain2) {
        println(
            "Unsere Playern haben gleich punkte deswegen wir würfeln noch ein mal " +
                    "um zu sehen wer der Gewinner ist : "
        )
        wuerfeln2(spielern[0], spielern[1])


    }

    println("unsere plane sind in der Reihe: ${lassPlanet.entries}".trimMargin())


    println(
        """die sagen alle ${lassPlanet.keys.sorted().size} zusammen : das Geschenk des Gewinners  : 
            |
            |ist Natürlich 4: SAGT =  "PIZZA" 🍕 /  4: SAGT = "POMMES"🍟 .
            |OOOO NEIN DIE STREITEN WIEDER 😱: """.trimMargin()

    )
    mars.pommes()
    Thread.sleep(1000)
    venus.pizza()
    Thread.sleep(1000)
    neptun.pommes()
    Thread.sleep(1000)
    jupiter.pizza()
    Thread.sleep(1000)
    uranus.pommes()
    Thread.sleep(1000)
    merkur.pizza()
    Thread.sleep(1000)
    saturn.pommesIstUns()


    println("""                      😐 Erde sagt 😐: ICH SEHE ES  "Wir essen  keine Pommes Heute  THE END" """)


    val difference = Duration.between(startSpiele, LocalTime.now())
    println("""wir haben gebracht in diese Spiel von zeit 🕜 : ${difference.toMinutes()} Minute. Viele dank """)


}

fun wechselSpieler(aktuelleSpielern: Player, spielern: MutableList<Player>): Player {

    return if (aktuelleSpielern == spielern[0]) {
        spielern[1]
    } else {
        spielern[0]
    }

}



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


    //todo hier ich habe meine planete jede class eine var

    var merkur = Merkur("Merkur", 0.382, 1, 0)
    var venus = Venus("Venus", 0.949, 2, 0)
    var erde = Erde("Erde", 1.00, 3, 1)
    var mars = Mars("Mars", 0.532, 4, 2)
    var jupiter = Jupiter("Jupiter", 80.0, 5, 80)
    var saturn = Saturn("Saturn", 9.449, 6, 83)
    var uranus = Uranus("Uranus", 4.007, 7, 27)
    var neptun = Neptun("Neptun", 3.883, 8, 14)

    var joker = Witz("Spaßvogel")

    var frage = Fragen("Moderator", 0)

    // todo hier die user geben irhe name


    //todo liste von player 1

    var spielern: MutableList<Player> = mutableListOf()

    for (i in 1..2) {
        println("Bitte geben Sie den Name des $i Spieler ein : ")
        spielern.add(Player(readln(), 0))


    }
    spielern[0].alterVonplayer1()
    spielern[1].alterVonplayer1()

    var gewinner: Player
    var verloren: Player
    var aktuellePlayer: Player
    println()
    //todo bewegen und vorstellen von user mit jahre
    println("So welcome ${spielern[0].name} und  ${spielern[1].name} bitte fest halten ... ")

    saturn.bewegen()

    //todo ersten wir würfeln dann wir anschaeun wer spielen anfagen
    println()
    println("wer anfange ersten ? xmmm ")
    Thread.sleep(2000)
    gewinner = anakatema(spielern[0], spielern[1])
    aktuellePlayer = gewinner
    if (spielern[0] == gewinner) {
        verloren = spielern[1]
    } else {
        verloren = spielern[0]

    }
    println()


    println("wir anfangen mit erste frage...oou oou oou .. ")
    Thread.sleep(1000)
    mars.bewegen()
    Thread.sleep(1000)
    mars.nichtBewegen(spielern[0])




    println("i see you ..")
    Thread.sleep(2000)
    println("jetzt dürfen wir die frage stellen")
    println()

    //todo erste frage

    if (frage.ersteFrage(aktuellePlayer) == false) {
        aktuellePlayer = wechselSpieler(aktuellePlayer,spielern)
        println(aktuellePlayer.name)

    }




    println()
    println("biete warten ..")
    // todo planet  bewegen...
    mars.bewegen()
    println()
    venus.bewegenLinks()


    //todo zweite frage
    println()
    println("zweite Frage jetzt können wir weiter spielen:")

    if (frage.zweiteFrage(aktuellePlayer) == false) {
        aktuellePlayer = wechselSpieler(aktuellePlayer,spielern)
    println(aktuellePlayer.name)
    }
    println()


    mars.polizei()
    println("o mein Gott Vogel ist wieder da... . !!")
    println("Wenn ich ihn fange, werde ich ihn auf dem Grill zubereiten. ")
    Thread.sleep(5000)
    joker.witz1()
    joker.gerauscht()

    println()
    println("pssssssssssss Ruhe , jemand bewegt :")
    //todo planet aktion

    saturn.meteoriten()
    uranus.blauFarbe()

    aktuellePlayer.name

    //todo tritte frage planet ruft
    println()


    if (frage.tritteFrage(aktuellePlayer) == false) {
        aktuellePlayer = wechselSpieler(aktuellePlayer,spielern)
        println(aktuellePlayer.name)
    }
    println("pzzzzzzzziiiiiii....pzzzzziiii")
    println("ooooo ein Planet  ruft uns an ..wer ist :  ..ooo Esel ruft von :")
    saturn.luft(mars)
    println()
    println("oooo bitte warten zeit zum lachen !!!")
    joker.witz2()

    println("Erdbeben gerade...")


    //todo planet bewegen
    merkur.dunkel()


    //todo vierte  frage 3 witz
    println()
    println("ooookkkk ...wo wir geblieben ....cool .. ich bin neugierig  was du antworten")


    if (frage.vierteFrage(aktuellePlayer) == false) {
        aktuellePlayer = wechselSpieler(aktuellePlayer,spielern)
        println(aktuellePlayer.name)
    }

    println()
    println("oh nein ..nicht wieder .. ")
    venus.glamour()
    joker.witz3()

    //todo willst du weiter spielen ?
    erde.back()
    frage.spieleWeiter()

    //todo fünfte Frage
    println("soo...... du hast kraft und Geduld das ist sehr gut ?ok  wir frage weiter ")

    if (frage.feunfteFrage(aktuellePlayer) == false) {
        aktuellePlayer = wechselSpieler(aktuellePlayer,spielern)
        println(aktuellePlayer.name)
    }
    println()
    venus.bewegen()
    println()
    jupiter.masseVonDias()
    println()
    // todo sechste Frage


    if (frage.sechsteFrage(aktuellePlayer) == false) {
        aktuellePlayer = wechselSpieler(aktuellePlayer,spielern)
        println(aktuellePlayer.name)
    }
    uranus.platz
    saturn.meteoriten()

    println()
    neptun.bewegen()


    //todo siebte Frage
    if (frage.siebteFrage(aktuellePlayer) == false) {
        aktuellePlayer = wechselSpieler(aktuellePlayer,spielern)
        println(aktuellePlayer.name)
    }

    merkur.umlaufgeschwindigkeit
    neptun.atmen()

    //todo achte Frage
    if (frage.achteFrage(aktuellePlayer) == false) {
        aktuellePlayer = wechselSpieler(aktuellePlayer,spielern)
        println(aktuellePlayer.name)
    }

    venus.bewegen()

    println("before wir fertig unsere spiele  wir lesen das letzte witz von : ")
    joker.witz4()
    println("jetzt ...Ich habe dich ..... jetzt wirst du sehen (Here is your end.) ..!!!")
    println("Danke, dass Sie bis zum Ende gespielen haben. ! sehen wir wer ist gewonnen jetzt :P")



    //todo  the end

    frage.gewonnen()
    spielern[0].playScore()
    spielern[1].playScore()
}


fun anakatema(player1: Player, player2: Player): Player {

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
        anakatema(player1, player2)

    }
    return gewinner
}

fun wechselSpieler(aktuellespielern : Player,spielern :MutableList<Player>): Player{

    if(aktuellespielern == spielern[0] ){
        return spielern[1]
    }else{
        return spielern[0]
    }

}
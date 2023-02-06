import kotlin.system.exitProcess

open class Fragen(name: String, score: Int) : Player(name, score) {


    var richtigeAntwort: Boolean = false


    // TODO  erste Runde
    open fun ersteFrage(player: Player): Boolean {

        println("""Welcher  Astronomin entdeckte die Zusammensetzung der Sonne??""".trimMargin()
        )
        println(" A) Platon Porezki")
        println(" B) Cecilia Payne")
        println(" C) Agrippa Bithynios")
        try {

            val frageMitNummer1 = "A"
            val frageMitNummer2 = "B"
            val frageMitNummer3 = "C"


            when (val ersteAntwort = readln().uppercase()) {
                frageMitNummer1 -> {
                    println("""oooooo nein ... sie haben false antworten ,.. in 3 sekunde  Sie werden Eiswürfel ..
                        |wir sendet dich bei planet Mars du bis aus ... """.trimMargin()
                    )
                    richtigeAntwort = false
                    for (i in 3 downTo 1) {
                        if (i in 0..ersteAntwort.hashCode()) {
                            println("$i sekunde noch...")
                        } else {
                            println("$i sekunde noch...")

                        }
                        Thread.sleep(2000)
                    }

                    println("Gutes Einfrieren, bis zum nächsten rude. :) ")
                    println("next player..Bitte :")

                }

                frageMitNummer2 -> {
                    println("Sehr schon , gehen wir zur nächsten Frage .")
                    richtigeAntwort = true
                    player.score += 1
                }

                frageMitNummer3 -> {
                    println("""oooooo nein ...sie haben false antworten.. in 3 sekunde  Sie werden Eiswürfel..
                        | wir sendet dich bei planet Mars du bis aus.""".trimMargin()
                    )
                    this.richtigeAntwort = false
                    for (i in 3 downTo 1) {
                        if (i in 0..ersteAntwort.length) {
                            println("$i sekunde noch...")
                        } else {
                            println("$i sekunde noch...")

                        }
                        Thread.sleep(2000)
                    }

                    println("Gutes Einfrieren, bis zum nächsten rude. :) ")
                    println("next player..Bitte:")

                }


                else -> {
                    println("es gibt keine Richtige Antwort,versuchen Sie es erneut Bitte mit A,B,C")
                    ersteFrage(player)
                }

            }
        } catch (ex: Exception) {
            ex.message
            println("Error: Bitte gib eine gültige antwort ein.")

        }

        return richtigeAntwort
    }


    // TODO zweite Runde
    open fun zweiteFrage(player: Player): Boolean {

        Thread.sleep(1000)
        println("Als die Geschichte des Rucksacks begann BOB(BUG-OUT-BAG)")

        println(" A) Beginnt in der Zeit des Koreakrieges 1950-1953 ")
        println(" B) Beginnt in der Zeit des Koreakrieges 1949-1952 ")
        println(" C) Beginnt in der Zeit des Koreakrieges 1951-1954 ")

        try {

            val frageMitNummer4 = "A"
            val frageMitNummer5 = "B"
            val frageMitNummer6 = "C"

            val zweiteAntwort = readln().uppercase()

            val antwortZweite: String = zweiteAntwort
            when (antwortZweite) {
                frageMitNummer4 -> {
                    println("""perfekt ...gehen wir zur nächsten Frage.""".trimMargin()

                    )
                    richtigeAntwort = true
                    player.score += 1

                }

                frageMitNummer5 -> {
                    println("""tut es mir leid,Sie haben falsch geantwortet. 
                            Sie werden in 3 sekunde eine Esel ...und bleiben sie in Erde  bis next rude """
                    )
                    richtigeAntwort = false
                    (3 downTo 1).forEach { i ->
                        if (i in 0..antwortZweite.length) {
                            println("$i sekunde noch...")
                        } else {
                            println("$i sekunde noch...")

                        }
                        Thread.sleep(3000)
                    }

                    println("viel spaß, bis zum nächsten rude. :) ")
                    println("next player..Bitte :")

                }

                frageMitNummer6 -> {
                    println("""tut es mir leid,Sie haben falsch geantwortet. 
                            |Sie werden in 3 sekunde eine Esel ...und bleiben sie in Mars  bis next rude  :) """.trimMargin()
                    )
                    richtigeAntwort = false
                    println("next player..Bitte")
                    for (i in 3 downTo 1) {
                        if (i in 0..antwortZweite.length) {
                            println("$i sekunde noch...")
                        } else {
                            println("$i sekunde noch...")
                        }
                        Thread.sleep(3000)

                    }
                    println("viel spaß, bis zum nächsten rude. :) ")
                    println("next player..Bitte :")
                }


                else -> {
                    println("es gibt keine Richtige Antwort,versuchen Sie es erneut Bitte mit A,B,C")
                    zweiteFrage(player)
                }

            }
        } catch (ex: Exception) {
            ex.message
            println("Error: Bitte gib eine gültige antwort ein.")

        }

        return richtigeAntwort
    }


    // TODO  dritte Runde
    open fun tritteFrage(player: Player): Boolean {

        println("""Was müssen wir zuerst machen, bevor wir eine notfallrücksack vorbereiten? !!""".trimMargin())
        println()
        println(" A) Umwelt/Bedingungen")
        println(" B) Einwegfahrkarten/Route")
        println(" C) Listen/Geld")
        try {

            val frageMitNummer7 = "A"
            val frageMitNummer8 = "B"
            val frageMitNummer9 = "C"

            val tritteAntwort = readln().uppercase()
            val antwortTritte: String = tritteAntwort
            when (antwortTritte) {
                frageMitNummer7 -> {
                    println(""",..echt jetzt ..
                        |hallooooo ersten muss tu rücksack kaufen ..aber ok ich lasse dich weil du  sympatisch bist.
                        |Ich verschenken dir ein punkte :) :) hhehehehe.""".trimMargin()
                    )
                    richtigeAntwort = true
                    player.score += 1
                }

                frageMitNummer8 -> {
                    println("""...echt jetzt ..... hallooooo ersten muss tu rucksack kaufen  :) :) hhehehehe. """)
                    richtigeAntwort = false
                    for (i in 3 downTo 1) {
                        if (i in 0..tritteAntwort.length) {
                            println("$i sekunde noch...")
                        } else {
                            println("$i sekunde noch...")

                        }
                        Thread.sleep(2000)
                    }
                    println("next player..Bitte : ")

                }

                frageMitNummer9 -> {
                    println("""echt jetzt ... Hallooooo ersten muss tu rucksack kaufen  :) :) hhehehehe.
                        |das geld  ich ..... . :O  :( ooo nein, einen Dieb ist da .""".trimMargin()
                    )
                    richtigeAntwort = false
                    for (i in 3 downTo 1) {
                        if (i in 0..tritteAntwort.length) {
                            println("$i sekunde noch...")
                        } else {
                            println("$i sekunde noch...")

                        }
                        Thread.sleep(2000)
                    }
                    println("""und jetzt was hast du verstanden .. wir sind beide ohne geld geblieben ... pfff 
                        |und keine pommes  essen ??!! ..hat uns beiden geklaut  :( du bist aus ... """.trimMargin())
                    println("next player..Bitte")

                    Thread.sleep(2000)
                }


                else -> {
                    println("es gibt keine Richtige Antwort,versuchen Sie es erneut Bitte mit A,B,C")
                    tritteFrage(player)
                }

            }
        } catch (ex: Exception) {
            ex.message
            println("Error: Bitte gib eine gültige antwort ein.")

        }

        return richtigeAntwort
    }


    //todo  vierte Runde
    open fun vierteFrage(player: Player): Boolean {
        print("jetzt sehen uns etwas andere ...  ")
        println("""Wer ist der Satellit der Erde? ? !!""".trimMargin()
        )
        println()
        println(" A) der Mond ")
        println(" B) Die Aphrodite /Venus")
        println(" C) der Klöppel (krone)")
        try {

            val frageMitNummer7 = "A"
            val frageMitNummer8 = "B"
            val frageMitNummer9 = "C"

            val tetartiAntwort = readln().uppercase()

            val antwortvier: String = tetartiAntwort
            when (antwortvier) {
                frageMitNummer7 -> {
                    println(
                        """Du bist gut ..ok ..macht weiter!!""".trimMargin())
                    richtigeAntwort = true
                    player.score += 1
                }

                frageMitNummer8 -> {
                    println("""du hast verloren, du werdest einen Flamingo mit rosa Rock  in.... """
                    )
                    richtigeAntwort = false
                    for (i in 3 downTo 1) {
                        if (i in 0..tetartiAntwort.length) {
                            println("$i sekunde noch...")
                        } else {
                            println("$i sekunde noch...")

                        }
                        Thread.sleep(2000)
                    }
                    println("next player..Bitte :")

                }

                frageMitNummer9 -> {
                    println("""leider falsch antworten ..du werdest ein UFO  ,keine Hoffnung  E.t. ist nicht da   .""")
                    richtigeAntwort = false
                    for (i in 3 downTo 1) {
                        if (i in 0..tetartiAntwort.length) {
                            println("$i sekunde noch...")
                        } else {
                            println("$i sekunde noch...")

                        }
                        Thread.sleep(2000)
                        println("bb.... bb .... wzzzziiiiiib")

                    }

                    println("next player..Bitte :")
                }


                else -> {
                    println("es gibt keine Richtige Antwort,versuchen Sie es erneut Bitte mit A,B,C")
                    vierteFrage(player)
                }

            }
        } catch (ex: Exception) {
            ex.message
            println("Error: Bitte gib eine gültige antwort ein.")

        }

        return richtigeAntwort
    }


    // TODO  play weiter yes or no
    open fun spieleWeiter() {

        when (readln().trim().uppercase()) {
            "NEIN" -> {
                println("Das Spiel wird beendet. Schade, dass du nicht weiter spielen willst.")
                exitProcess(0)

            }
        }
    }


    //todo  fünfte Runde
    open fun feunfteFrage(player: Player): Boolean {

        println("""Wer hat behauptet, dass Hermes und Apollo derselbe Planet sind_?""".trimMargin())
        println()
        println(" A) Mariner 10")
        println(" B) Pythagoras")
        println(" C) Tim. Alexandro")
        try {

            val frageMitNummer10 = "A"
            val frageMitNummer11 = "B"
            val frageMitNummer12 = "C"

            val ersteAntwort = readln().uppercase()

            //val firstAntwort: String = ersteAntwort
            when (ersteAntwort) {
                frageMitNummer10 -> {
                    println("""oooooo nein ... sie haben false antworten ,.. in 3 sekunde  senden wir dich in planet Hermes 
                    |...bis next rude...""".trimMargin()
                    )
                    richtigeAntwort = false
                    for (i in 3 downTo 1) {
                        if (i in 0..ersteAntwort.length) {
                            println("$i sekunde noch...")
                        } else {
                            println("$i sekunde noch...")

                        }
                        Thread.sleep(2000)
                    }

                    println("next player..Bitte :")
                }

                frageMitNummer11 -> {
                    println("Sehr schon , gehen wir zur nächsten Frage .")
                    richtigeAntwort = true
                    player.score += 1
                }

                frageMitNummer12 -> {
                    println("""oooooo nein ... sie haben false antworten ,.. in 5 sekunde  Sie werden ein Komet  ...... """)
                    richtigeAntwort = false
                    for (i in 5 downTo 1) {
                        if (i in 0..ersteAntwort.length) {
                            println("$i sekunde noch...")
                        } else {
                            println("$i sekunde noch...")

                        }
                        Thread.sleep(2000)
                    }
                    println("next player..Bitte :")

                }


                else -> {
                    println("es gibt keine Richtige Antwort,versuchen Sie es erneut Bitte mit A,B,C")
                    feunfteFrage(player)
                }

            }
        } catch (ex: Exception) {
            ex.message
            println("Error: Bitte gib eine gültige antwort ein.")

        }

        return richtigeAntwort
    }


    //todo  sechste Runde
    open fun sechsteFrage(player: Player): Boolean {

        println(
            """Welcher Planet hat die meisten Satelliten??""".trimMargin()
        )
        println()

        println(" A) Mars/Dias")
        println(" B) Saturn/Kronos")
        println(" C) Uranos")
        try {

            val frageMitNummer7 = "A"
            val frageMitNummer8 = "B"
            val frageMitNummer9 = "C"

            val tritteAntwort = readln().uppercase()

            val antwortTritte: String = tritteAntwort
            when (antwortTritte) {
                frageMitNummer7 -> {
                    println(
                        """leider war nicht die richtige antwort .Der Planet Dias  hat 80 Satelliten, aber der Planet kronos (Saturn) hat mehr. """.trimMargin()
                    )
                    richtigeAntwort = false
                    println("in 3 sekunde Abflug um den Planeten Mars, um die Satelliten zu sehen  ")
                    for (i in 3 downTo 1) {
                        if (i in 0..tritteAntwort.length) {
                            println("$i sekunde noch...")
                        } else {
                            println("$i sekunde noch...")

                        }
                        Thread.sleep(2000)
                        println("next player..Bitte :")
                    }
                }

                frageMitNummer8 -> {
                    println(
                        """genau sehr gut .. kronos hat 83 Satelliten   """
                    )
                    richtigeAntwort = true

                    player.score += 1

                }

                frageMitNummer9 -> {
                    println(
                        """Leider nein Uranos hat nur 27 """.trimMargin()
                    )
                    println("in 3 sekunde Abflug um den Planeten Uranos, um die Satelliten zu sehen  ")
                    richtigeAntwort = false
                    for (i in 3 downTo 1) {
                        if (i in 0..tritteAntwort.length) {
                            println("$i sekunde noch...")
                        } else {
                            println("$i sekunde noch...")

                        }
                        Thread.sleep(2000)
                        println("next player..Bitte:")
                    }


                }


                else -> {
                    println("es gibt keine Richtige Antwort,versuchen Sie es erneut Bitte mit A,B,C")
                    sechsteFrage(player)
                }

            }
        } catch (ex: Exception) {
            ex.message
            println("Error: Bitte gib eine gültige antwort ein.")

        }
        return richtigeAntwort

    }


    //todo  siebte Runde
    open fun siebteFrage(player: Player): Boolean {

        println("""Da ist ein großer, heller Stern, wenn ich mich ihm nähere, verglühe ich. Was ist das?""".trimMargin())
        println()
        println(" A) Ursa Major")
        println(" B) Sonne")
        println(" C) Aquila")
        try {

            val frageMitNummer7 = "A"
            val frageMitNummer8 = "B"
            val frageMitNummer9 = "C"

            val tritteAntwort = readln().uppercase()

            val antwortTritte: String = tritteAntwort
            when (antwortTritte) {
                frageMitNummer7 -> {
                    println("""falsche Antwort ...Es ist seit jeher das bekannteste Sternbild, was den Teil mit der charakteristischen 
                            |"Topf"- oder "Pflug"-Form betrifft. Als flächenmäßig drittgrößte Konstellation.  """.trimMargin())

                    for (i in 3 downTo 1) {
                        if (i in 0..tritteAntwort.length) {
                            println("$i sekunde noch...")
                        } else {
                            println("$i sekunde noch...")

                        }
                        Thread.sleep(2000)
                        println("next player..Bitte :")
                    }
                }

                frageMitNummer8 -> {
                    println(
                        """genau Richtig  ..unsere Sonne    """
                    )
                    richtigeAntwort = true
                    player.score += 1

                }

                frageMitNummer9 -> {
                    println("""Leider nein Adler... ist ein Sternbild, das bereits in der Antike von Ptolemäus 
                            |beschrieben wurde und zu den 88 offiziellen Sternbildern der Internationalen 
                            |Astronomischen Union gehört.""".trimMargin())

                    for (i in 3 downTo 1) {
                        if (i in 0..tritteAntwort.length) {
                            println("$i sekunde noch...")
                        } else {
                            println("$i sekunde noch...")

                        }
                        Thread.sleep(2000)
                        println("next player..Bitte:")
                    }


                }


                else -> {
                    println("es gibt keine Richtige Antwort,versuchen Sie es erneut Bitte mit A,B,C")
                    siebteFrage(player)
                }

            }
        } catch (ex: Exception) {
            ex.message
            println("Error: Bitte gib eine gültige antwort ein.")

        }
        return richtigeAntwort

    }


    //todo achte Runde
    open fun achteFrage(player: Player): Boolean {

        println("""wie viel  Satelliten der Planet Mars hat ?""".trimMargin())
        println()

        println(" A) 17")
        println(" B) 2")
        println(" C) 8")
        try {

            val frageMitNummer7 = "A"
            val frageMitNummer8 = "B"
            val frageMitNummer9 = "C"

            val tritteAntwort = readln().uppercase()

            val antwortTritte: String = tritteAntwort
            when (antwortTritte) {
                frageMitNummer7 -> {
                    println("""falsche Antwort ...hat nur  2 sind : Angst und Dimmos """.trimMargin())
                    println("in 3 sekunden du werdest ein sterne ich überlegen dich hier zu lassen ")
                    richtigeAntwort = false
                    for (i in 3 downTo 1) {
                        if (i in 0..tritteAntwort.length) {
                            println("$i sekunde noch...")
                        } else {
                            println("$i sekunde noch...")

                        }
                        Thread.sleep(2000)
                        println("next player..Bitte :")
                    }
                }

                frageMitNummer8 -> {
                    println("""genau Richtig  .Angst und Dimmos  sind die Satelliten """)
                    richtigeAntwort = true
                    player.score += 1

                }

                frageMitNummer9 -> {
                    println("""falsche Antwort ...hat nur  2 sind : Angst und Dimmos """.trimMargin()
                    )
                    richtigeAntwort = false
                    println("in 3 sekunden du werdest ein sterne ich überlegen dich hier zu lassen ")

                    for (i in 3 downTo 1) {
                        if (i in 0..tritteAntwort.length) {
                            println("$i sekunde noch...")
                        } else {
                            println("$i sekunde noch...")

                        }
                        Thread.sleep(2000)
                        println("next player..Bitte :")
                    }


                }


                else -> {
                    println("es gibt keine Richtige Antwort,versuchen Sie es erneut Bitte mit A,B,C")
                    achteFrage(player)
                }

            }
        } catch (ex: Exception) {
            ex.message
            println("Error: Bitte gib eine gültige antwort ein.")

        }
        return richtigeAntwort

    }


    //todo wer hat gewonnen
    open fun gewonnen() {
        Thread.sleep(5000)
        for (i in 10 downTo 1) {
            if (i in 0..5) {
                println("$i Minuten noch...")
            } else {
                println("$i Minute noch...")
            }
            Thread.sleep(2000)
        }

    }


}

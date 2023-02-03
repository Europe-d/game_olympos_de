open class Fragen(name: String, score: Int) : Player(name, score) {


    var richtigeAntworten: Boolean = false


    // TODO a: ερωτηση a δευτεροs γυρος
    open fun ersteFrage(player: Player): Boolean {

        println(
            """mit einem Notfallrucksack für wie viele Stunden man 
               kann ohne Probleme überleben, indem man einen festen Punkt ansteuert?""".trimMargin()
        )
        println(" A) 42 ")
        println(" B) 72 ")
        println(" C) 84 ")
        try {

            val erwthsh1 = "A"
            val erwthsh2 = "B"
            val erwthsh3 = "C"

            val ersteAntwort = readln().uppercase()


            when (ersteAntwort) {
                erwthsh1 -> {
                    println("""oooooo nein ... sie haben false antworten ,.. in 3 sekunde  Sie werden Eiswürfel und wir sendet dich bei planet Mars/Aris bis next rude... """)
                    richtigeAntworten = false
                    for (i in 3 downTo 1) {
                        if (i in 0..ersteAntwort.length) {
                            println("$i sekunde noch...")
                        } else {
                            println("$i sekunde noch...")

                        }
                        Thread.sleep(1000)
                    }

                    println("Gutes Einfrieren, bis zum nächsten rude. :) ")
                    println("next player..Bitte")

                }

                erwthsh2 -> {
                    println("Sehr schon , gehen wir zur nächsten Frage .")
                    richtigeAntworten = true
                    player.score += 1
                }

                erwthsh3 -> {
                    println("""oooooo nein ... sie haben false antworten ,.. in 3 sekunde  Sie werden Eis bis next rude... """)
                    richtigeAntworten = false
                    for (i in 3 downTo 1) {
                        if (i in 0..ersteAntwort.length) {
                            println("$i sekunde noch...")
                        } else {
                            println("$i sekunde noch...")

                        }
                        Thread.sleep(1000)
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

        return richtigeAntworten
    }


    // TODO b: ερωτηση β δευτεροσ γυρος
    open fun zweiteFrage(player: Player): Boolean {

        Thread.sleep(3000)
        println("Als die Geschichte des Rucksacks begann BOB(BUG-OUT-BAG)")

        println(" A) Beginnt in der Zeit des Koreakrieges 1950-1953 ")
        println(" B) Beginnt in der Zeit des Koreakrieges 1949-1952 ")
        println(" C) Beginnt in der Zeit des Koreakrieges 1951-1954 ")

        try {

            val erwthsh4 = "A"
            val erwthsh5 = "B"
            val erwthsh6 = "C"

            val zweiteAntwort = readln().uppercase()

            val antwortZweite: String = zweiteAntwort
            when (antwortZweite) {
                erwthsh4 -> {
                    println(
                        """perfekt ...gehen wir zur nächsten Frage.""".trimMargin()

                    )
                    richtigeAntworten = true
                    player.score += 1

                }

                erwthsh5 -> {
                    println(
                        """tut es mir leid,Sie haben falsch geantwortet. 
                            Sie werden in 3 sekunde eine Esel ...und bleiben sie in Erde  bis next rude """
                    )
                    richtigeAntworten = false
                    for (i in 3 downTo 1) {
                        if (i in 0..antwortZweite.length) {
                            println("$i sekunde noch...")
                        } else {
                            println("$i sekunde noch...")

                        }
                        Thread.sleep(3000)
                        //sound
                    }

                    println("viel spaß, bis zum nächsten rude. :) ")
                    println("next player..Bitte")

                }

                erwthsh6 -> {
                    println(
                        """tut es mir leid,Sie haben falsch geantwortet. 
                            |Sie werden in 3 sekunde eine Ezel ...und bleiben sie in Farmer  bis next rude  :) """.trimMargin()
                    )
                    richtigeAntworten = false
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
                    println("next player..Bitte")
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

        return richtigeAntworten
    }


    // TODO c: τριτος γυρος ερωτησεων
    open fun tritteFrage(player: Player): Boolean {

        println(
            """Was müssen wir zuerst machen, bevor wir eine notfallrücksack vorbereiten? !!""".trimMargin()
        )
        println()

        println(" A) Umwelt/Bedingungen")
        println(" B) Einwegfahrkarten/Route")
        println(" C) Listen/Geld")
        try {

            val erwthsh7 = "A"
            val erwthsh8 = "B"
            val erwthsh9 = "C"

            val tritteAntwort = readln().uppercase()

            val antwortTritte: String = tritteAntwort
            when (antwortTritte) {
                erwthsh7 -> {
                    println(
                        """,..echt jetzt ..
                        |hallooooo ersten muss tu rucksack kaufen ..aber ok ich lasse dich weil du bist sympatisch 
                        | next frage ..ich verschenken dir ein punkte :) :) hhehehehe.""".trimMargin()
                    )
                    richtigeAntworten = true
                    player.score += 1
                }

                erwthsh8 -> {
                    println(
                        """...echt jetzt ..... hallooooo ersten muss tu rucksack kaufen  :) :) hhehehehe. """
                    )
                    richtigeAntworten = false
                    for (i in 3 downTo 1) {
                        if (i in 0..tritteAntwort.length) {
                            println("$i sekunde noch...")
                        } else {
                            println("$i sekunde noch...")

                        }
                        Thread.sleep(3000)

                    }
                    println("next player..Bitte : ")

                }

                erwthsh9 -> {
                    println(
                        """echt jetzt ... Hallooooo ersten muss tu rucksack kaufen  :) :) hhehehehe.
                        |das geld  ich ..... . :O  :( 
                        |
                        |ooo nein, einen Dieb ist da .""".trimMargin()
                    )
                    richtigeAntworten = false
                    for (i in 3 downTo 1) {
                        if (i in 0..tritteAntwort.length) {
                            println("$i sekunde noch...")
                        } else {
                            println("$i sekunde noch...")

                        }
                        Thread.sleep(3000)
                    }
                    println(
                        """und jetzt was hast du verstanden .. wir sind beide ohne geld geblieben ... pfff 
                     und keine pommes  essen ??? ..hat uns beiden geklaut  :( du bist aus ..bis next rude .. """
                    )
                    println("next player..Bitte")


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

        return richtigeAntworten
    }


    //todo tetart erotisi
    open fun vierteFrage(player: Player): Boolean {
        print("jetzt sehen uns etwas andere ...  ")
        println(
            """Wer ist der Satellit der Erde? ? !!""".trimMargin()
        )
        println()

        println(" A) der Mond ")
        println(" B) Die Aphrodite /Venus")
        println(" C) der Klöppel (krone)")
        try {

            val erwthsh7 = "A"
            val erwthsh8 = "B"
            val erwthsh9 = "C"

            val tetartiAntwort = readln().uppercase()

            val antwortvier: String = tetartiAntwort
            when (antwortvier) {
                erwthsh7 -> {
                    println(
                        """Du bist gut ..ok ..macht weiter!!""".trimMargin()
                    )
                    richtigeAntworten = true
                    player.score += 1
                }

                erwthsh8 -> {
                    println(
                        """du hast verloren, du werdest einen Flamingo mit rosa Rock  in.... """
                    )
                    richtigeAntworten = false
                    for (i in 3 downTo 1) {
                        if (i in 0..tetartiAntwort.length) {
                            println("$i sekunde noch...")
                        } else {
                            println("$i sekunde noch...")

                        }
                        Thread.sleep(3000)
                    }
                    println("Es ist dunkel, ich weiß ... warte bis zum Morgen, dann wird es dämmern.  :) ")
                    println("next player..Bitte")

                }

                erwthsh9 -> {
                    println(
                        """leider falsch antworten ..du werdest ein UFO  ,keine Hoffnung  E.t. ist nicht da   ."""
                    )
                    richtigeAntworten = false
                    for (i in 3 downTo 1) {
                        if (i in 0..tetartiAntwort.length) {
                            println("$i sekunde noch...")
                        } else {
                            println("$i sekunde noch...")

                        }
                        Thread.sleep(3000)
                        println("bb.... bb .... wzzzziiiiiib")
                        println("next player..Bitte")
                    }


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

        return richtigeAntworten
    }


    // TODO d: play weiter yes or no
    open fun spieleWeiter() {
        val antworten = readLine()!!.trim()

        when (antworten) {
            "Nein" -> {
                println("Das Spiel wird beendet. Schade, dass du nicht weiter spielen willst.")
                System.exit(0)
            }
        }
    }



//todo pempti erotisi
open fun feunfteFrage(player: Player): Boolean {

    println(
        """Wer hat behauptet, dass Hermes und Apollo derselbe Planet sind_?""".trimMargin()
    )
    println(" A) Mariner 10")
    println(" B) Pythagoras")
    println(" C) Tim. Alexandro")
    try {

        val erwthsh10 = "A"
        val erwthsh11 = "B"
        val erwthsh12 = "C"

        val ersteAntwort = readln().uppercase()

        //val firstAntwort: String = ersteAntwort
        when (ersteAntwort) {
            erwthsh10 -> {
                println(
                    """oooooo nein ... sie haben false antworten ,.. in 3 sekunde  senden wir dich in planet Hermes 
                    |...bis next rude...er gibt deine straffe """.trimMargin()
                )
                richtigeAntworten = false
                for (i in 3 downTo 1) {
                    if (i in 0..ersteAntwort.length) {
                        println("$i sekunde noch...")
                    } else {
                        println("$i sekunde noch...")

                    }
                    Thread.sleep(1000)
                }

                println("next player..Bitte")
            }

            erwthsh11 -> {
                println("Sehr schon , gehen wir zur nächsten Frage .")
                richtigeAntworten = true
                player.score += 1
            }

            erwthsh12 -> {
                println("""oooooo nein ... sie haben false antworten ,.. in 5 sekunde  Sie werden ein Komet  ...... """)
                richtigeAntworten = false
                for (i in 5 downTo 1) {
                    if (i in 0..ersteAntwort.length) {
                        println("$i sekunde noch...")
                    } else {
                        println("$i sekunde noch...")

                    }
                    Thread.sleep(1000)
                }


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

    return richtigeAntworten
}


//todo ekti erotisi
open fun sechsteFrage(player: Player): Boolean {

    println(
        """Welcher Planet hat die meisten Satelliten??""".trimMargin()
    )
    println()

    println(" A) Mars/Dias")
    println(" B) Saturn/Kronos")
    println(" C) Uranos")
    try {

        val erwthsh7 = "A"
        val erwthsh8 = "B"
        val erwthsh9 = "C"

        val tritteAntwort = readln().uppercase()

        val antwortTritte: String = tritteAntwort
        when (antwortTritte) {
            erwthsh7 -> {
                println(
                    """leider war nicht die richtige antwort .Der Planet Dias  hat 80 Satelliten, aber der Planet kronos (Saturn) hat mehr. """.trimMargin()
                )
                richtigeAntworten = false
                println("in 3 sekunde Abflug um den Planeten Mars, um die Satelliten zu sehen  ")
                for (i in 3 downTo 1) {
                    if (i in 0..tritteAntwort.length) {
                        println("$i sekunde noch...")
                    } else {
                        println("$i sekunde noch...")

                    }
                    Thread.sleep(3000)
                    println("next player..Bitte")
                }
            }

            erwthsh8 -> {
                println(
                    """genau sehr gut .. kronos hat 83 Satelliten   """
                )
                richtigeAntworten = true

                player.score += 1

            }

            erwthsh9 -> {
                println(
                    """Leider nein Uranos hat nur 27 """.trimMargin()
                )
                println("in 3 sekunde Abflug um den Planeten Uranos, um die Satelliten zu sehen  ")
                richtigeAntworten = false
                for (i in 3 downTo 1) {
                    if (i in 0..tritteAntwort.length) {
                        println("$i sekunde noch...")
                    } else {
                        println("$i sekunde noch...")

                    }
                    Thread.sleep(3000)
                }
                println(

                )
                println("next player..Bitte")


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
    return richtigeAntworten

}


//todo ebdomi  erotisi
open fun siebteFrage(player: Player): Boolean {

    println(
        """Da ist ein großer, heller Stern, wenn ich mich ihm nähere, verglühe ich. Was ist das?""".trimMargin()
    )
    println()

    println(" A) Ursa Major")
    println(" B) Sonne")
    println(" C) Aquila")
    try {

        val erwthsh7 = "A"
        val erwthsh8 = "B"
        val erwthsh9 = "C"

        val tritteAntwort = readln().uppercase()

        val antwortTritte: String = tritteAntwort
        when (antwortTritte) {
            erwthsh7 -> {
                println(
                    """falsche Antwort ...Es ist seit jeher das bekannteste Sternbild, was den Teil mit der charakteristischen 
                            |"Topf"- oder "Pflug"-Form betrifft. Als flächenmäßig drittgrößte Konstellation.  """.trimMargin()
                )

                for (i in 3 downTo 1) {
                    if (i in 0..tritteAntwort.length) {
                        println("$i sekunde noch...")
                    } else {
                        println("$i sekunde noch...")

                    }
                    Thread.sleep(3000)
                    println("next player..Bitte")
                }
            }

            erwthsh8 -> {
                println(
                    """genau Richtig  ..unsere Sonne    """
                )
                richtigeAntworten = true
                player.score += 1

            }

            erwthsh9 -> {
                println(
                    """Leider nein Adler... ist ein Sternbild, das bereits in der Antike von Ptolemäus 
                            |beschrieben wurde und zu den 88 offiziellen Sternbildern der Internationalen 
                            |Astronomischen Union gehört.""".trimMargin()
                )

                for (i in 3 downTo 1) {
                    if (i in 0..tritteAntwort.length) {
                        println("$i sekunde noch...")
                    } else {
                        println("$i sekunde noch...")

                    }
                    Thread.sleep(3000)
                }
                println(

                )
                println("next player..Bitte:")


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
    return richtigeAntworten

}


//todo ebdomi  erotisi
open fun achteFrage(player: Player): Boolean {

    println(
        """wie viel  Satelliten der Planet Mars hat ?""".trimMargin()
    )
    println()

    println(" A) 17")
    println(" B) 2")
    println(" C) 8")
    try {

        val erwthsh7 = "A"
        val erwthsh8 = "B"
        val erwthsh9 = "C"

        val tritteAntwort = readln().uppercase()

        val antwortTritte: String = tritteAntwort
        when (antwortTritte) {
            erwthsh7 -> {
                println(
                    """falsche Antwort ...hat nur  2 sind : Angst und Dimmos """.trimMargin()
                )
                println("in 3 sekunden du werdest ein sterne ich überlegen dich hier zu lassen ")
                richtigeAntworten = false
                for (i in 3 downTo 1) {
                    if (i in 0..tritteAntwort.length) {
                        println("$i sekunde noch...")
                    } else {
                        println("$i sekunde noch...")

                    }
                    Thread.sleep(3000)
                    println("next player..Bitte")
                }
            }

            erwthsh8 -> {
                println(
                    """genau Richtig  .Angst und Dimmos  sind die Satelliten   """
                )
                richtigeAntworten = true
                player.score += 1

            }

            erwthsh9 -> {
                println(
                    """falsche Antwort ...hat nur  2 sind : Angst und Dimmos """.trimMargin()
                )
                richtigeAntworten = false
                println("in 3 sekunden du werdest ein sterne ich überlegen dich hier zu lassen ")

                for (i in 3 downTo 1) {
                    if (i in 0..tritteAntwort.length) {
                        println("$i sekunde noch...")
                    } else {
                        println("$i sekunde noch...")

                    }
                    Thread.sleep(3000)
                }
                println(

                )


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
    return richtigeAntworten

}


//todo gia to poios tha kerdisei
open fun gewonnen() {
    Thread.sleep(2000)
    for (i in 10 downTo 1) {
        if (i in 0..5) {
            println("$i Minuten noch...")
        } else {
            println("$i Minute noch...")
        }
        Thread.sleep(4000)
    }
    // println("unsere gewonnen ist : ${Player(aktuelleSpieler)}")

}
}

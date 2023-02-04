open class Planet(var namePlanet: String, var umlaufgeschwindigkeit: Double, var platz: Int,var satelliten: Int) {


    open fun bewegen() {

        println("wir bewegen geraden ..bitte aufpassen Sie die Meteoriten ")
    }


    open fun meteoriten() {

        println("${this.namePlanet} werden mit hoher Geschwindigkeit, etwas 1000 Meter pro Sekunde, abgeschossen")
    }


    open fun bewegenLinks() {
        this.umlaufgeschwindigkeit += (umlaufgeschwindigkeit * 3.5)
        println("""unsere planet  bewegen gerade links weil ${namePlanet}  er dreht sich um die Sonne 
            |mit einer durchschnittlichen Geschwindigkeit ${umlaufgeschwindigkeit} Kilometern pro Sekunde""".trimMargin())
    }

    open fun bewegenRecht() {
        this.umlaufgeschwindigkeit += (umlaufgeschwindigkeit * 4.3)
        println("""unsere planet  bewegen gerade Recht weil ${namePlanet}  mit einer durchschnittlichen 
                    Geschwindigkeit von  ${umlaufgeschwindigkeit} Kilometern pro Sekunde""")
    }



}


/**
 *
 * Η Σελήνη είναι ο μοναδικός φυσικός δορυφόρος της Γης και
 * ο πέμπτος μεγαλύτερος φυσικός δορυφόρος του ηλιακού συστήματος.
 * Πήρε το όνομά του από τη Σελήνη, αρχαιοελληνική θεά του δορυφόρου αυτού.
 * Λέγεται επίσης και «Φεγγάρι» στη δημοτική γλώσσα. Βικιπαίδεια
 * Ηλικία: 4,53e9 έτη
 * Πυκνότητα: 3,34 g/cm³
 * Απόσταση από τη Γη: 384.400 χλμ.
 * Βαρύτητα: 1,62 m/s²
 * Ακτίνα: 1.737,4 χλμ.
 * Τροχιακή περίοδος: 27 ημέρες
 * Εμφανές μέγεθος (V): -12,74
 */
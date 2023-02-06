open class Mars(namePlanet: String, umlaufgeschwindigkeit: Double, platz: Int, satelliten: Int) :
    Planet(namePlanet = namePlanet, umlaufgeschwindigkeit = umlaufgeschwindigkeit, platz = platz,satelliten = satelliten) {


    open fun nichtBewegen(player: Player) {

        println(
            """UFO sind da... wir dürfen  keine frage jetzt stelle und nicht bewegen ..
                |Erst müssen sie uns kontrollieren..ob wir pommes dabei haben !!!. Hey, du ..${player.name}..versteckst die Kartoffeln.""".trimMargin())
    }


    open fun polizei() {

        println("${this.namePlanet}  hat unsere kometen geärgert .of of  die polizei-UFO kommt wieder ")

    }

    open fun polizeiWieder() {
        println("""${this.namePlanet} hat wieder unsere kometen geärgert ...... die Polizisten-UFO  haben die Pommes gerochen ...OO NEIN keine Pommes mehr """.trimMargin())
    }

}


/**
 * Ο Άρης είναι ο τέταρτος σε απόσταση από τον Ήλιο πλανήτης του Ηλιακού μας Συστήματος, ο δεύτερος πλησιέστερος στη Γη, και ο έβδομος σε διαστάσεις και μάζα του Ηλιακού Συστήματος. Βικιπαίδεια
 * Δορυφόροι: Φόβος, Δείμος Τάσεις
 * Ηλικία: 4,603e9 έτη
 * Πυκνότητα: 3,93 g/cm³
 * Βαρύτητα: 3,721 m/s²
 * Ακτίνα: 3.389,5 χλμ.
 * Εμφανές μέγεθος (V): -2,91
 * Συντεταγμένες: RA 4h 28m 46s | Απόκ. +24° 27′ 46″
 */
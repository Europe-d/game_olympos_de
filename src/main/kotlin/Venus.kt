open class Venus(namePlanet: String, umlaufgeschwindigkeit: Double, platz: Int, satelliten: Int) :
    Planet(
        namePlanet = namePlanet,
        umlaufgeschwindigkeit = umlaufgeschwindigkeit,
        platz = platz,
        satelliten = satelliten
    ) {


    open fun glamour() {

        println("""Achtung die Venus ist der Planet, der auf seiner Umlaufbahn der Erdbahn 
mit einem minimalen Abstand von 38 Millionen Kilometern am nächsten kommt. """.trimMargin())
    }



    //Diese besteht zu 96 % aus Kohlenstoffdioxid und ihr Oberflächendruck ist 90-mal höher als auf der Erde.
}

/**
 * Η Αφροδίτη είναι ο δεύτερος σε απόσταση από τον Ήλιο πλανήτης του Ηλιακού Συστήματος.
 * Είναι το πιο λαμπρό αντικείμενο στον νυκτερινό ουρανό μετά τη Σελήνη. Ονομάζεται από το λαό Αυγερινός ή Αποσπερίτης.

 * Απόλυτο μέγεθος: -4,47
 * Ηλικία: 4,503e9 έτη
 * Πυκνότητα: 5,24 g/cm³
 * Βαρύτητα: 8,87 m/s²
 * Ακτίνα: 6.051,8 χλμ.
 * Εμφανές μέγεθος (V): -4,14
 * Συντεταγμένες: RA 22h 35m 29s | Απόκ. -10° 29′ 53″
 */
open class Jupiter(namePlanet: String, umlaufgeschwindigkeit: Double, platz: Int, satelliten: Int) :
    Planet(
        namePlanet = namePlanet,
        umlaufgeschwindigkeit = umlaufgeschwindigkeit,
        platz = platz,
        satelliten = satelliten
    ) {


    open fun masseVonDias() {

        println(
            """ ${namePlanet} : hat für uns ein info, Seine Masse ist 318-mal so groß wie die der Erde und 2,5-mal so groß
wie die aller Planeten und Satelliten. Sein Volumen ist 1.321 Mal so groß wie das der Erde"""
        )

    }

    open fun bin() {

        println("Jupiter : Ich bin der größte Planet des Sonnensystems in Bezug auf Größe und Masse. ho ho ho ..")
    }

}


/**
 *
 * Ο Δίας είναι ο μεγαλύτερος πλανήτης του Ηλιακού συστήματος σε διαστάσεις και μάζα.
 * Είναι ο πέμπτος κατά σειρά πλανήτης ξεκινώντας από τον Ήλιο. Στην Αστρονομία έχει το σύμβολο.
 * Ηλικία: 4,603e9 έτη
 * Πυκνότητα: 1,33 g/cm³
 * Βαρύτητα: 24,79 m/s²
 * Ακτίνα: 69.911 χλμ.
 * Εμφανές μέγεθος (V): -2,2
 * Συντεταγμένες: RA 0h 23m 34s | Απόκ. +1° 16′ 13″
 * Δορυφόροι: Ευρώπη, Γανυμήδης, Ιώ, Καλλιστώ, Αμάλθεια, συνολικά είναι 80
 */
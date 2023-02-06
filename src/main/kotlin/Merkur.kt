open class Merkur(namePlanet: String, umlaufgeschwindigkeit: Double, platz: Int, satelliten: Int) :
    Planet(namePlanet = namePlanet, umlaufgeschwindigkeit = umlaufgeschwindigkeit, platz = platz,satelliten = satelliten) {


    open fun dunkel() {

        println(
            """${namePlanet} oooo nein ist Dunkel geworden aber before ich schlafe ich habe  info für dich  : 
             Eine volle Umrundung der Sonne mit einer durchschnittlichen Geschwindigkeit von 48 Kilometern pro Sekunde 
             das für unsere Erde dauert nur 88 tage.""".trimMargin()
        )

    }
}

/**
 * Ο Ερμής είναι ο πλησιέστερος πλανήτης στον Ήλιο, και ο μικρότερος στο Ηλιακό Σύστημα.
 * Είναι δύσκολα ορατός στον νυχτερινό ουρανό διότι είναι πάντα κοντά στον Ήλιο.
 * Ακόμα και όταν είναι ορατός φαίνεται για ένα πολύ μικρό χρονικό διάστημα.
 * Ηλικία: 4,503e9 έτη
 * Πυκνότητα: 5,43 g/cm³
 * Βαρύτητα: 3,7 m/s²
 * Ακτίνα: 2.439,7 χλμ.
 * Τροχιακή περίοδος: 88 ημέρες
 * Εμφανές μέγεθος (V): 0,23
 * Συντεταγμένες: RA 19h 16m 18s | Απόκ. -21° 34′ 7″
 */
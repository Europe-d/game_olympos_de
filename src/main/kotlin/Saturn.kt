open class Saturn(namePlanet: String, umlaufgeschwindigkeit: Double, platz: Int, satelliten: Int) :
    Planet(namePlanet = namePlanet, umlaufgeschwindigkeit = umlaufgeschwindigkeit, platz = platz,satelliten = satelliten) {


    open fun luft(frage: Planet) {


        println(": Hey.. ich bin ${frage.namePlanet} ich habe eine info für sie : ")
        if (umlaufgeschwindigkeit >= 3 && frage.umlaufgeschwindigkeit >= 6) {
            println("is ok er kann zurück kommen  ")

        } else {
            println("Saturn hat am Äquator einen Durchmesser von 120.660 km und gehört zu den so genannten Gasriesen. ")
        }
    }
}



/**
 * Ο Κρόνος είναι ο έκτος πλανήτης σε σχέση με την απόστασή του από τον Ήλιο και ο δεύτερος σε μέγεθος του Ηλιακού συστήματος μετά τον Δία,
 * με διάμετρο στον ισημερινό του 120.660 χιλιόμετρα ενώ ανήκει στους λεγόμενους γίγαντες αερίων.
 * Ηλικία: 4,503e9 έτη
 * Πυκνότητα: 687 kg/m³
 * Βαρύτητα: 10,44 m/s²
 * Ακτίνα: 58.232 χλμ.
 * Εμφανές μέγεθος (V): -0,24
 * Συντεταγμένες: RA 21h 51m 29s | Απόκ. -14° 17′ 19″
 * Δορυφόροι: Τιτάνας, Εγκέλαδος, Μίμας, Διώνη, Ιαπετός, Τηθύς, ΠΕΡΙΣΣΟΤΕΡΑ
 */
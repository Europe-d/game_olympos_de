open class Uranus(namePlanet: String, umlaufgeschwindigkeit: Double, platz: Int, satelliten: Int) :
    Planet(namePlanet = namePlanet, umlaufgeschwindigkeit = umlaufgeschwindigkeit, platz = platz,satelliten = satelliten) {

    open fun blauFarbe() {

        println(""" Achtung  ${namePlanet}  ist in Bewegung und es gibt eine Menge Nebel ...
        Nein, nein, nein, keine Sorge .... es ist der Nebel, der den Himmelsplaneten bedeckt,
        deshalb ist er tiefer blau als Neptun ..
        wir werden  ein bisschen Blau  sein, aber das ist okay. konnen wir Dance am---Blue (Da Ba Dee)---Dance .""")

    }


}

//https://www.youtube.com/watch?v=AFIqSaZM2D0&ab_channel=AlonsOMG
/**
 * Ο Ουρανός είναι ο έβδομος σε απόσταση από τον Ήλιο,
 * ο τρίτος μεγαλύτερος και ο τέταρτος σε μάζα πλανήτης του Ηλιακού συστήματος.
 * Το όνομα προέρχεται από την αρχαία ελληνική θεότητα του ουρανού,
 * ο οποίος ήταν πατέρας του Κρόνου και παππούς του Δία.
 * Ημερομηνία ανακάλυψης: 13 Μαρτίου 1781
 * Ηλικία: 4,503e9 έτη
 * Πυκνότητα: 1,27 g/cm³
 * Βαρύτητα: 8,87 m/s²
 * Εμφανές μέγεθος (V): 5,68
 * Ανακαλύψας: Ουίλιαμ Χέρσελ
 * Συντεταγμένες: RA 2h 50m 19s | Απόκ. +15° 59′ 21″
 */
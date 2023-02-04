open class Venus(namePlanet: String, umlaufgeschwindigkeit: Double, platz: Int, satelliten: Int) :
    Planet(namePlanet = namePlanet, umlaufgeschwindigkeit = umlaufgeschwindigkeit, platz = platz,satelliten = satelliten) {


    open fun glamour() {

        println("""Achtung ..... die schönste ....komm....
            ___ what ?? ...!!! nein nein was für frau 
            ich spreche von planet Afroditi ...naja du hast recht das ist auch Weiblich Achtung...
            
            Die Venus ist der am zweitweitesten von der Sonne entfernte Planet in unserem Sonnensystem. 
            Er ist nach dem Mond das hellste Objekt am Nachthimmel..""".trimMargin())
    }


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
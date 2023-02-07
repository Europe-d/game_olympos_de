open class Neptun(namePlanet: String, umlaufgeschwindigkeit: Double, platz: Int, satelliten: Int) :
    Planet(namePlanet = namePlanet, umlaufgeschwindigkeit = umlaufgeschwindigkeit, platz = platz,satelliten = satelliten) {


    open fun atmen() {
        println("""Achtung ... 
            Tragen Sie die Sauerstoffmaske Neptuns Atmosphäre besteht zu 80 % 
            aus Wasserstoff und zu 19 % aus Helium. ooo nein  1% du hast es geschluckt """
        )

    }
}

/**
 * Ο Ποσειδώνας είναι ο όγδοος, κατά σειρά απόστασης από τον ήλιο, πλανήτης του Ηλιακού συστήματος.
 * Δεν είναι ορατός με γυμνό μάτι, ενώ αν παρατηρηθεί με ισχυρό τηλεσκόπιο μοιάζει με πράσινο δίσκο.
 * Στην αστρονομία συμβολίζεται με την τρίαινα ♆. Βικιπαίδεια
 * Ημερομηνία ανακάλυψης: 23 Σεπτεμβρίου 1846
 * Ηλικία: 4,503e9 έτη
 * Πυκνότητα: 1,64 g/cm³
 * Εμφανές μέγεθος (V): 7,78
 * Χώρος ανακάλυψης: Αστεροσκοπείο του Βερολίνου
 * Συντεταγμένες: RA 23h 37m 12s | Απόκ. -3° 44′ 36″
 * Ανακαλύψαντες: Ουρμπέν Λεβεριέ, Γιόχαν Γκότφριντ Γκάλε, Τζων Κουτς Άνταμς
 */
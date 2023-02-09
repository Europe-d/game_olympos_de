open class Erde(namePlanet: String, umlaufgeschwindigkeit: Double, platz: Int, satelliten: Int) :
    Planet(namePlanet = namePlanet, umlaufgeschwindigkeit = umlaufgeschwindigkeit, platz = platz,satelliten = satelliten) {


    open fun back() {

        println("""🌏 Planet ${this.namePlanet} sagt : PLEASE COME BACK""")

    }


}
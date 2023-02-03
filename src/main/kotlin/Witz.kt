open class Witz(var name: String) {


    open fun witz1() {
        Thread.sleep(3000)
        println(
            """          unsere ${this.name} hat für uns eine joke zu sagen ...
                        -Alter, als ich dich und deine Freundin gesehen habe, saht ihr aus wie in einem Märchen..
                        -Vielen Dank, mein Freund! Welches Märchen?
                        -Die Schöne und das Monster heheheheh :P :) ."""
        )
        Thread.sleep(1000)
    }

    open fun witz2() {
        Thread.sleep(3000)
        println(
            """           unsere ${this.name} hat für uns eine joke zu sagen ...
                          Der Lehrer sagt zu dem kleinen Toto:
                         - Wenn du fünf Euro in der einen und zehn Euro in der anderen Tasche hast, was hast du dann, Toto?
                   
                         - Wahrscheinlich habe ich die Hosen von jemand anderem, Sir..."""
        )
        Thread.sleep(1000)
    }

    open fun witz3() {
        Thread.sleep(3000)
        println(
            """          unsere ${this.name} hat für uns eine joke zu sagen ...
                        -Was willst du jetzt, Eva? - Hilfe Adam, Insel auf den Kykladen mit vier Buchstaben im Akkusativ? 
                        - Apfel.... - Wirst du mich noch lange schlagen?"""
        )
        Thread.sleep(1000)
    }

    open fun witz4() {
        Thread.sleep(3000)
        println(
            """         unsere ${this.name} hat für uns eine joke zu sagen ...
                        Das sind viele Fledermäuse, die in einer Höhle untergebracht sind.
                        Plötzlich betritt eine Fledermaus die Höhle und wird ins Gesicht geschlagen.

                        - "Woher hast du das ganze Blut?", fragen die anderen sie hungrig.
                        - "Siehst du das Schloss auf der anderen Seite des Berges?", sagt sie.
                        -Ja... sagen die anderen Fledermäuse.
                        -ja gut aber ich habe es nicht gesehen!!!!"""
        )
        Thread.sleep(1000)
    }


    open fun gerauscht() {
        println("trillern....trillern.......tziou tziou .. ")
    }
}
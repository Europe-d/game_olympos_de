open class Witz(var name: String) {


    open fun witz1() {

        println(
            """unsere ${this.name} hat für uns eine joke zu sagen ...
                - Komm schon, Mann... 
                Ich schulde 359€ für das Haus, 143 für die Nebenkosten, 
                356 für das Auto, 325 für Möbel... 
                Ich weiß nicht mehr, wie viel ich schulde!!! 
                - Hey Mann, kann ich dir helfen? 
                - echt kannst du  das? - Ja! du schuldest  1.183 Euro.."""
        )
        Thread.sleep(5000)
    }

    open fun witz2() {
        println(
            """unsere ${this.name} ist wieder da .. eine joke zu sagen ...
                
                Der Lehrer sagt zu dem kleinen Toto:
                - Wenn du fünf Euro in der Tasche hast und zehn Euro in der anderen Tasche hast, was hast du dann, Toto?
                - Wahrscheinlich habe ich die Hosen von jemand anderem, Sir..."""
        )
        Thread.sleep(5000)
    }

    open fun witz3() {
        println(
            """ooo mein Gott unsere ${this.name} komm wieder  eine joke zu sagen ...
                
                Papa, in der Schule nennen sie mich Mafioso..
                - Okay, ich komme vorbei und kümmere mich darum.
                - Gut. Lassen Sie es wie einen Unfall aussehen, hm?"""
        )
        Thread.sleep(5000)
    }

    open fun witz4() {
        println(
            """ ${this.name} : ich bin wieder da ...haben sie mir vermisst ??...
                
                Das sind viele Fledermäuse, die in einer Höhle untergebracht sind.
                Plötzlich betritt eine Fledermaus die Höhle und wird ins Gesicht geschlagen.

                - "Woher hast du das ganze Blut?", fragen die anderen sie hungrig.
                - "Siehst du das Schloss auf der anderen Seite des Berges?", sagt sie.
                -Ja... sagen die anderen Fledermäuse.
                -ja gut aber ich habe es nicht gesehen!!!!"""
        )
        Thread.sleep(5000)
    }


    open fun gerauscht() {
        println("trillern....trillern......twit, twit).. ")
    }
}
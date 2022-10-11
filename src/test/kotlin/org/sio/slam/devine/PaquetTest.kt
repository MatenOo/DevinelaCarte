package org.sio.slam.devine

import org.junit.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.fail
import org.sio.slam.devine.core.Carte
import org.sio.slam.devine.core.Paquet
import org.sio.slam.devine.enum.CouleurCarte
import org.sio.slam.devine.enum.NomCarte
import org.sio.slam.devine.fabrique.createJeu32Cartes

internal class PaquetTest {

    @Test
    fun cardinal2Cartes() {
        val paquet2Cartes = Paquet(
            listOf(
                Carte(NomCarte.AS, CouleurCarte.TREFLE),
                Carte(NomCarte.AS, CouleurCarte.COEUR),
            )
        )

        assertEquals(2, paquet2Cartes.cardinal())
    }

    @Test
    fun testToString2Cartes() {
        val paquet2Cartes = Paquet(
            listOf(
                Carte(NomCarte.VALET, CouleurCarte.COEUR),
                Carte(NomCarte.DIX, CouleurCarte.TREFLE),
            )
        )
        assertEquals("Paquet de 2 cartes", paquet2Cartes.toString())
    }

   /* @Test
    fun testGetCartes() {
        for (i in paquet2Cartes.values) {
            paquet2Cartes[i] = i
        }*/

    fun fabriqueDe52Cartes() {
        var paquet52Cartes = mutableListOf<Carte>()
        for (valcarte in NomCarte.values()) {
            for (coulcarte in CouleurCarte.values()) {
                var macarte = Carte(valcarte, coulcarte)
                paquet52Cartes.add(macarte)
            }
        }
    }

    @Test
    fun fabriqueDe32Cartes() {
        var paquet32Cartes = mutableListOf<Carte>()
        for (valcarte in NomCarte.values()){
            if (valcarte.points >= 7){
                for (coulcarte in CouleurCarte.values()){
                    var macarte=Carte(valcarte,coulcarte)
                    paquet32Cartes.add(macarte)
                }
            }
        }
    }

  /*  @Test
    fun melangeCartes(){
        val paquet2Cartes = Paquet(
            listOf(
                Carte(NomCarte.AS, CouleurCarte.TREFLE),
                Carte(NomCarte.AS, CouleurCarte.COEUR),
            )
        )
        val
    }*/

}

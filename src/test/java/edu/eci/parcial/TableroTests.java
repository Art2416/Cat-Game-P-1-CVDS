package edu.eci.parcial;



import static org.junit.Assert.assertTrue;

import edu.eci.parcial.game.Tablero;
import edu.eci.parcial.GatoJuego;

import org.junit.Assert;
import org.junit.Test;


public class TableroTests {

    @Test
    public void deberiaPonerX() {
        Tablero.play(0,0,"X");
        Assert.assertEquals("X",Tablero.getJuego()[0][0]);
    }

}

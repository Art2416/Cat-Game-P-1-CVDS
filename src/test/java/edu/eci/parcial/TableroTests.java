package edu.eci.parcial;
import static org.junit.Assert.assertTrue;

import edu.eci.parcial.game.Tablero;

import org.junit.Assert;
import org.junit.Test;


public class TableroTests {

    @Test
    public void deberiaPonerX() {
        Tablero.play(0,0,"X");
        Assert.assertEquals("X",Tablero.getJuego()[0][0]);
    }

    @Test
    public void deberiaPonerO() {
        Tablero.play(0, 0, "O");
        Assert.assertEquals("O", Tablero.getJuego()[0][0]);
    }

    @Test
    public void deberiaGanarX() {
        Tablero.play(0, 0, "X");
        Tablero.play(1, 1, "X");
        Tablero.play(2, 2, "X");
        assertTrue(Tablero.winner("X"));
    }

    @Test
    public void deberiaGanarO() {
        Tablero.play(0, 0, "O");
        Tablero.play(1, 1, "O");
        Tablero.play(2, 2, "O");
        assertTrue(Tablero.winner("O"));
    }
}

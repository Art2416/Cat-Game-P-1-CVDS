package edu.eci.parcial;
import static org.junit.Assert.assertTrue;

import edu.eci.parcial.game.Tablero;

import org.junit.Assert;
import org.junit.Test;


public class TableroTests {

    @Test
    public void givenPlayer_whenTableroIsEmpty_thenCreatePlayer() {
        //Arrange
        String player = "X";
        //Act
        Tablero.play(0,0,player);
        //Assert
        Assert.assertEquals("X",Tablero.getInstance()[0][0]);
    }

    @Test
    public void givenMachine_whenTableroIsEmpty_thenCreateMachine() {
        //Arrange
        String machine = "O";
        //Act
        Tablero.play(0, 0, machine);
        //Assert
        Assert.assertEquals("O", Tablero.getInstance()[0][0]);
    }

    @Test
    public void givenDifferentPlayerPositions_whenTableroIsEmpty_thenVerifyPlayerWinner() {
        //Arrange
        String player = "X";
        //Act
        Tablero.play(0, 0, player);
        Tablero.play(1, 1, player);
        Tablero.play(2, 2, player);
        //Assert
        assertTrue(Tablero.winner(player));
    }

    @Test
    public void givenDifferentMachinePositions_whenTableroIsEmpty_thenVerifyMachineWinner() {
        //Arrange
        String machine = "O";
        //Act
        Tablero.play(0, 0, machine);
        Tablero.play(1, 1, machine);
        Tablero.play(2, 2, machine);
        //Assert
        assertTrue(Tablero.winner(machine));
    }
}

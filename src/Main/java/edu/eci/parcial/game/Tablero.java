package Main.java.edu.eci.parcial.game;
import java.io.*;
public class Tablero{

    public static String[][] juego = new String[3][3];//matrices;

    /**
     * It creates a 2D array of strings and fills it with empty strings
     *
     * @return The array juego is being returned.
     */
    public static String[][] draw(){
        for (int a=0; a<=2; a=a+1) {
            for (int b=0; b<=2; b=b+1) {
                juego[a][b]=" ";
            }

        }

        return juego;
    }
    /**
     * This function takes in two integers and a string and sets the value of the array at the given row and column to the
     * given string
     *
     * @param fila The row where the player wants to play.
     * @param columna The column where the player wants to play.
     * @param player The player who is playing.
     */
    public static void play(int fila,int columna, String player){
        juego[fila][columna] = player;

    }
    /**
     * It prints the table
     */
    public static void printTable(){
        System.out.println("    0   1   2");
        System.out.println(" 0 "+juego[0][0]+" | "+juego[0][1]+" | "+juego[0][2]);
        System.out.println(" 1 "+juego[1][0]+" | "+juego[1][1]+" | "+juego[1][2]);
        System.out.println(" 2 " +juego[2][0]+" | "+juego[2][1]+" | "+juego[2][2]);
    }
    /**
     * It checks if the player has won the game
     *
     * @param player The player who is playing.
     */
    public static void winner(String player){

        if (Tablero.juego[0][0]== player && Tablero.juego[0][1]== player && Tablero.juego [0][2]== player) {
            System.out.println("El ganador es el jugador '"+player+"'.");
            System.exit(1);

        }
        else if (Tablero.juego[1][0]== player && Tablero.juego[1][1]== player && Tablero.juego [1][2]== player) {
            System.out.println("El ganador es el jugador '"+player+"'.");
            System.exit(1);

        }
        else if (Tablero.juego[2][0]== player && Tablero.juego[2][1]== player && Tablero.juego [2][2]== player) {
            System.out.println("El ganador es el jugador '"+player+"'.");
            System.exit(1);

        }
        else if (Tablero.juego[0][0]== player && Tablero.juego[1][0]== player && Tablero.juego [2][0]== player) {
            System.out.println("El ganador es el jugador '"+player+"'.");
            System.exit(1);
        }
        else if (Tablero.juego[0][1]== player && Tablero.juego[1][1]== player && Tablero.juego [2][1]== player) {
            System.out.println("El ganador es el jugador '"+player+"'.");
            System.exit(1);
        }
        else if (Tablero.juego[0][2]== player && Tablero.juego[1][2]== player && Tablero.juego [2][2]== player) {
            System.out.println("El ganador es el jugador '"+player+"'.");
            System.exit(1);
        }
        else if (Tablero.juego[0][0]== player && Tablero.juego[1][1]== player && Tablero.juego [2][2]== player) {
            System.out.println("El ganador es el jugador '"+player+"'.");
            System.exit(1);
        }
        else if (Tablero.juego[0][2]== player && Tablero.juego[1][1]== player && Tablero.juego [2][0]== player) {
            System.out.println("El ganador es el jugador '"+player+"'.");
            System.exit(1);
        }
    }




}

package Main.java.edu.eci.parcial.game;
import java.io.*;
public class Tablero{

    public static String[][] juego = new String[3][3];//matrices;

    public static String[][] draw(){
        for (int a=0; a<=2; a=a+1) {
            for (int b=0; b<=2; b=b+1) {
                juego[a][b]=" ";
            }

        }

        return juego;
    }
    public static void play(int fila,int columna){
        juego[fila][columna] = "X";

    }
    public static void printTable(){
        System.out.println("    0   1   2");
        System.out.println(" 0 "+juego[0][0]+" | "+juego[0][1]+" | "+juego[0][2]);
        System.out.println(" 1 "+juego[1][0]+" | "+juego[1][1]+" | "+juego[1][2]);
        System.out.println(" 2 " +juego[2][0]+" | "+juego[2][1]+" | "+juego[2][2]);
    }




}

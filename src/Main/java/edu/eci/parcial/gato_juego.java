package Main.java.edu.eci.parcial;

import Main.java.edu.eci.parcial.game.Tablero;

import java.io.*;
import Main.java.edu.eci.parcial.game.Tablero;
public class gato_juego {


public static void main(String[] args)throws IOException {

	BufferedReader recibir = new BufferedReader (new InputStreamReader(System.in));

	int n=0;
	int datob;
	int datob2;
	Tablero.draw();

	while (n<10) {
		Tablero.printTable();
		System.out.println("Es el turno del jugador X.");
		System.out.println(" fila.");
		int dato=Integer.parseInt(recibir.readLine());
		System.out.println(" columna.");
		int dato1=Integer.parseInt(recibir.readLine());
		while (Tablero.juego[dato][dato1]== "X" || Tablero.juego[dato][dato1]== "O" ) { //comparacion
			System.out.println("A ingresado una jugada en donde YA existia una  anteriormente");
			System.out.println("Ingrese una fila.");
			dato=Integer.parseInt(recibir.readLine());
			System.out.println("Ingrese una columna.");
			dato1=Integer.parseInt(recibir.readLine());
		}
		Tablero.play(dato,dato1, "X");

		Tablero.printTable();

		n=n+1;
		Tablero.winner("X");
		if (n==9) {
			break;
		}

		System.out.println("Es el turno del la Maquina");
		System.out.println(" fila.");

		datob = (int)(Math.random()*3)+0;
		System.out.println("columna.");

		datob2 = (int)(Math.random()*3)+0;
		while (Tablero.juego[datob][datob2]== "O" || Tablero.juego[datob][datob2]== "X" ) {
			System.out.println("maquina");
			datob = (int)(Math.random()*3)+0;
			datob2 = (int)(Math.random()*3)+0;
		}
		Tablero.play(datob,datob2, "O");
		n=n+1;
		Tablero.winner("O");
		if (n==9) {
			break;
		}
	}
}
}

package Main.java.edu.eci.parcial;

import Main.java.edu.eci.parcial.game.Tablero;

import java.io.*;
import Main.java.edu.eci.parcial.game.Tablero;
public class GatoJuego {


public static void main(String[] args)throws IOException {

	BufferedReader recibir = new BufferedReader (new InputStreamReader(System.in));

	int jugada=0;
	int coordenadaXConsola;
	int coordenadaYConsola;
	Tablero.draw();

	while (jugada < 10) {
		Tablero.printTable();
		System.out.println("Es el turno del jugador ->");
		System.out.println("Inserte el número de la fila:");
		int coordenadaXJugador = Integer.parseInt(recibir.readLine());
		System.out.println("Inserte el número de la columna:");
		int coordenadaYJugador = Integer.parseInt(recibir.readLine());
		while (Tablero.juego[coordenadaXJugador][coordenadaYJugador]== "X" || Tablero.juego[coordenadaXJugador][coordenadaYJugador]== "O" ) { //comparacion
			System.out.println("A ingresado una jugada en donde existente anteriormente");
			System.out.println("Inserte el número de la fila:");
			coordenadaXJugador = Integer.parseInt(recibir.readLine());
			System.out.println("Inserte el número de la columna:");
			coordenadaYJugador = Integer.parseInt(recibir.readLine());
		}
		Tablero.play(coordenadaXJugador,coordenadaYJugador, "X");

		Tablero.printTable();

		jugada = jugada + 1;
		Tablero.winner("X");
		if (jugada==9) {
			break;
		}

		System.out.println("Es el turno del la máquina");
		System.out.println("Fila:");

		coordenadaXConsola = (int)(Math.random()*3)+0;
		System.out.println("Columna.");

		coordenadaYConsola = (int)(Math.random()*3)+0;
		while (Tablero.juego[coordenadaXConsola][coordenadaYConsola]== "O" || Tablero.juego[coordenadaXConsola][coordenadaYConsola]== "X" ) {
			System.out.println("Máquina");
			coordenadaXConsola = (int)(Math.random()*3)+0;
			coordenadaYConsola = (int)(Math.random()*3)+0;
		}
		Tablero.play(coordenadaXConsola,coordenadaYConsola, "O");
		jugada = jugada + 1;
		Tablero.winner("O");
		if (jugada == 9) {
			break;
		}
	}
}
}

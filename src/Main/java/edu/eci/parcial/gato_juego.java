package Main.java.edu.eci.parcial;

import Main.java.edu.eci.parcial.game.Tablero;

import java.io.*;
import Main.java.edu.eci.parcial.game.Tablero;
public class gato_juego {


public static void main(String[] args)throws IOException {

	BufferedReader recibir = new BufferedReader (new InputStreamReader(System.in));

	int n=0;


	while (n<10) {

//jugador 'x'
		Tablero.draw();
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
		Tablero.play(dato,dato1);

		//tablero
		Tablero.printTable();

		n=n+1;


		if (Tablero.juego[0][0]== "X" && Tablero.juego[0][1]== "X" && Tablero.juego [0][2]== "X") {
			System.out.println("El ganador es el jugador 'x'.");
			break;
		}
		if (Tablero.juego[1][0]== "X" && Tablero.juego[1][1]== "X" && Tablero.juego [1][2]== "X") {
			System.out.println("El ganador es el jugador 'x'.");
			break;
		}
		else if (Tablero.juego[2][0]== "X" && Tablero.juego[2][1]== "X" && Tablero.juego [2][2]== "X") {
			System.out.println("El ganador es el jugador X.");
			break;
		}
		if (Tablero.juego[0][0]== "X" && Tablero.juego[1][0]== "X" && Tablero.juego [2][0]== "X") {
			System.out.println("El ganador es el jugador X.");
			break;
		}
		if (Tablero.juego[0][1]== "X" && Tablero.juego[1][1]== "X" && Tablero.juego [2][1]== "X") {
			System.out.println("El ganador es el jugador X.");
			break;
		}
		if (Tablero.juego[0][2]== "X" && Tablero.juego[1][2]== "X" && Tablero.juego [2][2]== "X") {
			System.out.println("El ganador es el jugador 'X'.");
			break;
		}
		if (Tablero.juego[0][0]== "X" && Tablero.juego[1][1]== "X" && Tablero.juego [2][2]== "X") {
			System.out.println("El ganador es el jugador X.");
			break;
		}
		if (Tablero.juego[0][2]== "X" && Tablero.juego[1][1]== "X" && Tablero.juego [2][0]== "X") {
			System.out.println("El ganador es el jugador X.");
			break;
		}


		if (n==9) {
			break;
		}

		System.out.println("Es el turno del la Maquina");
		System.out.println(" fila.");
		int datob;
		datob = (int)(Math.random()*3)+0;
		System.out.println("columna.");
		int datob2;
		datob2 = (int)(Math.random()*3)+0;
		//comprobar si la jugada existe
		while (Tablero.juego[datob][datob2]== "O" || Tablero.juego[datob][datob2]== "X" ) {
			System.out.println("maquina");
			datob = (int)(Math.random()*3)+0;
			datob2 = (int)(Math.random()*3)+0;
		}
		Tablero.juego[datob][datob2] = "O";

		System.out.println(" 0   1   2");
		System.out.println("0 "+Tablero.juego[0][0]+" | "+Tablero.juego[0][1]+" | "+Tablero.juego[0][2]);
		System.out.println("1 "+Tablero.juego[1][0]+" | "+Tablero.juego[1][1]+" | "+Tablero.juego[1][2]);
		System.out.println("2 "+Tablero.juego[2][0]+" | "+Tablero.juego[2][1]+" | "+Tablero.juego[2][2]);

		n=n+1;

		if (Tablero.juego[0][0]== "O" && Tablero.juego[0][1]== "O" && Tablero.juego [0][2]== "O") {
			System.out.println("el ganador es la maquina");
			break;
		}
		if (Tablero.juego[1][0]== "O" && Tablero.juego[1][1]== "O" && Tablero.juego [1][2]== "O") {
			System.out.println("El ganador es la maquina");
			break;
		}
		if (Tablero.juego[2][0]== "O" && Tablero.juego[2][1]== "O" && Tablero.juego [2][2]== "O") {
			System.out.println("El ganador es la maquina.");
			break;
		}
		if (Tablero.juego[0][0]== "O" && Tablero.juego[1][0]== "O" && Tablero.juego [2][0]== "O") {
			System.out.println("El ganador es la maquina");
			break;
		}
		if (Tablero.juego[0][1]== "O" && Tablero.juego[1][1]== "O" && Tablero.juego [2][1]== "O") {
			System.out.println("El ganador es la maquina");
			break;
		}
		if (Tablero.juego[0][2]== "O" && Tablero.juego[1][2]== "O" && Tablero.juego [2][2]== "O") {
			System.out.println("El ganador es la maquina");
			break;
		}

		if (Tablero.juego[0][0]== "O" && Tablero.juego[1][1]== "O" && Tablero.juego [2][2]== "O") {
			System.out.println("El ganador es la maquina.");
			break;
		}
		if (Tablero.juego[0][2]== "O" && Tablero.juego[1][1]== "O" && Tablero.juego [2][0]== "O") {
			System.out.println("El ganador es la maquina");
			break;
		}


		if (n==9) {
			break;
		}

	}



}
}

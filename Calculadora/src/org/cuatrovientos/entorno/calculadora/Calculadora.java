package org.cuatrovientos.entorno.calculadora;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scanner = new  Scanner(System.in);
		Integer numeroUno;
		String conversor;
		Integer numeroDos;
		Integer opcion;
		System.out.println("//CALCULADORA\\");
		System.out.println("Escribe 2 numeros");
		System.out.print("Numero 1: ");
		conversor = scanner.nextLine();
		numeroUno = Integer.parseInt(conversor);
		System.out.print("Numero 2: ");
		conversor = scanner.nextLine();
		numeroDos = Integer.parseInt(conversor);
		do {
			System.out.println("Elige la operacion que quieres realizar");
			System.out.println("1. Suma");
			System.out.println("2. Resta");
			System.out.println("3. Multiplicacion");
			System.out.println("4. Salir");
			conversor = scanner.nextLine();
			opcion = Integer.parseInt(conversor);
			
		} while (opcion != 4);
	}

}

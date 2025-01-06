package org.cuatrovientos.entorno.calculadora;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scanner = new  Scanner(System.in);
		Integer numeroUno;
		Integer numeroDos;
		Integer opcion;
		System.out.println("//CALCULADORA\\");
		System.out.println("Escribe 2 numeros");
		System.out.print("Numero 1: ");
		numeroUno = conversion(scanner);
		System.out.print("Numero 2: ");
		numeroDos = conversion(scanner);
		do {
			System.out.println("Elige la operacion que quieres realizar");
			System.out.println("1. Suma");
			System.out.println("2. Resta");
			System.out.println("3. Multiplicacion");
			System.out.println("4. Salir");
			opcion = conversion(scanner);
			
			switch (opcion) {
			case 1:
				suma(numeroUno, numeroDos);
				break;
			case 2:
				resta(numeroUno, numeroDos);
				break;
			case 3:
				multiplicacion(numeroUno, numeroDos);
				break;
			}
		} while (opcion != 4);
		System.out.println("Saliendo......");
	}

	private static void multiplicacion(Integer numeroUno, Integer numeroDos) {
		Integer respuesta;
		respuesta = numeroUno * numeroDos;
		System.out.println ("La multiplicacion de los dos numeros es "+respuesta);
	}

	private static void resta(Integer numeroUno, Integer numeroDos) {
		Integer respuesta;
		respuesta = numeroUno - numeroDos;
		System.out.println ("La resta de los dos numeros es "+respuesta);
	}

	private static void suma(Integer numeroUno, Integer numeroDos) {
		Integer respuesta;
		respuesta = numeroUno + numeroDos;
		System.out.println ("La suma de los dos numeros es "+ respuesta);
	}

	private static Integer conversion(Scanner scanner) {
		Integer numeroUno;
		String conversor;
		conversor = scanner.nextLine();
		numeroUno = Integer.parseInt(conversor);
		return numeroUno;
	}

}

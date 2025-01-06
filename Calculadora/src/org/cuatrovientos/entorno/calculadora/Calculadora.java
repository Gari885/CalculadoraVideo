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
	}

}

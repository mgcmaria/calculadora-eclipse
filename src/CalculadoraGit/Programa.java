package CalculadoraGit;

import java.time.LocalDate;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);
		
		int n1,n2;
		
		System.out.println("Introduce el primer numero: ");
		n1=teclado.nextInt();
		System.out.println("Introduce el segundo numero: ");
		n2=teclado.nextInt();
		System.out.println("----------------------");
		teclado.close();
		
		CalculadoraGit calcular1 = new CalculadoraGit(n1,n2);
		CalculadoraGit calcular = new CalculadoraGit(20,10);
		
		System.out.println("El resultado de sumar es: " + calcular.suma(4, 6));
		System.out.println("El resultado de restar es: " + calcular.resta(7, 2));
		System.out.println("----------------------");
		System.out.println("El resultado de sumar es: " + calcular1.suma(78, 4));
		System.out.println("El resultado de restar es: " + calcular1.resta(2, 98));
		System.out.println("----------------------");
		
		LocalDate hoy = LocalDate.now();
		System.out.println("Hoy es: "+hoy);
		System.out.println("Hoy es con otro formato: "+hoy.getDayOfMonth()+"/"+hoy.getMonthValue()+"/"+hoy.getYear());
	}
}
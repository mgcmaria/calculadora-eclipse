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

		System.out.println(+n1+" + "+n2+" = " + CalculadoraGit.suma(n1, n2));
		System.out.println(+n1+" - "+n2+" = " + CalculadoraGit.resta(n1, n2));
		System.out.println(n1+" * "+n2+" = " + CalculadoraGit.multiplica(n1, n2));
		System.out.println(n1+" / "+n2+" = " + CalculadoraGit.divide(n1, n2));
		System.out.println(n1+"^2 + "+n2+"^2 = " + CalculadoraGit.sumaCuadrados(n1, n2));
		System.out.println("----------------------");		

		
		System.out.println("----------------------");
		
		
		LocalDate hoy = LocalDate.now();
		System.out.println("Hoy es: "+hoy);
		System.out.println("Hoy es con otro formato: "+hoy.getDayOfMonth()+"/"+hoy.getMonthValue()+"/"+hoy.getYear());
	}
}
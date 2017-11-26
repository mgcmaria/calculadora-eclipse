package CalculadoraGit;

public class Programa {

	public static void main(String[] args) {
		
		CalculadoraGit calcular = new CalculadoraGit(16,8);
		
		System.out.println("El resultado de sumar es: " + calcular.suma());
		System.out.println("El resultado de restar es: " + calcular.resta());

	}

}

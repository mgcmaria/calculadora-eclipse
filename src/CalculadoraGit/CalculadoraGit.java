package CalculadoraGit;

public class CalculadoraGit {
	
	private static int num1;
	private static int num2;
	
	public CalculadoraGit (int a, int b)
	{
		setNum1(a);
		setNum2(b);
	}
	
/*
	//método suma
	public static int suma (int n1, int n2)
	{
		int resul=getNum1()+getNum2();
		return resul;
	}
	
	//método resta
	public static int resta(int n1, int n2)
	{
		int resul=getNum1()-getNum2();
		return resul;
	}
	
	//método multiplicar
	public static int multiplica (int n1, int n2)
	{
		int resul=getNum1()*getNum2();
		return resul;
	}
	
	//méodo dividir
	public static int divide (int n1, int n2)
	{
		int resul=getNum1()/getNum2();
		return resul;
	}
*/
	//método suma de cuadrados
	public static int sumaCuadrados (int n1, int n2)
	{
		int resul=getNum1()*getNum1()+getNum2()*getNum2();
		return resul;
	}	
	
	
	
	// métodos get y set
	public static int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public static int getNum2() {

		return num2;
	}

		public void setNum2(int num2) {
			this.num2 = num2;
	}
}	
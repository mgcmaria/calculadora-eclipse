package CalculadoraGit;

public class CalculadoraGit {
	
<<<<<<< HEAD
	private int num1;
	private int num2;
	
	public CalculadoraGit (int a, int b)
	{
		setNum1(a);
		setNum2(b);
	}
	
	public int suma ()
	{
		int resul=getNum1()+getNum2();
		return resul;
	}
	
	public int resta()
	{
		int resul=getNum1()-getNum2();
		return resul;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

=======
	
	private static int num1;
	  private  static int num2;
	    public void calculadoraGit (int a, int b){
	        num1=a;
	        num2=b;
	    }
	public static int divide(int a, int b){
        int resul=num1/num2;
        return resul;
        }
	public static int suma(int a, int b){
	        int resul= num1+num2;
	        return resul;
	        
	    }
	    public static int resta(int a, int b){
	        int resul=num1-num2;
	        return resul;
	    }
	    public static boolean resta2(int a , int b) {
	    	if(num1>=num2) {
	    		return true;
	    	}else {
	    		return false;
	    	}
	    }
	    public static int multiplica(int a, int b){
	        int resul=num1*num2;
	         return resul;
	    }
>>>>>>> branch 'master' of https://github.com/mgcmaria/calculadora-eclipse.git
}

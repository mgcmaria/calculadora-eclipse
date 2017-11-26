package CalculadoraGit;

public class CalculadoraGit {
	
	
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
}

package Gudobba.Gavin.Chapter6;

public class SimpleMath {
	public double numerator;
	public double denominator;

	
	public double divide(double Numerator,double Denominator) {
		if(Denominator==0){
			throw new ArithmeticException("cannot divide by 0");}
		double result = Numerator / Denominator;
		System.out.println(result);
		return result;	}		
	public double multiply(double Number1,double Number2) {
		double answer = Number1*Number2;
		return answer;}
	}
}


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
}


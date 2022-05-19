package week1.day2;

public class calculator {
	public int AddTwo(int number1, int number2) {
		int sum = number1 + number2;
		return sum;
		
	}

	public double Subtract(double number3, double number4) {
		double subtraction = number3 - number4;
		return subtraction;
		
		
	}

	public double Multiply(double number5, double number6) {
		double multiplication = number5 * number6;
		return multiplication;
		
		
	}
	
	public int Divide(int number7, int number8) {
		int division = number7 / number8;
		return division;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculator calci = new calculator();
		System.out.println("Addition of two Integer numbers = " + calci.AddTwo(10,25));
		System.out.println("Subtraction of two point numbers = " + calci.Subtract(34.901,25.78));
		System.out.println("Multiplication of two point numbers = " + calci.Multiply(34.56,25.06));
		System.out.println("Division of two Integer numbers = " +calci.Divide(100,25));

	}

}

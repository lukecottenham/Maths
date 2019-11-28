package main;

public class Maths {
	
	
	public static double sum(double firstNumber, double secondNumber) {
		double value;
		value = firstNumber + secondNumber;
		return value;
	}
	
	public static double subtract(double firstNumber, double secondNumber) {
		double value;
		value = firstNumber - secondNumber;
		return value;
	}
	
	public static double multiply(double firstNumber, double secondNumber) {
		double value;
		value = firstNumber * secondNumber;
		return value;
	}
	
	public static double divide(double firstNumber, double secondNumber) {
		double value;
		value = firstNumber / secondNumber;
		return value;
	}

	public static double calculator(double firstNumber, double secondNumber, String operator) {
		double result=0;
		
		switch (operator) {
			case "+":
				result = sum(firstNumber, secondNumber);
				break;
			case "-":
				result = subtract(firstNumber, secondNumber);
				break;
			case "*":
				result = multiply(firstNumber, secondNumber);
				break;
			case "/":
				result = divide(firstNumber, secondNumber);
				break;
		}
		return(result);
		
	}
	public static void main(String[] args) {
		
		double firstNumber = 1000;
		double secondNumber = 200;
		String operator = "/";
		double answer;
		if (operator == "/") {
			if (secondNumber == 0) {
				System.out.println("Cannot divide by 0");
			}
			else {
				answer = calculator(firstNumber, secondNumber, operator);
				System.out.println(firstNumber + " " + operator + " " + secondNumber + " = " + answer);
			}
			
		}
		else {
			answer = calculator(firstNumber, secondNumber, operator);
			System.out.println(firstNumber + " " + operator + " " + secondNumber + " = " + answer);
		}				
	}
}

//Write a program to Show the Arithmatic Operators concept in java 
public class Calculator {
	    int add(int a, int b) {
	        return a + b;
	    }
	    int sub(int a, int b) {
	        return a - b;
	    }
	    int multiply(int a, int b) {
	        return a * b;
	    }
	    int div(int a, int b) {
	        return a / b;
	    }
	    int mod(int a, int b) {
	        return a % b;
	    }
	    public static void main(String[] args) {
	    	Calculator op = new Calculator();
	        System.out.println("Addition: " + op.add(5, 10));
	        System.out.println("Substraction: " + op.sub(5, 10));
	        System.out.println("Multiplication: " + op.multiply(5, 10));
	        System.out.println("division: " + op.div(10, 5));
	        System.out.println("mod: " + op.mod(10, 5));
	    }
	}
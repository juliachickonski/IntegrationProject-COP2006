// Julia Chickonski 
// A look into what I have learned and a demonstration of my skills from COP2006 Programming I

import java.util.Scanner;

	// byte: holds 1 byte with range of -128 to 127 (Whole numbers only)
	// Short: holds 2 bytes with range of -32,768 to 32,767 (Whole numbers only)
	// Int: holds 4 bytes with range of -2,147,483,648 to 2,147,483,647 (Whole numbers only)
	// Long: holds 8 bytes with range of  -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 (Whole numbers only)
	// Float: holds 4 bytes, can hold non-whole numbers up to 6-7 decimal places
	// Double: holds 8 bytes, can hold non-whole numbers up to 15 decimal places
	// Boolean: holds 1 bit, either true or false values
	// Char: holds single 16-bit Unicode character

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variable describes the area in the program where data values are stored 
		// scope describes that variables can only be accessed within the certain area created
		Scanner scan = new Scanner(System.in);
		
		//Introduction of User
		// Use of a string variable
		System.out.println("Welcome to my Integration Project! \nWhat is your name?");
		String nameUser = scan.nextLine();
		System.out.println("Hello "+ nameUser + "! Have fun interacting with my work.");
		
		// Using a boolean variable and int variable
		System.out.println("\nEnter Variable 1: ");
		int variable1Int = scan.nextInt();
		System.out.println("Enter Variable 2: ");
		int variable2Int = scan.nextInt();

		
		boolean trueBoolean = true;
		boolean falseBoolean = false;
		
		if(variable1Int > variable2Int) {
			System.out.println("Variable 1 is greater than Variable 2: " + trueBoolean);
		}
		else {
			System.out.println("Variable 1 is greater than Variable 2: " + falseBoolean);
		}
		
		//Using double variable type
        System.out.println("\nEnter two numbers to multiply (press enter between each value): ");
        final double variableDouble1, variableDouble2, productDouble;
        	//final is used here to create a constant for all 3 double variables
        	//https://www.geeksforgeeks.org/final-keyword-java/
        variableDouble1 = scan.nextDouble();
        variableDouble2 = scan.nextDouble();
        productDouble = variableDouble1 * variableDouble2;
        System.out.println("The product of " + variableDouble1 + " and " + variableDouble2 + " equals " + productDouble + ".");
        
        // Demonstration of Casting
        System.out.println("\nHere I am going to demonstrate widening casting"); // Widening casting converts from a smaller data type to a larger
        int wideCastingInt = 45;
        double wideCastingDouble = wideCastingInt;
        System.out.println("Integer Value: " + wideCastingInt + "\nDouble Value: " + wideCastingDouble);
        
        System.out.println("\nHere I am going to demonstrate narrowing casting"); // narrowing casting converts from a smaller data type to a larger
        double narrowCastingDouble = 100.99;
        int narrowCastingInt = (int)narrowCastingDouble;
        System.out.println("Double Value: " + narrowCastingDouble + "\nInteger Value: " + narrowCastingInt);
        
		System.out.println("\nThank You for looking through my Integration Project!");
		scan.close();
		}
	}


// Julia Chickonski 
// A look into what I have learned and a demonstration of my skills from COP2006- Programming I

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

	// byte: holds 1 byte with range of -128 to 127 (Whole numbers only)
	// Short: holds 2 bytes with range of -32,768 to 32,767 (Whole numbers only)
	// Int: holds 4 bytes with range of -2,147,483,648 to 2,147,483,647 (Whole numbers only)
	// Long: holds 8 bytes with range of  -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 (Whole numbers only)
	// Float: holds 4 bytes, can hold non-whole numbers up to 6-7 decimal places
	// Double: holds 8 bytes, can hold non-whole numbers up to 15 decimal places
	// Boolean: holds 1 bit, either true or false values
	// Char: holds single 16-bit Unicode character

	//Operator Precedence list
	// expr++ , expr--
	// ++expr , --expr , +expr , -expr
	// multiplication (*), division (/), remainder (%)
	// Addition (+) , Subtraction (-) 
	// shift: << , >> , >>> 
	// relational: < , > , <= , >= , instanceOf
	// == , !=
	// bitwise AND: &
	// bitwise exclusive OR: ^
	// bitwise inclusive OR: |
	// logical AND: &&
	// logical OR: ||
	// ternary: booleanexpression ? expression 1 : expression 2 
	//assignment: = += -= *= /= %= &= ^= |= <<= >>= >>>=

	// inheritance is the  process where one class acquires the methods and fields of another parent class
	// follows a hierarchy
	// useful because you can reuse methods and fields of the parent class. 

	// Polymorphism describes how subclasses can perform their own actions while still relating to the same parent class

public class Main {

	public static void main(String[] args) {
		// Variable describes the area in the program where data values are stored 
		// scope describes that variables can only be accessed within the certain area created
		Scanner scan = new Scanner(System.in);
		
		//Introduction of User
		// Use of a string variable
		System.out.println("Welcome to my Integration Project! "
				+ "\nPlease enter your first and last name (press enter between)");
		String firstNameUser = scan.nextLine();
		String lastNameUser = scan.nextLine();
		
		int nameDifference = firstNameUser.compareToIgnoreCase(lastNameUser);
		
		String name1Common = "Smith";
		String name2Common = "Johnson";
		String name3Common = "Williams";
		
		System.out.println("Hello "+ firstNameUser + "!. "
				+ " Did you know, there is a difference of " + nameDifference + " lexicographically between your first and last name.");
		
		// equals method to determine if user has one of the most common last names
		if (name1Common.equalsIgnoreCase(lastNameUser) == true||name2Common.equalsIgnoreCase(lastNameUser) == true||name3Common.equalsIgnoreCase(lastNameUser) == true) {
			System.out.println("*Fun Fact: You have one of the most common last names in the US!*");
			}
		
		int programRepeat = 0;
		do {
			System.out.println("\nWhat can I assist you with? \n1. Comparisons \n2. Casting Demo \n3. Calculator \n4. Random Machine \n5. Array Demo");
			int userChoice = scan.nextInt();
			if (userChoice == 1) {
			// Using a boolean variable and int variable
				int repeatComparison = 0;
				do {
					System.out.println("Here you can enter two numbers to compare.\nEnter Variable 1 to compare: ");
					double variable1Double = scan.nextDouble();
					System.out.println("Enter Variable 2 to compare: ");
					double variable2Double = scan.nextDouble();
				
					boolean trueBoolean = true;
					boolean falseBoolean = false;
				
					if(variable1Double > variable2Double) {
					System.out.println(variable1Double + " is greater than "+ variable2Double + ": " + trueBoolean);
					}
					else {
						System.out.println(variable1Double + " is greater than "+ variable2Double + ": " + falseBoolean);
					}
					System.out.println("\nWhat should I do next? \n*press 1 to compare another set of numbers \n*press any other number to exit");
					repeatComparison = scan.nextInt();
				}
				while(repeatComparison == 1);
			}
			
			if (userChoice == 2) {
	        // Demonstration of Casting
				System.out.println("\nHere I am going to demonstrate widening casting"); // Widening casting converts from a smaller data type to a larger
				int wideCastingInt = 45;
				double wideCastingDouble = wideCastingInt;
				System.out.println("Integer Value: " + wideCastingInt + "\nDouble Value: " + wideCastingDouble);
	        
				System.out.println("\nHere I am going to demonstrate narrowing casting"); // narrowing casting converts from a smaller data type to a larger
				double narrowCastingDouble = 100.99;
				int narrowCastingInt = (int)narrowCastingDouble;
				System.out.println("Double Value: " + narrowCastingDouble + "\nInteger Value: " + narrowCastingInt);
				
				System.out.println("To see a further explination press 1, any other number to continue on");
				int example2Choice = scan.nextInt();
				if (example2Choice == 1) {
					System.out.println("Widening casting brings a smaller data type to a larger one. \nNarrowing Casting converts a larger data type to a smaller one"
							+"Press 1 to exit the program.");
					int finalChoice = scan.nextInt();
					if (finalChoice == 1) {
						continue; // continue is used here to break the loop and give the user the goodbye message and end the program
					}
				}
			}
			if(userChoice == 3) {
			//Calculator		
				System.out.println("Welcome to the calculator! ");
				int taskRepeat = 1;
				do {
					System.out.println("\nI can help you with... \n1. Addition \n2. Subtraction \n3. Multiplication \n4. Division \n5. Exponent ");
					System.out.println("What do you need to solve? ");
					int userMathChoice = scan.nextInt();
					// Addition
					if (userMathChoice == 1) {
						double sum = getSum(scan); // the getSum is the method call and scan is the argument
						System.out.println("Your total sum is: " + sum);
					} 
					//Subtraction
					if (userMathChoice == 2) {
						System.out.println("Enter the numbers you would like to subtract: ");
						try {
							double num1 = scan.nextDouble();
							double num2 = scan.nextDouble();
							double totalSubtract = num1 - num2;
							System.out.println("Your total is: " + totalSubtract);
						}catch (Exception e) {
							System.out.println("Sorry your input is invalid");
						}
					} 
					//multiplication
					else if (userMathChoice == 3) {
						System.out.println("How many numbers are you multiplying together?");
						int numsToMultiply = scan.nextInt();
						int numsCounter = 0;
						double totalProduct = 1;
						for (int numsMultiplying = 0; numsMultiplying < numsToMultiply ;) {
							System.out.println("Enter the numbers you would like to multiply together");
							while(numsCounter < numsToMultiply){
								double x = scan.nextDouble();
								totalProduct = totalProduct * x;
								numsCounter++;
							}
							break; // The break is used here to stop program from infinitely looping
						}
						System.out.println("Your total product is: " + totalProduct);
					}
					// Division
					else if (userMathChoice == 4) {
						System.out.println("What is your dividend?: ");
						double dividendNumber = scan.nextDouble();
						System.out.println("What is your divisor?: ");
						int divisorNumber = scan.nextInt();
					
						double quotient = dividendNumber / divisorNumber;
						System.out.println("Your quotient is " + quotient);
						if (dividendNumber % divisorNumber == 0) {
							System.out.println("with no remainder.");
						}	
						else if(dividendNumber % divisorNumber > 0) {
							double remainder = dividendNumber % divisorNumber;
							System.out.println("with a remainder of " + remainder + ".");
						}	
					}
					// Exponents
					else if (userMathChoice == 5) {
						System.out.println("Enter base: ");
						double baseNumber = scan.nextDouble();
						System.out.println("Enter Exponent: ");
						double exponentNumber = scan.nextDouble();
					
						final double EXPONENTANSWER = (double) (Math.pow(baseNumber, exponentNumber)); 
							//final is used here to create a constant for EXPONENTANSWER
							//https://www.geeksforgeeks.org/final-keyword-java/
						System.out.println("The answer is: " + EXPONENTANSWER); 
					}
					System.out.println("\nWhat should I do next? \n*press 1 to return to math menu \n*press any other number to continue");
					taskRepeat = scan.nextInt();
					}
				while(taskRepeat == 1);
			}
			
			if(userChoice ==4) {
				// Magic 8 Ball
				int decisionRepeat = 0;
				do {
					System.out.println("To help you decide, I can: \n1. Flip a coin \n2. Roll a dice");
					int userRandomChoice = scan.nextInt();
					Random random = new Random();
					switch (userRandomChoice) {
					case 1:
						System.out.println("Heads or tails?");
						int randomVariable = 1 + random.nextInt(1);
						String userAnswer = (randomVariable == 1) ? "Heads" : "Tails";
						System.out.println(userAnswer);
						break;
					case 2:
						System.out.println("How many faces does your dice have?");
						int numOfFaces = scan.nextInt();
					
						int diceRoll = 1 + random.nextInt(numOfFaces);
						System.out.println("Your roll is: " + diceRoll);
						break;
					case 3: 
		        	
					}
					System.out.println("\nWhat should I do next? \n*press 1 to decide another \n*press any other number to exit");
					decisionRepeat = scan.nextInt();
				}
				while(decisionRepeat == 1);
			} 

			if (userChoice == 5){
		        System.out.println("How large would you like the array?");
		        int arraySize = scan.nextInt(); // user inputs size of array
		        int[] exampleArray = new int [arraySize]; // creates an array from the arraySize
		        
		        System.out.println("Enter the numbers you would like in the array:");
		        for (int location = 0; location < arraySize;location++) { 
		            exampleArray[location] = scan.nextInt(); // user inputs the array values
		            }
		        
		        
		        int indexValue = 0; 
		        int smallestValue = exampleArray[indexValue];
		        int sum = 0;
		        
		        for(int x = 0; x < exampleArray.length; x++) {
		            if(exampleArray[x] <= smallestValue) {
		                smallestValue = (exampleArray[x]);
		                indexValue = x;
		            }
		            sum += exampleArray[x];
		        }
		        System.out.println("The smallest value is: " + smallestValue);
		        System.out.println("The index of the smallest value is: " + indexValue);
		        System.out.println("The sum of all the values in your array is: " + sum);
		        
		        ArrayList<Integer> exampleArray2 = new ArrayList<Integer>(); // creates an array from the arraySize
		        
		        System.out.println("Here is a list of numbers stored in an ArrayList:");
		        exampleArray2.add(57);
		        exampleArray2.add(15);
		        exampleArray2.add(6);
		        exampleArray2.add(64);
		        exampleArray2.add(3569);
		        exampleArray2.add(4);

		        for (int i : exampleArray2) {
		            System.out.println(i);
		          }
		        
		        Collections.sort(exampleArray2); 

		        int smallestNumber = exampleArray2.get(0);
		        System.out.println("The smallest value in this list is: "+ smallestNumber);
		        }
			
			System.out.println("Press 1 to return to menu, any other number to exit the program");
			programRepeat = scan.nextInt();
		}
		while(programRepeat == 1); // == works  by comparing what is stored in programRepeat to 1 
		//end of program message
		System.out.println("\nThank You for looking through my Integration Project!");	
		}
	
	//addition get
	public static double getSum(Scanner scan) { //public is the header and (Scanner scan) is the parameter		
        System.out.println("How many numbers are you adding together?");
        int arraySize = scan.nextInt(); // user inputs size of array
        int[] additionArray = new int [arraySize]; // creates an array from the arraySize
        
        System.out.println("Enter the numbers you would like to add:");
        for (int location = 0; location < arraySize;location++) { 
            additionArray[location] = scan.nextInt(); // user inputs the array values
            }
        
        int sum = 0;       
        for(int x : additionArray) {
            sum += x;
		}
		return sum;
	}
}

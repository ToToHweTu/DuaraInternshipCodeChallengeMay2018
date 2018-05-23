
/*
 * Mercy Salome 
 * Duara Challenge
 * Task 2_ Division by repeated subtraction:
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {

//function that divides two numbers and returns their quotient using recursive subtraction
	public static int DivbySubtraction(int x, int y) {

		if (x < y) {
			return 0;
		} else {

			return 1 +  DivbySubtraction(x - y, y);
		}


	}
	//Using the function
	public static void main(String[] args) {
		try {
			System.out.println("Enter two numbers you wish to divide( enter dividend first)");
			Scanner in = new Scanner(System.in);

			int  dividend = in.nextInt();
			int divisor = in.nextInt();
			int quotient = 0;

			if (dividend<0 &&divisor<0) {//if both are negative numbers ignore the sign 
				dividend = -1*dividend;
				divisor = divisor *-1;
				quotient = DivbySubtraction(dividend, divisor);

			}
			else if(dividend<0) { //if dividend is negative number make  positive 
				dividend = -1*dividend;


				quotient = DivbySubtraction(dividend, divisor);
				quotient=  quotient	*-1;} 

			else if(divisor<0) { //if divisor is negative make positive first
				divisor = divisor *-1;
				quotient = DivbySubtraction(dividend, divisor);
				quotient=  quotient	*-1;}   



			else { //if both are positive
				quotient = DivbySubtraction(dividend, divisor);


			}
			System.out.println("The quotient is: "+ quotient);
			in.close();
		}
		catch(InputMismatchException e){
			System.out.println("Input in wrong format");

		}
	}



}
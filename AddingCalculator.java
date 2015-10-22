import java.util.Scanner;
public class AddingCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);//this gets user input
		
		//insert type of operation here
		System.out.println("An addition
 calculator by Dhanush Patel.");
		
		System.out.println("Enter the first number: ");
		double input1 = scanner.nextDouble();
		
		System.out.println("Enter the second number: ");
		double input2 = scanner.nextDouble();

		System.out.println("Enter the third number: ");
		double input3 = scanner.nextDouble();

		System.out.println("Enter the fourth number: ");
		double input4 = scanner.nextDouble();
		
		System.out.println("Enter the fifth number: ");
		double input5 = scanner.nextDouble();

		double result = input1 + input2 + input3 + input4 + input5; //insert operation here
		
		System.out.println("Result = " + result);
	}
}
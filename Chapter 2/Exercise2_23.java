// Elise Sarles March 10 2020
import java.util.Scanner; 
class Exercise2_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// I like that if i put it like this it will ask the question, you anwser it then it wil show the next question. 
		System.out.println("Enter Driving distance: ");
		Double Miles = input.nextDouble();
		System.out.println("Enter Miles per gallon: ");
		Double Mpg = input.nextDouble();
		System.out.println("Enter price per gallon: ");
		Double Ppg = input.nextDouble();
		Double Cod = (Miles / Mpg) * Ppg;
		System.out.println("The cost of driving is " + Cod);
	}
}
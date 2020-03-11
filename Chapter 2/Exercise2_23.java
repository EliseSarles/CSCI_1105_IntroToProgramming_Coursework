// Elise Sarles March 10 2020 Cost of gas for a trip
import java.util.Scanner; 
class Exercise2_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// I like that if i put it like this it will ask the question, you anwser it then it wil show the next question. 
		System.out.println("Enter Driving distance: ");
		double miles = input.nextDouble();
		System.out.println("Enter Miles per gallon: ");
		double mpg = input.nextDouble();
		System.out.println("Enter price per gallon: ");
		double ppg = input.nextDouble();
		double cod = (miles / mpg) * ppg;
		System.out.println("The cost of driving is " + cod);
	}
}
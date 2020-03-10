// Elise Sarles March 9 2020
import java.util.Scanner;
class Exercise2_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter in a degress of Celsius: ");
		double Celsius = input.nextDouble();;
		double Fahrenhiet = 9.0 / 5 * Celsius + 32;
		System.out.println(Celsius + " Celsius is "+ Fahrenhiet +" Fahrenhiet");
	}
}
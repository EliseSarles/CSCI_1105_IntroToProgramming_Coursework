/// Elise Sarles March 13 2020
import java.util.Scanner;
class Exercise3_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter value of a");
		double a = input.nextDouble();
		System.out.println("enter value of b");
		double b = input.nextDouble();
		System.out.println("enter value of c");
		double c = input.nextDouble();
		System.out.println("enter value of d");
		double d = input.nextDouble();
		System.out.println("enter value of e");
		double e = input.nextDouble();
		System.out.println("enter value of f");
		double f = input.nextDouble();
		double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
		double y = ((a * f) - (e * c)) / ((a * d) - (b * c));
	if (((a * d) - (b * c)) == 0) {
		System.out.println("Cannot divide by zero");
	}
	else {
				System.out.println("X = " + x);
		System.out.println("Y = " + y);
	}
	}
}
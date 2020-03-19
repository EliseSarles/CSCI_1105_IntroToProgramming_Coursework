/// Elise Sarles March 19 2020.  Type in side of triangle you get perimeter it is a real triangle
import java.util.Scanner;
class Exercise3_19{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Frist side of the Triangle");
		double a = input.nextDouble();
		System.out.println("Secound side");
		double b = input.nextDouble();
		System.out.println("Third side");
		double c = input.nextDouble();
		double p = a + b + c;
		if (a +b < c) {
			System.out.println("INVAlID TRIANGLE");
		}
		else if (c+b < a){
					System.out.println("INVAlID TRIANGLE");
		}
		else if (a + c < b){
					System.out.println("INVAlID TRIANGLE");
		}

		else {
			System.out.println("Perimeter is " + p);
		}
	}
}
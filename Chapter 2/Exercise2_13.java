// Elise Sarles March 9 2020
import java.util.Scanner; 
class Exercise2_13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Monthly saving amount: $" );
		Double FivePersent = (1+ 0.00417);
		double Month0 = input.nextDouble();
		double Month1 = Month0 * FivePersent;
		double Month2 = (Month0 + Month1) * FivePersent;
		double Month3 = (Month0 + Month2) * FivePersent;
		double Month4 = (Month0 + Month3) * FivePersent;
		double Month5 = (Month0 + Month4) * FivePersent;
		double Month6 = (Month0 + Month5) * FivePersent;
		System.out.println("After The sixth month, the account value is $" + Month6);
		
	}
}
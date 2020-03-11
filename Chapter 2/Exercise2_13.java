// Elise Sarles March 9 2020 money in a bank
import java.util.Scanner; 
class Exercise2_13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Monthly saving amount: $" );
		double fivePersent = (1+ 0.00417);
		double month0 = input.nextDouble();
		double month1 = month0 * fivePersent;
		double month2 = (month0 + month1) * fivePersent;
		double month3 = (month0 + month2) * fivePersent;
		double month4 = (month0 + month3) * fivePersent;
		double month5 = (month0 + month4) * fivePersent;
		double month6 = (month0 + month5) * fivePersent;
		System.out.println("After The sixth month, the account value is $" + month6);
		
	}
}
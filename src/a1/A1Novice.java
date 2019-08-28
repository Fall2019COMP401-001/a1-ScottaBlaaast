package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		//For the amount of customers we have:
		//Print out their first initial and last name
		// For the amount of items they have
		// multiply the int by the double and add them up.
		
		int customers = scan.nextInt();
		for (int i = 0; i < customers; i++)
		{
			String firstName = scan.next().substring(0,1);
			String lastName = scan.next();
			int groceries = scan.nextInt();
			double total = 0;
			for (int j = 0; j < groceries; j++)
			{
				int quantity = scan.nextInt();
				String irrelevent = scan.next();
				total += quantity * scan.nextDouble();
			}
			System.out.println(firstName + ". " + lastName + ": " + String.format("%.2f", total));
		}
	}
}

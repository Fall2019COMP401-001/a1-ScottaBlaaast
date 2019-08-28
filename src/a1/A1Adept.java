package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		// Setting up the grocery arrays
		Scanner scan = new Scanner(System.in);
		int groceriesOffered = scan.nextInt();
		String[] names = new String[groceriesOffered];
		double[] prices = new double[groceriesOffered];
		for(int i = 0; i < groceriesOffered; i++)
		{
			names[i] = scan.next();
			prices[i] = scan.nextDouble();
		}
		// Acquiring customer names and how much each spent
		int customers = scan.nextInt();
		String[] cNames = new String[customers];
		double[] cPrices = new double[customers];
		for(int i = 0; i < customers; i++)
		{
			cNames[i] = scan.next() + " " + scan.next();
			int temp = scan.nextInt();
			for(int j = 0; j < temp; j++)
			{
				int amount = scan.nextInt();
				String item = scan.next();
				for(int k = 0; k < names.length; k++)
				{
					if(names[k].equals(item))
					cPrices[i] += amount * prices[k];
				}
			}
			
		}
		// determining which price is lowest, highest, and avg
		double lowest = cPrices[0];
		int lowestIndex = 0;
		for(int i = 0; i < cPrices.length; i++)
		{
			if (cPrices[i] < lowest)
			{
				lowest = cPrices[i];
				lowestIndex = i;
			}
		}
		double highest = cPrices[0];
		int highestIndex = 0;
		for(int i = 0; i < cPrices.length; i++)
		{
			if (cPrices[i] > highest)
			{
				highest = cPrices[i];
				highestIndex = i;
			}
		}
		double avg = 0;
		for(int i = 0; i < cPrices.length; i++)
		{
			avg += cPrices[i];
		}
		avg /= cPrices.length;
		// output
		System.out.println("Biggest: " + cNames[highestIndex] + " (" + String.format("%.2f", cPrices[highestIndex]) + ")"); 
		System.out.println("Smallest: " + cNames[lowestIndex] + " (" + String.format("%.2f", cPrices[lowestIndex]) + ")");
		System.out.println("Average: " + String.format("%.2f", avg));	
	}
}

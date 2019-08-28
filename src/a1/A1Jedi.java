package a1;

import java.util.Scanner;

public class A1Jedi {


	public static void main(String[] args) {
		
		// Setting up the grocery array
		Scanner scan = new Scanner(System.in);
		int groceriesOffered = scan.nextInt();
		String[] names = new String[groceriesOffered];
		
		//amountBought = total amount of an item bought
		//customersBought = how many customers bought that item
		int[] amountBought = new int[groceriesOffered];
		int[] customersBought = new int[groceriesOffered];
		for(int i = 0; i < groceriesOffered; i++)
		{
			names[i] = scan.next();
			scan.nextDouble();
		}
		
		//list of groceries
		//go through customer's list, adding to the quantities bought array when they are bought
				
		int customers = scan.nextInt();
		for(int i = 0; i < customers; i++)
		{
			// skipping the name
			scan.next();
			scan.next();
			
			int differentGroc = scan.nextInt();
			for(int j = 0; j < differentGroc; j++)
			{
				int curr = scan.nextInt();
				String currS = scan.next();
				for(int k = 0; k < names.length; k++)
				{
					if(currS.equals(names[k]))
					{
						amountBought[k] += curr;
						customersBought[k]++;
					}
				}
			}
		}
		
		// output
		for(int i = 0; i < names.length; i++)
		{
			if(amountBought[i] == 0)
			{
				System.out.println("No customers bought " + names[i]);
			}
			else
			{
				System.out.println(customersBought[i] + " customers bought " + amountBought[i] + " " + names[i]);
			}
		}
	}
}

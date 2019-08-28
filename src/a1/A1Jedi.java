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
		//looping for each customer
		for(int i = 0; i < customers; i++)
		{
			boolean[] alreadyBought = new boolean[groceriesOffered];
			//resets alreadyBought
			for(int l = 0; l < alreadyBought.length; l++)
			{
				alreadyBought[l] = false;
			}
			// skipping the name
			scan.next();
			scan.next();
			// looping for the amount of different groceries the customer bought
			int differentGroc = scan.nextInt();
			for(int j = 0; j < differentGroc; j++)
			{	
				//curr = how many of a specific grocery they bought
				int curr = scan.nextInt();
				//currS = name of the grocery they bought
				String currS = scan.next();
				//loop through the grocery list to determine index to increment
				for(int k = 0; k < names.length; k++)
				{
					if(currS.equals(names[k]))
					{
						amountBought[k] += curr;
						if(!alreadyBought[k])
						{
							alreadyBought[k] = true;
							customersBought[k]++;
						}
												
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

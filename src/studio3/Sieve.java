package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the number n: ");
		int number = in.nextInt();
		
		boolean [] set = new boolean [number + 1];
		set [0] = true;
		
				for(int n = 2; n < number + 1; n++)
				{
					
					
					for(int o = n; o < number + 1; o=(n+o)) {
					
						set [o] = false;
		
				}

				
				}
				
				for (int i=1; i < set.length; i++)
				{
					System.out. println(i);
				}

			

	}
}
		

		
	



package MaxNumber;

import java.util.Scanner;

public class MaxNumber {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		 
		System.out.println("Enter 3 numbers to find their max");
		 
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		
		int max = 0;
		
		if (num1 > num2 && num1 > num3) {
			 max = num1;
		}
		else if(num2 > num1 && num2 > num3 ) {
			max = num2;
		}
		else {
			max = num3;
		}
		
		
		System.out.println("The max is: " + max);
		}
	

	
	}



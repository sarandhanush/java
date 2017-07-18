package DemoStatement;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[]args) {
		int number,sum=0,temp,mod;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number");
		number = input.nextInt();
		temp = number;
		while(temp!=0) {
			mod = temp%10;
			sum = sum + mod*mod*mod;
			temp = temp / 10;
					
		}
		if(number == sum) {
			System.out.println("Given Number is Armstrong Number");
		}
		else {
			System.out.println("Given number is Not Armstrong Number");
		}
	}

}

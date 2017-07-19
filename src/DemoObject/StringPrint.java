package DemoObject;

import java.util.Scanner;

public class StringPrint {
	public static void main(String[]args) {
		Scanner userName = new Scanner(System.in);
		System.out.println("Enter the your name ");
		String name = userName.next();
		System.out.println("\"Good Morning\"" + " \'dude\'");
		System.out.println("Have a nice day! "+'"'+name+'"');
	}
}

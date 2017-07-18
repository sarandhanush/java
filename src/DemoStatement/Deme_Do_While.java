package DemoStatement;

public class Deme_Do_While {
public static void main(String[]args) {
	/*--Do while false condition--*/
	int a=1;
	do {
		System.out.println("value of a is "+a);
		a++;  //post-incrementer
		++a; // pre-incrementer
	}
	while(a>5); {
	System.out.println("value of a is "+a);
	}
	
	/*--Do while true condition--*/
	int b=4;
	do {
		System.out.println("value of b is "+b);
		b++;
	}
	while(b<5); {
	System.out.println("value of b is "+b);
	}
}
}

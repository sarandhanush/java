package DemoObject;

public class AcessInstanceMember {
	String color = "red";

	int areaOfCircle(int a) {
		int b = a * a;
		return b;
	}

	public static void main(String[] args) {
		AcessInstanceMember obj = new AcessInstanceMember();
		System.out.println(obj.color);
		int result = obj.areaOfCircle(3);
		System.out.println(result);

	}

}

package DemoObject;

public class StaticAcessInstance {
	static void testMethod() {
		System.out.println("Acessing Static method from Instance");
	}

	int areaOfRectangle(int l, int b) {
		int area = l * b;
		testMethod();
		return area;
	}

	public static void main(String[] args) {
		StaticAcessInstance ref = new StaticAcessInstance();
		int var = ref.areaOfRectangle(3, 6);
		System.out.println(var);
	}

}

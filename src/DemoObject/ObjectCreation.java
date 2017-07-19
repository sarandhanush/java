package DemoObject;

public class ObjectCreation {
	int price = 100;
	int tax =10;
	public static void main(String[] args) {
		ObjectCreation ref = new ObjectCreation();
		System.out.println(ref.price);
		System.out.println(ref.tax);
		ref = new ObjectCreation();
		System.out.println(ref);
		System.out.println(ref.price);
		System.out.println(ref.tax);
		ref = null;
		System.out.println(ref);
		System.out.println(ref.price);
		System.out.println(ref.tax);

	}

}

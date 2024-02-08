
public class InstanceOf {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		findInstance(b);

	}

	private static void findInstance(Object o) {

		if (o instanceof A) {
			System.out.println("o instanceof A");
		}
		if (o instanceof B) {
			System.out.println("o instanceof B");
		}
		if (o instanceof C) {
			System.out.println("o instanceof C");
		}
		if (o instanceof Object) {
			System.out.println("o instanceof Object");
		}

	}
}

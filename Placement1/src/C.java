
public class C extends B{
	C(){
		System.out.println("C");
	}
	C(int c){
		super (10);
		System.out.println("C with "+c);
	}
	
	public static void main(String[] args) {
		C c = new C();
	}
}

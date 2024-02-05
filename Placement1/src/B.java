public class B extends A{
	B(){
		System.out.println("B");
	}
	B(int b){
		super (100);
		System.out.println("B with "+b);
	}
}
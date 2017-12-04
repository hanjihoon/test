package p10;

public class Son extends Father {
	
	public Son(){
		super(1,2);
	}
	
	public void test() {
		a = 8;
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		Son s = new Son();
		s.test();
		
		
	}

}

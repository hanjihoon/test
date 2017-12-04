package p10;

public class Father {
	int a;
	
	public int minNum;
	public int maxNum;
	
	public Father(int minNum, int maxNum) {
		this.minNum = minNum;
		this.maxNum = maxNum;
		System.out.println("너냐 날 부른게");
	}
	
	 protected void test() {
		 a = 5;
		 System.out.println(a);
		
	}
	 
	 public void print() {
		 System.out.println("아빠꺼 프린트");
	 }
}

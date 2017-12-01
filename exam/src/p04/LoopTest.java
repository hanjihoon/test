package p04;

public class LoopTest{
	void func1(int num1, int num2) {
		for(int i=num1; i<num2; i++) {
		int sum = 0;
		sum += i;
		}
	}
	void func2() {
		for(int i=1; i<101; i+=2) {
		System.out.print(i + ", ");
		if(i%9==0) {
			System.out.println();
		}
		}
	}
	void func3(int num1, int num2, int num3) {
		if(num1>num2) {
			int tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
		for(int i=num1; i<num2; i++) {
			if(i%num3==0) {
				System.out.print(i + ",");
			}
			if(i%10==0) {
			System.out.println();
			}
		}
	}
		
	public static void main(String[] args) {
	
	LoopTest lp = new LoopTest();
	lp.func3(3,100,0);
	
	}
}

package p03;

public class CastingExam01 {
	public static void main(String[] args) {
		double d = 12.3;
		int i = (int)d;
		
		System.out.println("더블 타입 d = " + d);
		System.out.println("인트타입 i = " + i);
		
		int i2 = 123;
		double d2 = i2;
		
		long l = 1234;
		int i3 = (int)l;
		
		int i4 = 1234;
		long l2 = i4;
		
	}

}

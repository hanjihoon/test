package p07;

public class Exam02 {
	int w = 107;
	int a = 4;
	int b = 3;
	int c = 2;
	int d = 0;
	int e = 0;
	int f = 0;

	void func() {
		for (int i = a; i < w; i += a) {
			d += 1;
		}
		if (w % a >= b && ((w % a) % b) > c || ((w % a) % b)==0 ) {
			for (int j = b; j <= (w % a); j += b) {
				e += 1;
			}
		}
		if ((w % a) % b >= c && ((w % a) % b) % c == 0) {
			for (int k = c; k <= ((w % a) % b); k += c) {
				f += 1;
			}
		}
	}
	
	void print() {
		int sum = d + e + f;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		/*
		 * 총 107L의 물이 있습니다 5리터 물통과 3리터 물통 2리터의 물통을 가지고 있을때 총 몇개의 물통이 있어야 107리터를 담을 수 있는지
		 * 계산하는 프로그램을 작성해주세요. 단 물통의 개수는 최소여야 합니다.
		 */
		Exam02 e = new Exam02();
		e.func();
		e.print();
	}
}

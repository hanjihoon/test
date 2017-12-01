package p06;

public class Exam01 {

	public static void main(String[] args) {

		for (int i = 9; i > 0; i--) {
			for (int j = 9; j > 0; j--) {
				System.out.print(i + " x " + j + " = " + i * j);
				
				if ((i * j) % 3 == 0) {
					System.out.print(" (3의 배수)");
				}
				if(j!=1) {
					System.out.print(", ");
				}
			}
			System.out.println();
		}
	}
}

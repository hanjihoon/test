package p07;

import java.util.Scanner;

public class Exam01 {
	int sum = 0;
	int [] nums = new int[5];
	
	void inputNums() {
		for(int i=0;i<5;i++) {
		Scanner s = new Scanner(System.in);
		System.out.println( i+1+"번째숫자를 입력하시오");
		nums[i] = s.nextInt();
		}
	}
	void print() {

		for (int i = nums[0]; i > nums[1]; i--) {
			for (int j = nums[2]; j > nums[3]; j--) {
				String str = i + " x " + j + " = " + i * j;
				if ((i * j) % nums[4] == 0) {
					str = nums[4]+"의 배수";
					sum+=1;
				}
				System.out.print(str);
				if(j!=1) {
					System.out.print(", ");
				}
			}
			System.out.println();
		}
		System.out.println("*"+nums[4]+"의 배수의 개수는 = "+sum);
	}

	public static void main(String[] args) {
		Exam01 e = new Exam01();
		e.inputNums();
//		e.print();
		System.out.println(e.nums[4]);
	}
}

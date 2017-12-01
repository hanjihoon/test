package p07;

import java.util.Scanner;

public class Exam03 {

	int[] nums = new int[5];

	void inputNums() {
		for (int i = 0; i < nums.length; i++) {
			Scanner s = new Scanner(System.in);
			System.out.println(i + 1 + "번째숫자를 입력하시오");
			nums[i] = s.nextInt();
		}

	}

	void loop() {
		int temp = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
					temp = 0;
				}
			}
		}
	}

	void print() {
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

	public static void main(String[] args) {
		Exam03 e = new Exam03();
		e.inputNums();
		e.loop();
		e.print();

	}

}

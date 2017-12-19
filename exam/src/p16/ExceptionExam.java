package p16;

import java.util.Scanner;

public class ExceptionExam {
	public void convertAndPrint(String numStr) throws Exception {
		System.out.println(Integer.parseInt(numStr));
	}

	public static void main(String[] args) {
		ExceptionExam ee = new ExceptionExam();
		Scanner s = new Scanner(System.in);
		System.out.println("출력하실 숫자를 입력해 주세요");
		String str = s.nextLine();
		try {
			ee.convertAndPrint(str);
		} catch (Exception e) {
			System.out.println("숫자를 적어 달라고 제발..");
			System.out.println("출력하실 숫자를 적어주세요!");
			str = s.nextLine();
			try {
				ee.convertAndPrint(str);
			} catch (Exception e1) {
				System.out.println("숫자를 적어 달라고 제발..");
			}

		}
	}
}

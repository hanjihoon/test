package P05;

import java.util.Scanner;

public class ArrayExam2 {
	int num1;
	int num2;
	
	void inputNums() {
		Scanner s = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요");
		num1 = s.nextInt();
		System.out.print("두번째 숫자를 입력하세요");
		num2 = s.nextInt();
	}
	
	void LoopTest() {
		for(int i=1;i<num1;i++) {
			for(int j=1;j<=num2;j++) {
				}
			}
	}	
	
	void printGGD() {
		for(int i=1;i<=num1;i++) {
			for(int j=1;j<=num2;j++) {
				System.out.print(i + "x" + j + "=" + i*j + " ");
				if(j==num2) {
					System.out.println(" ,");
				}else {
					System.out.println(); 
				}
			}
		}
	}
	public static void main(String[] args) {
		//스캐너 클래스로 구구단의 최대값울 입력받아 줻력받아 주세요
		//입력받은 각각의 단 만큼 구구단을 출력하는 프로그램을 작성해 주시기 바람니다.
		ArrayExam2 ae2 = new ArrayExam2();
		ae2.inputNums();
		ae2.printGGD();
	}	
}

package P05;

import java.util.Scanner;

public class ArrayExam {
	static int num1;
	static int num2;
	int [][] numArr;
	
	public void inputNums() {
		Scanner s = new Scanner(System.in);		
		System.out.println("1차원 배열변수의 갯수를 입력하세요");
		num1 = s.nextInt();
		System.out.print("2차원 배열변수의 갯수를 입력하세요");
		num2 = s.nextInt();
	}
	
	void initNumArr() {
		numArr = new int[num1][num2];
		for(int i=0;i<numArr.length;i++) {
			for(int j=0;j<numArr[i].length;j++) {
				numArr[i][j]=(i*numArr[i].length)+(j+1);
			if(j+1<numArr[i].length) {
				}
			}
		}
	}
	void printNumArr() {
		for(int i=0;i<numArr.length;i++) {
			System.out.println();
			for(int j=0;j<numArr[i].length;j++) {
				numArr[i][j]=(i*numArr[i].length)+(j+1);
			System.out.print(numArr[i][j]);
			if(j+1<numArr[i].length) {
				System.out.print(", ");
				}
			}
		}	
	}
	public static void main(String[] args) {
		
		ArrayExam ae = new ArrayExam();
		ae.inputNums();
		System.out.println(ae.num1);
		System.out.println(ae.num2);
		ae.initNumArr();
		ae.printNumArr();				
	}
}

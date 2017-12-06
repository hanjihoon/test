package p12;

import java.util.ArrayList;
import java.util.Scanner;

public class ListExam2 {

	ArrayList<String> al;
	String sNum;
	String[] strs;

	// 중복제거,중복될 경우 중복값이 있다고 알려주고 다시 돔, 홀짝 출력 함수 2개

	ListExam2(){

	al = new ArrayList<String>();
}

	void inputSplit() {
		Scanner s = new Scanner(System.in);
		System.out.println("배열화 할 문자열을 입력해주세요.");
		sNum = s.nextLine();
		strs = sNum.split(",");
	}
	
	void putNums() {
		
		for (int i = 0; i < strs.length; i++) {
			al.add(strs[i]);
		}
	}

	void checkDupl() {
		for (int i = 0; i < strs.length; i++) {
			for (int j = i - 1; j >= 0; j--) {
				if (strs[i].equals(strs[j])) {
					System.out.println("값이 중복되었습니다!");
					inputSplit();
					checkDupl();
					return;
				}					
			}
		}
		putNums();
	}

	
	
	void printOdd() {
		System.out.println("짝수만!");
		for(int i=0;i<al.size();i++) {
			int num = Integer.parseInt(al.get(i));
			if(num%2==0) {
				System.out.print(num+", ");
			}
		}
		System.out.println();
	}
	void printEven() {
		System.out.println("홀수만!");
		for(int i=0;i<al.size();i++) {
			int num = Integer.parseInt(al.get(i));
			if(num%2==1) {
				System.out.print(num+", ");
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		ListExam2 le = new ListExam2();
		le.inputSplit();
		le.checkDupl();
		le.printEven();
		le.printOdd();
	}
}

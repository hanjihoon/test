package p16;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam01 {

	ArrayList<Integer> al = new ArrayList<Integer>();
	int num1;
	int num2;
	int num3;
	int num4;
	int num5;

	Exam01() {
		Scanner s = new Scanner(System.in);
		System.out.println("첫번째 점수를 입력해 주세요");
		num1 = s.nextInt();
		al.add(num1);
		System.out.println("두번째 점수를 입력해 주세요");
		num2 = s.nextInt();
		al.add(num2);
		System.out.println("세번째 점수를 입력해 주세요");
		num3 = s.nextInt();
		al.add(num3);
		System.out.println("네번째 점수를 입력해 주세요");
		num4 = s.nextInt();
		al.add(num4);
		System.out.println("다섯번째 점수를 입력해 주세요");
		num5 = s.nextInt();
		al.add(num5);
	}

	void setDown() {
		for (int i = 0; i < al.size(); i++) {
			for (int j = i + i; j < al.size(); j++) {
				if (al.get(i) > al.get(j)) {
					int iNum = al.get(i);
					int jNum = al.get(j);
					int tmp = 0;
					tmp = iNum;
					iNum = jNum;
					jNum = tmp;
					al.set(i, iNum);
					al.set(j, jNum);
				}
			}
		}
	}

	void print () {
		System.out.println("정렬된 점수");
		for(int i: al) {
			System.out.print(i+",");
		}
		System.out.println();
	}
	
	int sum() {
		int sum = 0;
		for (int a : al) {
			sum += a;
		}
		return sum;
	}

	int average() {
		return sum() / 5;
	}
	public static void main(String[] args) {
		Exam01 e1 = new Exam01();
		e1.setDown();
		e1.print();
		System.out.println(e1.sum());
		System.out.println(e1.average());
	}
}



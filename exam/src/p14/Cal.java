package p14;

import java.util.ArrayList;
import java.util.Scanner;

public class Cal {
	int a;
	int b;
	String str = new String();
	ArrayList<Integer> al = new ArrayList<Integer>();

	void inputNums() {
		Scanner s = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하여 주세요");
		a = s.nextInt();
		s.nextLine();
		System.out.println("두번째 숫자를 입력하여 주세요");
		b = s.nextInt();
		s.nextLine();
		System.out.println("연산자를 입력하여 주세요");
		str = s.nextLine();
	}

	int operator(int a, int b, String str) {
		if (str.equals("+")) {
			return a + b;
		} else if (str.equals("-")) {
			if (a < b) {
				int tmp = 0;
				tmp = a;
				a = b;
				b = tmp;
			}
			return a - b;
		} else if (str.equals("*")) {
			return a * b;
		} else {
			if (a < b) {
				int tmp = 0;
				tmp = a;
				a = b;
				b = tmp;
			}
			return a / b;
		}
	}
	
	void numToAL() {
		al.add(operator(a,b,str));
		}
	
	void print() {
		for(int i =al.size()-1; i>=0;i--) {
			System.out.println(al.get(i));
		}
	}
	
	public static void main(String[] args) {
		Cal c = new Cal();
		for(int i=0; i<3; i++) {
		c.inputNums();
		c.numToAL();
		}
		c.print();
	}
}

/*
 * 1. 더하기, 빼기, 곱하기, 나누기를 각 각 실행 해주는 인트형 함수 네 개 를 만들고 사용자에게 피연산자 두 개 와 연산자 하나를
 * 입력받아 입력받은 연산자에 맞는 함수를 실행하여 리턴받은 값을 어레이리스트에 저장 저장 한 어레이리스트를 거꾸로 출력하는 프로그랩을
 * 작성하시오 (단. 빼거나 나눈땐 자동으로 큰 값에서 작은 값을 빼거나 나누어야 한다.)
 */

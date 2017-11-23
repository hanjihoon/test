package p03;

import java.util.Scanner;

public class Test {
	String str;
	
	Test(String str){
		this.str = str;
	}
	void print() {
		System.out.println(str);
	}
	String getCoffee() {
		Scanner s = new Scanner(System.in);
		System.out.println("커피를 먹으려면 돈을 입력하세요!!");
		int pay = s.nextInt();
		if(pay>1000) {
			return "커피를 사왔습니다.";
		}
		return "돈 부족해 임마!!";
	}
	
	public static void main(String[] args) {
		Test t = new Test("가나다ABC123");
		try {
		t.print();
		String result = t.getCoffee();
		System.out.println(result);
		}catch(Exception e) {
			System.out.println("돈을 안 넣은거 같은데? 그래서 고장난듯?");
		}
	}
}
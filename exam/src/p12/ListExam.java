package p12;

import java.util.ArrayList;
import java.util.Scanner;

public class ListExam {

	private ArrayList<String> alStr;
	int cnt = 0;

	ListExam() {
		alStr = new ArrayList<String>();
	}

	void inputAlStr() {
		Scanner s = new Scanner(System.in);
		System.out.println("숫자스트링을 넣어주세요. 구분자는 , 입니다.");
		String str = s.nextLine();
		String[] strs = str.split(",");
		for (String ss : strs) {
			alStr.add(ss);
		}
	}

	void add(String str) {
		alStr.add(str);
		// if(alStr.size()==1) {
		// System.out.println("처음 값을 추가 하셨군요");
		// }else System.out.println(alStr.get(alStr.size()-2));
	}

	String get(int idx) {
		return alStr.get(idx);
	}

	void remove(int idx) {
		alStr.remove(idx);
	}

	void printAlStr() {
		for (int i = 0; i < alStr.size(); i++) {

			System.out.println(cnt + "번째 값 : " + alStr.get(i));
			cnt++;
		}
	}

	void printEven() {
		for (int i = 0; i < alStr.size(); i++) {
			if (i % 2 == 0) {
				if (alStr.get(i).equals(i + "")) {
					alStr.remove(i);
					i--;
				} else {
					System.out.println(alStr.get(i));
				}
			}
		}
	}

	void printAlStr2() {
		for (int i = 0; i < alStr.size(); i++) {
			String numStr = alStr.get(i);
			System.out.println(i + "번째 값은 : " + alStr.get(i));
		}
	}

	void printSum() {
		int sum = 0;
		for (int i = 0; i < alStr.size(); i++) {
			int numStr = Integer.parseInt(alStr.get(i));
			sum+= numStr;
			System.out.println(i + "번째 값은 : " + alStr.get(i));
		}
		System.out.println("각 배열 값의 합은 = "+sum);
	}

	public static void main(String[] args) {

	}

}

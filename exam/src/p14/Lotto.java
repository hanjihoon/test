package p14;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
	/*
	 * 로또번호를 입력하고 랜덤하게 로또를 만들고 (자동,수동 반자동이 선택가능하게 만들어야함) 로또가 끝난이후 맞춘 갯수를 출력
	 */
	ArrayList<Integer> lt = new ArrayList<Integer>();
	ArrayList<Integer> myNums = new ArrayList<Integer>();
	Random r = new Random();
	int halfSel;
	String selGame = new String();

	Lotto() {
		Scanner s = new Scanner(System.in);
		System.out.println("게임 방식을 입력해주세요.(자동, 수동, 반자동)");
		selGame = s.nextLine();
		if (selGame.equals("자동")) {
			auto();
		}
		if (selGame.equals("수동")) {
			for (int i = 0; i < 6; i++) {
				System.out.println(i + 1 + "번째 숫자를 적어주세요");
				int sNum = s.nextInt();
				myNums.add(sNum);
				if (checkDupl(myNums, sNum,i)) {
					System.out.println("중복 되었습니다! 다시 입력해주세요");
					i--;
				}
			}
		}
		if (selGame.equals("반자동")) {
			System.out.println("수동으로 입력할 개수를 입력해주세요.");
			int pNum = s.nextInt();
			for (int i = 0; i < pNum; i++) {
				System.out.println(i+1+"번째 숫자를 입력해주세요");
				myNums.add(s.nextInt());
			}
			for (int i = 0; i < 6 - pNum; i++) {
				myNums.add(r.nextInt(45) + 1);
			}
		}
	}

	void auto() {
		for (int i = 0; i < 6; i++) {
			int rNum = r.nextInt(45) + 1;
			myNums.add(rNum);
			if (checkDupl(myNums, rNum,i)) {
				myNums.remove(i);
				i--;
			}
		}
	}

	boolean checkDupl(ArrayList<Integer> al, int a,int b) {
		for (int i = al.size(); i > 0; i--) {
			if (i-2>-1&&al.get(i - 2) == a) {
				return true;
			}
		}
		return false;
	}

	void initLotto() {
		for (int i = 0; i < 6; i++) {
			int rNum = r.nextInt(45) + 1;
			lt.add(rNum);
			if (checkDupl(lt, rNum,i)) {
				lt.remove(i);
				i--;
			}
		}
	}

	void compare() {
		System.out.println("당첨번호");
		String str = "[";
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (lt.get(i) == myNums.get(j)) {
					str += myNums.get(j)+",";
				}
			}
		}
		System.out.print(str + "]");
	}

	void print(ArrayList<Integer> al) {
		if (al==myNums) {
			System.out.println("내 번호");
		}else {
			System.out.println("로또 번호");
		}
		String str = "[";
		for (Integer i : al) {
			str += i+",";
		}
		System.out.println(str+"]");
		System.out.println();
	}

	public static void main(String[] args) {
		Lotto l = new Lotto();
		l.initLotto();
		l.print(l.lt);
		l.print(l.myNums);
		l.compare();
	}
}

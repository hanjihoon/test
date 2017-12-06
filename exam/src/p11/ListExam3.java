package p11;

import java.util.ArrayList;
import java.util.Random;

public class ListExam3 {

	Integer sum = 0;
	Random r = new Random();
	ArrayList<Integer> alInt = new ArrayList<Integer>();

	void inputNums() {
		for (int i = 0; i < 20; i++) {
			int rNum = r.nextInt(30) + 1;
			alInt.add(rNum);
			for (int j = i -1; j > 0; j--) {
				if (alInt.get(i) != null && alInt.get(j) != null && alInt.get(i) == alInt.get(j)) {
					alInt.remove(i);
					i--;
				}
			}
		}
	}

	void sumNums() {
		for (int i = 0; i < alInt.size(); i++) {
			sum += alInt.get(i);
		}
	}

	void printNums() {
		for (Integer a : alInt) {
			System.out.print(a + ",");
		}
	}

	public static void main(String[] args) {
		ListExam3 le = new ListExam3();
		le.inputNums();
		le.printNums();
		System.out.println();
		le.sumNums();

		System.out.println(le.sum);
	}

}

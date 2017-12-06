package p12;

import java.util.LinkedHashMap;
import java.util.Random;

public class MapExam {

	Random r = new Random();

	LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();

	void add(String str) {
		hm.put(hm.size(), str);
	}

	void add(int idx, String str) {
		hm.put(idx, str);
	}

	void inputNums() {
		for (int i = 0; i < 10; i++) {
			int rNum = r.nextInt(10) + 1;
			if (hm.containsKey(rNum) == false) {
				add(rNum, (i + 1) + "번째 값");
			} else {
				i--;
			}
		}
	}

	public static void main(String[] args) {
		MapExam me = new MapExam();
		me.inputNums();
		System.out.println(me.hm);
	}

}

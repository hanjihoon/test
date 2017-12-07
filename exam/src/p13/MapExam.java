package p13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class MapExam {

	int tmp = 0;

	Random r = new Random();

	HashMap<String, String> hm = new HashMap<String, String>();

	ArrayList<HashMap<String, String>> al = new ArrayList<HashMap<String, String>>();

	boolean checkDuplNum(ArrayList<HashMap<String, String>> al, int num) {
		for (int i = 0; i < al.size(); i++) {
			HashMap<String, String> hme1 = al.get(i);
			int num1 = Integer.parseInt((String) hme1.get("age"));
			for (int j = i - 1; j > 0; j--) {
				HashMap<String, String> hme2 = al.get(j);
				int num2 = Integer.parseInt((String) hme2.get("age"));
				if (num1 == num2) {
					return true;
				}
			}
		}
		return false;
	}

	void inputData() {
		for (int i = 0; i < 10; i++) {
			hm = new HashMap<String, String>();
			tmp = i;
			int rNum = r.nextInt(100) + 1;

			if (checkDuplNum(al, rNum)) {
				i--;
			} else {
				i = rNum;
				hm.put("age", i + "");
				hm.put("name", i + "홍길동");
				al.add(hm);
				i = tmp;
			}
		}
	}

	void checkDuplOrder() {

		for (int i = 0; i < al.size(); i++) {
			HashMap<String, String> hme1 = new HashMap<String, String>();
			int num1 = Integer.parseInt(al.get(i).get("age"));
			for (int j = i + 1; j < al.size(); j++) {
				HashMap<String, String> hme2 = new HashMap<String, String>();
				int num2 = Integer.parseInt(al.get(j).get("age"));
				if (num1 < num2) {
					HashMap<String, String> tmphm = new HashMap<String, String>();
					hme1 = al.get(i);
					hme2 = al.get(j);
					tmphm = hme1;
					hme1 = hme2;
					hme2 = tmphm;
					al.set(i, hme1);
					al.set(j, hme2);
				}
			}
		}

	}

	void print() {
		for (HashMap<String, String> h : al) {
			System.out.println(h);
		}
	}

	public static void main(String[] args) {

		MapExam me = new MapExam();

		me.inputData();
		me.checkDuplOrder();
		me.print();

	}

}

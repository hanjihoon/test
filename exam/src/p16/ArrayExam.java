package p16;

import java.util.ArrayList;

public class ArrayExam {

	public static ArrayList list;

	ArrayExam() {
		list = new ArrayList();

	}

	public ArrayList getArrayList() {
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		return list;
	}
}

package p14;

import java.util.ArrayList;

public class MapExam {

	private ArrayList<String> alKey;
	private ArrayList<String> alValue;

	public MapExam() {
		alKey = new ArrayList<String>();
		alValue = new ArrayList<String>();
	}

	public void put(String key, String value) {

		alKey.add(key);
		alValue.add(value);

		for (String str : alKey) {

			if (str == key) {
				int idx = alKey.indexOf(key);
				alValue.set(idx, value);
			}

		}
	}

	public String get(String key) {
		int idx = alKey.indexOf(key);
		if (idx == -1) {
			return null;
		} else
			return alValue.get(idx);
	}

	public String toString() {
		String str = new String();
		String str1 = new String();
		String str2 = new String();
		for (int i = 0; i < alKey.size(); i++) {
			str1 = alKey.get(i);
			str2 = alValue.get(i);
			if (i == alKey.size() - 1) {
				str += str1 + "=" + str2;
			} else {
				str += str1 + "=" + str2 + ",";
			}
		}
		return "{" + str + "}";
	}

}

package p20;

import java.util.LinkedHashMap;

public class Excute {

	public static void main(String[] args) {
		Service s = new Service();
		LinkedHashMap<String, Object> hm = new LinkedHashMap<String, Object>();
		hm.put("cidesc11", "pt반" );
		hm.put("cino11", 5 );
		int result = s.updateClassInfo(hm);
		if (result == 1) {
			System.out.println("업데이트 잘됐음!");
		}
	}
}

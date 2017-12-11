package p14;

import java.util.ArrayList;
import java.util.Random;

public class Excute {

	public static void main(String[] args) {
		MapExam me = new MapExam();
		ArrayList<MapExam> al = new ArrayList<MapExam>();
		Random r = new Random();
		for(int i=0;i<10;i++) {
			me = new MapExam();
			me.put("name", "Trump"+i);
			me.put("age",r.nextInt(100)+1+"");
			al.add(me);
			//랜덤값 최소값 = 1, 최대 = 100;
			//ArrayList<MapExam> 하나씩 추가 되시면 됩니다.
		}

		for(MapExam m : al) {
			System.out.println(m);
		}
		
	}
}

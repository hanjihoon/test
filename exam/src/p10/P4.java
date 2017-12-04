package p10;

public class P4 extends P3 {
	public String toString() {
		return "피포";
	}

	public static void main(String[] args) {
		Object a = new Person();
		Object b = new P2();
		Object c = new P3();
		Object d = new P4();

		Object[] o = new Object[4];
		o[0] = a.toString();
		o[1] = b.toString();
		o[2] = c.toString();
		o[3] = d.toString();

		for (int i = 0; i < 4; i++) {
			System.out.println(o[i]);
		}
	}
}

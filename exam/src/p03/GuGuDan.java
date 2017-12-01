package p03;

public class GuGuDan {
	public void printLoop(ObjectExam oe) {
		for(int i=1; i<oe.num1; i++) {
			for(int j=1; j<oe.num2; j++) 
				System.out.print("[" +i + "," + j + "]");
			}
			System.out.println();
		}
	public int gg(ObjectExam p) {
		return p.num1 + p.num2 + p.num3;
	}
		public static void main(String[] args) {
			ObjectExam oe = new ObjectExam();
			oe.inputNums();
			GuGuDan ggd = new GuGuDan();
			ggd.printLoop(oe);
			
			ObjectExam p = new ObjectExam();
			p.inputNums();
			GuGuDan pp = new GuGuDan();
			System.out.print(pp.gg(p));
			
		}
}


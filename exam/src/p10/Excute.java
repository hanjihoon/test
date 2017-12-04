package p10;

public class Excute extends Father {
	
	Excute(int num1, int num2){
		super(num1,num2);
		
	}
	
		public void print() {
			for(int i=minNum; i <=maxNum; i++) {
				String a = i +"";
				if(a.indexOf("3")>-1 || a.indexOf("6")>-1 || a.indexOf("9")>-1) {
					System.out.print("짝,");
				}else {
					System.out.print(a+",");
				}
				if(i%10==0) {
					System.out.println();
				}
			}
		}
		
		public void print(Father f) {
			System.out.println(f.toString());
		}
	
	

	public static void main(String[] args) {
		Father f = new Father(1,2);
		System.out.println(f);
		Excute e = new Excute(1,2);
		e.print(f);
	}
}

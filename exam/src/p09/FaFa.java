package p09;

public class FaFa {
	
	public int a = 3;
	
	public FaFa() {
		System.out.println("아빠 생성자 호출");
	}
	
	FaFa(String str) {
		System.out.println("아빠 생성자 호출");
	}
	
	public FaFa(String str1, String str2) {
		System.out.println("아빠 생성자 호출 : "+str2);
	}
	
	public void print() {
		System.out.println("내가 니 애비다!");
	}
	
	public static void main(String[] args) {
		
	}

}

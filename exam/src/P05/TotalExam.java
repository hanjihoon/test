package P05;

import java.util.Scanner;

public class TotalExam {
	int a = 0;
	Integer ac;
	boolean b;
	Boolean bc;
	
	int parseInt(String str) {
		return 1;
	}
	
	public static void main(String[] args) {
//		TotalExam te = new TotalExam();
//		if(te.a==1 || te.a==2 || te.a==3) {
//			System.out.println("a가 0이 아니네요");
//		}else if(te.a==0) {
//			System.out.println("a가 0이 이네요");
//		}
//		System.out.println(Integer.parseInt("167")==167);
		
		System.out.println("스트링 배열 변수의 방 개수를 입력해주세요");
		Scanner s = new Scanner(System.in);
		int length = s.nextInt();
		String[] strArr = new String[length];
		for(int i=0;i<=length-1;i++) {
			strArr[i]=i+1+"";
			System.out.println(strArr[i]);
		}
		int sum = 0;
		for(int i=0;i<strArr.length;i++) {
			sum += Integer.parseInt(strArr[i]);
		}
		System.out.println(sum);
	}
		
}

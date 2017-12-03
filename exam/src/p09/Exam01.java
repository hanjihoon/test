package p09;

import java.util.Random;
import java.util.Scanner;

public class Exam01 {
	
	Random r = new Random();
	int[] pNums;
	int[] wPNums;
	int maxPNum;
	int maxWPNum;
	
	boolean isDupl(int[] a, int b) {
		for(int i = 0; i < a.length; i++) {
			if(a[i]==b) {
				return true;
			}
		}
		return false;
	}
	
	void inputNums() {
		Scanner s = new Scanner(System.in);
		maxPNum = s.nextInt();
		maxWPNum = s.nextInt();
		pNums = new int [maxPNum];
		wPNums = new int [maxWPNum];
	}
	
	void arrPNums() {
		for(int i=0;i<maxPNum;i++) {
			int rNum = r.nextInt(maxPNum+1);
			if(isDupl(pNums, rNum)) {
				i--;
			}else {
				pNums[i] = rNum;
			}
		}
	}
	
	void printPNums() {
		System.out.println("참여 인원 : "+maxPNum);
		System.out.println("당첨 인원 : "+maxWPNum);
	}
	
	
	void printWPNums() {
		System.out.print("당첨 번호 : ");
		int rNum;
		for(int i=0;i<maxWPNum;i++) {
			rNum = r.nextInt(maxPNum+1);
			wPNums[i] = rNum;
			System.out.print(wPNums[i]+",");
		}
		
	}
	
	public static void main(String[] args) {
		
		Exam01 e1 = new Exam01();
		e1.inputNums();
		e1.arrPNums();
		e1.printPNums();
		e1.printWPNums();
		
		
	}
}

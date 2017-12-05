package p11;

import java.util.ArrayList;
import java.util.Random;

public class NewSol {

	Random r = new Random();

	ArrayList<String> pNames = new ArrayList<String>();
	
	 int pNum;
	 int wNum;
	 String[] joinP;
	 String[] wNames;
	 

	NewSol(int a, int b) {
		pNames.add("정기");
		pNames.add("현섭");
		pNames.add("용만");
		pNames.add("시현");
		pNames.add("영회");
		pNames.add("옥상");
		pNames.add("상익");
		pNames.add("주석");
		pNames.add("봉원");
		pNames.add("강우");
		pNames.add("봉이");
		pNames.add("신호");
		pNames.add("심산");
		pNames.add("운형");

		pNum = a;
		wNum = b;
		joinP = new String[pNum];
		wNames = new String[wNum];
	}

	public boolean isDupl(String[] a, String b) {
		for (int i = 0; i < joinP.length; i++) {
			if (joinP[i]==b) {
				return true;
			}
		}
		return false;
	}

	void inputJoinName() {
		for (int i = 0; i < joinP.length; i++) {
			int rNum = r.nextInt(14);
			if (isDupl(joinP, pNames.get(rNum))) {
				i--;
			} else {
				joinP[i] = pNames.get(rNum);
			}
		}
	}

	void drawS() {
		for (int i = 0; i < wNames.length; i++) {
			int rNum = r.nextInt(14);
			if (isDupl(joinP, pNames.get(rNum))) {
				wNames[i] = pNames.get(rNum);
				
			}else {
				i--;
			}
			
		}
	}
	

	void print(String[] a) {
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i]+",");
		}
	}
	public static void main(String[] args) {
		NewSol ns = new NewSol(8, 4);
		ns.inputJoinName();
		ns.drawS();
		
		ns.print(ns.joinP);
		System.out.println();
		ns.print(ns.wNames);
	}
}

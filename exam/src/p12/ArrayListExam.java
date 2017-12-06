package p12;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListExam {
	
	int minNum;
	int maxNum;
	ArrayList<Integer> al = new ArrayList<Integer>();
	Random r = new Random();
	
	
	
	ArrayListExam(int a, int b){
		minNum = a;
		maxNum = b;
	}
	
	
	void inputNums() {
		for(int i=minNum; i<maxNum; i++) {
			al.add(i);
			
		}
	}
	
	
	
	
	public static void main(String[] args) {
		
	}

}

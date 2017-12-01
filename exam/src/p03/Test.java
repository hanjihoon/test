package p03;

import java.util.Scanner;

public class Test {
	String str;
	
	Test(String str){
		this.str = str;
	}
	void print(ObjectExam oe) {
		System.out.println(oe.num1 + ",");
		System.out.println(oe.num2);
	}
	
	
	public static void main(String[] args) {
		ObjectExam oe = new ObjectExam();
		oe.inputNums();
		
		GuGuDan ggd = new GuGuDan();
		ggd.printLoop(oe);
	}
}
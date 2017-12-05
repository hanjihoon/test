package p11;

import java.util.ArrayList;

public class ListExam2 {
	ArrayList<String> alStr;
	ListExam2(){
		alStr = new ArrayList<String>();
	}
	
	public static void main(String[] args) {
		ListExam2 le  = new ListExam2();
		System.out.println(le.alStr.size());
	}

}

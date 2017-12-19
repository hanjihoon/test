package p16;

import java.util.Scanner;
import java.util.ArrayList;

public class Exam {

	ArrayList<Integer> al;

	Exam() {
		al = new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			int a = Integer.parseInt(s.nextLine());
			al.add(a);
		}
	}

	void arrayDown() {
		int s = al.size();
		int min = 0;
		int idx = 0;
		for (int i = 0; i < s; i++) {
			if (i == 0) {
				min = al.get(i);
				idx = i;
			} else if (min > al.get(i)) {
				min = al.get(i);
				idx = i;
			}
			if (i == s - 1) {
				al.remove(idx);
				al.add(min);
				i = -1;
				s-- ;
				min = 0;
			}
		}
	}
	
	int sum () {
		int sum = 0;
		for(Integer i:al) {
			sum += i;
		}
		return sum;
	}
	
	int average() {
		return sum()/al.size();
		
	}

	void print() {
		System.out.println(al);
	}
	public static void main(String[] args) {
		Exam e =new Exam();
		e.print();
		e.arrayDown();
		e.print();
		System.out.println(e.sum());
		System.out.println(e.average());
	}
}

package p18;

import java.util.Scanner;

public class Tornado {
	int[][] tornado;
	int a;
	int b;

	Tornado() {
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		tornado = new int[a][b];
	}

	void inputNums() {
		int num = 1;
		for (int i = 0;i<a; i++) {
			
			if(i==0) {
				for(int j = 0; j<b;i++) {
				tornado[i][j] = num;
				}
			}
		}
	}

}

package p11;

import java.util.ArrayList;
import java.util.Random;

public class ListExam {
	int[] nums = new int[0];
	
	public boolean add(int num) {
		int len = nums.length;
		int[] copy_num = new int[len+1];
		for(int i = 0;i<nums.length;i++) {
			copy_num[i] = nums[i];
		}
		return true;
	}
	public int indexOf(int num) {
		for(int i = 0;i<nums.length;i++) {
			if(nums[i] == num){
				return i;
			}
		}
		return -1;
	}
	public int size() {
		return nums.length;
	}

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			Random r = new Random();
			int rNum = r.nextInt(10) + 1;
			if(al.indexOf(rNum)==-1) {
			al.add(rNum);
			}else {
				i--;
			}
		}
		for (Integer i : al) {
			System.out.println(i);
		}
	}
}

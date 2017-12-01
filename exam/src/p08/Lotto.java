package p08;

import java.util.Random;
import java.util.Scanner;

public class Lotto {

	private int[] lottoNums;
	private int lottoMaxNum;
	private int s;
	private int[] checkLottoNums = new int[6];
	private int cnt = 0;
	Random r = new Random();

	public Lotto() {
		this(6, 45);
	}

	public Lotto(int lottoNumsLength) {
		this(lottoNumsLength, 45);
	}

	public Lotto(int lottoNumsLength, int lottoMaxNum) {
		lottoNums = new int[lottoNumsLength];
		this.lottoMaxNum = lottoMaxNum;
	}

	void setCheckLottoNums(int[] checkLottoNums) {
		this.checkLottoNums = checkLottoNums;
	}

	void inputCheckLottoNums() {
		 Scanner s = new Scanner(System.in);
	 for(int i=0;i<checkLottoNums.length;i++) {
		 System.out.println(i+1+"번째 뽑을 숫자를 입력해주세요");
	 checkLottoNums[i] = s.nextInt();
	 }
	 }

	void matchLottoNums() {
		for (int i = 0; i < lottoNums.length; i++) {
			for (int j = 0; j < checkLottoNums.length; j++) {
				if (lottoNums[i] == checkLottoNums[j]) {
					cnt++;
				}
			}
		}

	}

	private boolean checkNums() {
		for (int i = 0; i < lottoNums.length; i++) {
			if (lottoNums[i] == s) {
				return true;
			}
		}
		return false;
	}

	void inputNums() {
		for (int i = 0; i < lottoNums.length; i++) {
			s = r.nextInt(lottoMaxNum + 1);
			if (checkNums()) {
				i--;
				continue;
			}
			lottoNums[i] = s;

		}
	}

	void printNums(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ",");
		}

		System.out.println();
	}

	public static void main(String[] args) {
		Lotto lt = new Lotto();
		lt.inputNums();
		lt.printNums(lt.lottoNums);
		lt.inputCheckLottoNums();
		lt.matchLottoNums();
		lt.printNums(lt.checkLottoNums);

		System.out.println(" 맞은 개수 : " + lt.cnt);
	}
}

package p11;

import java.util.Random;
import java.util.Scanner;

public class Lotto {

	int lottoCnt = 0;
	int joinCnt = 0;

	Lotto() {
		Scanner s = new Scanner(System.in);
		System.out.println("참여인원을 입력해주세요=>");
		joinCnt = s.nextInt();
		System.out.println("당첨인원을 입력해주세요=>");
		lottoCnt = s.nextInt();
		s.close();
	}

	int[] getLottos() {
		return new int[lottoCnt];
	}

	int[] getJoins() {
		return new int[joinCnt];
	}

	void setLottos(int[] lottos) {
		Random r = new Random();
		for (int i = 0; i < lottos.length; i++) {
			int n = r.nextInt(joinCnt) + 1;
			lottos[i] = n;
			for (int j = i - 1; j >= 0; j--) {
				if (lottos[i] == lottos[j]) {
					i--;
				}
			}
		}
	}

	void printLottos(int[] lottos) {
		for (int i = 0; i < lottos.length; i++) {
			System.out.println(lottos[i]);
		}
	}

	public static void main(String[] args) {
		Lotto l = new Lotto();
		int[] lottos = l.getLottos();
		int[] joins = l.getJoins();
		l.setLottos(joins);
		l.printLottos(joins);

	}
}

package p09;

public class ForRandomExam {
	// 랜덤 숫자
	// 중복불가
	// 내림차순

	int[][] arr = new int[4][3];

	boolean checkdupl(int[][] nums, int num) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				if (nums[i][j] == num) {
					return true;
				}
			}
		}
		return false;
	}

	void inputNums() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				int r = (int) (Math.random() * 20);
				if (checkdupl(arr, r)) {
					j--;
				} else {
					arr[i][j] = r;
				}
			}
		}
	}

	void arraydown() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr.length; k++) {
					for (int g = 0; g < arr[i].length; g++) {
						if (arr[i][j] > arr[k][g]) {
							int tmp = 0;
							tmp = arr[i][j];
							arr[i][j] = arr[k][g];
							arr[k][g] = tmp;
						}
					}
				}
			}
		}
		System.out.println("내림 차순 정렬!");
	}

	void printNums() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + ", ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		ForRandomExam frde = new ForRandomExam();
		frde.inputNums();
		frde.printNums();
		frde.arraydown();
		frde.printNums();

	}

}

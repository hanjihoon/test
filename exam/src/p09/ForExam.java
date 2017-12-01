package p09;

public class ForExam {

	public static void main(String[] args) {
		int[][] nums = new int[3][];

		int[] a = new int[3];
		int[] b = new int[4];
		nums[0] = a;
		nums[1] = b;
		nums[2] = new int[5];

		for (int i = 0; i < 3; i++) {
			nums[0][i] = (i + 1);
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(nums[0][i] + ",");
		}
		System.out.println();

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				if (i > 0) {
					nums[i][j] = nums[i - 1][nums[i-1].length - 1] + (j + 1);
				}else {
				nums[i][j] = j + 1;
				}
			}
		}
		

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}
		
		int num = (int)(Math.random() * 8);
		System.out.println(num);
	}
}


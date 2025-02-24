package Insert_Sort;

public class shell {
	public static void main(String[] args) {
		int[] a = { 12, 56, 48, 4, 2, 50, 36, 3, 0, 28, 22, 16 };

		shell_sorted s = new shell_sorted();

		a = s.SS(a);

		for (int i : a) {
			System.out.print(i + " ");
		}
	}
}

class shell_sorted {
	public int[] SS(int[] a) {
		// 确定h的初始值
		int h = 1;
		while (h < a.length / 2) {
			h = 2 * h + 1;
		}

		while (h >= 1) {
			// 分组排序
			int temp = 0;
			for (int i = h; i < a.length; i++) {
				for (int j = i; j > 0; j = j - h) {
					if (a[j] < a[j - 1]) {
						temp = a[j];
						a[j] = a[j - 1];
						a[j - 1] = temp;
					} else
						break;
				}
			}

			// 减少h
			h = h / 2;
		}

		return a;
	}
}
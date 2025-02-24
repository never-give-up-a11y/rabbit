package third;

import java.util.Scanner;

//假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
//
//每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？

public class third {
	public static void main(String[] args) {
		Solution S=new Solution();
		Scanner scan=new Scanner(System.in);
		System.out.println(S.climbStairs(scan.nextInt()));
		
		scan.close();
	}
}

class Solution {
	public long climbStairs(int n) {
		int x = n / 2;
		long count = 0;

		while (x >= 0) {
			count += C(n - x, x);
			x--;
		}

		return count;
	}

	public long C(int m, int x) {
		long re = 1;

		if (x == 0)
			return 1;
		for (int i = 0; i < x; i++) {
			re = re * (m - i) / (i + 1);
		}

		return re;
	}
}

//int型会溢出，所以改成long，但提交答案必须是int型，为难
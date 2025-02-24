package first;

import java.util.Scanner;

//将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行 Z 字形排列。s 由英文字母（小写和大写）、',' 和 '.' 组成
//
//比如输入字符串为 "PAYPALISHIRING" 行数为 3 时，排列如下：
//
//P   A   H   N
//A P L S I I G
//Y   I   R

public class first {
	public static void main(String[] args) {
		Solution S = new Solution();
		System.out.println("输入字符串");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		System.out.println("输入行数");
		int n = scan.nextInt();
		System.out.println(S.convert(s, n));
		scan.close();
	}

}

class Solution {
	public String convert(String s, int numRows) {
		if (s.length() <= numRows||numRows==1)
			return s;
		// 如果只有一列就直接输出

		else {
			String s1 = "";
			// 结果答案

			int[] loc = new int[numRows];
			for (int i = 0; i < numRows; i++) {
				loc[i] = i;
			}
			// 赋予初始位置

			

			for (int j = 1; j < numRows - 1; j++) {
				// 添加第0个字符
				int m = 0;
				do{
					m++;
					if (m % 2 != 0) {
						s1 = s1 + s.charAt(loc[j]);
						loc[j] = loc[j] + 2 * (numRows - j-1);
						// 添加偶数个字符
					} else {
						s1 = s1 + s.charAt(loc[j]);
						loc[j] = loc[j] + 2 * j;
						// 添加奇数数个字符
					}
				}while (loc[j] < s.length()) ;
			}
			String s2 = "";
			String s3 = "";

			do {
				s2 = s2 + s.charAt(loc[0]);
				loc[0] = loc[0] + 2 * (numRows - 1);
			} while (loc[0] < s.length());
			// 因该先保证了绝对不越界才能进行下一次的运算

			do {
				s3 = s3 + s.charAt(loc[numRows - 1]);
				loc[numRows - 1] = loc[numRows - 1] + 2 * (numRows - 1);
			} while (loc[numRows - 1] < s.length());

			return s2 + s1 + s3;
		}

	}
}


//作为判断条件的变量一定要先使用，再变化。
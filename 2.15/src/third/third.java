package third;

import java.util.Scanner;

//给你一个字符串 s，找到 s 中最长的回文子串。

public class third {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();

		Solution solu = new Solution();

		scan.close();

		System.out.println(solu.longestPalindrome(s));
	}
}
class Solution {
	public String longestPalindrome(String s) {
		String s2="",s3="";
		if (s.length() == 1) {
			return s;
		}

		String s1 = new StringBuffer(s).reverse().toString();

		if (s.equals(s1)) {
			return s;
		} else {
			s2=longestPalindrome(s.substring(1, s.length()));
			s3=longestPalindrome(s.substring(0, s.length() - 1));
		}
		return s2.length()>s3.length()?s2:s3;
	}
}

//超时
//还是少用递归吧
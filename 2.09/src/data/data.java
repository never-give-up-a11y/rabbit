package data;

import java.util.Scanner;

//输入日期，计算还有多少天过生日
//ctrl+？是注释
public class data {
	public static void main(String[] args) {
		int s1;
		Scanner s=new Scanner(System.in);
		System.out.println("请输入你的生日（格式XX.XX）");
		s1=s.nextInt();
		
		System.out.println(s1);
	}
}

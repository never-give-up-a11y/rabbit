package first;

import java.util.Scanner;

//要求用户输入16个数，如果用户输入的数大于32，则要求重新输入

public class first {
	public static void main(String[] args) {
		int a[] = new int[16];
		Scanner s = new Scanner(System.in);

		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
			while(a[i]>32) {
				System.out.println("请重新输入");
				a[i]=s.nextInt();
			}
		}
		s.close();
		
		for(int i:a) {
			System.out.print(i+" ");
		}
	}
}

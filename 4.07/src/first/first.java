package first;

//0-9 2021�ſ�Ƭ

public class first {
	public static void main(String[] args) {
		int[] card = new int[10];
		for (int i = 0; i < 10; i++) {
			card[i] = 2021;
		}
		
		int s = 1;
		while (true) {
			int i = s;
			while (i > 0) {
				int temp = 0;
				temp = i % 10;
				i = i / 10;
				card[temp]--;
				if (card[temp] == 0) {
					System.out.println(s);
					return ;
				}
			}
			s++;
		}
	}

}

package table;

public class text {
	public static void main(String[] args) {
		chartable<Integer, Integer> ch=new chartable<Integer, Integer>();
		
		ch.insert(1, 2);
		ch.insert(3, 7);
		ch.insert(-9,8);
		
		System.out.println(ch.get(3));
		
		ch.insert(3, 5);
		System.out.println(ch.get(3));
	}
}

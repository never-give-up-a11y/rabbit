package Tree;

public class test {
	public static void main(String[] args) {
		tree t=new tree();
		t.put(3, 5);
		t.put(2, 7);
		t.put(1, 5);
		t.put(8, 6);
		t.put(15, 11);
		t.put(9, 20);
		t.put(23, 6);
		t.put(0, 6);
		t.delete(3);
		t.pre(t.root);
		
		System.out.println(t.N);
		
	}
}

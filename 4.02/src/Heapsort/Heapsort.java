package Heapsort;

public class Heapsort<T extends Comparable<T>> {
	Comparable<T> data[] = null;
	int N = 0;

	public Heapsort(T[] a) {
		this.data = new Comparable[a.length + 1];
		for (int i = 1; i < this.data.length; i++) {
			this.data[i] = a[i - 1];
		}
		N = a.length;
	}

	public void BeHeap() {
		int i = N;
		while (i / 2 >= 1) {
			if (less(data[i / 2], data[i]))
				exchange(i / 2, i);
			i--;
		}
	}

	public boolean less(Comparable<T> w, Comparable<T> v) {
		return w.compareTo((T) v) < 0;
	}

	public void exchange(int i, int j) {
		Comparable<T> temp;
		temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}

	public void print() {
		for (int i = 1; i <= N; i++) {
			System.out.print(data[i] + " ");
		}
	}
}
//快速成堆 实现思想不对

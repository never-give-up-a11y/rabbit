package first;

import java.util.Scanner;

//�鲢��ϰ

public class first {
	public static void main(String[] args) {
		int n=0;
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		mergesort m =new mergesort(n);
		
		for(int i=0;i<n;i++) {
			m.a[i]=scan.nextInt();
		}
		m.Merge();
		m.sysop();
	}
}

class mergesort {
	Comparable a[] = null;
	Comparable temp[] = null;
	int N = 0;

	public mergesort(int N) {
		this.a = new Comparable[N];
		this.temp = new Comparable[N];
		this.N = N;
	}

	public boolean less(Comparable w, Comparable v) {
		return w.compareTo(v) < 0;
	}

	public void exchange(Comparable a[], int i, int j) {
		Comparable temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public void Merge() {
		int left = 0;
		int right = a.length - 1;

		Merge(left, right);
	}

	public void Merge(int left, int right) {
		if (left >= right)
			return;

		int mid = (left + right) / 2;

		Merge(left, mid);
		Merge(mid + 1, right);

		int i = left;
		int j = mid + 1;
		int index = left;
		while (i <= mid || j <= right) {
			if (less(a[i], a[j])) {
				temp[index] = a[i];
				index++;
				i++;
			} else {
				temp[index] = a[j];
				index++;
				j++;
			}

			if (i > mid && j <= right) {
				while (j <= right) {
					temp[index] = a[j];
					index++;
					j++;
				}
			}
			if (j > right && i <= mid) {
				while (i <= mid) {
					temp[index] = a[i];
					index++;
					i++;
				}
			}
		}

		for (int ind = left; ind <= right; ind++) {
			a[ind] = temp[ind];
		}
	}

	public void sysop() {
		for (Comparable t : a) {
			System.out.print(t + " ");
		}
	}
}
package SequenceList;

import java.util.Iterator;

public class List<T> implements Iterable<T> {
	private T[] a;

	private int N;

	List(int capital) {
		this.a = (T[]) new Object[capital];
		this.N = 0;
	}

	public void clear() {
		this.N = 0;
	}

	public boolean isEmpty() {
		if (this.N == 0)
			return true;
		else
			return false;
	}

	public int length() {
		return this.N;
	}

	public T get(int index) {
		try {
			if (index >= N)
				return null;
			else
				return this.a[index];
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	public void reSize(int newSize) {
		T[] temp = (T[]) new Object[newSize];

		for (int i = 0; i < this.N; i++)
			temp[i] = this.a[i];

		this.a = temp;
	}

	public void insert(int index, T append) {
		if (this.N == a.length)
			reSize(N * 2);

		for (int i = N; i > index; i--)
			this.a[i] = this.a[i - 1];

		this.a[index] = append;
	}

	public void remove(int index) {
		if (this.N <= (a.length / 4))
			reSize(a.length / 4);

		for (int i = index; i < this.N - 1; i++) {
			this.a[i] = this.a[i + 1];
		}
	}

	public int indexOf(T com) {
		for (int i = 0; i < N; i++) {
			if (this.a[i].equals(com))
				return i;
		}

		return -1;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new SItera();
	}

	private class SItera implements Iterator {
		int cus = 0;

		public SItera() {
			// TODO Auto-generated constructor stub
			this.cus = 0;
		}

		@Override
		public boolean hasNext() {
			return cus < N;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			return a[cus++];
		}
	}
}

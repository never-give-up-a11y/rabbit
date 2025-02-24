package Mergesort;

public class mergesort<T extends Comparable<T>> {
	public T[] date;
	public T[] temp;
	public mergesort(T[] date) {
		this.date = date;
		this.temp=this.date.clone();
	}

	public void mergesort(T[] date) {
		int left = 0;
		int right = date.length - 1;
		int mid = (left + right) / 2;
		
		mergesort(date, left, mid);
		mergesort(date, mid + 1, right);
		merge(date, left, right, mid);
	}

	public void mergesort(T[] date, int left, int right) {
		if (left >= right)
			return;

		int mid = (left + right) / 2;
		mergesort(date, left, mid);
		mergesort(date, mid + 1, right);
		merge(date, left, right, mid);
	}

	public void merge(T[] date,int left,int right,int mid) {
		int fst=left;
		int sec=mid+1;
		int t=left;
		while(fst<=mid||sec<=right) {
			if(date[fst].compareTo(date[sec])<0) 
				temp[t++]=date[fst++];
			else 
				temp[t++]=date[sec++];
			
			if(fst>mid) {
				while(sec<=right) 
					temp[t++]=date[sec++];
			}
			if(sec>right) {
				while(fst<=mid) 
					temp[t++]=date[fst++];
			}
		}
		for(int i=left;i<=right;i++) 
			date[i]=temp[i];
	}
	
	public static void main(String[] args) {
		Integer[] a = { 2, 5, -5, 66, 7, 11, 1, 1, 1, 6, 2 };
		mergesort<Integer> m=new mergesort<Integer>(a);
		m.mergesort(a);	
		for(int i:m.date) {
			System.out.print(i+" ");
		}
	}
}
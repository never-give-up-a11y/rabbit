package forth;

//·��

public class Main {
	public static void main(String[] args) {
		int[] r = new int[2022];
		for (int i = 2; i < 2022; i++) {
			r[i] = findMinRoute(i, r);
		}
		System.out.println(r[2021]);
	}

	static int findMinRoute(int pos, int[] r) {
		int minRoute = Integer.MAX_VALUE;
		for (int i = pos - 1; pos - i <= 21 && i > 0; i--) {
			int len = lcm(pos, i);
			minRoute = Math.min(minRoute, len + r[i]);
		}
		return minRoute;
	}

	static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}

	static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}
}

package first;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class anti_polan {
	public int anti(String[] data) {
		Stack<Integer> stc = new Stack<>();
		Set<String> st = new HashSet<>();
		int sum = 0;
		st.add("+");
		st.add("-");
		st.add("*");
		st.add("/");

		for (String i : data) {
			if (!st.contains(i)) {
				stc.push(Integer.parseInt(i));
			} else {
				int temp = 0;
				int m = stc.pop();
				int n = stc.pop();
				if (i == "*") {
					temp = m * n;
					stc.push(temp);
					sum = sum + temp;
				} else if (i == "/") {
					temp = m / n;
					stc.push(temp);
					sum = sum + temp;
				} else if (i == "+") {
					temp = m + n;
					stc.push(temp);
					sum = sum + temp;
				} else {
					temp = m - n;
					stc.push(temp);
					sum = sum + temp;
				}
			}
		}
		return sum;
	}
}
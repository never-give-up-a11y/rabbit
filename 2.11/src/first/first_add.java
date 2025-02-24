package first;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class first_add {
	
}
class Solution1 {
    public boolean isValid(String s) {
        int n = s.length();
        if (n % 2 == 1) {
            return false;
        }

        Map<Character, Character> pairs = new HashMap<Character, Character>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};
        Deque<Character> stack = new LinkedList<Character>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (pairs.containsKey(ch)) {
                if (stack.isEmpty() || stack.peek() != pairs.get(ch)) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}

//作者：LeetCode-Solution
//链接：https://leetcode-cn.com/problems/valid-parentheses/solution/you-xiao-de-gua-hao-by-leetcode-solution/
//来源：力扣（LeetCode）
//著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。


//class Solution {
//    public boolean isValid(String s) {
//        Stack<Character> stack = new Stack<>();
//        char[] chars = s.toCharArray();
//        for (char aChar : chars) {
//            if (stack.size() == 0) {
//                stack.push(aChar);
//            } else if (isSym(stack.peek(), aChar)) {
//                stack.pop();
//            } else {
//                stack.push(aChar);
//            }
//        }
//        return stack.size() == 0;
//    }
//    
//    private boolean isSym(char c1, char c2) {
//        return (c1 == '(' && c2 == ')') || (c1 == '[' && c2 == ']') || (c1 == '{' && c2 == '}');
//    }
//}
//
//计算速度非常快 2ms


//class Solution {
//    public boolean isValid(String s) {
//        Deque<Character> deque = new LinkedList<>();
//        char ch;
//        for (int i = 0; i < s.length(); i++) {
//            ch = s.charAt(i);
//            //碰到左括号，就把相应的右括号入栈
//            if (ch == '(') {
//                deque.push(')');
//            }else if (ch == '{') {
//                deque.push('}');
//            }else if (ch == '[') {
//                deque.push(']');
//            } else if (deque.isEmpty() || deque.peek() != ch) {
//                return false;
//            }else {//如果是右括号判断是否和栈顶元素匹配
//                deque.pop();
//            }
//        }
//        //最后判断栈中元素是否匹配
//        return deque.isEmpty();
//    }
//}
//用时1ms
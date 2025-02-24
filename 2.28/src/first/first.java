package first;

import java.util.HashMap;
import java.util.Map;

//罗马数字转整数
//I             1
//V             5
//X             10
//L             50
//C             100
//D             500
//M             1000
//例如， 罗马数字 2 写做 II ，即为两个并列的 1 。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
//
//通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
//
//I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
//X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
//C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。

public class first {

}

class Solution {
	public int romanToInt(String s) {
		int n=0;

		

		return n;
	}
}


//class Solution {
//    public int romanToInt(String s) {
//        int sum = 0;
//        int preNum = getValue(s.charAt(0));
//        for(int i = 1;i < s.length(); i ++) {
//            int num = getValue(s.charAt(i));
//            if(preNum < num) {
//                sum -= preNum;
//            } else {
//                sum += preNum;
//            }
//            preNum = num;
//        }
//        sum += preNum;
//        return sum;
//    }
//    
//    private int getValue(char ch) {
//        switch(ch) {
//            case 'I': return 1;
//            case 'V': return 5;
//            case 'X': return 10;
//            case 'L': return 50;
//            case 'C': return 100;
//            case 'D': return 500;
//            case 'M': return 1000;
//            default: return 0;
//        }
//    }
//}


//当较小的数在右边则是加，在左边则是减，这才是这题的本质


//class Solution {
//    public int romanToInt(String s) {
//        s = s.replace("IV","a");
//        s = s.replace("IX","b");
//        s = s.replace("XL","c");
//        s = s.replace("XC","d");
//        s = s.replace("CD","e");
//        s = s.replace("CM","f");
//        
//        int res = 0;
//        for (int i = 0; i < s.length(); i++) {
//            res += getValue(s.charAt(i));
//        }
//        return res;
//    }
//
//    public int getValue(char c) {
//        switch(c) {
//            case 'I': return 1;
//            case 'V': return 5;
//            case 'X': return 10;
//            case 'L': return 50;
//            case 'C': return 100;
//            case 'D': return 500;
//            case 'M': return 1000;
//            case 'a': return 4;
//            case 'b': return 9;
//            case 'c': return 40;
//            case 'd': return 90;
//            case 'e': return 400;
//            case 'f': return 900;
//        }
//        return 0;
//    }
//}

//另一个大佬的思路，反正有减法的字母组合是唯一的，所以直接替换掉，省的和其他单个字母混乱

//Map<k,v> M=new HashMap<k,v>();
//M.put(k,v);	存数据
//M.get(k); 	取得k的值
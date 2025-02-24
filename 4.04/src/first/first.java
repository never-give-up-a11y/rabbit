package first;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

//给你一个字符串 s 和一个字符串列表 wordDict 作为字典。请你判断是否可以利用字典中出现的单词拼接出 s 。
//注意：不要求字典中出现的单词全部都使用，并且字典中的单词可以重复使用。


public class first {
	public static void main(String[] args) {
		Solution s=new Solution();
		List<String> l=new LinkedList<String>();
		l.add("cats");
		l.add("dog");
		l.add("sand");
		l.add("and");
		l.add("cat");
		System.out.println(s.wordBreak("catsandog",l));
	}
}

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
		//先按首字母匹配
    	//剩下的部分再首字母匹配
    		
    	while(s.length()>0) {
    		int k=0;
    		for(String a:wordDict) {
    			if(a.length()>s.length())
    				continue;
    			String temp=s.substring(0, a.length());
    			if(temp.equals(a)) {
    				s=s.substring(a.length());
    				k++;
    				break;
    			}
    		}
    		if(k==0)
    			return false;
    	}
    	return true;
    }
}

//必须要学会动态规划

//0ms解答
//class Solution {
//    public boolean wordBreak(String s, List<String> wordDict) {
//        if (s.length() == 0) return true;
//        if (s.length() >= 150) return false;
//        for (int i = 0; i < wordDict.size(); i++) {
//            if (s.startsWith(wordDict.get(i))) {
//                if (wordBreak(s.substring(wordDict.get(i).length()), wordDict)) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//}
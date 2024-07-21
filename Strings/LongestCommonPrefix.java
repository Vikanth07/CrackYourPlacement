package Strings;

import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1=strs[0];
        String s2=strs[strs.length-1];
        int precnt=0;
        for(int i=0; i<Math.min(s1.length(),s2.length()); i++){
            if(s1.charAt(i)==s2.charAt(i))precnt++;
            else break;
        }
        return s2.substring(0,precnt);
    }
}

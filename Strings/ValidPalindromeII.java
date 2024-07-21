package Strings;

public class ValidPalindromeII {
    public boolean validPalindrome(String s) {
        int lp=0;
        int rp=s.length()-1;
        while(lp<rp){
            if(s.charAt(lp)==s.charAt(rp)){
                lp++;
                rp--;
            }else{
                return isPalindrome(s,lp+1,rp) || isPalindrome(s,lp,rp-1);
            }
        }
        return true;
    }
    public boolean isPalindrome(String s, int i, int j){
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
}

package Strings;

public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        int[] hash = new int[256];
        int l=0;
        int r=0;
        int cnt=0;
        int startidx=-1;
        int minLength=Integer.MAX_VALUE;
        for(int i=0; i<t.length(); i++){
            hash[t.charAt(i)]++;
        }
        while(r<s.length()){
            hash[s.charAt(r)]--;
            if(hash[s.charAt(r)]>=0)cnt++;
            while(cnt==t.length()){
                if(r-l+1<minLength){
                    minLength=r-l+1;
                    startidx=l;
                }
                if(hash[s.charAt(l)]==0)cnt--;
                hash[s.charAt(l)]++;
                l++;
            }
            r++;
        }
        return startidx==-1?"":s.substring(startidx,startidx+minLength);
    }
}

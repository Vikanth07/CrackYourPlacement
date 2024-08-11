package Heaps;

public class ReorganizeString {
    public String reorganizeString(String s) {
        int[] freq = new int[26];
        int n = s.length();
        for(char ch : s.toCharArray()){
            freq[ch-'a']++;
        }
        int maxi = 0;
        int maxind = 0;
        for(int i=0; i<26; i++){
            if(freq[i]>maxi){
                maxi=freq[i];
                maxind = i;
            }
        }
        if(maxi>(n+1)/2)return "";
        char ans[] = new char[n];
        int idx = 0;
        while(freq[maxind]>0){
            ans[idx] = (char)(maxind+'a');
            idx+=2;
            freq[maxind]--;
        }
        for(int i=0; i<26; i++){
            while(freq[i]!=0){
                if(idx>=n)idx=1;
                ans[idx] = (char)(i+'a');
                idx+=2;
                freq[i]--;
            }
        }
        return String.valueOf(ans);
    }
}

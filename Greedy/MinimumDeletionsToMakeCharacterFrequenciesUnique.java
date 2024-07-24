package Greedy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MinimumDeletionsToMakeCharacterFrequenciesUnique {
    public int minDeletions(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        Set<Integer> freq = new HashSet<>();
        int res = 0;
        for(int val : map.values()){
            while(val>0 && freq.contains(val)){
                val--;
                res++;
            }
            freq.add(val);
        }
        return res;
    }
}

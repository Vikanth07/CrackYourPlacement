package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            char count[] = new char[128];
            for(char ch : str.toCharArray()){
                count[ch]++;
            }
            String key = new String(count);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(str);
        }
        return new ArrayList(map.values()); 
    }
}

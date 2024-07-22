package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PrintAnagramsTogether {
    public List<List<String>> Anagrams(String[] string_list) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str : string_list){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }
        return new ArrayList(map.values());
    }
}

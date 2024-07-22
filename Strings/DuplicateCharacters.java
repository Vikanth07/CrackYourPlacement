package Strings;

import java.util.*;

public class DuplicateCharacters {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s1 = sc.nextLine();
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : s1.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for(Map.Entry<Character, Integer> mapelement : map.entrySet()){
            if(mapelement.getValue()>1){
                System.out.println(mapelement.getKey()+", count="+mapelement.getValue());
            }
        }
    }
}

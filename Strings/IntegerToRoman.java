package Strings;

public class IntegerToRoman {
    public String intToRoman(int num) {
        int[] val = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] key = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String res="";
        for(int i=0; i<val.length; i++){
            if(num/val[i]>0){
                int count=num/val[i];
                for(int j=0; j<count; j++){
                    res+=key[i];
                }
            }
            num=num%val[i];
        }
        return res;
    }
}

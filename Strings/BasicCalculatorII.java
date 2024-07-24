package Strings;

public class BasicCalculatorII {
    public int calculate(String s) {
        int res=0;
        int currNum=0;
        int lstNum=0;
        char sign='+';
        for(int i=0; i<s.length(); i++){
            char currChar = s.charAt(i);
            if(Character.isDigit(currChar)){
                currNum = (currNum*10)+(currChar-'0');
            }
            if(!Character.isDigit(currChar) && !Character.isWhitespace(currChar) || i==s.length()-1){
                if(sign=='+'){
                    res+=lstNum;
                    lstNum = currNum;
                }else if(sign=='-'){
                    res+=lstNum;
                    lstNum=-currNum;
                }
                else if(sign=='*'){
                    lstNum=lstNum*currNum;
                }else if(sign=='/'){
                    lstNum=lstNum/currNum;
                }
                sign=currChar;
                currNum=0;
            }
        }
        res+=lstNum;
        return res;
    }
}

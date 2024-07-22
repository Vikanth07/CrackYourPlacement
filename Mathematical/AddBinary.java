package Mathematical;

public class AddBinary {
    public String addBinary(String a, String b) {
        int alen=a.length();
        int blen=b.length();
        int carry=0;
        int i=0;
        String ans="";
        while(i<alen || i<blen || carry!=0){
            int x=0;
            if(i<alen && a.charAt(alen-i-1)=='1'){
                x=1;
            }
            int y=0;
            if(i<blen && b.charAt(blen-i-1)=='1'){
                y=1;
            }
            ans=String.valueOf((x+y+carry)%2)+ans;
            carry=(x+y+carry)/2;
            i++;
        }
        return ans;
    }
}

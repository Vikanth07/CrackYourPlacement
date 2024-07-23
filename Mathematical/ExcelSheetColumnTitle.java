package Mathematical;

public class ExcelSheetColumnTitle {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while(columnNumber>0){
            columnNumber--;
            char ch = (char)('A'+columnNumber%26);
            sb.insert(0,ch);
            columnNumber/=26;
        }
        return sb.toString();
    }
}

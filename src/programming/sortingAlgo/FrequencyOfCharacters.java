package programming.sortingAlgo;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "1";
        int n=5;
        String newStr="";
        while(n>1){
            newStr = nextTerm(str);
            str = newStr;
            n--;
        }
        System.out.println(newStr);

    }

    private static String nextTerm(String str) {
        int i=0;
        String newstr="";
        while(i<str.length() ){
            int count = 1;
            for(int j=i;j<str.length();j++){
                char ch = str.charAt(j);
                if(j!=str.length()-1 && ch == str.charAt(j+1)){
                    count++;
                    continue;
                }else{
                    newstr+=count+""+ch;
                    i=j+1;
                    break;
                }
            }
        }
        return newstr;
    }
}

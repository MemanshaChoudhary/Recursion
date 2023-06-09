public class replaceAdjacent {
    static String replace(String s, int i){
        if(i==s.length()-1){
            return "";
        }
char ch= s.charAt(i);
char ch1=s.charAt(i+1);
if(ch==ch1){
s.replace(ch1, '#');
}
return replace(s, i+1);
return s;
    }
    public static void main(String[] args) {
        String ans= replace("abbaacc",0);
        System.out.println(ans);
    }
}

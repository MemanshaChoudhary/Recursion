// print all the subsequence of a string
public class subsequence {
    static void subSequence(String s, String result){
        if(s.length()==0){
            System.out.print(result + " ");
            return;
        }
        char firstChar= s.charAt(0);
        String smallS= s.substring(1);
        subSequence(smallS, result);
        subSequence(smallS, result+ firstChar);
    }
    public static void main(String[] args) {
        subSequence("abc", "");
    }
}

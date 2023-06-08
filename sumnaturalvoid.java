public class sumnaturalvoid{
    static void calc(int n, int sum){
if(n<=0){
    System.out.println(sum);
    return;
}
 calc(n-1, sum+n);
    }
public static void main(String[] args) {
    calc(5,0);
}
}
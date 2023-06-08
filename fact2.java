public class fact2 {
    public static void calcfact(int n, int result){
if(n==1){
    System.out.println(result);
    return;
}
calcfact(n-1,result *n);
    }
    public static void main(String[] args) {
        calcfact(4, 1);
    }
}

public class sumnaturalint {
    static int summ(int n , int sum){
if(n<=0){
    return sum;
}
sum = sum + summ(n-1,sum);
return n + sum;
    }
    public static void main(String[] args) {
        int ans=summ(2,0);
        System.out.println(ans);
    }
}

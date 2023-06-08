public class sumofdigitvoid {
    static void sod(int num,int sum){
        if(num==0){
            System.out.println(sum);
            return;
        }
        int singledigit=num%10;
        sum=sum+singledigit;
        sod(num/10,sum);
    }
    public static void main(String[] args) {
        sod(123,0);
    }
}

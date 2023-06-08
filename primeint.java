public class primeint {
    static int prime(int n,int i){
if(i>n/2){
    return 1;
}
if(n%i==0){
    return 0;
}
else{
    return prime(n, i+1);
}
    }
public static void main(String[] args) {
        int ans=prime(11,2);
        System.out.println(ans);
    }
}


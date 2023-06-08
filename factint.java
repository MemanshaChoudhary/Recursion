public class factint {
    static int calcfact(int n){
      
if(n==1){
    return 1;
}
else{
    return n * calcfact(n-1);
}
    }
    public static void main(String[] args) {
       int ans= calcfact(5);
       System.out.println(ans);
    }
}

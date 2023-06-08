public class sumofdigit {
    static int sod(int num){
if(num==0){
    return 0;
}
 int sum= sod( num/10);
      int singledigit=  num%10;
      sum=sum+singledigit;
      return sum;
    }
    public static void main(String[] args) {
       System.out.println(sod(123 )); 
    }
}

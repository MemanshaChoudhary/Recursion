import java.util.*;
public class armstrongint {
    static int armstrong(int n ){
   if(n==0){
    return 0;
   }
   int ans =armstrong(n/10);
   ans= ans + (int)Math.pow(n%10, 3);
   return ans;
    }
    public static void main(String[] args) {
        int ans= armstrong(153);
        
     if(ans==153){
        System.out.println("armstrong");
      }
      else{
        System.out.println(" not an armstrong");
      }
    } 
}


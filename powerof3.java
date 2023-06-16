public class powerof3 {
    public static boolean isPowerOfThree(int n) {
          if(n<=0) return false;
    
              if(n==1) return true;
                   
              
            int rem=n%3;
            if(rem!=0) return false;
        return isPowerOfThree(n/3);
    }
    public static void main(String[] args){
   
    if(isPowerOfThree(27)) {
    System.out.println("Its power of 3");
    }
    else{
     System.out.println("Its not a power of 3");
    }
    }
}

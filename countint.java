public class countint {
  
        public static int zeroCount(int number) {
       if (number == 0) {
         return 1;
       } else if (number <= 9) {
         return 0;
       } else {
         return ((number % 10 == 0) ? 1 : 0) + zeroCount(number / 10);
       }
     }
     public static void main(String[] args) {
      int ans=zeroCount(102102);
      System.out.println(ans);
     }
    }


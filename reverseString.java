public class reverseString {
    static String reverse(String s){
   if(s.length()==0){
return "";
   }
   if(s.length()==1){
    return s;
    
}
  char first=s.charAt(0);
  
  return  reverse(s.substring(1 )) + first;
  
   

    }
    public static void main(String[] args) {
       String result= reverse("abcd");
       System.out.println(result);
    }

}

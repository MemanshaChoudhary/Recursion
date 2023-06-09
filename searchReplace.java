// .Given an Array find the element and replace the value with given value, search and replace all occurrences.


public class searchReplace {
   
    static int[] search(int []a, int x, int i){
        if(i==a.length-1){
           
return a;
            
        }
     
        if(a[i]==x){
            a[i]=200; // replace x=20 with 200
        
        }
        search(a, x, i+1);
        return a;
    }
  
    public static void main(String[] args) {
        int []n ={10,20,30,20,10};
       int [] ans = search(n,20,0);
       for(int i=0;i<ans.length;i++)
       {
      System.out.println(ans[i]);
       }
    }
}

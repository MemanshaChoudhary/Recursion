//Find the Highest Element in an Array 
public class highestArray {
    static int max=0;
    static int highest(int [] a, int i){
if(i==a.length){
   return max; 
}

if(a[i]>max){
    max=a[i];
}
 return highest(a, i+1);
    }
    public static void main(String[] args) {
        int[] arr ={10,20,39,1,2};
        int ans= highest(arr,0);
        System.out.println(ans);
    }
}

public class Arraysearch {
    static int search(int []arr, int i, int x){
        if(arr.length==i){
           
            return -1;
        }
        if(arr[i]==x){
         return 1;
        }
   
           return search(arr, i+1, x);
        
    }
    public static void main(String[] args) {
      int [] arr={10,30,20,40,30};
        int ans=search(arr, 0, 20);
        if(ans==1){
            System.out.println("found");
        }
        else{
            System.out.println("not found");
        }
    }
}

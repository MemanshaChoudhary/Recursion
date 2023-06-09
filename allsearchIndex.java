public class allsearchIndex {
    static void search(int []n, int i, int x){
if(i==n.length-1){
    
    return;
}
int a[]= new int[n.length];

        if(n[i]==x){


}
else{
    search(n, i+1, x);
}



    }
    public static void main(String[] args) {
       int [] arr= {10,20,30,20,40,20};

       
        search(arr,0,20);
    }
}

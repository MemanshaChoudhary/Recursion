public class allsearchOccurence{
    static int c=0;
    static void search(int []n, int i, int x){
if(i==n.length){
    System.out.println(c);
    return;
}
        if(n[i]==x){
    c++;
}
search(n, i+1, x);

    }
    public static void main(String[] args) {
       int [] arr= {10,20,30,20,40,20};

       
        search(arr,0,20);
    }
}
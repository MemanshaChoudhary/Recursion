public class treeRecursion {
    static void tree(int n){
        if(n>=3){
            return;
        }
        System.out.println(n);
        tree(n+1);
        tree(n+2);
    }
    public static void main(String[] args) {
        tree(0);
    }
}

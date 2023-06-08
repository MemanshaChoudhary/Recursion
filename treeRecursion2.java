public class treeRecursion2 {
    static void tree(int n){
        if(n>0){
            System.out.println(n);
            tree(n-1);
            tree(n-2);
        }
    }
    public static void main(String[] args) {
        tree(3);
    }
}

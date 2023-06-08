public class primevoid {
    static void prime(int n, int i) {
        if (i > n / 2) {

            System.out.println("prime");
            return;
        }
        if (n % i == 0) {
            System.out.println(" not prime");
        } else {
            prime(n, i + 1);

        }
    }

    public static void main(String[] args) {
        prime(18, 2);
    }
}

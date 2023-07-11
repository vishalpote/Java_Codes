public class primenumber2 {
    public static void main(String[] args) {
        int i;
        int j;
        for (i = 1; i <= 100; i++) {
            for (j = 2; j <= i; j++) {
                if (i % j == 0) {
                    break;
                }
            }

            if (i == j) {
                System.out.println("prime numbers:" + i);
            }
        }
    }
}

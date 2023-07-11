public class divisibleby35andboth {
    public static void main(String[] args) {
        int i;
        System.out.println("Divisible By 3:");
        for (i = 0; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print("  " + i);

            }

        }
        System.out.println();
        System.out.println("Divisible by 5:");
        for (i = 0; i <= 100; i++) {
            if (i % 5 == 0) {

                System.out.print(" " + i);
            }

        }
        System.out.println();
        System.out.println("divisible by 3 and 5:");
        for (i = 0; i <= 100; i++) {
            if (i % 3 == 0 || i % 5 == 0) {

                System.out.print(" "+i);
            }
        }
    }
}


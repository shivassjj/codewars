package task3;

public class Factor {
    public static boolean checkForFactor(int base, int factor) {
        if (base < 0 && factor < 0) {
            System.out.println("base is a non-negative number, factor is a positive number.");
        } else if (base < 0) {
            System.out.println("base is a non-negative number");
        } else if (factor < 0) {
            System.out.println("factor is a positive number");
        }

        return base % factor == 0;
    }
}

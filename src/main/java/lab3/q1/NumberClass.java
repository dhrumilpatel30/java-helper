package lab3.q1;

public class NumberClass {
    public int num;
    NumberClass(final int a) {
        num = a;
    }

    public boolean isPrimeNumber() {
        for (int i = 2; i < (num + 1) / 2; i++) {
            if (0 == num % i) {
                return false;
            }
        }
        return true;
    }

}

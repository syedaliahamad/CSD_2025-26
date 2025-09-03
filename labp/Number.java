package labp;

public class Number {
    private double value;

    public Number(double value) {
        this.value = value;
    }

    public boolean isZero() {
        boolean result = (value == 0);
        System.out.println("Zero = " + result);
        return result;
    }

    public boolean isPositive() {
        boolean result = (value > 0);
        System.out.println("Positive = " + result);
        return result;
    }

    public boolean isNegative() {
        boolean result = (value < 0);
        System.out.println("Negative = " + result);
        return result;
    }

    public boolean isOdd() {
        if (value % 2 != 0) {
            System.out.println("Odd = true");
            return true;
        } else {
            System.out.println("Odd = false");
            return false;
        }
    }

    public boolean isEven() {
        if (value % 2 == 0) {
            System.out.println("Even = true");
            return true;
        } else {
            System.out.println("Even = false");
            return false;
        }
    }

    public boolean isPrime() {
        if (value <= 1 || value != Math.floor(value)) {
            System.out.println("Prime = false");
            return false;
        }
        int n = (int) value;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println("Prime = false");
                return false;
            }
        }
        System.out.println("Prime = true");
        return true;
    }

    public boolean isAmstrong() {
        if (value != Math.floor(value) || value < 0) {
            System.out.println("Armstrong = false");
            return false;
        }
        int n = (int) value;
        int original = n;
        int digits = String.valueOf(n).length();
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }
        boolean result = (sum == original);
        System.out.println("Armstrong = " + result);
        return result;
    }

    public static void main(String[] args) {
        Number num1 = new Number(153);
        System.out.println("fot the number 153:");
        num1.isZero();
        num1.isPositive();
        num1.isNegative();
        num1.isOdd();
        num1.isEven();
        num1.isPrime();
        num1.isAmstrong();
    }
}


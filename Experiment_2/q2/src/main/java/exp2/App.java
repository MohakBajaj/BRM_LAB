package exp2;

/**
 * Reverse of a Number
 *
 */
public class App {
    int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.reverse(123));
    }
}

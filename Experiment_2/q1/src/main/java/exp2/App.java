package exp2;

/**
 * Sum of two numbers
 *
 */
public class App {
    int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.sum(1, 2));
    }
}

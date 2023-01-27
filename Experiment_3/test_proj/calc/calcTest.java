package calc;

import exp3.App;

public class calcTest {
    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.sum(1, 2));
        System.out.println(app.sub(1, 2));
        System.out.println(app.mul(1, 2));
        System.out.println(app.div(1, 2));
        System.out.println(app.mod(1, 2));
    }
}

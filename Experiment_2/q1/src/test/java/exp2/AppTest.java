package exp2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithSum() {
        App app = new App();
        assertEquals(app.sum(1, 2), 3);
        assertEquals(app.sum(5, 4), 9);
        assertEquals(app.sum(1, 9), 10);
        assertEquals(app.sum(1, 7), 8);
    }

}

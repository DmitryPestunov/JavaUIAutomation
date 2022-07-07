import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Triangle test")
public class TriangleTest {
    private static Triangle t = new Triangle();
    private static Logger logger = LoggerFactory.getLogger(TriangleTest.class);

    @Test
    public void testJudge() { // Unable to form a triangle
        assertEquals(false, t.judge(2, 1, 3));
    }
    @Test
    public void testJudge1() { // Can form a triangle
        assertEquals(true, t.judge(3, 4, 5));
    }
    @Test
    public void testJudge2() { //Cannot form a negative triangle
        assertEquals(false, t.judge(-3, -4, -5));
    }

}

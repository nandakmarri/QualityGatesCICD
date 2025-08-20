import org.junit.Test;
import static org.junit.Assert.*;

public class SimpleTest {
    
    @Test
    public void testSimple() {
        assertEquals(4, 2 + 2);
        assertTrue(true);
    }
    
    @Test
    public void testMath() {
        assertEquals(10, 5 * 2);
        assertFalse(false);
    }
}
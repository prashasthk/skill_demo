import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    
    @Test
    public void testGetOnesPlace() {
        assertEquals(5, SkillDemo.getOnesPlace(25));
    }
}

package example.codeclan.com.employeestartpoint;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jamie on 24/10/2017.
 */

public class DirectorTest {
    Director director;

    @Before
    public void before() {
        director = new Director(1, "Hera", "Security", 60000, "Being da boss", 4000000);
    }

    @Test
    public void canGetBudget() {
        assertEquals(4000000, director.getBudget(), 0.1);
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(20000);
        assertEquals(80000, director.getSalary(), 0.1);
    }

    @Test
    public void canSetName() {
        director.setName("Joanna");
        assertEquals("Joanna", director.getName());
    }
}

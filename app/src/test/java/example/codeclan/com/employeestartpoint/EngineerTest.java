package example.codeclan.com.employeestartpoint;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jamie on 24/10/2017.
 */

public class EngineerTest {
    Engineer engineer;

    @Before
    public void before() {
        engineer = new Engineer(1, "Jess", "Sociable", 16000);
    }

    @Test
    public void canGetId() {
        assertEquals(1, engineer.getId());
    }

    @Test
    public void canRaiseSalary() {
        engineer.raiseSalary(3000);
        assertEquals(19000, engineer.getSalary(), 0.1);
    }

    @Test
    public void canSetName() {
        engineer.setName("Joanna");
        assertEquals("Joanna", engineer.getName());
    }
}

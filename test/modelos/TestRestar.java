package modelos;

import operacionesbasicas.OperacionesBasicas;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestRestar {

    public TestRestar() {
    }
    
    @Test
    public void testRestar() {
        System.out.println("Restar");
        OperacionesBasicas instance = new OperacionesBasicas(8,2);
        int expResult = 6;
        int result = instance.Restar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

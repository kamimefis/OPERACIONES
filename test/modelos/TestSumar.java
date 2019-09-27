package modelos;

import operacionesbasicas.OperacionesBasicas;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestSumar {

    public TestSumar() {
    }
    
    @Test
    public void testSumar() {
        System.out.println("Sumar");
        OperacionesBasicas instance = new OperacionesBasicas(8,2);
        int expResult = 10;
        int result = instance.Sumar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}

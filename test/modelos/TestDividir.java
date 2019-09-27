package modelos;

import operacionesbasicas.OperacionesBasicas;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestDividir {

    public TestDividir() {
    }
    
    @Test
    public void testDividir() {
        System.out.println("Dividir");
        OperacionesBasicas instance = new OperacionesBasicas(8,2);
        int expResult = 4;
        int result = instance.Dividir();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

package modelos;

import operacionesbasicas.OperacionesBasicas;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestMultiplicar {

    public TestMultiplicar() {
    }
    
    @Test
    public void testMultiplicar() {
        System.out.println("Multiplicar");
        OperacionesBasicas instance = new OperacionesBasicas(8,2);
        int expResult = 16;
        int result = instance.Multiplicar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

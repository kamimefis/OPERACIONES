
package modelos;

import operacionesbasicas.OperacionesBasicas;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class OperacionesBasicasTest {
    
    public OperacionesBasicasTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Sumar method, of class OperacionesBasicas.
     */
    @Test
    public void testSumar() {
        System.out.println("Sumar");
        OperacionesBasicas instance = new OperacionesBasicas(8,2);
        int expResult =10;
        int result = instance.Sumar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Restar method, of class OperacionesBasicas.
     */
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

    /**
     * Test of Multiplicar method, of class OperacionesBasicas.
     */
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

    /**
     * Test of Dividir method, of class OperacionesBasicas.
     */
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

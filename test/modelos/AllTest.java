package modelos;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class) 
@Suite.SuiteClasses({
    TestSumar.class, TestMultiplicar.class, TestRestar.class, TestDividir.class
})
public class AllTest {
    
}

package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestLengthAndScaledLength.class, TestStructure.class, 
				TestConstructors.class, TestLengths2.class })
public class AllTests {

}

import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({ testaddnumbers.class, testaddstrings.class })
public class AllTests {
	
}

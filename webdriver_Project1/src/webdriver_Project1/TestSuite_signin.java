package webdriver_Project1;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)	
@SuiteClasses({ ParameterizedTestcase.class,
Login_errormessage.class
})

public class TestSuite_signin {

}

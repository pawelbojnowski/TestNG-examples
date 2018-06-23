package pl.pb.testng.examples.parameters;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * PLEASE run these tests with custom suite: <project dir></>src/test/resources/testng-custom-suite-parameters.xml
 * from command line or:
 * https://intellij-support.jetbrains.com/hc/en-us/community/posts/115000383450-How-to-create-a-TestNG-Suite
 */
public class TestParametersFromCustomSuite {

    @Test
    @Parameters({"firstName"})
    public void testWithFirstNameAsParameters(String firstName) {
        System.out.println("TestParametersFromCustomSuite.testWithFirstNameAsParameters() " + firstName);
    }

    @Test
    @Parameters({"lastName"})
    public void testWithLastNameAsParameters(@Optional("example last name value - with optional value") String firstName) {
        System.out.println("TestParametersFromCustomSuite.testWithLastNameAsParameters(): " + firstName);
    }
}

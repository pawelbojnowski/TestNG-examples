package pl.pb.testng.examples.logginglisteners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({CustomTestListenerAdapter.class})
public class TestTestListenerAdapter {
    @Test
    public void testSuccess() {
    }

    @Test
    public void testFailure() {
        Assert.fail();
    }

    //'dependsOnMethods' was added to invoke 'onTestSkipped' method form CustomTestListenerAdapter.java
    @Test(dependsOnMethods = "testFailure")
    public void testIgnored() {
        System.out.println("TestTestListenerAdapter.testIgnored()");
    }
}

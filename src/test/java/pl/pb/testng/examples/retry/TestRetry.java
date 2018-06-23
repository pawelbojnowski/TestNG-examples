package pl.pb.testng.examples.retry;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRetry {

    /**
     * The number of execution of this test should be 1 + N
     * N - number of time checked the Retry Analyzer,
     * in this case RetryTestAnalyzer.class
     */
    @Test(retryAnalyzer = RetryTestAnalyzer.class)
    public void testRetry() {
        System.out.println("TestRetry.testRetry()");
        Assert.fail();
    }
}

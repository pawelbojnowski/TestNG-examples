package pl.pb.testng.examples.retry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryTestAnalyzer implements IRetryAnalyzer {

    private static final int maxExecution = 3;
    private int currentExecution = 0;

    public boolean retry(ITestResult result) {
        System.out.println("RetryTestAnalyzer.retry()");
        if (currentExecution < maxExecution) {
            currentExecution++;
            return true;
        }
        return false;
    }
}

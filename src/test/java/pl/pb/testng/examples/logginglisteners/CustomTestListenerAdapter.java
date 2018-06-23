package pl.pb.testng.examples.logginglisteners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class CustomTestListenerAdapter extends TestListenerAdapter {
    private int m_count = 0;

    @Override
    public void onTestFailure(ITestResult tr) {
        System.out.println("Failure : " + tr.getName());
    }

    @Override
    public void onTestSkipped(ITestResult tr) {
        System.out.println("Skipped : " + tr.getName());
    }

    @Override
    public void onTestSuccess(ITestResult tr) {
        System.out.println("Success : " + tr.getName());
    }
}

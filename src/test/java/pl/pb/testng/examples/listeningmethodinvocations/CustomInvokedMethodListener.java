package pl.pb.testng.examples.listeningmethodinvocations;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class CustomInvokedMethodListener implements IInvokedMethodListener {

    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        System.out.println("CustomInvokedMethodListener.beforeInvocation()");
    }

    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        System.out.println("CustomInvokedMethodListener.afterInvocation()\n");
    }
}

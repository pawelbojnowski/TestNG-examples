package pl.pb.testng.examples.overridingtestmethods;

import org.testng.IHookCallBack;
import org.testng.IHookable;
import org.testng.ITestResult;


/*
 *In this case an Interceptor allows run test only with specific groups and ignore the rest of test.
 */
public class CustomHook implements IHookable {

    public void run(final IHookCallBack callBack, final ITestResult testResult) {
        System.out.println("CustomHook.run() " + testResult.getName());

        if (!"testWithGroupFour".equals(testResult.getName())) {
            callBack.runTestMethod(testResult);
        } else {
            System.out.println("Test: '" + testResult.getName() + "' will be not execute");
        }
        System.out.println();
    }
}

package pl.pb.testng.examples.overridingtestmethods;

import utils.XMLTestSuiteRunnerUtils;

public class XMLTestSuiteRunner {

    //    Other Listener
//    IAnnotationTransformer
//    IAnnotationTransformer2
//    IHookable
//    IInvokedMethodListener
//    IMethodInterceptor
//    IReporter
//    ISuiteListener
//    ITestListener
    public static void main(String[] args) {
        XMLTestSuiteRunnerUtils.run("testng-custom-suite-hook.xml");
    }
}

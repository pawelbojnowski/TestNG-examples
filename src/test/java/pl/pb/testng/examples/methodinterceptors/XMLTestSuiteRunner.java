package pl.pb.testng.examples.methodinterceptors;

import utils.XMLTestSuiteRunnerUtils;

public class XMLTestSuiteRunner {

    public static void main(String[] args) {
        XMLTestSuiteRunnerUtils.run("testng-custom-suite-method-interceptors.xml");
    }
}

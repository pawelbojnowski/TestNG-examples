package pl.pb.testng.examples.listeningmethodinvocations;

import utils.XMLTestSuiteRunnerUtils;

public class XMLTestSuiteRunner {

    public static void main(String[] args) {
        XMLTestSuiteRunnerUtils.run("testng-custom-suite-invoked-method-listener.xml");
    }
}

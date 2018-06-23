package pl.pb.testng.examples.logginglisteners;

import utils.XMLTestSuiteRunnerUtils;

public class XMLTestSuiteRunner {

    public static void main(String[] args) {
        XMLTestSuiteRunnerUtils.run("testng-custom-suite-logging-listeners.xml");
    }
}

package pl.pb.testng.examples.alteringsuites;

import utils.XMLTestSuiteRunnerUtils;

public class XMLTestSuiteRunner {

    public static void main(String[] args) {
        XMLTestSuiteRunnerUtils.run("testng-custom-suite-alter-suite-listener.xml");
    }

}

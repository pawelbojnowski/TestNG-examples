package pl.pb.testng.examples.alteringsuites;

import org.testng.annotations.Test;

public class TestAlterSuiteListenerRunFromXML {

    @Test
    public void testOne() {
        System.out.println("TestAlterSuiteListenerRunFromXML.testOne()");
    }

    @Test
    public void testTwo() {
        System.out.println("TestAlterSuiteListenerRunFromXML.testTwo()");
    }


}

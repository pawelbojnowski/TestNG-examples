package pl.pb.testng.examples.listeningmethodinvocations;

import org.testng.annotations.Test;

public class TestCustomInvokedMethodListenerRunFromXML {
    @Test
    public void testOne() {
        System.out.println("TestCustomInvokedMethodListenerRunFromXML.testOne()");
    }

    @Test
    public void testTwo() {
        System.out.println("TestCustomInvokedMethodListenerRunFromXML.testTwo()");
    }
}

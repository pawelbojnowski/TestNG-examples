package pl.pb.testng.examples.listeningmethodinvocations;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({CustomInvokedMethodListener.class})
public class TestCustomInvokedMethodListener {

    @Test
    public void testOne() {
        System.out.println("TestCustomInvokedMethodListenertestOne()");
    }

    @Test
    public void testTwo() {
        System.out.println("TestCustomInvokedMethodListener.testTwo()");
    }
}

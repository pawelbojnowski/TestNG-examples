package pl.pb.testng.examples.ignore;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore
public class TestIgnoreAllTestInClass {

    @Test
    public void testIgnored() {
        System.out.println("TestIgnoreAllTestInClass.testIgnored()");
    }

    @Test
    public void testAlsoWillBeIgnored() {
        System.out.println("TestIgnoreAllTestInClass.testAlsoWillBeIgnored()");
    }
}

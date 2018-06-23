package pl.pb.testng.examples.ignore.packageignorde;

import org.testng.annotations.Test;

public class TestIgnoredOne {

    @Test
    public void testIgnored() {
        System.out.println("TestIgnoredOne.testIgnored()");
    }

    @Test
    public void testAlsoWillBeIgnored() {
        System.out.println("TestIgnoredOne.testAlsoWillBeIgnored()");
    }
}

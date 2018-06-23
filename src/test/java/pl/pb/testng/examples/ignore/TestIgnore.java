package pl.pb.testng.examples.ignore;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestIgnore {

    @Test
    @Ignore
    public void testIgnored() {
        System.out.println("TestIgnore.testIgnored()");
    }

    @Test
    public void testNotIgnored() {
        System.out.println("TestIgnore.testNotIgnored()");
    }

}

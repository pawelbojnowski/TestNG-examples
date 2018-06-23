package pl.pb.testng.examples.thread;

import org.testng.annotations.Test;

public class TestThread {
    @Test(threadPoolSize = 3, invocationCount = 10, timeOut = 1000)
    public void testThread() throws InterruptedException {
        System.out.println("TestThread.testThread() - start ");

        Thread.sleep(100);

        System.out.println("TestThread.testThread() - end");
    }

    /**
     * Only first 3 (threadPoolSize) should be executed
     */
    @Test(threadPoolSize = 3, invocationCount = 10, timeOut = 1000)
    public void testThreadWithTimeout() throws InterruptedException {
        System.out.println("TestThread.testThreadWithTimeout() - start");

        Thread.sleep(1100);

        System.out.println("TestThread.testThreadWithTimeout() - End");
    }
}

package pl.pb.testng.examples.annotationtransformers;

import org.testng.annotations.Test;

public class TestCustomTransformer {

    @Test
    public void testChangedByCustomTransformer() {
        System.out.println("TestCustomTransformer.testChangedByCustomTransformer()");
    }

    @Test
    public void testWithoutAnyTransformers() {
        System.out.println("TestCustomTransformer.testWithoutAnyTransformers()");
    }

}

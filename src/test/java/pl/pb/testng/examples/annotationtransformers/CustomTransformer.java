package pl.pb.testng.examples.annotationtransformers;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class CustomTransformer implements IAnnotationTransformer {

    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
        System.out.println("CustomTransformer.transform()");
        System.out.println("test method:" + testMethod.getName());

        if ("testChangedByCustomTransformer".equals(testMethod.getName())) {
            System.out.println("test 'testChangedByCustomTransformer' will be execute 5 times");
            annotation.setInvocationCount(5);
        }

        System.out.println();
    }
}

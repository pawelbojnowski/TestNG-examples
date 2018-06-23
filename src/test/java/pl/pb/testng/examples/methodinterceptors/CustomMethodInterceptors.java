package pl.pb.testng.examples.methodinterceptors;

import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import java.util.*;

/*
 *In this case an Interceptor allows run test only with specific groups and ignore the rest of test.
 */
public class CustomMethodInterceptors implements IMethodInterceptor {

    public List<IMethodInstance> intercept(List<IMethodInstance> methods, ITestContext context) {
        System.out.println("CustomMethodInterceptors.intercept()");
        List<IMethodInstance> result = new ArrayList<IMethodInstance>();
        for (IMethodInstance m : methods) {

            Test test = m.getMethod().getConstructorOrMethod().getMethod().getAnnotation(Test.class);

            if (test!=null && test.groups() != null) {
                Set<String> groups = new HashSet<String>(Arrays.asList(test.groups()));

                System.out.println("method: '" + m.getMethod().getMethodName() + "' with groups: " + groups);
                if (groups.contains("GroupOne") || groups.contains("GroupThree")) {
                    result.add(m);
                }
            }
        }
        System.out.println();
        return result;
    }
}

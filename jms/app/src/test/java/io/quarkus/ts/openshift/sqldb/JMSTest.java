package io.quarkus.ts.openshift.sqldb;

import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.junit.QuarkusTest;
import jdk.nashorn.internal.ir.annotations.Ignore;

import static org.hamcrest.Matchers.hasSize;

@QuarkusTest
@QuarkusTestResource(ArtemisTestResource.class)
public class JMSTest extends AbstractJMSTest {
    @Override
    @Ignore
    public void testLastPrice() throws InterruptedException {
        super.testLastPrice();
    }
}

package io.quarkus.ts.openshift.jms;

import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.junit.QuarkusTest;

import static org.hamcrest.Matchers.hasSize;

@QuarkusTest
@QuarkusTestResource(ArtemisTestResource.class)
public class JMSTest extends AbstractJMSTest {
    @Override
    public void testLastPrice() throws InterruptedException {
        super.testLastPrice();
    }
}

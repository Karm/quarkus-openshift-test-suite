package io.quarkus.ts.openshift.jms.qpidamqp;

import io.quarkus.ts.openshift.common.AdditionalResources;
import io.quarkus.ts.openshift.common.OpenShiftTest;
import io.quarkus.ts.openshift.jms.AbstractJMSTest;

@OpenShiftTest
@AdditionalResources("classpath:amqp.yaml")
public class QPidAMQPOpenShiftIT extends AbstractJMSTest {
}

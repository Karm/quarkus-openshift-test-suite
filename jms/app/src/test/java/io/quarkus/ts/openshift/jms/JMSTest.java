package io.quarkus.ts.openshift.jms;

import io.quarkus.test.junit.QuarkusTest;

/**
 * docker run -it --rm -p 8161:8161 -p 61616:61616 -e AMQ_USER=quarkus -e AMQ_PASSWORD=quarkus -e AMQ_QUEUES=prices -e AMQ_DATA_DIR=/opt/amq/data --tmpfs /opt/amq/data registry.access.redhat.com/amq-broker-7/amq-broker-72-openshift
 *
 * should probably be @Disabled, as it requires a container running, but I'll leave that to you
 */
@QuarkusTest
public class JMSTest extends AbstractJMSTest {
}

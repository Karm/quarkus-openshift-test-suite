package io.quarkus.ts.openshift.jms;

import io.restassured.RestAssured;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.hamcrest.text.MatchesPattern.matchesPattern;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public abstract class AbstractJMSTest {
    @Test
    @Order(1)
    public void testLastPrice() throws InterruptedException {
        Thread.sleep(100L);
        RestAssured.given()
                .when().get("/prices/last")
                .then()
                .statusCode(200)
                .body(matchesPattern("\\d+"));
    }
}

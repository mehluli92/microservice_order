//package com.orderservice.order;
//
//import static org.mockito.ArgumentMatchers.*;
//
//import org.hamcrest.Matchers;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.web.server.LocalServerPort;
//import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
//import org.testcontainers.containers.MySQLContainer;
//
//import io.restassured.RestAssured;
//
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//class OrderServiceApplicationTests {
//
//    @ServiceConnection
//    static MySQLContainer<?> mySQLContainer = new MySQLContainer<>("mysql:8.0.32")
//            .withDatabaseName("testdb")
//            .withUsername("test")
//            .withPassword("test");
//
//    @LocalServerPort
//    private int port;
//
//    @BeforeEach
//    void setup() {
//        RestAssured.baseURI = "http://localhost";
//        RestAssured.port = port;
//    }
//
//    static {
//        mySQLContainer.start();
//    }
//
//    @Test
//    void shouldCreateOrder() {
//        String requestBody = """
//                {
//                    "name": "iPhone 15",
//                    "description": "iPhone 15 is a smartphone from Apple",
//                    "price": 1000
//                }
//                """;
//
//        RestAssured.given()
//                .contentType("application/json")
//                .body(requestBody)
//                .when()
//                .post("/api/product")
//                .then()
//                .statusCode(201)
//                .body("id", Matchers.notNullValue())
//                .body("name", Matchers.equalTo("iPhone 15"))
//                .body("description", Matchers.equalTo("iPhone 15 is a smartphone from Apple"))
//                .body("price", Matchers.equalTo(1000));
//    }
//}

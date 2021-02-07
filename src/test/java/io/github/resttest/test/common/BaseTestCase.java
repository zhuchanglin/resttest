package io.github.resttest.test.common;

import io.github.resttest.river.TestConfig;
import io.restassured.RestAssured;
import org.junit.Before;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.basic;

public abstract class BaseTestCase {

    final protected TestConfig config;

    final protected Map<String,String> emptyJSONObject;

    protected BaseTestCase() {
        this.config = new TestConfig();
        this.emptyJSONObject = new HashMap<>();
    }

    protected void defaultSetup() {
        RestAssured.baseURI = config.baseURI();
        RestAssured.authentication = basic(config.getUsername(), config.getPassword());
    }

    @Before
    public void setUp() {
        defaultSetup();
    }
}

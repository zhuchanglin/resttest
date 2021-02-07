package io.github.resttest.river.test;

import io.github.resttest.test.common.BaseTestCase;
import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class ArticleApiTest extends BaseTestCase {

    private final String articleListApi = "/article/list";

    @Test
    public void testArticleList_json_validation() {
        given()
                .contentType(ContentType.JSON)
                .body(emptyJSONObject)
                .when()
                .post(articleListApi)
                .then()
                .statusCode(HttpStatus.SC_OK)
                .body(matchesJsonSchemaInClasspath("schema/article_list.json"));
    }
}

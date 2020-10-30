package api.impl;

import api.enums.StatusCodeEnum;
import api.services.RequestExecutorService;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class RequestExecutorServiceImpl implements RequestExecutorService {

    @Override
    public Response createPostRequest(Object object,
                                      String executorPath) {
        Response response = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(object)
                .when()
                .post(RestAssured.basePath + executorPath);
        response
                .then()
                .assertThat()
                .statusCode(StatusCodeEnum.STATUS_CODE_200.getCode());
        return response;
    }

    @Override
    public Response createGetRequest(String executorPath) {
        Response response = given()
                .accept(ContentType.JSON)
                .when()
                .get(RestAssured.basePath + executorPath);
        response
                .then()
                .assertThat()
                .statusCode(StatusCodeEnum.STATUS_CODE_200.getCode());
        return response;
    }

    @Override
    public void createPutRequest() {

    }

    @Override
    public void createDeleteRequest() {

    }
}

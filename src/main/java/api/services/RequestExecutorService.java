package api.services;

import io.restassured.response.Response;

public interface RequestExecutorService {

    Response createPostRequest(Object body, String executorPath);

    Response createGetRequest(String executorPath);

    void createPutRequest();

    void createDeleteRequest();
}

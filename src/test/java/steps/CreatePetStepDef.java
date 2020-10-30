package steps;

import api.factory.PetFactory;
import api.impl.RequestExecutorServiceImpl;
import api.pojo.Category;
import api.pojo.Pet;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.equalTo;

public class CreatePetStepDef {

    @Then("check created pet petId as {int} by api")
    public void checkCreatedPetPetIdAsIdByApi(Integer petId) {
        Response response = new RequestExecutorServiceImpl().createGetRequest("v2/pet/" + petId);
        response.then()
                .body("id", equalTo(response.as(Pet.class).getId()));
    }

    @Then("create pet with petId as {int} petName as {string} CategoryId as {int}  CategoryName as {string} by api")
    public void createPetWithIdAsPetIdPetNameAsCategoryIdAsCategoryIdCategoryNameAsByApi(Integer petId,
                                                                                         String petName,
                                                                                         Integer categoryId,
                                                                                         String categoryName) {
        new RequestExecutorServiceImpl().createPostRequest(PetFactory.createPet(petId, petName, categoryId, categoryName), "v2/pet");
    }
}

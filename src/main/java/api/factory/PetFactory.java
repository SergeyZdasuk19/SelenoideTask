package api.factory;

import api.pojo.Category;
import api.pojo.Pet;

public class PetFactory {

    public static Pet createPet(Integer petId,
                                String petName,
                                Integer categoryId,
                                String categoryName) {
        return Pet.builder()
                .id(petId)
                .name(petName)
                .category(
                        Category.builder()
                                .id(categoryId)
                                .name(categoryName)
                                .build())
                .build();
    }
}

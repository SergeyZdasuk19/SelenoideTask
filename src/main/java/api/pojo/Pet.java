package api.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
@Builder
public class Pet {

    private Integer id;
    private String name;
    private List<String> photoUrls;
    private List<String> tags;
    private Category category;
}

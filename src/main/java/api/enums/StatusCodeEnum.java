package api.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum StatusCodeEnum {

    STATUS_CODE_505(505),
    STATUS_CODE_200(200),
    STATUS_CODE_404(404);

    private Integer code;
}

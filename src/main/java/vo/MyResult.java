package vo;

import lombok.Data;

@Data
public class MyResult<T> {
    private Integer code;

    private String msg;

    private T data;
}

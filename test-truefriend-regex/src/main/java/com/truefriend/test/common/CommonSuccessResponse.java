package com.truefriend.test.common;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommonSuccessResponse<T> {

    private final boolean result = true;
    private T data;

    public CommonSuccessResponse() {
        this.data = null;
    }

    public CommonSuccessResponse(T data) {
        this.data = data;
    }
}

package com.example.mvcweb.enumer;

import lombok.Getter;

@Getter
public enum BaseResponseEnum {

    SUCCESS(200, "请求成功"),

    ERROR(500, "服务端异常");

    private final Integer statusCode;

    private final String message;

    BaseResponseEnum(Integer code, String message) {
        this.statusCode = code;
        this.message = message;
    }
}

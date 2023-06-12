package com.turling.demo.config;

import lombok.Data;

@Data
public class MessageObject {

    public static final Integer OK = 0;

    private Integer code = 0;
    private String message;
    private Object dataObject;

    public MessageObject() {
        super();
    }

    public MessageObject(Integer code, String message) {
        super();
        this.code = code;
        this.message = message;
    }

    public MessageObject(Integer code, String message, Object dataObject) {
        super();
        this.code = code;
        this.message = message;
        this.dataObject = dataObject;
    }

}

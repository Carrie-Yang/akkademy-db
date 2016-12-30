package com.akkademy.messages;

/**
 * Created by yanglu on 2016/12/28.
 */
public class SetRequest {
    private final String key;
    private final Object value;

    public SetRequest(String key, Object value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public Object getValue() {
        return value;
    }
}

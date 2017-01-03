package com.akkademy.messages;

import java.io.Serializable;

/**
 * Created by yanglu on 2016/12/28.
 */
public class GetRequest implements Serializable {
    private final String key;

    public GetRequest(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }
}

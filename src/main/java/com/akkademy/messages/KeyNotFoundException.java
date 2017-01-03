package com.akkademy.messages;

import java.io.Serializable;

/**
 * Created by luyang on 1/3/17.
 */
public class KeyNotFoundException extends Exception implements Serializable {
    public final String key;

    public KeyNotFoundException(String key) {
        this.key = key;
    }
}

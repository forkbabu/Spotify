package com.spotify.libs.connect.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.JsonNode;
import com.spotify.mobile.android.cosmos.JacksonModel;

public class Message implements JacksonModel {
    @JsonProperty("payload")
    public JsonNode payload;
    @JsonProperty("type")
    public Type type;

    public enum Type implements JacksonModel {
        GET_INFO("getInfo"),
        GET_INFO_RESPONSE("getInfoResponse"),
        ADD_USER("addUser"),
        ADD_USER_RESPONSE("addUserResponse"),
        ADD_USER_ERROR("addUserError"),
        LOGGED_OUT("loggedOut"),
        UNKNOWN("unknown");
        
        private static final Type[] VALUES = values();
        private final String mValue;

        private Type(String str) {
            this.mValue = str;
        }

        @JsonCreator
        public static Type fromString(String str) {
            if (str != null) {
                Type[] typeArr = VALUES;
                for (Type type : typeArr) {
                    if (str.equalsIgnoreCase(type.mValue)) {
                        return type;
                    }
                }
            }
            return UNKNOWN;
        }

        @JsonValue
        public String getValue() {
            return this.mValue;
        }
    }

    public Message() {
    }

    public Message(Type type2, JsonNode jsonNode) {
        this.type = type2;
        this.payload = jsonNode;
    }
}

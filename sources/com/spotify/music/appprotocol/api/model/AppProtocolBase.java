package com.spotify.music.appprotocol.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Collections;
import java.util.List;

public interface AppProtocolBase {
    public static final Empty a = new Empty();
    public static final List<Object> b = Collections.emptyList();

    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Empty implements JacksonModel {
        public String toString() {
            return "{}";
        }
    }
}

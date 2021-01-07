package com.spotify.imageresolve;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

public abstract class CacheStatusResponse implements JacksonModel {

    public static abstract class Entry implements JacksonModel {
        @JsonCreator
        public static Entry create(@JsonProperty("uri") String str, @JsonProperty("cached") boolean z) {
            return new AutoValue_CacheStatusResponse_Entry(str, z);
        }

        public abstract boolean cached();

        public abstract String uri();
    }

    @JsonCreator
    public static CacheStatusResponse create(@JsonProperty("result") List<Entry> list) {
        return new AutoValue_CacheStatusResponse(list);
    }

    public abstract List<Entry> result();
}

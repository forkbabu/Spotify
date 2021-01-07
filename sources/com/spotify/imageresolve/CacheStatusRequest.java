package com.spotify.imageresolve;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Set;

public abstract class CacheStatusRequest implements JacksonModel {
    public static CacheStatusRequest create(Set<String> set) {
        return new AutoValue_CacheStatusRequest(set);
    }

    @JsonGetter("uris")
    public abstract Iterable<String> uris();
}

package com.spotify.music.follow;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public abstract class p {
    @JsonCreator
    public static p create(@JsonProperty("target_uris") List<String> list) {
        return new h(list);
    }

    @JsonProperty("target_uris")
    public abstract List<String> targetUris();
}

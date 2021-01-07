package com.spotify.music.features.localfilesimport.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public abstract class e {
    public static e a(List<LocalSourceJacksonModel> list) {
        return new a(list);
    }

    @JsonProperty("sources")
    public abstract List<LocalSourceJacksonModel> sources();
}

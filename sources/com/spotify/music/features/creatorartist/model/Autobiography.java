package com.spotify.music.features.creatorartist.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class Autobiography implements Parcelable, JacksonModel {
    @JsonCreator
    public static Autobiography create(@JsonProperty("body") String str, @JsonProperty("urls") List<String> list, @JsonProperty("links") LinksModel linksModel) {
        return new AutoValue_Autobiography(str, gf0.a(list), linksModel);
    }

    @JsonProperty("body")
    public abstract String body();

    @JsonProperty("links")
    public abstract LinksModel links();

    @JsonProperty("urls")
    public abstract List<String> urls();
}

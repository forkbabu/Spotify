package com.spotify.music.libs.assistedcuration.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class RecsContentRating implements JacksonModel {
    @JsonCreator
    public static RecsContentRating create(@JsonProperty("country") String str, @JsonProperty("tag") List<String> list) {
        return new AutoValue_RecsContentRating(str, list);
    }

    /* access modifiers changed from: package-private */
    public abstract String country();

    /* access modifiers changed from: package-private */
    public abstract List<String> tags();
}

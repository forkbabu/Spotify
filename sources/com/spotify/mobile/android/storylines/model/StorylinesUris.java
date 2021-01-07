package com.spotify.mobile.android.storylines.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Set;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(using = StorylinesUris_Deserializer.class)
public class StorylinesUris implements JacksonModel {
    private final Set<String> mEntityUris;

    @JsonCreator
    public StorylinesUris(@JsonProperty("entityUris") String[] strArr) {
        this(ImmutableSet.copyOf(strArr));
    }

    public boolean containsEntity(String str) {
        return this.mEntityUris.contains(str);
    }

    public Set<String> getEntityUris() {
        return this.mEntityUris;
    }

    public StorylinesUris(Set<String> set) {
        this.mEntityUris = set;
    }
}

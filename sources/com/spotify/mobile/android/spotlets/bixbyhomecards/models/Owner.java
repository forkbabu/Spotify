package com.spotify.mobile.android.spotlets.bixbyhomecards.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.spotlets.bixbyhomecards.models.AutoValue_Owner;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(builder = Builder.class)
@JsonSerialize(as = Owner.class)
public abstract class Owner implements JacksonModel {

    public static abstract class Builder implements JacksonModel {
        @JsonCreator
        public static Builder create() {
            return Owner.builder();
        }

        public abstract Owner build();

        @JsonProperty("display_name")
        public abstract Builder displayName(String str);
    }

    public static Builder builder() {
        return new AutoValue_Owner.Builder();
    }

    public static Owner create(String str) {
        return builder().displayName(str).build();
    }

    @JsonProperty("display_name")
    public abstract String displayName();
}

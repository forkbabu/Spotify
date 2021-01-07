package com.spotify.music.features.ads.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class OfflineResources implements JacksonModel {

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static abstract class Resources implements JacksonModel {
        @JsonCreator
        public static Resources create(@JsonProperty("uri") String str, @JsonProperty("offline_availability") String str2) {
            return new AutoValue_OfflineResources_Resources(str, str2);
        }

        public abstract String offlineAvailability();

        public abstract String uri();
    }

    @JsonCreator
    public static OfflineResources create(@JsonProperty("resources") Resources resources) {
        return new AutoValue_OfflineResources(resources);
    }

    public abstract Resources resources();
}

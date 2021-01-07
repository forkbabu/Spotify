package com.spotify.music.libs.facebook;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.libs.facebook.AutoValue_SocialState;
import java.util.List;

@JsonDeserialize(builder = Builder.class)
public abstract class SocialState implements JacksonModel {

    public static abstract class Builder implements JacksonModel {
        @JsonCreator
        static Builder create() {
            return SocialState.builder();
        }

        @JsonProperty("accessToken")
        public abstract Builder accessToken(String str);

        @JsonProperty("available")
        public abstract Builder available(boolean z);

        public abstract SocialState build();

        @JsonProperty("enabled")
        public abstract Builder enabled(boolean z);

        @JsonProperty("missingPermissions")
        public abstract Builder missingPermissions(List<String> list);
    }

    public static Builder builder() {
        return new AutoValue_SocialState.Builder();
    }

    public abstract String accessToken();

    public abstract boolean available();

    public abstract boolean enabled();

    public abstract List<String> missingPermissions();

    public abstract Builder toBuilder();
}

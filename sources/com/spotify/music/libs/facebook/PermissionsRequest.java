package com.spotify.music.libs.facebook;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.libs.facebook.AutoValue_PermissionsRequest;
import java.util.List;

public abstract class PermissionsRequest implements JacksonModel {

    public static abstract class Builder implements JacksonModel {
        static Builder create() {
            return PermissionsRequest.builder();
        }

        public abstract PermissionsRequest build();

        @JsonProperty("permissions")
        public abstract Builder permissions(List<String> list);
    }

    public static Builder builder() {
        return new AutoValue_PermissionsRequest.Builder();
    }

    @JsonProperty("permissions")
    public abstract List<String> permissions();

    public abstract Builder toBuilder();
}

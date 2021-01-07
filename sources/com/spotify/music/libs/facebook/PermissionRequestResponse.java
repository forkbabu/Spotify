package com.spotify.music.libs.facebook;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.libs.facebook.AutoValue_PermissionRequestResponse;

@JsonDeserialize(builder = Builder.class)
public abstract class PermissionRequestResponse implements JacksonModel {

    public static abstract class Builder implements JacksonModel {
        @JsonCreator
        static Builder create() {
            return PermissionRequestResponse.builder();
        }

        @JsonProperty("authSuccessUrl")
        public abstract Builder authSuccessUrl(String str);

        public abstract PermissionRequestResponse build();

        @JsonProperty("missingPermissions")
        public abstract Builder missingPermissions(String str);

        @JsonProperty("requestPermissionsUrl")
        public abstract Builder requestPermissionsUrl(String str);
    }

    public static Builder builder() {
        return new AutoValue_PermissionRequestResponse.Builder();
    }

    public abstract String authSuccessUrl();

    public abstract String missingPermissions();

    public abstract String requestPermissionsUrl();

    public abstract Builder toBuilder();
}

package com.spotify.music.libs.facebook;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.libs.facebook.AutoValue_SocialEvent;

public abstract class SocialEvent implements JacksonModel {
    private static final ImmutableMap<String, SocialError> ERROR_MAPPING;

    public static abstract class Builder implements JacksonModel {
        static Builder create() {
            return SocialEvent.builder();
        }

        public abstract SocialEvent build();

        public abstract Builder description(String str);

        public abstract Builder socialError(SocialError socialError);
    }

    static {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        builder.mo51put("permissions", SocialError.PERMISSIONS);
        builder.mo51put("unauthorized", SocialError.UNAUTHORIZED);
        builder.mo51put("userDataFail", SocialError.USER_DATA_FAIL);
        builder.mo51put("failedToConnect", SocialError.FAILED_TO_CONNECT);
        builder.mo51put("serviceConnectNotPermitted", SocialError.SERVICE_CONNECT_NOT_PERMITTED);
        ERROR_MAPPING = builder.build();
    }

    public static Builder builder() {
        return new AutoValue_SocialEvent.Builder();
    }

    @JsonCreator
    public static SocialEvent create(@JsonProperty("errorType") String str, @JsonProperty("description") String str2) {
        return builder().socialError(ERROR_MAPPING.getOrDefault(str, SocialError.NONE)).description(str2).build();
    }

    public abstract String description();

    public abstract SocialError socialError();

    public abstract Builder toBuilder();
}

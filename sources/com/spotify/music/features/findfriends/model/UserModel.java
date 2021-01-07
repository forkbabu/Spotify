package com.spotify.music.features.findfriends.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.features.findfriends.model.C$AutoValue_UserModel;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonSerialize(as = UserModel.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class UserModel implements JacksonModel, Parcelable {

    public static abstract class a {
        public abstract UserModel a();

        public abstract a b(String str);

        public abstract a c(boolean z);

        public abstract a d(String str);

        public abstract a e(String str);
    }

    public static a builder() {
        return new C$AutoValue_UserModel.b();
    }

    @JsonCreator
    public static UserModel create(@JsonProperty("uri") String str, @JsonProperty("title") String str2, @JsonProperty("image") String str3, @JsonProperty("following") boolean z) {
        a builder = builder();
        builder.e(str);
        builder.d(str2);
        builder.b(MoreObjects.nullToEmpty(str3));
        builder.c(z);
        return builder.a();
    }

    @JsonProperty("image")
    public abstract String image();

    @JsonProperty("isFollowing")
    public abstract boolean isFollowing();

    @JsonProperty("title")
    public abstract String title();

    public abstract a toBuilder();

    @JsonProperty("uri")
    public abstract String uri();
}

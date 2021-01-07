package com.spotify.music.features.album.offline.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.features.album.offline.model.C$AutoValue_DecorationPolicy;
import com.spotify.music.features.album.offline.model.C$AutoValue_Policy;

@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class Policy implements JacksonModel, Parcelable {

    public interface a {
        a a(DecorationPolicy decorationPolicy);

        Policy build();
    }

    public static a builder() {
        C$AutoValue_Policy.b bVar = new C$AutoValue_Policy.b();
        bVar.a(((C$AutoValue_DecorationPolicy.b) DecorationPolicy.builder()).build());
        return bVar;
    }

    @JsonProperty("policy")
    public abstract DecorationPolicy policy();

    public abstract a toBuilder();
}

package com.spotify.music.features.album.offline.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.features.album.offline.model.C$AutoValue_DecorationPolicy;
import com.spotify.music.features.album.offline.model.C$AutoValue_ListPolicy;

@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class DecorationPolicy implements JacksonModel, Parcelable {

    public interface a {
        a a(ListPolicy listPolicy);

        DecorationPolicy build();
    }

    public static a builder() {
        C$AutoValue_DecorationPolicy.b bVar = new C$AutoValue_DecorationPolicy.b();
        bVar.a(((C$AutoValue_ListPolicy.b) ListPolicy.builder()).build());
        return bVar;
    }

    @JsonProperty("list")
    public abstract ListPolicy list();

    public abstract a toBuilder();
}

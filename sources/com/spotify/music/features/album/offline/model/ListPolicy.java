package com.spotify.music.features.album.offline.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.features.album.offline.model.C$AutoValue_ListPolicy;

@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class ListPolicy implements JacksonModel, Parcelable {

    public interface a {
        a a(ImmutableMap<String, Boolean> immutableMap);

        ListPolicy build();
    }

    public static a builder() {
        C$AutoValue_ListPolicy.b bVar = new C$AutoValue_ListPolicy.b();
        bVar.a(ImmutableMap.of("link", Boolean.FALSE));
        return bVar;
    }

    @JsonAnyGetter
    public abstract ImmutableMap<String, Boolean> attributes();

    public abstract a toBuilder();
}

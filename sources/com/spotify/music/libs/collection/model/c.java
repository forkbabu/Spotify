package com.spotify.music.libs.collection.model;

import com.google.common.collect.ImmutableList;
import com.spotify.playlist.models.i;
import com.spotify.playlist.models.o;

public abstract class c implements i<o> {

    public interface a {
    }

    public static a builderWithDefaults() {
        h hVar = new h();
        com.spotify.playlist.models.a.a().e();
        hVar.a(ImmutableList.of());
        return hVar;
    }

    public abstract com.spotify.playlist.models.a getHeader();
}

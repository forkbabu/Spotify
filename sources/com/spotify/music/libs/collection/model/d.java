package com.spotify.music.libs.collection.model;

import com.google.common.collect.ImmutableList;
import com.spotify.music.libs.collection.model.i;
import com.spotify.playlist.models.i;
import java.util.List;

public abstract class d implements i<com.spotify.playlist.models.a> {

    public interface a {
        a a(List<com.spotify.playlist.models.a> list);

        a b(int i);

        d build();

        a c(boolean z);

        a d(int i);
    }

    public static a a() {
        i.b bVar = new i.b();
        bVar.a(ImmutableList.of());
        bVar.d(0);
        bVar.b(0);
        bVar.c(false);
        return bVar;
    }

    public static a b() {
        return new i.b();
    }
}

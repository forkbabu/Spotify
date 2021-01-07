package com.spotify.music.features.podcast.episode.inspector.tracklist.model;

import com.google.common.collect.ImmutableList;
import com.spotify.music.features.podcast.episode.inspector.tracklist.model.b;
import java.util.List;

public abstract class d {

    public interface a {
        d build();

        a c(String str);

        a d(List<c> list);

        a e(boolean z);

        a f(List<String> list);

        a g(String str);
    }

    public static a b() {
        b.C0247b bVar = new b.C0247b();
        bVar.f(ImmutableList.of());
        return bVar;
    }

    public abstract List<String> a();

    public abstract boolean c();

    public abstract String d();

    public abstract String e();

    public abstract List<c> f();
}

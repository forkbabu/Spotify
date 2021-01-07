package com.spotify.music.features.podcast.episode.inspector.tracklist.model;

import com.spotify.music.features.podcast.episode.inspector.tracklist.model.a;
import java.util.List;

public abstract class c {

    public interface a {
        a a(String str);

        a b(long j);

        c build();

        a c(String str);

        a d(String str);

        a e(List<String> list);

        a f(String str);

        a g(boolean z);

        a h(String str);

        a i(String str);

        a j(String str);

        a k(String str);

        a l(long j);

        a m(TrackListItemType trackListItemType);
    }

    public static a b() {
        return new a.b();
    }

    public abstract List<String> a();

    public abstract long c();

    public abstract String d();

    public abstract String e();

    public abstract boolean f();

    public abstract String g();

    public abstract String h();

    public abstract String i();

    public abstract TrackListItemType j();

    public abstract long k();

    public abstract String l();

    public abstract String m();

    public abstract String n();
}

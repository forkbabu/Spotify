package com.spotify.music.features.yourlibraryx.effecthandlers;

import com.spotify.music.playlist.synchronizer.d;
import java.util.Set;
import kotlin.jvm.internal.h;

public final class c {
    private final d a;

    public c(d dVar) {
        h.e(dVar, "synchronizer");
        this.a = dVar;
    }

    public final void a(Set<String> set, Set<String> set2) {
        h.e(set, "previous");
        h.e(set2, "next");
        Set<String> Y = kotlin.collections.d.Y(set);
        Y.removeAll(set2);
        Set<String> Y2 = kotlin.collections.d.Y(set2);
        Y2.removeAll(set);
        for (String str : Y) {
            this.a.b(str);
        }
        for (String str2 : Y2) {
            this.a.a(str2);
        }
    }
}

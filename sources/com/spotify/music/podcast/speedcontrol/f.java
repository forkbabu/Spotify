package com.spotify.music.podcast.speedcontrol;

import com.google.common.collect.ImmutableList;

public final class f implements fjf<ImmutableList<Integer>> {
    private final wlf<g> a;

    public f(wlf<g> wlf) {
        this.a = wlf;
    }

    public static ImmutableList<Integer> a(Object obj) {
        ImmutableList<Integer> a2 = ((g) obj).a();
        yif.g(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}

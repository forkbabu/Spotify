package com.spotify.music.libs.mediabrowserservice;

import android.support.v4.media.session.MediaSessionCompat;
import java.util.Set;

public final class p2 implements fjf<o2> {
    private final wlf<MediaSessionCompat> a;
    private final wlf<Set<u1>> b;
    private final wlf<s1> c;
    private final wlf<RecentlyUsedComparator> d;

    public p2(wlf<MediaSessionCompat> wlf, wlf<Set<u1>> wlf2, wlf<s1> wlf3, wlf<RecentlyUsedComparator> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new o2(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}

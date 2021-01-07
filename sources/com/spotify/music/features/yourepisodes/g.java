package com.spotify.music.features.yourepisodes;

import com.spotify.music.podcastentityrow.b;
import com.spotify.music.podcastentityrow.m;
import kotlin.jvm.internal.h;

public final class g implements fjf<m> {

    /* access modifiers changed from: private */
    public static final class a {
        private static final g a = new g();
    }

    public static g a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        int i = m.k;
        b bVar = b.a;
        h.d(bVar, "MarkAsPlayedDelegate.NO_OP");
        return bVar;
    }
}

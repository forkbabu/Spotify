package com.spotify.music.podcast.freetierlikes.tabs.di;

import kotlin.Pair;
import kotlin.collections.d;

public final class m implements fjf<com.spotify.podcast.endpoints.collection.a> {

    /* access modifiers changed from: private */
    public static final class a {
        private static final m a = new m();
    }

    public static m a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new com.spotify.podcast.endpoints.collection.a(d.x(new Pair("artists", Boolean.TRUE)));
    }
}

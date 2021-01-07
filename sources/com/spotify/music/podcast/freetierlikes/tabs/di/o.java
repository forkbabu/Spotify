package com.spotify.music.podcast.freetierlikes.tabs.di;

import com.spotify.podcast.endpoints.collection.b;
import kotlin.Pair;
import kotlin.collections.d;

public final class o implements fjf<b> {

    /* access modifiers changed from: private */
    public static final class a {
        private static final o a = new o();
    }

    public static o a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        Boolean bool = Boolean.TRUE;
        return new b(d.y(new Pair("name", bool), new Pair("link", bool), new Pair("inCollection", bool), new Pair("covers", bool)));
    }
}

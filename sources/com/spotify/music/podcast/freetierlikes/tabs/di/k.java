package com.spotify.music.podcast.freetierlikes.tabs.di;

import java.util.Map;
import kotlin.Pair;
import kotlin.collections.d;

public final class k implements fjf<Map<String, Boolean>> {

    /* access modifiers changed from: private */
    public static final class a {
        private static final k a = new k();
    }

    public static k a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        Boolean bool = Boolean.TRUE;
        return d.y(new Pair("link", bool), new Pair("name", bool), new Pair("offline", bool), new Pair("isNew", bool), new Pair("isInListenLater", bool), new Pair("isPlayed", bool), new Pair("length", bool), new Pair("timeLeft", bool), new Pair("playable", bool), new Pair("available", bool), new Pair("covers", bool), new Pair("isExplicit", bool), new Pair("covers", bool), new Pair("isExplicit", bool), new Pair("freezeFrames", bool), new Pair("manifestId", bool), new Pair("mediaTypeEnum", bool), new Pair("description", bool), new Pair("publishDate", bool), new Pair("addTime", bool), new Pair("syncProgress", bool));
    }
}

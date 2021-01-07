package com.spotify.music.podcast.freetierlikes.tabs.followed;

import com.spotify.podcast.endpoints.c0;
import io.reactivex.s;
import kotlin.jvm.internal.h;

public final class n implements m {
    private final c0 a;
    private final String b;
    private final c0.a c;

    public n(c0 c0Var, String str, c0.a aVar) {
        h.e(c0Var, "showsEndpoint");
        h.e(str, "username");
        h.e(aVar, "configuration");
        this.a = c0Var;
        this.b = str;
        this.c = aVar;
    }

    @Override // com.spotify.music.podcast.freetierlikes.tabs.followed.m
    public s<ryd> a() {
        return this.a.a(this.b, this.c);
    }
}

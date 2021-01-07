package com.spotify.voice.results.impl;

import com.spotify.voice.results.model.e;
import io.reactivex.g;
import io.reactivex.y;

public final class f {
    private final wlf<g<ugf>> a;
    private final wlf<qg0<String>> b;
    private final wlf<com.spotify.voice.results.model.g> c;
    private final wlf<com.spotify.player.play.f> d;
    private final wlf<y> e;
    private final wlf<y> f;

    public f(wlf<g<ugf>> wlf, wlf<qg0<String>> wlf2, wlf<com.spotify.voice.results.model.g> wlf3, wlf<com.spotify.player.play.f> wlf4, wlf<y> wlf5, wlf<y> wlf6) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
        a(wlf3, 3);
        this.c = wlf3;
        a(wlf4, 4);
        this.d = wlf4;
        a(wlf5, 5);
        this.e = wlf5;
        a(wlf6, 6);
        this.f = wlf6;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public d b(e eVar, h hVar) {
        g<ugf> gVar = this.a.get();
        a(gVar, 1);
        g<ugf> gVar2 = gVar;
        qg0<String> qg0 = this.b.get();
        a(qg0, 2);
        qg0<String> qg02 = qg0;
        com.spotify.voice.results.model.g gVar3 = this.c.get();
        a(gVar3, 3);
        com.spotify.voice.results.model.g gVar4 = gVar3;
        com.spotify.player.play.f fVar = this.d.get();
        a(fVar, 4);
        com.spotify.player.play.f fVar2 = fVar;
        y yVar = this.e.get();
        a(yVar, 5);
        y yVar2 = yVar;
        y yVar3 = this.f.get();
        a(yVar3, 6);
        a(eVar, 7);
        a(hVar, 8);
        return new d(gVar2, qg02, gVar4, fVar2, yVar2, yVar3, eVar, hVar);
    }
}

package com.spotify.music.features.playlistentity.header;

import com.google.common.base.Optional;
import com.spotify.music.features.playlistentity.configuration.g;
import com.spotify.music.features.playlistentity.w;
import com.spotify.music.navigation.t;
import io.reactivex.y;

/* access modifiers changed from: package-private */
public class s0 {
    private final wlf<o0> a;
    private final wlf<t> b;
    private final wlf<u0> c;
    private final wlf<w> d;
    private final wlf<String> e;
    private final wlf<y> f;
    private final wlf<h0> g;
    private final wlf<k0> h;

    s0(wlf<o0> wlf, wlf<t> wlf2, wlf<u0> wlf3, wlf<w> wlf4, wlf<String> wlf5, wlf<y> wlf6, wlf<h0> wlf7, wlf<k0> wlf8) {
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
        a(wlf7, 7);
        this.g = wlf7;
        a(wlf8, 8);
        this.h = wlf8;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    /* access modifiers changed from: package-private */
    public r0 b(g gVar, Optional<v0> optional) {
        o0 o0Var = this.a.get();
        a(o0Var, 1);
        o0 o0Var2 = o0Var;
        t tVar = this.b.get();
        a(tVar, 2);
        t tVar2 = tVar;
        u0 u0Var = this.c.get();
        a(u0Var, 3);
        u0 u0Var2 = u0Var;
        w wVar = this.d.get();
        a(wVar, 4);
        w wVar2 = wVar;
        String str = this.e.get();
        a(str, 5);
        String str2 = str;
        y yVar = this.f.get();
        a(yVar, 6);
        y yVar2 = yVar;
        h0 h0Var = this.g.get();
        a(h0Var, 7);
        h0 h0Var2 = h0Var;
        k0 k0Var = this.h.get();
        a(k0Var, 8);
        a(gVar, 9);
        a(optional, 10);
        return new r0(o0Var2, tVar2, u0Var2, wVar2, str2, yVar2, h0Var2, k0Var, gVar, optional);
    }
}

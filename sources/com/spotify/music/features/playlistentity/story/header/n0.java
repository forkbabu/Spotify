package com.spotify.music.features.playlistentity.story.header;

import com.spotify.music.features.playlistentity.w;
import com.spotify.playlist.endpoints.v;
import io.reactivex.y;
import io.reactivex.z;

/* access modifiers changed from: package-private */
public class n0 {
    private final wlf<vfa> a;
    private final wlf<h0> b;
    private final wlf<v> c;
    private final wlf<k0> d;
    private final wlf<w> e;
    private final wlf<String> f;
    private final wlf<y> g;
    private final wlf<y> h;
    private final wlf<g0> i;
    private final wlf<Integer> j;
    private final wlf<z<p62>> k;

    n0(wlf<vfa> wlf, wlf<h0> wlf2, wlf<v> wlf3, wlf<k0> wlf4, wlf<w> wlf5, wlf<String> wlf6, wlf<y> wlf7, wlf<y> wlf8, wlf<g0> wlf9, wlf<Integer> wlf10, wlf<z<p62>> wlf11) {
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
        a(wlf9, 9);
        this.i = wlf9;
        a(wlf10, 10);
        this.j = wlf10;
        a(wlf11, 11);
        this.k = wlf11;
    }

    private static <T> T a(T t, int i2) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i2));
    }

    /* access modifiers changed from: package-private */
    public m0 b(f0 f0Var) {
        vfa vfa = this.a.get();
        a(vfa, 1);
        vfa vfa2 = vfa;
        h0 h0Var = this.b.get();
        a(h0Var, 2);
        h0 h0Var2 = h0Var;
        v vVar = this.c.get();
        a(vVar, 3);
        v vVar2 = vVar;
        k0 k0Var = this.d.get();
        a(k0Var, 4);
        k0 k0Var2 = k0Var;
        w wVar = this.e.get();
        a(wVar, 5);
        w wVar2 = wVar;
        String str = this.f.get();
        a(str, 6);
        String str2 = str;
        y yVar = this.g.get();
        a(yVar, 7);
        y yVar2 = yVar;
        y yVar3 = this.h.get();
        a(yVar3, 8);
        y yVar4 = yVar3;
        g0 g0Var = this.i.get();
        a(g0Var, 9);
        g0 g0Var2 = g0Var;
        Integer num = this.j.get();
        a(num, 10);
        int intValue = num.intValue();
        z<p62> zVar = this.k.get();
        a(zVar, 11);
        a(f0Var, 12);
        return new m0(vfa2, h0Var2, vVar2, k0Var2, wVar2, str2, yVar2, yVar4, g0Var2, intValue, zVar, f0Var);
    }
}

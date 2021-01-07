package defpackage;

import com.spotify.music.connection.g;
import io.reactivex.functions.c;
import io.reactivex.k;
import io.reactivex.s;
import io.reactivex.w;

/* renamed from: a4b  reason: default package */
public final class a4b implements fjf<z3b> {
    private final wlf<s<g>> a;
    private final wlf<s<d5b>> b;
    private final wlf<r4b> c;
    private final wlf<c<b91, b91, b91>> d;
    private final wlf<sg0<b91, b91>> e;
    private final wlf<h1e<b91>> f;
    private final wlf<w<b91, b91>> g;
    private final wlf<k<b91, b91>> h;
    private final wlf<String> i;
    private final wlf<u7b> j;

    public a4b(wlf<s<g>> wlf, wlf<s<d5b>> wlf2, wlf<r4b> wlf3, wlf<c<b91, b91, b91>> wlf4, wlf<sg0<b91, b91>> wlf5, wlf<h1e<b91>> wlf6, wlf<w<b91, b91>> wlf7, wlf<k<b91, b91>> wlf8, wlf<String> wlf9, wlf<u7b> wlf10) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
        this.i = wlf9;
        this.j = wlf10;
    }

    public static a4b a(wlf<s<g>> wlf, wlf<s<d5b>> wlf2, wlf<r4b> wlf3, wlf<c<b91, b91, b91>> wlf4, wlf<sg0<b91, b91>> wlf5, wlf<h1e<b91>> wlf6, wlf<w<b91, b91>> wlf7, wlf<k<b91, b91>> wlf8, wlf<String> wlf9, wlf<u7b> wlf10) {
        return new a4b(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7, wlf8, wlf9, wlf10);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new z3b(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get());
    }
}

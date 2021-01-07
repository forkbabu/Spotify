package defpackage;

import com.spotify.music.connection.g;
import io.reactivex.functions.c;
import io.reactivex.functions.l;
import io.reactivex.k;
import io.reactivex.s;
import io.reactivex.w;

/* renamed from: m4b  reason: default package */
public final class m4b implements fjf<x3b> {
    private final wlf<s<g>> a;
    private final wlf<s<d5b>> b;
    private final wlf<l<a7b, io.reactivex.g<b91>>> c;
    private final wlf<sg0<b91, b91>> d;
    private final wlf<w<b91, b91>> e;
    private final wlf<k<b91, b91>> f;
    private final wlf<a8b> g;
    private final wlf<h1e<b91>> h;
    private final wlf<c<b91, b91, b91>> i;
    private final wlf<v7b> j;

    public m4b(wlf<s<g>> wlf, wlf<s<d5b>> wlf2, wlf<l<a7b, io.reactivex.g<b91>>> wlf3, wlf<sg0<b91, b91>> wlf4, wlf<w<b91, b91>> wlf5, wlf<k<b91, b91>> wlf6, wlf<a8b> wlf7, wlf<h1e<b91>> wlf8, wlf<c<b91, b91, b91>> wlf9, wlf<v7b> wlf10) {
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

    public static m4b a(wlf<s<g>> wlf, wlf<s<d5b>> wlf2, wlf<l<a7b, io.reactivex.g<b91>>> wlf3, wlf<sg0<b91, b91>> wlf4, wlf<w<b91, b91>> wlf5, wlf<k<b91, b91>> wlf6, wlf<a8b> wlf7, wlf<h1e<b91>> wlf8, wlf<c<b91, b91, b91>> wlf9, wlf<v7b> wlf10) {
        return new m4b(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7, wlf8, wlf9, wlf10);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new x3b(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get());
    }
}

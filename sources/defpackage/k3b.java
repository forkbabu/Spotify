package defpackage;

import com.spotify.music.connection.g;
import com.spotify.music.libs.restrictedcontent.transformer.h;
import io.reactivex.s;

/* renamed from: k3b  reason: default package */
public final class k3b implements fjf<j3b> {
    private final wlf<s<g>> a;
    private final wlf<s<d5b>> b;
    private final wlf<y4b> c;
    private final wlf<u4b> d;
    private final wlf<qqa> e;
    private final wlf<sg0<b91, b91>> f;
    private final wlf<h1e<b91>> g;
    private final wlf<ch3> h;
    private final wlf<h> i;
    private final wlf<h1e<b91>> j;
    private final wlf<String> k;

    public k3b(wlf<s<g>> wlf, wlf<s<d5b>> wlf2, wlf<y4b> wlf3, wlf<u4b> wlf4, wlf<qqa> wlf5, wlf<sg0<b91, b91>> wlf6, wlf<h1e<b91>> wlf7, wlf<ch3> wlf8, wlf<h> wlf9, wlf<h1e<b91>> wlf10, wlf<String> wlf11) {
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
        this.k = wlf11;
    }

    public static k3b a(wlf<s<g>> wlf, wlf<s<d5b>> wlf2, wlf<y4b> wlf3, wlf<u4b> wlf4, wlf<qqa> wlf5, wlf<sg0<b91, b91>> wlf6, wlf<h1e<b91>> wlf7, wlf<ch3> wlf8, wlf<h> wlf9, wlf<h1e<b91>> wlf10, wlf<String> wlf11) {
        return new k3b(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7, wlf8, wlf9, wlf10, wlf11);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new j3b(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get());
    }
}

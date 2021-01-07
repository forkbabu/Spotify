package defpackage;

import com.spotify.music.connection.g;
import io.reactivex.BackpressureStrategy;
import io.reactivex.functions.c;
import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.k;
import io.reactivex.s;
import io.reactivex.w;

/* renamed from: x3b  reason: default package */
public class x3b {
    private final g<com.spotify.music.connection.g> a;
    private final g<d5b> b;
    private final l<a7b, g<b91>> c;
    private final q6b d = new q6b();
    private final sg0<b91, b91> e;
    private final w<b91, b91> f;
    private final k<b91, b91> g;
    private final a8b h;
    private final h1e<b91> i;
    private final c<b91, b91, b91> j;
    private final v7b k;

    public x3b(s<com.spotify.music.connection.g> sVar, s<d5b> sVar2, l<a7b, g<b91>> lVar, sg0<b91, b91> sg0, w<b91, b91> wVar, k<b91, b91> kVar, a8b a8b, h1e<b91> h1e, c<b91, b91, b91> cVar, v7b v7b) {
        BackpressureStrategy backpressureStrategy = BackpressureStrategy.LATEST;
        this.a = sVar.Y0(backpressureStrategy);
        this.b = sVar2.Y0(backpressureStrategy);
        this.c = lVar;
        sg0.getClass();
        this.e = sg0;
        this.f = wVar;
        this.g = kVar;
        this.h = a8b;
        h1e.getClass();
        this.i = h1e;
        this.j = cVar;
        this.k = v7b;
    }

    public Boolean a(a7b a7b, a7b a7b2, a7b a7b3) {
        q6b q6b = this.d;
        String g2 = a7b.c().g();
        com.spotify.music.connection.g a2 = a7b.a();
        a2.getClass();
        p6b a3 = p6b.a(g2, a2 instanceof g.c);
        String g3 = a7b2.c().g();
        com.spotify.music.connection.g a4 = a7b2.a();
        a4.getClass();
        p6b a5 = p6b.a(g3, a4 instanceof g.c);
        String g4 = a7b3.c().g();
        com.spotify.music.connection.g a6 = a7b3.a();
        a6.getClass();
        return q6b.a(a3, a5, p6b.a(g4, a6 instanceof g.c));
    }

    public Boolean b(a7b a7b, a7b a7b2, a7b a7b3) {
        q6b q6b = this.d;
        String g2 = a7b.c().g();
        com.spotify.music.connection.g a2 = a7b.a();
        a2.getClass();
        p6b a3 = p6b.a(g2, a2 instanceof g.c);
        String g3 = a7b2.c().g();
        com.spotify.music.connection.g a4 = a7b2.a();
        a4.getClass();
        p6b a5 = p6b.a(g3, a4 instanceof g.c);
        String g4 = a7b3.c().g();
        com.spotify.music.connection.g a6 = a7b3.a();
        a6.getClass();
        return q6b.a(a3, a5, p6b.a(g4, a6 instanceof g.c));
    }

    public io.reactivex.g<b91> c(io.reactivex.g<b7b> gVar) {
        io.reactivex.g l = new v(io.reactivex.g.j(gVar, this.b.O(m1b.a), this.a, z1b.a).l(new c3b(this.c, new b2b(this))).s()).q(this.f).q(this.h).Y0(BackpressureStrategy.BUFFER).l(this.g);
        sg0<b91, b91> sg0 = this.e;
        sg0.getClass();
        return l.O(new a3b(sg0)).l(this.i);
    }

    public io.reactivex.g<b91> d(io.reactivex.g<b7b> gVar, io.reactivex.g<y6b> gVar2, b91 b91) {
        io.reactivex.g l = new v(io.reactivex.g.k(gVar, gVar2, this.b.O(m1b.a), this.a, a2b.a).l(new c3b(this.c, new c2b(this))).Y(b91, this.j).O(this.k).s()).q(this.f).q(this.h).Y0(BackpressureStrategy.BUFFER).l(this.g);
        sg0<b91, b91> sg0 = this.e;
        sg0.getClass();
        return l.O(new a3b(sg0)).l(this.i);
    }
}

package defpackage;

import com.spotify.music.connection.g;
import com.spotify.music.libs.restrictedcontent.transformer.h;
import io.reactivex.BackpressureStrategy;
import io.reactivex.g;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.s;

/* renamed from: j3b  reason: default package */
public class j3b {
    private final g<com.spotify.music.connection.g> a;
    private final g<d5b> b;
    private final y4b c;
    private final u4b d;
    private final qqa e;
    private final sg0<b91, b91> f;
    private final h1e<b91> g;
    private final h h;
    private final h1e<b91> i;
    private final String j;
    private final ch3 k;

    j3b(s<com.spotify.music.connection.g> sVar, s<d5b> sVar2, y4b y4b, u4b u4b, qqa qqa, sg0<b91, b91> sg0, h1e<b91> h1e, ch3 ch3, h hVar, h1e<b91> h1e2, String str) {
        sVar.getClass();
        BackpressureStrategy backpressureStrategy = BackpressureStrategy.LATEST;
        this.a = sVar.Y0(backpressureStrategy);
        sVar2.getClass();
        this.b = sVar2.Y0(backpressureStrategy);
        y4b.getClass();
        this.c = y4b;
        u4b.getClass();
        this.d = u4b;
        qqa.getClass();
        this.e = qqa;
        sg0.getClass();
        this.f = sg0;
        this.g = h1e;
        this.k = ch3;
        this.h = hVar;
        this.i = h1e2;
        this.j = str;
    }

    public /* synthetic */ a7b a(y6b y6b, String str, com.spotify.music.connection.g gVar) {
        return a7b.b(z6b.a(y6b, this.j, str), gVar);
    }

    public /* synthetic */ g b(a7b a7b, g.c cVar) {
        return this.c.apply(a7b);
    }

    public /* synthetic */ io.reactivex.g c(a7b a7b, g.b bVar) {
        return io.reactivex.g.N(this.e.c(a7b.c().g()));
    }

    public /* synthetic */ io.reactivex.g d(g.a aVar) {
        return io.reactivex.g.N(this.e.e());
    }

    public io.reactivex.g<b91> e(io.reactivex.g<y6b> gVar, b91 b91) {
        io.reactivex.g s = new v(io.reactivex.g.j(gVar, this.b.O(m1b.a), this.a, new p1b(this)).F(new n1b(this))).q(this.k).Y0(BackpressureStrategy.BUFFER).l(this.h).Y(b91, this.d).s();
        sg0<b91, b91> sg0 = this.f;
        sg0.getClass();
        return s.O(new a3b(sg0)).l(this.g).l(this.i);
    }
}

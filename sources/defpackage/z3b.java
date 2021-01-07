package defpackage;

import com.spotify.music.connection.g;
import io.reactivex.BackpressureStrategy;
import io.reactivex.functions.c;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.k;
import io.reactivex.s;
import io.reactivex.w;

/* renamed from: z3b  reason: default package */
public class z3b implements y3b {
    private final s<g> a;
    private final s<d5b> b;
    private final r4b c;
    private final c<b91, b91, b91> d;
    private final sg0<b91, b91> e;
    private final h1e<b91> f;
    private final k<b91, b91> g;
    private final String h;
    private final w<b91, b91> i;
    private final u7b j;

    z3b(s<g> sVar, s<d5b> sVar2, r4b r4b, c<b91, b91, b91> cVar, sg0<b91, b91> sg0, h1e<b91> h1e, w<b91, b91> wVar, k<b91, b91> kVar, String str, u7b u7b) {
        this.a = sVar;
        this.b = sVar2;
        this.c = r4b;
        this.d = cVar;
        this.e = sg0;
        this.f = h1e;
        this.i = wVar;
        this.g = kVar;
        this.h = str;
        this.j = u7b;
    }

    public static s b(z3b z3b, a7b a7b) {
        return z3b.c.a(z3b.j.a(a7b.c()), a7b.a());
    }

    @Override // defpackage.y3b
    public s<b91> a(s<y6b> sVar, b91 b91) {
        io.reactivex.g l = s.m(sVar, this.b.j0(m1b.a), this.a, new e2b(this)).W(new d2b(this), false, Integer.MAX_VALUE).y0(b91, this.d).E().q(this.i).Y0(BackpressureStrategy.BUFFER).l(this.g);
        sg0<b91, b91> sg0 = this.e;
        sg0.getClass();
        io.reactivex.g l2 = l.O(new a3b(sg0)).l(this.f);
        l2.getClass();
        return new v(l2);
    }

    public /* synthetic */ a7b c(y6b y6b, String str, g gVar) {
        return a7b.b(z6b.a(y6b, this.h, str), gVar);
    }
}

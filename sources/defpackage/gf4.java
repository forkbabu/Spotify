package defpackage;

import com.spotify.music.connection.g;
import com.spotify.music.connection.l;
import io.reactivex.BackpressureStrategy;
import io.reactivex.functions.c;
import io.reactivex.g;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.s;

/* renamed from: gf4  reason: default package */
public class gf4 {
    private final l a;
    private final s<we4> b;
    private final qf4 c;
    private final of4 d;
    private final ue4 e;
    private final h1e<b91> f;
    private final c<b91, b91, b91> g;
    private final b91 h;

    gf4(l lVar, s<we4> sVar, qf4 qf4, of4 of4, ue4 ue4, h1e<b91> h1e, c<b91, b91, b91> cVar, b91 b91) {
        this.a = lVar;
        this.b = sVar;
        this.c = qf4;
        this.d = of4;
        this.e = ue4;
        this.f = h1e;
        this.g = cVar;
        this.h = b91;
    }

    public static g a(gf4 gf4, me4 me4) {
        gf4.getClass();
        com.spotify.music.connection.g b2 = me4.b();
        return ((g) b2.a(new ad4(gf4, me4), new cd4(gf4), new bd4(gf4))).O(new ed4(b2, me4.a())).l(gf4.e);
    }

    public /* synthetic */ g b(me4 me4, g.c cVar) {
        return this.c.c(me4);
    }

    public /* synthetic */ io.reactivex.g c(g.b bVar) {
        return this.d.a(bVar.d()).u();
    }

    public /* synthetic */ io.reactivex.g d(g.a aVar) {
        return io.reactivex.g.N(this.h);
    }

    public io.reactivex.g<b91> e(b91 b91) {
        io.reactivex.g<com.spotify.music.connection.g> Y0 = this.a.a().Y0(BackpressureStrategy.BUFFER);
        s<we4> sVar = this.b;
        BackpressureStrategy backpressureStrategy = BackpressureStrategy.LATEST;
        return new v(io.reactivex.g.i(Y0, sVar.Y0(backpressureStrategy), wd4.a).F(new dd4(this)).l(this.f).Y(b91, this.g)).Y0(backpressureStrategy).s();
    }
}

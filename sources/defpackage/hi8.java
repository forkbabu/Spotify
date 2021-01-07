package defpackage;

import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.extras.b;
import com.spotify.mobius.rx2.i;
import com.spotify.mobius.rx2.m;
import com.spotify.mobius.z;
import com.spotify.music.navigation.t;
import defpackage.wi8;
import io.reactivex.s;

/* renamed from: hi8  reason: default package */
public class hi8 {
    private MobiusLoop.g<yi8, xi8> a;
    private ei8 b;
    private final s<Boolean> c;
    private final t d;
    private final ji8 e;
    private final ws3 f;
    private final li8 g;
    private final us3 h;
    private final cqe i;
    wb2 j;

    public hi8(us3 us3, t tVar, s<Boolean> sVar, ji8 ji8, li8 li8, ws3 ws3, cqe cqe) {
        this.h = us3;
        this.d = tVar;
        this.e = ji8;
        this.f = ws3;
        this.g = li8;
        this.i = cqe;
        this.c = sVar;
    }

    public void a(ei8 ei8) {
        this.b = ei8;
        ei8.h(this.e);
        this.b.i(this.h);
    }

    public void b() {
        MobiusLoop.g<yi8, xi8> gVar = this.a;
        if (gVar != null && gVar.isRunning()) {
            this.a.stop();
            this.a.d();
        }
    }

    public void c() {
        MobiusLoop.g<yi8, xi8> gVar = this.a;
        if (gVar != null && gVar.isRunning()) {
            this.a.stop();
            this.a.d();
        }
        if (this.f.c()) {
            di8 di8 = di8.a;
            t tVar = this.d;
            wb2 wb2 = this.j;
            li8 li8 = this.g;
            m f2 = i.f();
            f2.d(wi8.a.class, new ni8(wb2));
            f2.d(wi8.c.class, new oi8(tVar, li8));
            f2.d(wi8.b.class, new pi8(li8));
            MobiusLoop.f c2 = i.c(di8, f2.i());
            cqe cqe = this.i;
            ji8 ji8 = this.e;
            s<Boolean> sVar = this.c;
            wb2 wb22 = this.j;
            MobiusLoop.g<yi8, xi8> b2 = z.b(c2.h(i.a(s.m0(ji8.b(), sVar.Q(bi8.a).j0(new zh8(cqe)), wb22.a().Q(yh8.a).j0(ai8.a), wb22.a().Q(ci8.a).j0(xh8.a)))).f(b.g("[bookmark reminder]")), yi8.a(this.h.b(), this.h.a(), this.h.d(), false, this.h.c()), u92.b());
            this.a = b2;
            b2.c(this.b);
            this.a.start();
        }
    }
}

package defpackage;

import com.spotify.mobius.rx2.i;
import com.spotify.mobius.rx2.m;
import com.spotify.signup.splitflow.views.j;
import com.spotify.signup.splitflow.views.k;
import com.spotify.signup.splitflow.views.l;
import com.spotify.signup.splitflow.w1;
import defpackage.nhe;
import io.reactivex.android.schedulers.a;
import io.reactivex.w;

/* renamed from: bie  reason: default package */
public class bie {
    private final gie a;
    private final w1 b;
    private final k c;
    private final sie d;
    private final xje e;
    private final l f;

    public bie(gie gie, w1 w1Var, k kVar, sie sie, xje xje, l lVar) {
        this.a = gie;
        this.b = w1Var;
        this.c = kVar;
        this.d = sie;
        this.e = xje;
        this.f = lVar;
    }

    public static void e(bie bie, nhe.a aVar) {
        bie.e.a(aVar.a());
    }

    public w<nhe, ohe> a() {
        m f2 = i.f();
        k kVar = this.c;
        kVar.getClass();
        f2.c(nhe.b.class, new zhe(kVar), a.b());
        sie sie = this.d;
        sie.getClass();
        f2.c(nhe.d.class, new aie(sie), a.b());
        f2.e(nhe.f.class, new uhe(this), a.b());
        f2.e(nhe.e.class, new the(this), a.b());
        f2.d(nhe.c.class, new rhe(this));
        f2.e(nhe.a.class, new xhe(this), a.b());
        f2.h(nhe.g.class, new whe(this.a));
        return f2.i();
    }

    public /* synthetic */ void b(nhe.f fVar) {
        ((j) this.f).i(fVar.a());
    }

    public /* synthetic */ void c(nhe.e eVar) {
        this.d.a(eVar.a());
    }

    public void d(nhe.c cVar) {
        this.b.d();
    }
}

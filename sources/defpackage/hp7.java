package defpackage;

import com.spotify.mobius.e0;
import defpackage.ct7;
import defpackage.lp7;
import defpackage.mp7;
import defpackage.np7;
import kotlin.jvm.internal.h;

/* renamed from: hp7  reason: default package */
public final /* synthetic */ class hp7 implements nmf {
    public final /* synthetic */ np7 a;

    public /* synthetic */ hp7(np7 np7) {
        this.a = np7;
    }

    @Override // defpackage.nmf
    public final Object invoke(Object obj) {
        np7 np7 = this.a;
        mp7.a aVar = (mp7.a) obj;
        if (np7.c().isEmpty()) {
            np7.a n = np7.n();
            n.d(aVar.a().r());
            n.h(aVar.a().o());
            n.g(aVar.a().n());
            np7 = n.a();
        }
        ct7.a g = ct7.a.g();
        g.d(aVar.a().p());
        g.c(aVar.a().l());
        g.e(aVar.a().m());
        ct7 a2 = g.a();
        np7.a n2 = np7.n();
        n2.p(aVar.a().q());
        n2.e(aVar.a().i());
        n2.m(aVar.a().u());
        n2.k(aVar.a().v());
        n2.f(a2);
        n2.l(aVar.a().t());
        n2.j(aVar.a().s());
        n2.b(aVar.a().h());
        np7 a3 = n2.a();
        String o = a3.o();
        h.e(o, "username");
        h.e(a2, "baseFollowState");
        return e0.g(a3, z42.l(new lp7.c(o, a2)));
    }
}

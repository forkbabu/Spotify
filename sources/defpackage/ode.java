package defpackage;

import com.spotify.mobius.e0;
import defpackage.gee;
import defpackage.iee;
import defpackage.mbe;
import defpackage.wie;

/* renamed from: ode  reason: default package */
public final /* synthetic */ class ode implements ti0 {
    public final /* synthetic */ kee a;

    public /* synthetic */ ode(kee kee) {
        this.a = kee;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        kee kee = this.a;
        iee.v vVar = (iee.v) obj;
        gee n = kee.n();
        n.getClass();
        if (n instanceof gee.b) {
            return e0.h();
        }
        boolean k = vVar.y().k();
        boolean equals = vVar.y().f().equals("KR");
        gee.b bVar = new gee.b(vVar.y());
        mbe.b bVar2 = (mbe.b) kee.o();
        bVar2.l(bVar);
        kee c = bVar2.c();
        tae i = kee.a().i(uae.c());
        mbe.b bVar3 = (mbe.b) c.o();
        bVar3.a(i);
        kee u = bVar3.c().s(kee.f().g(vVar.y().e()).f(false)).u(kee.j().l(equals).n(k).o(vVar.y().j()));
        if (kee.i()) {
            wie b = kee.f().b();
            b.getClass();
            if (!(b instanceof wie.c)) {
                u = u.v(kee.k() + 1);
            }
        }
        return e0.f(u);
    }
}

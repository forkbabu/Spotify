package defpackage;

import com.spotify.mobius.e0;
import defpackage.oke;
import defpackage.pke;
import defpackage.qke;

/* renamed from: jke  reason: default package */
public final /* synthetic */ class jke implements ti0 {
    public final /* synthetic */ pke a;

    public /* synthetic */ jke(pke pke) {
        this.a = pke;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        pke pke = this.a;
        oke.a aVar = (oke.a) obj;
        String g = aVar.g();
        if (!pke.b().equals(g)) {
            return e0.h();
        }
        int ordinal = aVar.h().ordinal();
        if (ordinal == 0) {
            pke f = pke.f(true);
            qke.e eVar = new qke.e(g);
            pke.a e = f.e();
            e.c(eVar);
            return e0.f(e.a());
        } else if (ordinal == 1) {
            qke.h hVar = new qke.h(g);
            pke.a e2 = pke.e();
            e2.c(hVar);
            return e0.f(e2.a());
        } else if (ordinal == 2) {
            pke f2 = pke.f(true);
            qke.i iVar = new qke.i(g);
            pke.a e3 = f2.e();
            e3.c(iVar);
            return e0.f(e3.a());
        } else if (ordinal == 3) {
            qke.b bVar = new qke.b();
            pke.a e4 = pke.e();
            e4.c(bVar);
            return e0.f(e4.a());
        } else if (ordinal != 4) {
            return e0.h();
        } else {
            qke.d dVar = new qke.d(g);
            pke.a e5 = pke.e();
            e5.c(dVar);
            return e0.f(e5.a());
        }
    }
}

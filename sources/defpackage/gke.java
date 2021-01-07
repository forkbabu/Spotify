package defpackage;

import com.spotify.mobius.e0;
import defpackage.nke;
import defpackage.oke;
import defpackage.pke;
import defpackage.qke;

/* renamed from: gke  reason: default package */
public final /* synthetic */ class gke implements ti0 {
    public final /* synthetic */ pke a;

    public /* synthetic */ gke(pke pke) {
        this.a = pke;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        pke pke = this.a;
        oke.d dVar = (oke.d) obj;
        if (dVar.h().c()) {
            qke.g gVar = new qke.g(dVar.g());
            pke.a e = pke.e();
            e.c(gVar);
            return e0.g(e.a(), z42.l(new nke.b()));
        } else if (dVar.h().b()) {
            qke.a aVar = new qke.a(dVar.g());
            pke.a e2 = pke.e();
            e2.c(aVar);
            return e0.f(e2.a());
        } else {
            qke.c cVar = new qke.c(dVar.g(), dVar.h().a());
            pke.a e3 = pke.e();
            e3.c(cVar);
            return e0.f(e3.a());
        }
    }
}

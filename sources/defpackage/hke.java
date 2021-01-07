package defpackage;

import com.google.common.base.MoreObjects;
import com.spotify.mobius.e0;
import defpackage.nke;
import defpackage.oke;
import defpackage.pke;
import defpackage.qke;

/* renamed from: hke  reason: default package */
public final /* synthetic */ class hke implements ti0 {
    public final /* synthetic */ pke a;

    public /* synthetic */ hke(pke pke) {
        this.a = pke;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        pke pke = this.a;
        String g = ((oke.b) obj).g();
        if (MoreObjects.isNullOrEmpty(g)) {
            qke.b bVar = new qke.b();
            pke.a e = pke.e();
            e.c(bVar);
            return e0.f(e.a());
        }
        qke.d dVar = new qke.d(g);
        pke.a e2 = pke.e();
        e2.c(dVar);
        return e0.g(e2.a(), z42.l(new nke.a(g)));
    }
}

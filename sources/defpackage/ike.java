package defpackage;

import com.spotify.mobius.e0;
import defpackage.nke;
import defpackage.oke;
import defpackage.pke;
import defpackage.qke;

/* renamed from: ike  reason: default package */
public final /* synthetic */ class ike implements ti0 {
    public final /* synthetic */ pke a;

    public /* synthetic */ ike(pke pke) {
        this.a = pke;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        pke pke = this.a;
        oke.c cVar = (oke.c) obj;
        qke c = pke.c();
        c.getClass();
        if (c instanceof qke.g) {
            return e0.a(z42.l(new nke.b()));
        }
        qke c2 = pke.c();
        c2.getClass();
        if (!(c2 instanceof qke.e)) {
            qke c3 = pke.c();
            c3.getClass();
            if (!(c3 instanceof qke.a)) {
                return e0.f(pke.f(true));
            }
        }
        qke.f fVar = new qke.f(pke.b());
        pke.a e = pke.e();
        e.c(fVar);
        return e0.g(e.a(), z42.l(new nke.c(pke.b())));
    }
}

package defpackage;

import com.spotify.mobius.e0;
import defpackage.nhe;
import defpackage.ohe;
import defpackage.phe;
import defpackage.qhe;

/* renamed from: xge  reason: default package */
public final /* synthetic */ class xge implements ti0 {
    public final /* synthetic */ phe a;

    public /* synthetic */ xge(phe phe) {
        this.a = phe;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        phe phe = this.a;
        ohe.g gVar = (ohe.g) obj;
        if (!(!phe.a().equals(gVar.k()))) {
            qhe b = phe.b();
            b.getClass();
            if (b instanceof qhe.c) {
                qhe.f fVar = new qhe.f(gVar.k());
                phe.a e = phe.e();
                e.b(fVar);
                return e0.g(e.a(), z42.l(new nhe.g(gVar.k(), false)));
            }
        }
        return e0.h();
    }
}

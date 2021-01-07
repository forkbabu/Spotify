package defpackage;

import com.spotify.mobius.e0;
import defpackage.nhe;
import defpackage.ohe;
import defpackage.phe;
import defpackage.qhe;

/* renamed from: bhe  reason: default package */
public final /* synthetic */ class bhe implements ti0 {
    public final /* synthetic */ phe a;

    public /* synthetic */ bhe(phe phe) {
        this.a = phe;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        phe phe = this.a;
        ohe.c cVar = (ohe.c) obj;
        qhe.f fVar = new qhe.f(cVar.k());
        phe.a e = phe.e();
        e.b(fVar);
        return e0.g(e.a(), z42.l(new nhe.e(cVar.k()), new nhe.d(), new nhe.g(cVar.k(), true)));
    }
}

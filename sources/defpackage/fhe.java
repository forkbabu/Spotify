package defpackage;

import com.spotify.mobius.e0;
import defpackage.hie;
import defpackage.nhe;
import defpackage.ohe;
import defpackage.phe;
import defpackage.qhe;

/* renamed from: fhe  reason: default package */
public final /* synthetic */ class fhe implements ti0 {
    public final /* synthetic */ ohe.f a;
    public final /* synthetic */ phe b;
    public final /* synthetic */ String c;

    public /* synthetic */ fhe(ohe.f fVar, phe phe, String str) {
        this.a = fVar;
        this.b = phe;
        this.c = str;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        ohe.f fVar = this.a;
        phe phe = this.b;
        String str = this.c;
        hie.c cVar = (hie.c) obj;
        if (fVar.k()) {
            qhe.d dVar = new qhe.d(str);
            phe.a e = phe.e();
            e.b(dVar);
            return e0.g(e.a(), z42.l(new nhe.a(cVar.e()), new nhe.b()));
        }
        qhe.d dVar2 = new qhe.d(str);
        phe.a e2 = phe.e();
        e2.b(dVar2);
        return e0.g(e2.a(), z42.l(new nhe.a(cVar.e())));
    }
}

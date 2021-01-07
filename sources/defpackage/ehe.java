package defpackage;

import com.spotify.mobius.e0;
import defpackage.hie;
import defpackage.nhe;
import defpackage.phe;
import defpackage.qhe;

/* renamed from: ehe  reason: default package */
public final /* synthetic */ class ehe implements ti0 {
    public final /* synthetic */ phe a;
    public final /* synthetic */ String b;

    public /* synthetic */ ehe(phe phe, String str) {
        this.a = phe;
        this.b = str;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        phe phe = this.a;
        String str = this.b;
        hie.b bVar = (hie.b) obj;
        if (bVar.e() == 20) {
            qhe.b bVar2 = new qhe.b(str, bVar.e());
            phe.a e = phe.e();
            e.b(bVar2);
            return e0.g(e.a(), z42.l(new nhe.f(str)));
        }
        qhe.b bVar3 = new qhe.b(str, bVar.e());
        phe.a e2 = phe.e();
        e2.b(bVar3);
        return e0.f(e2.a());
    }
}

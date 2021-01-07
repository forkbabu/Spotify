package defpackage;

import com.spotify.mobius.e0;
import defpackage.kje;
import defpackage.rje;

/* renamed from: lje  reason: default package */
public final /* synthetic */ class lje implements ti0 {
    public final /* synthetic */ sje a;

    public /* synthetic */ lje(sje sje) {
        this.a = sje;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        sje sje = this.a;
        rje.a aVar = (rje.a) obj;
        boolean f = aVar.f();
        kje.b bVar = (kje.b) sje.k();
        bVar.c(f);
        sje a2 = bVar.a();
        boolean e = aVar.e();
        kje.b bVar2 = (kje.b) a2.k();
        bVar2.b(e);
        sje a3 = bVar2.a();
        boolean g = aVar.g();
        kje.b bVar3 = (kje.b) a3.k();
        bVar3.e(g);
        return e0.f(bVar3.a());
    }
}

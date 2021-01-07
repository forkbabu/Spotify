package defpackage;

import com.google.common.base.MoreObjects;
import com.spotify.mobius.e0;
import defpackage.kje;
import defpackage.rje;
import defpackage.tje;

/* renamed from: mje  reason: default package */
public final /* synthetic */ class mje implements ti0 {
    public final /* synthetic */ sje a;

    public /* synthetic */ mje(sje sje) {
        this.a = sje;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        sje sje = this.a;
        String f = ((rje.b) obj).f();
        if (MoreObjects.isNullOrEmpty(f)) {
            tje.a aVar = new tje.a();
            kje.b bVar = (kje.b) sje.k();
            bVar.f(aVar);
            return e0.f(bVar.a());
        }
        tje.b bVar2 = new tje.b(f);
        kje.b bVar3 = (kje.b) sje.k();
        bVar3.f(bVar2);
        return e0.f(bVar3.a());
    }
}

package defpackage;

import com.spotify.mobius.e0;
import defpackage.nae;
import defpackage.rae;
import defpackage.sae;
import defpackage.uae;
import java.util.HashSet;

/* renamed from: pae  reason: default package */
public final /* synthetic */ class pae implements ti0 {
    public final /* synthetic */ tae a;

    public /* synthetic */ pae(tae tae) {
        this.a = tae;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        tae tae = this.a;
        sae.a aVar = (sae.a) obj;
        HashSet hashSet = new HashSet();
        uae a2 = tae.a();
        a2.getClass();
        if (a2 instanceof uae.c) {
            hashSet.add(rae.a.a);
        } else {
            uae a3 = tae.a();
            a3.getClass();
            if (a3 instanceof uae.b) {
                hashSet.add(new rae.c(tae.e(), tae.c(), tae.b(), true));
            }
        }
        if (tae.f()) {
            return e0.a(hashSet);
        }
        nae.b bVar = (nae.b) tae.g();
        bVar.f(true);
        return e0.g(bVar.e(), hashSet);
    }
}

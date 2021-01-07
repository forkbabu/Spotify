package defpackage;

import com.spotify.mobius.e0;
import defpackage.rae;
import defpackage.sae;
import defpackage.uae;

/* renamed from: qae  reason: default package */
public final /* synthetic */ class qae implements ti0 {
    public final /* synthetic */ tae a;

    public /* synthetic */ qae(tae tae) {
        this.a = tae;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        tae tae = this.a;
        sae.c cVar = (sae.c) obj;
        if (tae.f()) {
            return e0.g(tae.h(cVar.h(), cVar.g(), cVar.f(), new uae.d()), z42.l(new rae.c(cVar.h(), cVar.g(), cVar.f(), false)));
        }
        return e0.g(tae.h(cVar.h(), cVar.g(), cVar.f(), new uae.b()), z42.l(new rae[0]));
    }
}

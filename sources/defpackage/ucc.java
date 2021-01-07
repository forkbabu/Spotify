package defpackage;

import com.spotify.mobius.e0;
import defpackage.adc;
import defpackage.bdc;

/* renamed from: ucc  reason: default package */
public final /* synthetic */ class ucc implements ti0 {
    public final /* synthetic */ ddc a;

    public /* synthetic */ ucc(ddc ddc) {
        this.a = ddc;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        bdc.i iVar = (bdc.i) obj;
        bla bla = this.a.b().get(iVar.k());
        bla.getClass();
        if (!bla.c()) {
            return e0.a(z42.l(new adc.c(iVar.k())));
        }
        return e0.h();
    }
}

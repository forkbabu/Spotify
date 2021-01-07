package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobius.e0;
import defpackage.adc;
import defpackage.bdc;
import defpackage.ddc;

/* renamed from: pcc  reason: default package */
public final /* synthetic */ class pcc implements ti0 {
    public final /* synthetic */ ddc a;

    public /* synthetic */ pcc(ddc ddc) {
        this.a = ddc;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        ddc ddc = this.a;
        bdc.h hVar = (bdc.h) obj;
        bla bla = ddc.b().get(hVar.k());
        bla.getClass();
        if (!(!bla.b())) {
            return e0.h();
        }
        ddc.a d = ddc.d();
        d.a(Optional.of(hVar.k()));
        return e0.g(d.b(), z42.l(new adc.b(hVar.k())));
    }
}

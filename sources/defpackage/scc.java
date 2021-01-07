package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobius.e0;
import defpackage.adc;
import defpackage.bdc;
import defpackage.ddc;
import java.util.HashSet;
import java.util.Set;

/* renamed from: scc  reason: default package */
public final /* synthetic */ class scc implements ti0 {
    public final /* synthetic */ ddc a;

    public /* synthetic */ scc(ddc ddc) {
        this.a = ddc;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        bdc.f fVar = (bdc.f) obj;
        ddc.a d = this.a.d();
        d.d(Optional.of(Boolean.valueOf(fVar.k())));
        ddc b = d.b();
        Set l = z42.l(new adc.e(fVar.k()));
        if (!fVar.k()) {
            ((HashSet) l).add(new adc.f());
        }
        return e0.g(b, l);
    }
}

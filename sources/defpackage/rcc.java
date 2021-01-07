package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobius.e0;
import defpackage.bdc;
import defpackage.ddc;

/* renamed from: rcc  reason: default package */
public final /* synthetic */ class rcc implements ti0 {
    public final /* synthetic */ ddc a;

    public /* synthetic */ rcc(ddc ddc) {
        this.a = ddc;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        ddc.a d = this.a.d();
        d.d(Optional.of(Boolean.valueOf(((bdc.g) obj).k())));
        return e0.f(d.b());
    }
}

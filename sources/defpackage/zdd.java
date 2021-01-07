package defpackage;

import com.google.common.base.MoreObjects;
import com.spotify.mobius.e0;
import defpackage.hed;
import defpackage.ied;

/* renamed from: zdd  reason: default package */
public final /* synthetic */ class zdd implements ti0 {
    public final /* synthetic */ jed a;

    public /* synthetic */ zdd(jed jed) {
        this.a = jed;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        jed jed = this.a;
        ied.f fVar = (ied.f) obj;
        if (!MoreObjects.isNullOrEmpty(jed.d())) {
            return e0.a(z42.l(new hed.e(jed.d(), jed.c())));
        }
        return e0.h();
    }
}

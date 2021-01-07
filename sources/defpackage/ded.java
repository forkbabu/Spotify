package defpackage;

import com.google.common.base.MoreObjects;
import com.spotify.mobius.e0;
import defpackage.hed;
import defpackage.ied;

/* renamed from: ded  reason: default package */
public final /* synthetic */ class ded implements ti0 {
    public final /* synthetic */ jed a;

    public /* synthetic */ ded(jed jed) {
        this.a = jed;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        jed jed = this.a;
        ied.b bVar = (ied.b) obj;
        if (!MoreObjects.isNullOrEmpty(jed.d())) {
            return e0.a(z42.l(new hed.e(jed.d(), jed.c())));
        }
        return e0.h();
    }
}

package defpackage;

import com.google.common.collect.ImmutableSet;
import com.spotify.mobius.e0;
import defpackage.wb9;
import defpackage.xb9;

/* renamed from: ub9  reason: default package */
public final /* synthetic */ class ub9 implements ti0 {
    public final /* synthetic */ zb9 a;

    public /* synthetic */ ub9(zb9 zb9) {
        this.a = zb9;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        xb9.d dVar = (xb9.d) obj;
        if (this.a.b().containsValue(Boolean.TRUE)) {
            return e0.h();
        }
        return e0.a(ImmutableSet.of(new wb9.b()));
    }
}

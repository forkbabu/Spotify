package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.mobius.e0;
import defpackage.xb9;
import defpackage.zb9;

/* renamed from: sb9  reason: default package */
public final /* synthetic */ class sb9 implements ti0 {
    public final /* synthetic */ zb9 a;

    public /* synthetic */ sb9(zb9 zb9) {
        this.a = zb9;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        zb9 zb9 = this.a;
        ImmutableMap<String, Boolean> f = ((xb9.b) obj).f();
        zb9.a d = zb9.d();
        d.c(f);
        return e0.f(d.a());
    }
}

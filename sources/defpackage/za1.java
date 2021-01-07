package defpackage;

import com.spotify.remoteconfig.l7;
import defpackage.ya1;
import kotlin.jvm.internal.h;

/* renamed from: za1  reason: default package */
public final class za1 implements fjf<Boolean> {
    private final wlf<l7> a;

    public za1(wlf<l7> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        l7 l7Var = this.a.get();
        ya1.a aVar = ya1.a;
        h.e(l7Var, "properties");
        return Boolean.valueOf(l7Var.b());
    }
}

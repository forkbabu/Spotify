package defpackage;

import com.spotify.instrumentation.a;
import com.spotify.ubi.specification.factories.t4;

/* renamed from: qkc  reason: default package */
public final class qkc implements fjf<t4> {
    private final wlf<a> a;

    public qkc(wlf<a> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new t4(this.a.get().path());
    }
}

package defpackage;

import com.spotify.instrumentation.a;
import com.spotify.ubi.specification.factories.b3;

/* renamed from: n77  reason: default package */
public final class n77 implements fjf<b3> {
    private final wlf<a> a;

    public n77(wlf<a> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b3(this.a.get().path());
    }
}

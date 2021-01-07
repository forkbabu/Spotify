package defpackage;

import com.spotify.instrumentation.a;
import com.spotify.ubi.specification.factories.w2;

/* renamed from: cd7  reason: default package */
public final class cd7 implements fjf<w2> {
    private final wlf<a> a;
    private final wlf<String> b;

    public cd7(wlf<a> wlf, wlf<String> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new w2(this.a.get().path(), this.b.get());
    }
}

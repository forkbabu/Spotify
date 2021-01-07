package defpackage;

import com.spotify.ubi.specification.factories.a1;

/* renamed from: k64  reason: default package */
public final class k64 implements fjf<j64> {
    private final wlf<a1> a;

    public k64(wlf<a1> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new j64(this.a.get());
    }
}

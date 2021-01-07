package defpackage;

import com.spotify.credentials.store.b;
import com.spotify.login.r0;

/* renamed from: s01  reason: default package */
public final class s01 implements fjf<r01> {
    private final wlf<b> a;
    private final wlf<r0> b;
    private final wlf<ae0> c;

    public s01(wlf<b> wlf, wlf<r0> wlf2, wlf<ae0> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new r01(this.a.get(), this.b.get(), this.c.get());
    }
}

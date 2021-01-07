package defpackage;

import com.spotify.ubi.specification.factories.b3;
import com.spotify.ubi.specification.factories.s0;

/* renamed from: ua7  reason: default package */
public final class ua7 implements fjf<ta7> {
    private final wlf<ere> a;
    private final wlf<b3> b;
    private final wlf<s0> c;

    public ua7(wlf<ere> wlf, wlf<b3> wlf2, wlf<s0> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ta7(this.a.get(), this.b.get(), this.c.get());
    }
}

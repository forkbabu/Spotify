package defpackage;

import com.spotify.ubi.specification.factories.s4;

/* renamed from: fd9  reason: default package */
public final class fd9 implements fjf<ed9> {
    private final wlf<s4> a;
    private final wlf<ere> b;

    public fd9(wlf<s4> wlf, wlf<ere> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ed9(this.a.get(), this.b.get());
    }
}

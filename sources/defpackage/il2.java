package defpackage;

import com.spotify.mobile.android.sso.bakery.e;

/* renamed from: il2  reason: default package */
public final class il2 implements fjf<hl2> {
    private final wlf<av1> a;
    private final wlf<e> b;

    public il2(wlf<av1> wlf, wlf<e> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new hl2(this.a.get(), this.b.get());
    }
}

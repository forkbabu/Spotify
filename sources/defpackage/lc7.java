package defpackage;

import com.spotify.music.navigation.t;

/* renamed from: lc7  reason: default package */
public final class lc7 implements fjf<kc7> {
    private final wlf<oa7> a;
    private final wlf<t> b;

    public lc7(wlf<oa7> wlf, wlf<t> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new kc7(this.a.get(), this.b.get());
    }
}

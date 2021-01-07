package defpackage;

import com.spotify.music.navigation.t;

/* renamed from: c77  reason: default package */
public final class c77 implements fjf<b77> {
    private final wlf<t> a;
    private final wlf<w57> b;

    public c77(wlf<t> wlf, wlf<w57> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b77(this.a.get(), this.b.get());
    }
}

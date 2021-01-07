package defpackage;

import com.spotify.music.features.ads.i0;

/* renamed from: k27  reason: default package */
public final class k27 implements fjf<j27> {
    private final wlf<i0> a;
    private final wlf<h27> b;

    public k27(wlf<i0> wlf, wlf<h27> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new j27(this.a.get(), this.b.get());
    }
}

package defpackage;

import com.spotify.mobile.android.rx.v;
import com.spotify.mobile.android.rx.w;

/* renamed from: gq8  reason: default package */
public final class gq8 implements fjf<fq8> {
    private final wlf<w> a;
    private final wlf<v> b;

    public gq8(wlf<w> wlf, wlf<v> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new fq8(this.a.get(), this.b.get());
    }
}

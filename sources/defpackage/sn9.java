package defpackage;

import com.spotify.mobile.android.service.media.browser.q;

/* renamed from: sn9  reason: default package */
public final class sn9 implements fjf<rn9> {
    private final wlf<q> a;
    private final wlf<ki1> b;

    public sn9(wlf<q> wlf, wlf<ki1> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new rn9(this.a.get(), this.b.get());
    }
}

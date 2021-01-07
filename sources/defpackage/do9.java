package defpackage;

import com.spotify.mobile.android.service.media.browser.q;

/* renamed from: do9  reason: default package */
public final class do9 implements fjf<co9> {
    private final wlf<q> a;
    private final wlf<ao9> b;

    public do9(wlf<q> wlf, wlf<ao9> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new co9(this.a.get(), this.b.get());
    }
}

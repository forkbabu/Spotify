package defpackage;

import com.spotify.mobile.android.spotlets.bixbyhomecards.cards.b;

/* renamed from: au1  reason: default package */
public final class au1 implements fjf<zt1> {
    private final wlf<b> a;
    private final wlf<xt1> b;

    public au1(wlf<b> wlf, wlf<xt1> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new zt1(this.a.get(), this.b.get());
    }
}

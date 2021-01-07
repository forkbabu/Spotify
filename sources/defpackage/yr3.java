package defpackage;

import com.spotify.music.features.ads.model.AdBreakState;
import io.reactivex.s;

/* renamed from: yr3  reason: default package */
public final class yr3 implements fjf<xr3> {
    private final wlf<s<AdBreakState>> a;
    private final wlf<zr3> b;

    public yr3(wlf<s<AdBreakState>> wlf, wlf<zr3> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new xr3(this.a.get(), this.b.get());
    }
}

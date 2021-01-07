package defpackage;

import com.spotify.music.features.ads.model.AdBreakState;
import io.reactivex.s;

/* renamed from: cs3  reason: default package */
public final class cs3 implements fjf<bs3> {
    private final wlf<s<AdBreakState>> a;
    private final wlf<tr3> b;

    public cs3(wlf<s<AdBreakState>> wlf, wlf<tr3> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new bs3(this.a.get(), this.b.get());
    }
}

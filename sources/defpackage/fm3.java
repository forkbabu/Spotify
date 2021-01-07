package defpackage;

import com.spotify.music.features.ads.audioplus.LeaveBehindAdType;
import com.spotify.music.features.ads.audioplus.overlay.i;
import com.spotify.music.features.ads.audioplus.overlay.j;

/* renamed from: fm3  reason: default package */
public final class fm3 implements j {
    private final wlf<cm3> a;

    public fm3(wlf<cm3> wlf) {
        this.a = wlf;
    }

    @Override // com.spotify.music.features.ads.audioplus.overlay.j
    public i.a b() {
        wlf<cm3> wlf = this.a;
        wlf.getClass();
        return new wl3(wlf);
    }

    @Override // com.spotify.music.features.ads.audioplus.overlay.j
    public String name() {
        return LeaveBehindAdType.CONCERT_PROMO.d();
    }
}

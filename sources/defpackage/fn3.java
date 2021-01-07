package defpackage;

import com.spotify.music.features.ads.audioplus.LeaveBehindAdType;
import com.spotify.music.features.ads.audioplus.overlay.i;
import com.spotify.music.features.ads.audioplus.overlay.j;

/* renamed from: fn3  reason: default package */
public final class fn3 implements j {
    private final wlf<cn3> a;

    public fn3(wlf<cn3> wlf) {
        this.a = wlf;
    }

    @Override // com.spotify.music.features.ads.audioplus.overlay.j
    public i.a b() {
        wlf<cn3> wlf = this.a;
        wlf.getClass();
        return new hm3(wlf);
    }

    @Override // com.spotify.music.features.ads.audioplus.overlay.j
    public String name() {
        return LeaveBehindAdType.PODCAST_PROMO.d();
    }
}

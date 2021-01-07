package defpackage;

import com.spotify.music.features.ads.audioplus.LeaveBehindAdType;
import com.spotify.music.features.ads.audioplus.overlay.i;
import com.spotify.music.features.ads.audioplus.overlay.j;

/* renamed from: ym3  reason: default package */
public final class ym3 implements j {
    private final wlf<vm3> a;

    public ym3(wlf<vm3> wlf) {
        this.a = wlf;
    }

    @Override // com.spotify.music.features.ads.audioplus.overlay.j
    public i.a b() {
        wlf<vm3> wlf = this.a;
        wlf.getClass();
        return new hm3(wlf);
    }

    @Override // com.spotify.music.features.ads.audioplus.overlay.j
    public String name() {
        return LeaveBehindAdType.MUSIC_PROMO.d();
    }
}

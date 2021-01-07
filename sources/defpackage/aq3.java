package defpackage;

import com.spotify.music.features.ads.api.SlotApi;
import com.spotify.music.features.ads.api.b;
import com.spotify.remoteconfig.AndroidLibsAdsCommonProperties;
import io.reactivex.y;

/* renamed from: aq3  reason: default package */
public final class aq3 implements fjf<zp3> {
    private final wlf<SlotApi> a;
    private final wlf<b> b;
    private final wlf<uec> c;
    private final wlf<AndroidLibsAdsCommonProperties> d;
    private final wlf<y> e;

    public aq3(wlf<SlotApi> wlf, wlf<b> wlf2, wlf<uec> wlf3, wlf<AndroidLibsAdsCommonProperties> wlf4, wlf<y> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new zp3(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}

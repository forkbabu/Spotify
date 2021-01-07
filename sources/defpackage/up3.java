package defpackage;

import com.spotify.music.features.ads.api.SlotApi;
import com.spotify.music.features.ads.api.b;
import com.spotify.remoteconfig.AndroidLibsAdsCommonProperties;
import io.reactivex.y;

/* renamed from: up3  reason: default package */
public final class up3 implements fjf<tp3> {
    private final wlf<b> a;
    private final wlf<SlotApi> b;
    private final wlf<uec> c;
    private final wlf<AndroidLibsAdsCommonProperties> d;
    private final wlf<y> e;

    public up3(wlf<b> wlf, wlf<SlotApi> wlf2, wlf<uec> wlf3, wlf<AndroidLibsAdsCommonProperties> wlf4, wlf<y> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new tp3(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}

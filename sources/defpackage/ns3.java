package defpackage;

import com.spotify.music.features.ads.api.SlotApi;
import com.spotify.remoteconfig.AndroidLibsAdsCommonProperties;

/* renamed from: ns3  reason: default package */
public final class ns3 implements fjf<ms3> {
    private final wlf<SlotApi> a;
    private final wlf<AndroidLibsAdsCommonProperties> b;

    public ns3(wlf<SlotApi> wlf, wlf<AndroidLibsAdsCommonProperties> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ms3(this.a.get(), this.b.get());
    }
}

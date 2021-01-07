package defpackage;

import com.spotify.remoteconfig.AndroidLibsAdsCommonProperties;

/* renamed from: pv3  reason: default package */
public final class pv3 implements fjf<ov3> {
    private final wlf<AndroidLibsAdsCommonProperties> a;

    public pv3(wlf<AndroidLibsAdsCommonProperties> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ov3(this.a.get());
    }
}

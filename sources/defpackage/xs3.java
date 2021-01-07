package defpackage;

import com.spotify.remoteconfig.AndroidLibsAdsCommonProperties;

/* renamed from: xs3  reason: default package */
public final class xs3 implements fjf<ws3> {
    private final wlf<AndroidLibsAdsCommonProperties> a;

    public xs3(wlf<AndroidLibsAdsCommonProperties> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ws3(this.a.get());
    }
}

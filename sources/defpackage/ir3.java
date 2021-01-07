package defpackage;

import com.spotify.remoteconfig.AndroidLibsAdsCommonProperties;

/* renamed from: ir3  reason: default package */
public final class ir3 implements fjf<hr3> {
    private final wlf<AndroidLibsAdsCommonProperties> a;

    public ir3(wlf<AndroidLibsAdsCommonProperties> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new hr3(this.a.get());
    }
}

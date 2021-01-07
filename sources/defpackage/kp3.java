package defpackage;

import com.spotify.remoteconfig.AndroidLibsAdsCommonProperties;

/* renamed from: kp3  reason: default package */
public final class kp3 implements fjf<jp3> {
    private final wlf<AndroidLibsAdsCommonProperties> a;

    public kp3(wlf<AndroidLibsAdsCommonProperties> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new jp3(this.a.get());
    }
}

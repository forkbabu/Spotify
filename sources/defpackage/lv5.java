package defpackage;

import com.spotify.remoteconfig.AndroidFeatureAllboardingProperties;

/* renamed from: lv5  reason: default package */
public final class lv5 implements fjf<kv5> {
    private final wlf<AndroidFeatureAllboardingProperties> a;

    public lv5(wlf<AndroidFeatureAllboardingProperties> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new kv5(this.a.get());
    }
}

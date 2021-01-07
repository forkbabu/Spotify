package defpackage;

import com.spotify.remoteconfig.AndroidFeatureSearchProperties;

/* renamed from: h98  reason: default package */
public final class h98 implements fjf<Boolean> {
    private final wlf<AndroidFeatureSearchProperties> a;

    public h98(wlf<AndroidFeatureSearchProperties> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Boolean.valueOf(this.a.get().d());
    }
}

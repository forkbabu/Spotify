package defpackage;

import com.spotify.remoteconfig.AndroidFeatureSearchProperties;

/* renamed from: z78  reason: default package */
public final class z78 implements fjf<Boolean> {
    private final wlf<AndroidFeatureSearchProperties> a;

    public z78(wlf<AndroidFeatureSearchProperties> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Boolean.valueOf(this.a.get().a());
    }
}

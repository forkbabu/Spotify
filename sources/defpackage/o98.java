package defpackage;

import com.spotify.remoteconfig.AndroidFeatureSearchProperties;

/* renamed from: o98  reason: default package */
public final class o98 implements fjf<Boolean> {
    private final wlf<AndroidFeatureSearchProperties> a;

    public o98(wlf<AndroidFeatureSearchProperties> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Boolean.valueOf(this.a.get().f() != AndroidFeatureSearchProperties.LoadMoreSearchResults.OFF);
    }
}

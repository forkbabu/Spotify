package defpackage;

import com.spotify.remoteconfig.AndroidFeatureSearchProperties;

/* renamed from: a88  reason: default package */
public final class a88 implements fjf<Boolean> {
    private final wlf<AndroidFeatureSearchProperties> a;

    public a88(wlf<AndroidFeatureSearchProperties> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Boolean.valueOf(this.a.get().c());
    }
}

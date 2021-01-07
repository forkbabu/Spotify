package defpackage;

import com.spotify.remoteconfig.AndroidFeatureHomeProperties;

/* renamed from: bk5  reason: default package */
public final class bk5 implements fjf<Boolean> {
    private final wlf<AndroidFeatureHomeProperties> a;

    public bk5(wlf<AndroidFeatureHomeProperties> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Boolean.valueOf(this.a.get().d());
    }
}

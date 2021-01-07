package defpackage;

import com.spotify.remoteconfig.AndroidFeatureSearchProperties;

/* renamed from: p98  reason: default package */
public final class p98 implements fjf<Integer> {
    private final wlf<AndroidFeatureSearchProperties> a;

    public p98(wlf<AndroidFeatureSearchProperties> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        int i;
        AndroidFeatureSearchProperties androidFeatureSearchProperties = this.a.get();
        if (androidFeatureSearchProperties.f() == AndroidFeatureSearchProperties.LoadMoreSearchResults.TEN) {
            i = 10;
        } else {
            i = androidFeatureSearchProperties.f() == AndroidFeatureSearchProperties.LoadMoreSearchResults.SEVEN ? 7 : 0;
        }
        return Integer.valueOf(i);
    }
}

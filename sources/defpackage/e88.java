package defpackage;

import com.spotify.remoteconfig.AndroidFeatureSearchProperties;

/* renamed from: e88  reason: default package */
public final class e88 implements fjf<Integer> {
    private final wlf<AndroidFeatureSearchProperties> a;
    private final wlf<Boolean> b;

    public e88(wlf<AndroidFeatureSearchProperties> wlf, wlf<Boolean> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    public static Integer a(AndroidFeatureSearchProperties androidFeatureSearchProperties, boolean z) {
        int i = 10;
        if (!z) {
            if (androidFeatureSearchProperties.g() == AndroidFeatureSearchProperties.MoreRecentSearchesResults.THIRTY) {
                i = 30;
            } else if (androidFeatureSearchProperties.g() == AndroidFeatureSearchProperties.MoreRecentSearchesResults.FIFTY) {
                i = 50;
            }
        }
        yif.g(i, "Cannot return null from a non-@Nullable @Provides method");
        return i;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get(), this.b.get().booleanValue());
    }
}

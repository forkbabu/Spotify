package defpackage;

import com.spotify.music.features.playlistentity.configuration.LicenseLayout;

/* renamed from: k56  reason: default package */
public final class k56 implements n46 {
    private final wlf<m56> a;
    private final wlf<y56> b;

    public k56(wlf<m56> wlf, wlf<y56> wlf2) {
        b(wlf, 1);
        this.a = wlf;
        b(wlf2, 2);
        this.b = wlf2;
    }

    private static <T> T b(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // defpackage.n46
    public h46 a(LicenseLayout licenseLayout, boolean z) {
        m56 m56 = this.a.get();
        b(m56, 1);
        y56 y56 = this.b.get();
        b(y56, 2);
        b(licenseLayout, 3);
        return new j56(m56, y56, licenseLayout, z);
    }
}
package defpackage;

import com.spotify.music.features.playlistentity.configuration.LicenseLayout;

/* renamed from: z46  reason: default package */
public final class z46 implements k46 {
    private final wlf<y56> a;

    public z46(wlf<y56> wlf) {
        b(wlf, 1);
        this.a = wlf;
    }

    private static <T> T b(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // defpackage.k46
    public h46 a(LicenseLayout licenseLayout) {
        y56 y56 = this.a.get();
        b(y56, 1);
        b(licenseLayout, 2);
        return new y46(y56, licenseLayout);
    }
}

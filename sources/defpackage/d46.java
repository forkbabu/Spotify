package defpackage;

import com.spotify.music.features.playlistentity.configuration.LicenseLayout;
import java.util.Map;

/* renamed from: d46  reason: default package */
public final class d46 implements g46 {
    private final wlf<m56> a;

    public d46(wlf<m56> wlf) {
        b(wlf, 1);
        this.a = wlf;
    }

    private static <T> T b(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // defpackage.g46
    public h46 a(LicenseLayout licenseLayout, Map map) {
        m56 m56 = this.a.get();
        b(m56, 1);
        b(licenseLayout, 2);
        b(map, 3);
        return new c46(m56, licenseLayout, map);
    }
}

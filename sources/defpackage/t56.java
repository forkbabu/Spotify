package defpackage;

import com.spotify.music.features.playlistentity.configuration.LicenseLayout;
import com.spotify.remoteconfig.AndroidLibsPlaylistEntityConfigurationProperties;
import java.util.Map;

/* renamed from: t56  reason: default package */
public final class t56 implements p46 {
    private final wlf<m56> a;
    private final wlf<AndroidLibsPlaylistEntityConfigurationProperties> b;

    public t56(wlf<m56> wlf, wlf<AndroidLibsPlaylistEntityConfigurationProperties> wlf2) {
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

    @Override // defpackage.p46
    public h46 a(LicenseLayout licenseLayout, Map map) {
        m56 m56 = this.a.get();
        b(m56, 1);
        AndroidLibsPlaylistEntityConfigurationProperties androidLibsPlaylistEntityConfigurationProperties = this.b.get();
        b(androidLibsPlaylistEntityConfigurationProperties, 2);
        b(licenseLayout, 3);
        b(map, 4);
        return new s56(m56, androidLibsPlaylistEntityConfigurationProperties, licenseLayout, map);
    }
}

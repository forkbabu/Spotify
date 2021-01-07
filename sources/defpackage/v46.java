package defpackage;

import com.spotify.music.features.playlistentity.configuration.LicenseLayout;
import com.spotify.remoteconfig.AndroidLibsPlaylistEntityConfigurationProperties;
import java.util.Map;

/* renamed from: v46  reason: default package */
public final class v46 implements j46 {
    private final wlf<AndroidLibsPlaylistEntityConfigurationProperties> a;
    private final wlf<m56> b;
    private final wlf<y56> c;

    public v46(wlf<AndroidLibsPlaylistEntityConfigurationProperties> wlf, wlf<m56> wlf2, wlf<y56> wlf3) {
        b(wlf, 1);
        this.a = wlf;
        b(wlf2, 2);
        this.b = wlf2;
        b(wlf3, 3);
        this.c = wlf3;
    }

    private static <T> T b(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // defpackage.j46
    public h46 a(LicenseLayout licenseLayout, Map map) {
        AndroidLibsPlaylistEntityConfigurationProperties androidLibsPlaylistEntityConfigurationProperties = this.a.get();
        b(androidLibsPlaylistEntityConfigurationProperties, 1);
        AndroidLibsPlaylistEntityConfigurationProperties androidLibsPlaylistEntityConfigurationProperties2 = androidLibsPlaylistEntityConfigurationProperties;
        m56 m56 = this.b.get();
        b(m56, 2);
        m56 m562 = m56;
        y56 y56 = this.c.get();
        b(y56, 3);
        b(licenseLayout, 4);
        b(map, 5);
        return new u46(androidLibsPlaylistEntityConfigurationProperties2, m562, y56, licenseLayout, map);
    }
}

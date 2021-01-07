package defpackage;

import com.spotify.music.features.playlistentity.configuration.LicenseLayout;
import com.spotify.remoteconfig.AndroidLibsPlaylistEntityConfigurationProperties;

/* renamed from: c56  reason: default package */
public final class c56 implements l46 {
    private final wlf<AndroidLibsPlaylistEntityConfigurationProperties> a;

    public c56(wlf<AndroidLibsPlaylistEntityConfigurationProperties> wlf) {
        b(wlf, 1);
        this.a = wlf;
    }

    private static <T> T b(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // defpackage.l46
    public h46 a(LicenseLayout licenseLayout) {
        AndroidLibsPlaylistEntityConfigurationProperties androidLibsPlaylistEntityConfigurationProperties = this.a.get();
        b(androidLibsPlaylistEntityConfigurationProperties, 1);
        b(licenseLayout, 2);
        return new b56(androidLibsPlaylistEntityConfigurationProperties, licenseLayout);
    }
}

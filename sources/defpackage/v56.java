package defpackage;

import com.spotify.music.features.playlistentity.configuration.LicenseLayout;
import com.spotify.music.features.playlistentity.configuration.i;
import com.spotify.remoteconfig.AndroidLibsPlaylistEntityConfigurationProperties;
import kotlin.jvm.internal.h;

/* renamed from: v56  reason: default package */
public final class v56 implements h46<i> {
    private final AndroidLibsPlaylistEntityConfigurationProperties a;
    private final LicenseLayout b;

    public v56(AndroidLibsPlaylistEntityConfigurationProperties androidLibsPlaylistEntityConfigurationProperties, LicenseLayout licenseLayout) {
        h.e(androidLibsPlaylistEntityConfigurationProperties, "properties");
        h.e(licenseLayout, "licenseLayout");
        this.a = androidLibsPlaylistEntityConfigurationProperties;
        this.b = licenseLayout;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.h46
    public i a() {
        i.b bVar = i.c;
        i.a aVar = new i.a(null, null, 3);
        aVar.a(this.a.a() || this.b != LicenseLayout.SHUFFLE_WHEN_FREE);
        i.c.a aVar2 = new i.c.a(null, null, null, 7);
        aVar2.b(false);
        aVar2.d(false);
        aVar2.c(true);
        aVar.c(aVar2.a());
        return aVar.b();
    }
}

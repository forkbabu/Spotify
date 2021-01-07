package defpackage;

import com.spotify.music.features.playlistentity.configuration.LicenseLayout;
import com.spotify.music.features.playlistentity.configuration.f;
import com.spotify.remoteconfig.AndroidLibsPlaylistEntityConfigurationProperties;
import kotlin.jvm.internal.h;

/* renamed from: b56  reason: default package */
public final class b56 implements h46<f> {
    private final AndroidLibsPlaylistEntityConfigurationProperties a;
    private final LicenseLayout b;

    public b56(AndroidLibsPlaylistEntityConfigurationProperties androidLibsPlaylistEntityConfigurationProperties, LicenseLayout licenseLayout) {
        h.e(androidLibsPlaylistEntityConfigurationProperties, "properties");
        h.e(licenseLayout, "licenseLayout");
        this.a = androidLibsPlaylistEntityConfigurationProperties;
        this.b = licenseLayout;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.h46
    public f a() {
        LicenseLayout licenseLayout = LicenseLayout.PREVIEWS_WHEN_FREE;
        f.a aVar = new f.a(null, null, null, null, null, 31);
        LicenseLayout licenseLayout2 = this.b;
        LicenseLayout licenseLayout3 = LicenseLayout.SHUFFLE_WHEN_FREE;
        aVar.e((licenseLayout2 == licenseLayout3 || licenseLayout2 == licenseLayout) ? Boolean.TRUE : null);
        aVar.d(null);
        LicenseLayout licenseLayout4 = this.b;
        boolean z = false;
        aVar.f((licenseLayout4 == licenseLayout3 || licenseLayout4 == licenseLayout) && this.a.e());
        aVar.c(this.b == LicenseLayout.ON_DEMAND_WHEN_FREE_JUMPIN);
        if (this.b == licenseLayout) {
            z = true;
        }
        aVar.a(z);
        return aVar.b();
    }
}

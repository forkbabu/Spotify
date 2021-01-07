package defpackage;

import com.spotify.music.features.playlistentity.configuration.LicenseLayout;
import com.spotify.remoteconfig.AndroidLibsPlaylistEntityConfigurationProperties;
import java.util.Map;
import kotlin.jvm.internal.h;

/* renamed from: n56  reason: default package */
public final class n56 implements m56 {
    private final y56 a;
    private final AndroidLibsPlaylistEntityConfigurationProperties b;

    public n56(y56 y56, AndroidLibsPlaylistEntityConfigurationProperties androidLibsPlaylistEntityConfigurationProperties) {
        h.e(y56, "externalDependencies");
        h.e(androidLibsPlaylistEntityConfigurationProperties, "properties");
        this.a = y56;
        this.b = androidLibsPlaylistEntityConfigurationProperties;
    }

    @Override // defpackage.m56
    public boolean a(LicenseLayout licenseLayout, Map<String, String> map) {
        h.e(licenseLayout, "licenseLayout");
        h.e(map, "productStateMap");
        boolean z = true;
        boolean z2 = licenseLayout == LicenseLayout.ON_DEMAND_WHEN_FREE_TFT;
        if (!uxc.c(map) && !z2) {
            z = false;
        }
        return this.a.e(z);
    }

    @Override // defpackage.m56
    public boolean b(Map<String, String> map) {
        h.e(map, "productStateMap");
        if (this.b.i()) {
            return uxc.d(map);
        }
        return true;
    }

    @Override // defpackage.m56
    public boolean c() {
        return this.b.c();
    }
}

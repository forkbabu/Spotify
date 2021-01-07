package defpackage;

import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import com.spotify.music.features.playlistentity.configuration.LicenseLayout;
import com.spotify.music.features.playlistentity.configuration.PlaylistDataSourceConfiguration;
import com.spotify.music.features.playlistentity.configuration.d;
import com.spotify.playlist.endpoints.policy.playlist.ListPolicy;
import java.util.Map;
import kotlin.jvm.internal.h;

/* renamed from: e56  reason: default package */
public final class e56 implements h46<PlaylistDataSourceConfiguration> {
    private final m56 a;
    private final LicenseLayout b;
    private final Map<String, String> c;

    public e56(m56 m56, LicenseLayout licenseLayout, Map<String, String> map) {
        h.e(m56, "providerHelper");
        h.e(licenseLayout, "licenseLayout");
        h.e(map, "productStateMap");
        this.a = m56;
        this.b = licenseLayout;
        this.c = map;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.h46
    public PlaylistDataSourceConfiguration a() {
        int i;
        LicenseLayout licenseLayout = LicenseLayout.ON_DEMAND_WHEN_FREE_JUMPIN;
        Boolean bool = Boolean.FALSE;
        PlaylistDataSourceConfiguration.b bVar = PlaylistDataSourceConfiguration.i;
        int i2 = null;
        PlaylistDataSourceConfiguration.a aVar = new PlaylistDataSourceConfiguration.a(null, null, null, null, null, null, null, null, BitmapRenderer.ALPHA_VISIBLE);
        PlaylistDataSourceConfiguration.c.a aVar2 = new PlaylistDataSourceConfiguration.c.a(null, new ListPolicy(null, null, null, null, null, null, 63, null), null, null, 13);
        aVar2.c(this.a.b(this.c));
        aVar2.b(PlaylistDataSourceConfiguration.DecorationPolicy.LARGE_WITHOUT_VIEWPORT);
        LicenseLayout licenseLayout2 = this.b;
        LicenseLayout licenseLayout3 = LicenseLayout.SHUFFLE_WHEN_FREE;
        aVar2.d(licenseLayout2 == licenseLayout3 ? bool : null);
        aVar.b(aVar2.a());
        LicenseLayout licenseLayout4 = this.b;
        boolean z = true;
        aVar.h(licenseLayout4 == licenseLayout3 || licenseLayout4 == LicenseLayout.PREVIEWS_WHEN_FREE);
        aVar.d(d.b(this.b) ? bool : null);
        if (this.b != licenseLayout3) {
            bool = null;
        }
        aVar.c(bool);
        LicenseLayout licenseLayout5 = this.b;
        if (licenseLayout5 == licenseLayout3) {
            i = 500;
        } else {
            if (licenseLayout5 == licenseLayout) {
                i2 = 50;
            }
            i = i2;
        }
        aVar.g(i);
        if (this.b != licenseLayout) {
            z = false;
        }
        aVar.e(z);
        aVar.f(d.b(this.b));
        aVar.i(d.c(this.b));
        return aVar.a();
    }
}

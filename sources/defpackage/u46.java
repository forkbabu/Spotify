package defpackage;

import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.features.playlistentity.configuration.LicenseLayout;
import com.spotify.music.features.playlistentity.configuration.d;
import com.spotify.remoteconfig.AndroidLibsPlaylistEntityConfigurationProperties;
import java.util.Map;
import kotlin.jvm.internal.h;

/* renamed from: u46  reason: default package */
public final class u46 implements h46<ItemListConfiguration> {
    private final AndroidLibsPlaylistEntityConfigurationProperties a;
    private final m56 b;
    private final y56 c;
    private final LicenseLayout d;
    private final Map<String, String> e;

    public u46(AndroidLibsPlaylistEntityConfigurationProperties androidLibsPlaylistEntityConfigurationProperties, m56 m56, y56 y56, LicenseLayout licenseLayout, Map<String, String> map) {
        h.e(androidLibsPlaylistEntityConfigurationProperties, "properties");
        h.e(m56, "providerHelper");
        h.e(y56, "externalDependencies");
        h.e(licenseLayout, "licenseLayout");
        h.e(map, "productStateMap");
        this.a = androidLibsPlaylistEntityConfigurationProperties;
        this.b = m56;
        this.c = y56;
        this.d = licenseLayout;
        this.e = map;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.h46
    public ItemListConfiguration a() {
        ItemListConfiguration.PreviewToast previewToast;
        AndroidLibsPlaylistEntityConfigurationProperties.ShowToastAboutPremiumOnPreviewPlayback l;
        LicenseLayout licenseLayout = this.d;
        boolean z = false;
        boolean z2 = licenseLayout == LicenseLayout.PREVIEWS_WHEN_FREE;
        ItemListConfiguration.b bVar = ItemListConfiguration.v;
        ItemListConfiguration.a aVar = new ItemListConfiguration.a(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097151);
        aVar.q(d.b(licenseLayout));
        aVar.o(!d.b(this.d));
        LicenseLayout licenseLayout2 = this.d;
        aVar.k(licenseLayout2 == LicenseLayout.ON_DEMAND_WHEN_FREE_NO_RESTRICTIONS || licenseLayout2 == LicenseLayout.ON_DEMAND_WHEN_FREE_TFT || licenseLayout2 == LicenseLayout.ON_DEMAND_WHEN_PREMIUM);
        aVar.n(!d.b(this.d));
        aVar.m(true);
        aVar.p(true);
        aVar.c(d.c(this.d));
        aVar.b(this.a.a() || this.d != LicenseLayout.SHUFFLE_WHEN_FREE);
        aVar.i(false);
        aVar.f(false);
        aVar.h(!d.b(this.d) ? ItemListConfiguration.LongClickAction.SHOW_CONTEXT_MENU : ItemListConfiguration.LongClickAction.DO_NOTHING);
        aVar.l(!d.b(this.d));
        aVar.r(this.c.b());
        aVar.u(z2);
        if (z2 && this.a.g()) {
            z = true;
        }
        aVar.t(z);
        if (d.a(this.d) && (l = this.a.l()) != null) {
            int ordinal = l.ordinal();
            if (ordinal == 1) {
                previewToast = ItemListConfiguration.PreviewToast.SHOW_ONCE_PER_PLAYLIST_SESSION;
            } else if (ordinal == 2) {
                previewToast = ItemListConfiguration.PreviewToast.SHOW_ON_EVERY_PLAYBACK;
            }
            aVar.j(previewToast);
            aVar.v(d.c(this.d));
            aVar.g(this.a.f());
            aVar.a(ItemListConfiguration.AddedByAttribution.AS_FACE_WHEN_COLLABORATIVE);
            aVar.e(this.b.a(this.d, this.e));
            aVar.s(this.c.a());
            return aVar.d();
        }
        previewToast = ItemListConfiguration.PreviewToast.DONT_SHOW;
        aVar.j(previewToast);
        aVar.v(d.c(this.d));
        aVar.g(this.a.f());
        aVar.a(ItemListConfiguration.AddedByAttribution.AS_FACE_WHEN_COLLABORATIVE);
        aVar.e(this.b.a(this.d, this.e));
        aVar.s(this.c.a());
        return aVar.d();
    }
}

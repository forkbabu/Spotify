package defpackage;

import com.spotify.music.features.playlistentity.configuration.LicenseLayout;
import com.spotify.music.features.playlistentity.configuration.PlaylistDataSourceConfiguration;
import com.spotify.music.features.playlistentity.configuration.b;
import com.spotify.music.features.playlistentity.configuration.c;
import com.spotify.music.features.playlistentity.configuration.d;
import com.spotify.music.features.playlistentity.configuration.i;
import com.spotify.music.features.playlistentity.vanilla.footer.FooterConfiguration;
import com.spotify.remoteconfig.AndroidLibsPlaylistEntityModesVanillaProperties;

/* renamed from: qz6  reason: default package */
public class qz6 {
    private final AndroidLibsPlaylistEntityModesVanillaProperties a;

    /* renamed from: qz6$a */
    class a implements xo6 {
        final /* synthetic */ LicenseLayout a;

        a(qz6 qz6, LicenseLayout licenseLayout) {
            this.a = licenseLayout;
        }

        @Override // defpackage.xo6
        public /* synthetic */ b.c a(b.c cVar) {
            return wo6.b(this, cVar);
        }

        @Override // defpackage.xo6
        public /* synthetic */ c b(c cVar) {
            return wo6.c(this, cVar);
        }

        @Override // defpackage.xo6
        public /* synthetic */ com.spotify.music.features.playlistentity.configuration.a c(com.spotify.music.features.playlistentity.configuration.a aVar) {
            return wo6.a(this, aVar);
        }

        @Override // defpackage.xo6
        public PlaylistDataSourceConfiguration.c d(PlaylistDataSourceConfiguration.c cVar) {
            PlaylistDataSourceConfiguration.DecorationPolicy decorationPolicy;
            LicenseLayout licenseLayout = this.a;
            PlaylistDataSourceConfiguration.c.a e = cVar.e();
            if (licenseLayout == LicenseLayout.SHUFFLE_WHEN_FREE) {
                decorationPolicy = PlaylistDataSourceConfiguration.DecorationPolicy.LIMITED_WITHOUT_VIEWPORT;
            } else if (licenseLayout == LicenseLayout.ON_DEMAND_WHEN_FREE_JUMPIN) {
                decorationPolicy = PlaylistDataSourceConfiguration.DecorationPolicy.LARGE_WITHOUT_VIEWPORT;
            } else {
                decorationPolicy = PlaylistDataSourceConfiguration.DecorationPolicy.LARGE_WITH_VIEWPORT;
            }
            e.b(decorationPolicy);
            return e.a();
        }

        @Override // defpackage.xo6
        public /* synthetic */ i.c e(i.c cVar) {
            return wo6.e(this, cVar);
        }
    }

    /* renamed from: qz6$b */
    class b implements FooterConfiguration {
        final /* synthetic */ LicenseLayout a;

        b(LicenseLayout licenseLayout) {
            this.a = licenseLayout;
        }

        @Override // com.spotify.music.features.playlistentity.vanilla.footer.FooterConfiguration
        public boolean a() {
            return d.c(this.a);
        }

        @Override // com.spotify.music.features.playlistentity.vanilla.footer.FooterConfiguration
        public FooterConfiguration.Type b(boolean z) {
            boolean b2 = d.b(this.a);
            boolean a2 = qz6.this.a.a();
            boolean c = d.c(this.a);
            AndroidLibsPlaylistEntityModesVanillaProperties.RecommendationsSectionInFree b3 = qz6.this.a.b();
            boolean z2 = false;
            if (z && (!b2 || (b3 == AndroidLibsPlaylistEntityModesVanillaProperties.RecommendationsSectionInFree.PLAYLIST_EXTENDER && (c || !a2)))) {
                return FooterConfiguration.Type.PLEX;
            }
            if (b2 && z && b3 == AndroidLibsPlaylistEntityModesVanillaProperties.RecommendationsSectionInFree.ASSISTED_CURATION && (c || !a2)) {
                z2 = true;
            }
            if (z2) {
                return FooterConfiguration.Type.AC;
            }
            return FooterConfiguration.Type.MLT;
        }
    }

    public qz6(AndroidLibsPlaylistEntityModesVanillaProperties androidLibsPlaylistEntityModesVanillaProperties) {
        this.a = androidLibsPlaylistEntityModesVanillaProperties;
    }

    public xo6 b(LicenseLayout licenseLayout) {
        return new a(this, licenseLayout);
    }

    public FooterConfiguration c(LicenseLayout licenseLayout) {
        return new b(licenseLayout);
    }
}

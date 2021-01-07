package defpackage;

import com.spotify.music.features.playlistentity.configuration.LicenseLayout;
import com.spotify.music.features.playlistentity.configuration.PlaylistDataSourceConfiguration;
import com.spotify.music.features.playlistentity.configuration.a;
import com.spotify.music.features.playlistentity.configuration.b;
import com.spotify.music.features.playlistentity.configuration.c;
import com.spotify.music.features.playlistentity.configuration.i;

/* renamed from: kt6  reason: default package */
public class kt6 {

    /* access modifiers changed from: package-private */
    /* renamed from: kt6$a */
    public class a implements xo6 {
        final /* synthetic */ LicenseLayout a;

        a(kt6 kt6, LicenseLayout licenseLayout) {
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
        public com.spotify.music.features.playlistentity.configuration.a c(com.spotify.music.features.playlistentity.configuration.a aVar) {
            a.C0241a c = aVar.c();
            c.c(true);
            c.d(true);
            return c.b();
        }

        @Override // defpackage.xo6
        public PlaylistDataSourceConfiguration.c d(PlaylistDataSourceConfiguration.c cVar) {
            PlaylistDataSourceConfiguration.DecorationPolicy decorationPolicy;
            LicenseLayout licenseLayout = this.a;
            PlaylistDataSourceConfiguration.c.a e = cVar.e();
            e.c(true);
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

    public xo6 a(LicenseLayout licenseLayout) {
        return new a(this, licenseLayout);
    }
}

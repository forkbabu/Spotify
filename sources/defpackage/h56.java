package defpackage;

import com.spotify.music.features.playlistentity.configuration.LicenseLayout;
import com.spotify.playlist.formatlisttype.FormatListType;
import com.spotify.playlist.models.OnDemandInFreeReason;
import com.spotify.playlist.models.k;
import com.spotify.remoteconfig.AndroidLibsPlaylistEntityConfigurationProperties;
import java.util.List;
import java.util.Map;
import kotlin.collections.d;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.h;

/* renamed from: h56  reason: default package */
public final class h56 implements x46 {
    public static final List<FormatListType> c = d.u(FormatListType.r, FormatListType.b, FormatListType.s, FormatListType.n);
    public static final a d = new a(null);
    private final com.spotify.playlist.formatlisttype.a a;
    private final AndroidLibsPlaylistEntityConfigurationProperties b;

    /* renamed from: h56$a */
    public static final class a {
        public a(f fVar) {
        }
    }

    public h56(com.spotify.playlist.formatlisttype.a aVar, AndroidLibsPlaylistEntityConfigurationProperties androidLibsPlaylistEntityConfigurationProperties) {
        h.e(aVar, "mFormatListTypeCompanion");
        h.e(androidLibsPlaylistEntityConfigurationProperties, "mConfigurationProperties");
        this.a = aVar;
        this.b = androidLibsPlaylistEntityConfigurationProperties;
    }

    @Override // defpackage.x46
    public LicenseLayout a(k kVar, Map<String, String> map) {
        LicenseLayout licenseLayout = LicenseLayout.ON_DEMAND_WHEN_FREE_NO_RESTRICTIONS;
        h.e(kVar, "playlistEntity");
        h.e(map, "productStateMap");
        h.e(map, "productStateMap");
        if (h.a("premium", map.get("type"))) {
            return LicenseLayout.ON_DEMAND_WHEN_PREMIUM;
        }
        if (uxc.e(map)) {
            if (uxc.b(map)) {
                return licenseLayout;
            }
            return LicenseLayout.ON_DEMAND_WHEN_FREE_TFT;
        } else if (kVar.j().l() == OnDemandInFreeReason.ON_DEMAND) {
            return LicenseLayout.ON_DEMAND_WHEN_FREE_JUMPIN;
        } else {
            if (kVar.j().l() == OnDemandInFreeReason.ON_DEMAND_EPISODES_ONLY) {
                return licenseLayout;
            }
            boolean z = false;
            if (c.contains(this.a.a(kVar.j().g())) && this.b.b() != AndroidLibsPlaylistEntityConfigurationProperties.ChunkyRowsAndPreviews.TRACK_CLOUD) {
                z = true;
            }
            if (z) {
                return LicenseLayout.PREVIEWS_WHEN_FREE;
            }
            return LicenseLayout.SHUFFLE_WHEN_FREE;
        }
    }
}

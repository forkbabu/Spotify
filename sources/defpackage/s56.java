package defpackage;

import com.spotify.music.features.playlistentity.configuration.LicenseLayout;
import com.spotify.music.features.playlistentity.configuration.ToolbarConfiguration;
import com.spotify.music.features.playlistentity.configuration.d;
import com.spotify.remoteconfig.AndroidLibsPlaylistEntityConfigurationProperties;
import java.util.Map;
import kotlin.jvm.internal.h;

/* renamed from: s56  reason: default package */
public final class s56 implements h46<ToolbarConfiguration> {
    private final m56 a;
    private final AndroidLibsPlaylistEntityConfigurationProperties b;
    private final LicenseLayout c;
    private final Map<String, String> d;

    public s56(m56 m56, AndroidLibsPlaylistEntityConfigurationProperties androidLibsPlaylistEntityConfigurationProperties, LicenseLayout licenseLayout, Map<String, String> map) {
        h.e(m56, "providerHelper");
        h.e(androidLibsPlaylistEntityConfigurationProperties, "properties");
        h.e(licenseLayout, "licenseLayout");
        h.e(map, "productStateMap");
        this.a = m56;
        this.b = androidLibsPlaylistEntityConfigurationProperties;
        this.c = licenseLayout;
        this.d = map;
    }

    private final ToolbarConfiguration.EditOption b() {
        int ordinal;
        ToolbarConfiguration.EditOption editOption = ToolbarConfiguration.EditOption.NO_SHOW;
        ToolbarConfiguration.EditOption editOption2 = ToolbarConfiguration.EditOption.SHOW_WHEN_CAN_MODIFY_CONTENTS;
        boolean b2 = d.b(this.c);
        AndroidLibsPlaylistEntityConfigurationProperties.EditPlaylistOptionInToolbarMenuNftBehaviour d2 = this.b.d();
        if (b2) {
            if (d2 == null || (ordinal = d2.ordinal()) == 0) {
                return editOption;
            }
            if (ordinal == 1) {
                return ToolbarConfiguration.EditOption.SHOW_WHEN_OWNED_BY_SELF;
            }
            if (ordinal != 2) {
                return editOption;
            }
        }
        return editOption2;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.h46
    public ToolbarConfiguration a() {
        ToolbarConfiguration.RecommendationEducationOption recommendationEducationOption;
        ToolbarConfiguration.b bVar = ToolbarConfiguration.l;
        ToolbarConfiguration.a aVar = new ToolbarConfiguration.a(null, null, null, null, null, null, null, null, null, null, null, 2047);
        aVar.h(d.b(this.c));
        aVar.f(d.b(this.c) ? ToolbarConfiguration.FollowOption.LIKE : ToolbarConfiguration.FollowOption.FOLLOW);
        aVar.g(!d.b(this.c));
        aVar.b(!d.b(this.c));
        aVar.c(this.a.a(this.c, this.d));
        boolean z = false;
        aVar.l(b() == ToolbarConfiguration.EditOption.NO_SHOW);
        aVar.d(b());
        if (d.c(this.c) || this.c == LicenseLayout.PREVIEWS_WHEN_FREE) {
            z = true;
        }
        aVar.e(z);
        aVar.j(this.b.k());
        AndroidLibsPlaylistEntityConfigurationProperties.RecommendationEducationOptionInToolbarMenuBehavior h = this.b.h();
        if (h != null) {
            int ordinal = h.ordinal();
            if (ordinal == 1) {
                recommendationEducationOption = ToolbarConfiguration.RecommendationEducationOption.FORMAT_LISTS_ONLY;
            } else if (ordinal == 2) {
                recommendationEducationOption = ToolbarConfiguration.RecommendationEducationOption.ALL_PLAYLISTS;
            }
            aVar.k(recommendationEducationOption);
            aVar.i(this.b.j());
            return aVar.a();
        }
        recommendationEducationOption = ToolbarConfiguration.RecommendationEducationOption.NO_SHOW;
        aVar.k(recommendationEducationOption);
        aVar.i(this.b.j());
        return aVar.a();
    }
}

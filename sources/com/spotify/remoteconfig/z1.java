package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidLibsPlaylistEntityModesVanillaProperties;
import com.spotify.remoteconfig.hg;

public final /* synthetic */ class z1 implements o0e {
    public static final /* synthetic */ z1 a = new z1();

    private /* synthetic */ z1() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("android-libs-playlist-entity-modes-vanilla", "only_show_recommendations_section_in_on_demand_playlists_in_free", false);
        AndroidLibsPlaylistEntityModesVanillaProperties.RecommendationsSectionInFree recommendationsSectionInFree = AndroidLibsPlaylistEntityModesVanillaProperties.RecommendationsSectionInFree.NONE;
        boolean a3 = p0e.a("android-libs-playlist-entity-modes-vanilla", "show_refresh_header_instead_of_playlist_header", false);
        hg.b bVar = new hg.b();
        bVar.b(false);
        bVar.c(recommendationsSectionInFree);
        bVar.d(false);
        bVar.b(a2);
        bVar.c((AndroidLibsPlaylistEntityModesVanillaProperties.RecommendationsSectionInFree) p0e.b("android-libs-playlist-entity-modes-vanilla", "recommendations_section_in_free", recommendationsSectionInFree));
        bVar.d(a3);
        return bVar.a();
    }
}

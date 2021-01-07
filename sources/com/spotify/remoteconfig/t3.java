package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidFeatureSearchProperties;
import com.spotify.remoteconfig.ke;

public final /* synthetic */ class t3 implements o0e {
    public static final /* synthetic */ t3 a = new t3();

    private /* synthetic */ t3() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("android-feature-search", "enable_editorial_on_demand_playback", false);
        boolean a3 = p0e.a("android-feature-search", "enable_mobius", false);
        boolean a4 = p0e.a("android-feature-search", "enable_music_and_talk", false);
        boolean a5 = p0e.a("android-feature-search", "enable_new_find_header_in_search", false);
        boolean a6 = p0e.a("android-feature-search", "enable_page_loading_api_integration_in_search_drill_down", false);
        AndroidFeatureSearchProperties.LoadMoreSearchResults loadMoreSearchResults = AndroidFeatureSearchProperties.LoadMoreSearchResults.OFF;
        AndroidFeatureSearchProperties.MoreRecentSearchesResults moreRecentSearchesResults = AndroidFeatureSearchProperties.MoreRecentSearchesResults.TEN;
        AndroidFeatureSearchProperties.TrendingSearchesBehaviour trendingSearchesBehaviour = AndroidFeatureSearchProperties.TrendingSearchesBehaviour.NAVIGATE;
        AndroidFeatureSearchProperties.TrendingSearchesExperience trendingSearchesExperience = AndroidFeatureSearchProperties.TrendingSearchesExperience.OFF;
        ke.b bVar = new ke.b();
        bVar.b(false);
        bVar.c(false);
        bVar.d(false);
        bVar.e(false);
        bVar.f(false);
        bVar.g(loadMoreSearchResults);
        bVar.h(moreRecentSearchesResults);
        bVar.i(trendingSearchesBehaviour);
        bVar.j(trendingSearchesExperience);
        bVar.b(a2);
        bVar.c(a3);
        bVar.d(a4);
        bVar.e(a5);
        bVar.f(a6);
        bVar.g((AndroidFeatureSearchProperties.LoadMoreSearchResults) p0e.b("android-feature-search", "load_more_search_results", loadMoreSearchResults));
        bVar.h((AndroidFeatureSearchProperties.MoreRecentSearchesResults) p0e.b("android-feature-search", "more_recent_searches_results", moreRecentSearchesResults));
        bVar.i((AndroidFeatureSearchProperties.TrendingSearchesBehaviour) p0e.b("android-feature-search", "trending_searches_behaviour", trendingSearchesBehaviour));
        bVar.j((AndroidFeatureSearchProperties.TrendingSearchesExperience) p0e.b("android-feature-search", "trending_searches_experience", trendingSearchesExperience));
        return bVar.a();
    }
}

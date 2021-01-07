package com.spotify.remoteconfig;

import com.comscore.util.crashreport.CrashReportManager;
import com.spotify.remoteconfig.AndroidLibsYourLibraryMusicPagesFlagsProperties;
import com.spotify.remoteconfig.lh;

public final /* synthetic */ class n0 implements o0e {
    public static final /* synthetic */ n0 a = new n0();

    private /* synthetic */ n0() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        AndroidLibsYourLibraryMusicPagesFlagsProperties.ArtistRecommendationsSource artistRecommendationsSource = AndroidLibsYourLibraryMusicPagesFlagsProperties.ArtistRecommendationsSource.CORE;
        AndroidLibsYourLibraryMusicPagesFlagsProperties.ArtistRecommendationsSource artistRecommendationsSource2 = (AndroidLibsYourLibraryMusicPagesFlagsProperties.ArtistRecommendationsSource) p0e.b("android-libs-your-library-music-pages-flags", "artist_recommendations_source", artistRecommendationsSource);
        boolean a2 = p0e.a("android-libs-your-library-music-pages-flags", "display_tags_in_liked_songs_context_menu", false);
        boolean a3 = p0e.a("android-libs-your-library-music-pages-flags", "frecency_sorting_as_default_in_your_library_music_pages_playlists", false);
        boolean a4 = p0e.a("android-libs-your-library-music-pages-flags", "liked_songs_filter_chips_enabled", false);
        AndroidLibsYourLibraryMusicPagesFlagsProperties.LikedSongsFilterChipsSource likedSongsFilterChipsSource = AndroidLibsYourLibraryMusicPagesFlagsProperties.LikedSongsFilterChipsSource.NONE;
        AndroidLibsYourLibraryMusicPagesFlagsProperties.LikedSongsFilterChipsSource likedSongsFilterChipsSource2 = (AndroidLibsYourLibraryMusicPagesFlagsProperties.LikedSongsFilterChipsSource) p0e.b("android-libs-your-library-music-pages-flags", "liked_songs_filter_chips_source", likedSongsFilterChipsSource);
        AndroidLibsYourLibraryMusicPagesFlagsProperties.LikedSongsScrollerType likedSongsScrollerType = AndroidLibsYourLibraryMusicPagesFlagsProperties.LikedSongsScrollerType.DEFAULT;
        AndroidLibsYourLibraryMusicPagesFlagsProperties.LikedSongsScrollerType likedSongsScrollerType2 = (AndroidLibsYourLibraryMusicPagesFlagsProperties.LikedSongsScrollerType) p0e.b("android-libs-your-library-music-pages-flags", "liked_songs_scroller_type", likedSongsScrollerType);
        AndroidLibsYourLibraryMusicPagesFlagsProperties.QuickscrollMechanismInYourLibrary quickscrollMechanismInYourLibrary = AndroidLibsYourLibraryMusicPagesFlagsProperties.QuickscrollMechanismInYourLibrary.DEFAULT;
        AndroidLibsYourLibraryMusicPagesFlagsProperties.QuickscrollMechanismInYourLibrary quickscrollMechanismInYourLibrary2 = (AndroidLibsYourLibraryMusicPagesFlagsProperties.QuickscrollMechanismInYourLibrary) p0e.b("android-libs-your-library-music-pages-flags", "quickscroll_mechanism_in_your_library", quickscrollMechanismInYourLibrary);
        int c = p0e.c("android-libs-your-library-music-pages-flags", "quickscroll_min_pages", 1, 10, 3);
        int c2 = p0e.c("android-libs-your-library-music-pages-flags", "your_library_music_pages_loading_range_size", 32, CrashReportManager.TIME_WINDOW, 256);
        lh.b bVar = new lh.b();
        bVar.a(artistRecommendationsSource);
        bVar.c(false);
        bVar.d(false);
        bVar.e(false);
        bVar.f(likedSongsFilterChipsSource);
        bVar.g(likedSongsScrollerType);
        bVar.h(quickscrollMechanismInYourLibrary);
        bVar.i(3);
        bVar.j(256);
        bVar.a(artistRecommendationsSource2);
        bVar.c(a2);
        bVar.d(a3);
        bVar.e(a4);
        bVar.f(likedSongsFilterChipsSource2);
        bVar.g(likedSongsScrollerType2);
        bVar.h(quickscrollMechanismInYourLibrary2);
        bVar.i(c);
        bVar.j(c2);
        AndroidLibsYourLibraryMusicPagesFlagsProperties b = bVar.b();
        if (b.h() < 1 || b.h() > 10) {
            throw new IllegalArgumentException("Value for quickscrollMinPages() out of bounds");
        } else if (b.i() >= 32 && b.i() <= 5000) {
            return b;
        } else {
            throw new IllegalArgumentException("Value for yourLibraryMusicPagesLoadingRangeSize() out of bounds");
        }
    }
}

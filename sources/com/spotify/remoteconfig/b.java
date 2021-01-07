package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidLibsPlaylistEntityConfigurationProperties;
import com.spotify.remoteconfig.bg;

public final /* synthetic */ class b implements o0e {
    public static final /* synthetic */ b a = new b();

    private /* synthetic */ b() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("android-libs-playlist-entity-configuration", "allow_auto_play_of_episodes_in_shuffle_mode_in_playlist", false);
        AndroidLibsPlaylistEntityConfigurationProperties.ChunkyRowsAndPreviews chunkyRowsAndPreviews = AndroidLibsPlaylistEntityConfigurationProperties.ChunkyRowsAndPreviews.TRACK_CLOUD;
        boolean a3 = p0e.a("android-libs-playlist-entity-configuration", "double_state_play_button", false);
        AndroidLibsPlaylistEntityConfigurationProperties.EditPlaylistOptionInToolbarMenuNftBehaviour editPlaylistOptionInToolbarMenuNftBehaviour = AndroidLibsPlaylistEntityConfigurationProperties.EditPlaylistOptionInToolbarMenuNftBehaviour.NO_SHOW;
        boolean a4 = p0e.a("android-libs-playlist-entity-configuration", "enable_weighted_shuffle_playback", true);
        boolean a5 = p0e.a("android-libs-playlist-entity-configuration", "log_impressions_for_item_rows", false);
        boolean a6 = p0e.a("android-libs-playlist-entity-configuration", "onboarding_for_chunky_rows_and_previews", false);
        AndroidLibsPlaylistEntityConfigurationProperties.RecommendationEducationOptionInToolbarMenuBehavior recommendationEducationOptionInToolbarMenuBehavior = AndroidLibsPlaylistEntityConfigurationProperties.RecommendationEducationOptionInToolbarMenuBehavior.NO_SHOW;
        boolean a7 = p0e.a("android-libs-playlist-entity-configuration", "respect_shows_collection_flag_in_playlist_for_including_episodes", true);
        boolean a8 = p0e.a("android-libs-playlist-entity-configuration", "show_manage_privacy_option_in_toolbar_menu", false);
        boolean a9 = p0e.a("android-libs-playlist-entity-configuration", "show_other_devices_to_offline_to_option_in_toolbar_menu", false);
        AndroidLibsPlaylistEntityConfigurationProperties.ShowToastAboutPremiumOnPreviewPlayback showToastAboutPremiumOnPreviewPlayback = AndroidLibsPlaylistEntityConfigurationProperties.ShowToastAboutPremiumOnPreviewPlayback.NO_SHOW;
        bg.b bVar = new bg.b();
        bVar.a(false);
        bVar.c(chunkyRowsAndPreviews);
        bVar.d(false);
        bVar.e(editPlaylistOptionInToolbarMenuNftBehaviour);
        bVar.f(true);
        bVar.g(false);
        bVar.h(false);
        bVar.i(recommendationEducationOptionInToolbarMenuBehavior);
        bVar.j(true);
        bVar.k(false);
        bVar.l(false);
        bVar.m(showToastAboutPremiumOnPreviewPlayback);
        bVar.a(a2);
        bVar.c((AndroidLibsPlaylistEntityConfigurationProperties.ChunkyRowsAndPreviews) p0e.b("android-libs-playlist-entity-configuration", "chunky_rows_and_previews", chunkyRowsAndPreviews));
        bVar.d(a3);
        bVar.e((AndroidLibsPlaylistEntityConfigurationProperties.EditPlaylistOptionInToolbarMenuNftBehaviour) p0e.b("android-libs-playlist-entity-configuration", "edit_playlist_option_in_toolbar_menu_nft_behaviour", editPlaylistOptionInToolbarMenuNftBehaviour));
        bVar.f(a4);
        bVar.g(a5);
        bVar.h(a6);
        bVar.i((AndroidLibsPlaylistEntityConfigurationProperties.RecommendationEducationOptionInToolbarMenuBehavior) p0e.b("android-libs-playlist-entity-configuration", "recommendation_education_option_in_toolbar_menu_behavior", recommendationEducationOptionInToolbarMenuBehavior));
        bVar.j(a7);
        bVar.k(a8);
        bVar.l(a9);
        bVar.m((AndroidLibsPlaylistEntityConfigurationProperties.ShowToastAboutPremiumOnPreviewPlayback) p0e.b("android-libs-playlist-entity-configuration", "show_toast_about_premium_on_preview_playback", showToastAboutPremiumOnPreviewPlayback));
        return bVar.b();
    }
}

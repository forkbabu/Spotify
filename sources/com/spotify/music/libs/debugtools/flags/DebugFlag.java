package com.spotify.music.libs.debugtools.flags;

public enum DebugFlag {
    ACCOUNTS_STAGING("accounts-staging"),
    AGE_VERIFICATION_STAGING("age_verification_staging"),
    ARTIST_BETA("artist-beta"),
    BOOTSTRAP_REQUIRE_SUCCESS("bootstrap-enabled"),
    CONNECT_ACCESS("connect-access"),
    CONNECT_DESTINATION("connect-destination"),
    CONNECT_IN_BACKGROUND("connect-in-background"),
    CYOA("cyoa"),
    DATA_SAVER_MODE_SYNC_WITH_ANDROID("data_saver_mode_sync_with_android"),
    DEBUG_SHUTDOWN("debug_shutdown"),
    DISABLE_PREMIUM_PURCHASE("disable_premium_purchase"),
    DISABLE_REPEATING_ANIMATIONS("disable_repeating_animations"),
    DISABLE_STRICT_MODE_FLICKERING("disable_strict_mode_flickering"),
    DRIVING_FRAGMENT("driving-now-playing"),
    DRIVING_VOICE("driving-voice"),
    ENABLE_LEAK_CANARY("enable-leak-canary"),
    ENABLE_PRINTING_STATE_DIAGNOSTICS("ENABLE_PRINTING_STATE_DIAGNOSTICS"),
    EPISODE_PREVIEWS("episode-previews"),
    FIND_CARD_ROUNDED_CORNERS("find_card_rounded_corners"),
    FIND_USE_LOCAL_DATA_SOURCE("find_use_local_data_source"),
    FREE_TIER_ALBUM_LOCAL_HUBS("free-tier-album-local-hubs"),
    FREE_TIER_ARTIST_LOCAL_HUBS("free-tier-artist-local-hubs"),
    FREE_TIER_TRACK_LOCAL_HUBS("free-tier-track-local-hubs"),
    HOME_LOCAL_HUBS("home-local-hubs"),
    HOME_NO_CACHE("home-no-cache"),
    MARQUEE_BETA("marquee-beta"),
    MO_CAPPED_ONDEMAND("mo-capped-ondemand"),
    MO_CAPPED_ONDEMAND_SHUFFLE("mo-capped-ondemand-shuffle"),
    MO_ZERO_RATED("mo-zero-rated"),
    NATIVE_WAIT_FOR_DEBUGGER("native_wait_for_debugger"),
    NFT_ASSISTED_CURATION_COMBINE_RECS_SECTIONS_INTO_ONE("nft_ac_combine_recs_sections_into_one"),
    NFT_ASSISTED_CURATION_DISABLE_INLINE_PREVIEW_CONTINUATION("nft_ac_disable_inline_preview_continuation"),
    NFT_ASSISTED_CURATION_INLINE_PREVIEW("nft_ac_inline_preview"),
    NFT_ASSISTED_CURATION_LEADING_NAMING_SCREEN("nft_ac_leading_naming_screen"),
    NFT_ASSISTED_CURATION_MIX_ENTITY_NEW_BUTTONS("nft_ac_mix_entity_new_buttons"),
    NFT_ASSISTED_CURATION_OPEN_PREVIEW_TRANSITIONS("nft_ac_preview_transitions"),
    NFT_ASSISTED_CURATION_PROGRESS_BAR("nft_ac_progress_bar"),
    NFT_ASSISTED_CURATION_REMOVE_SHOPPING_CART("nft_ac_remove_shopping_cart"),
    NFT_ASSISTED_CURATION_SHORTEN_PREVIEWS("nft_ac_shorten_previews"),
    NFT_ASSISTED_CURATION_SHOW_EMPTY_MIX_UPFRONT("nft_ac_show_empty_mix_upfront"),
    NFT_ASSISTED_CURATION_SPLIT_TRACK_CLOUD_IN_TWO("nft_ac_split_track_cloud_in_two"),
    NFT_TASTE_ONBOARDING_COMPLETE_SIGNALS("nft_taste_onboarding_complete_signals"),
    NFT_USE_GRAVITY_TRACK_SERVER("nft_use_gravity_track_server"),
    NFT_USE_STAGING_SERVER("nft_use_staging_server"),
    NFT_USE_VANILLA_SERVER("nft_use_vanilla_server"),
    ONBOARDING_ACTIVITY_MANAGER_USE_STAGING_SERVER("onboarding_use_staging_server"),
    ONBOARDING_NOTIFICATION_DEBUG("onboarding_notification_debug"),
    ONBOARDING_NOTIFICATION_FORCE_OPTIN_EXP("onboarding_use_force-optin-exp"),
    ONBOARDING_NOTIFICATION_TIMING("onboarding_use_fake_notification_timing"),
    OVERRIDE_TELCO_OFFER_3G_CHECK("override_telco_bundle_connectivity_check"),
    OVERRIDE_TELCO_OFFER_SHOWN_ONCE("override_telco_dialog_check"),
    PLAYLIST_PLEX_ENABLE_LIST_ANIMATIONS("playlist-enable-list-animations"),
    PLAYLIST_WEB_VIEW_ENABLED("playlist-web-view-enabled"),
    PREMIUM_DESTINATION_BADGE("premium_destination_badge_override"),
    PREMIUM_DESTINATION_DEV("premium_destination_dev"),
    PREMIUM_DESTINATION_LOCAL_HUBS("premium_destination_local_hubs"),
    PREMIUM_DESTINATION_OVERRIDE_PAGE_SOURCE("premium_destination_override_page_source"),
    PREMIUM_DESTINATION_SAMSUNG_ELIGIBILITY_OVERRIDE("premium_destination_samsung_eligibility_override"),
    PREMIUM_DESTINATION_SHOW_UNSAFE_UNPUBLISHED_CONTENT("premium_destination_show_unsafe_unpublished_content"),
    PRE_SIGN_UP_EXPERIMENT_ENABLED("enable_pre_sign_up_experiment"),
    RUNNING_BETA_SERVER("running_beta_server"),
    SHOW_PAGE_INFO("show-page-info"),
    SIGNUP_USE_STAGING_ENDPOINT("signup_use_staging_endpoint"),
    SOCIAL_LISTENING_EDUCATION("social_listening_education"),
    SOCIAL_LISTENING_MOBIUS_LOGGING("social_listening_mobius_logging"),
    SUPERBIRD_RECORD_VOICE("superbird_record_voice"),
    TELCO_OFFER_ALLOW_GET_PREMIUM("telco_offer_allow_get_premium"),
    TERMS_AND_CONDITIONS_NEVER_AGREE_OVERRIDE("terms_and_conditions_never_agree_override"),
    TERMS_AND_CONDITIONS_NO_CACHE_OVERRIDE("terms_and_conditions_no_cache_override"),
    TERMS_AND_CONDITIONS_POSTPONE_OVERRIDE("terms_and_conditions_postpone_override"),
    UBI_IN_LOGCAT_IMPRESSION("ubi_in_logcat_impression"),
    UBI_IN_LOGCAT_INTERACTION("ubi_in_logcat_interaction"),
    UPDATE_NAG_TEST_VERSIONS_SOURCE("update_nag_on_will_use_testing_versions_source"),
    USER_DETAILS_CONFIRMATION_ENABLED("enable_fb_user_details_confirmation"),
    USE_LEGACY_VIDEO_RENDERER("use_legacy_video_renderer"),
    VIDEO_OVERLAY_INFO("video_overylay_info"),
    VOICE_DISABLE_LANGUAGE_RESTRICTION("voice_disable_language_restriction"),
    VOICE_SAVE_AUDIO("voice_save_audio_in_backend"),
    YOUR_LIBRARY_MUSIC_PAGES_ENABLE_DEBUG_OVERLAY("your_library_music_pages_enable_debug_overlay"),
    YOUR_LIBRARY_MUSIC_PAGES_ENABLE_MOBIUS_LOGGING("your_library_music_pages_enable_mobius_logging");
    
    private final String mPrefsKey;

    private DebugFlag(String str) {
        this.mPrefsKey = str;
    }
}

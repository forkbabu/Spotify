package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidLibsAdsCommonProperties;
import com.spotify.remoteconfig.xe;

public final /* synthetic */ class t2 implements o0e {
    public static final /* synthetic */ t2 a = new t2();

    private /* synthetic */ t2() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("android-libs-ads-common", "ads_android_turn_on_comscore", false);
        int c = p0e.c("android-libs-ads-common", "ads_audio_plus__fetch_timer", 120, 300, 155);
        AndroidLibsAdsCommonProperties.AdsAudioPlusFormat adsAudioPlusFormat = AndroidLibsAdsCommonProperties.AdsAudioPlusFormat.NONE;
        AndroidLibsAdsCommonProperties.AdsAudioPlusVersion adsAudioPlusVersion = AndroidLibsAdsCommonProperties.AdsAudioPlusVersion.V2;
        AndroidLibsAdsCommonProperties.AdsBookmarkableFormatsAndroid adsBookmarkableFormatsAndroid = AndroidLibsAdsCommonProperties.AdsBookmarkableFormatsAndroid.NONE;
        boolean a3 = p0e.a("android-libs-ads-common", "ads_core_sponsored_sessions", false);
        boolean a4 = p0e.a("android-libs-ads-common", "ads_enable_carousel_topbanner_android", false);
        boolean a5 = p0e.a("android-libs-ads-common", "ads_enable_one_trust_cmp_android", false);
        AndroidLibsAdsCommonProperties.AdsInAppBrowserAndroid adsInAppBrowserAndroid = AndroidLibsAdsCommonProperties.AdsInAppBrowserAndroid.CONTROL;
        AndroidLibsAdsCommonProperties.AdsInAppBrowserAndroid adsInAppBrowserAndroid2 = (AndroidLibsAdsCommonProperties.AdsInAppBrowserAndroid) p0e.b("android-libs-ads-common", "ads_in_app_browser_android", adsInAppBrowserAndroid);
        boolean a6 = p0e.a("android-libs-ads-common", "enable_image_loading_for_espresso_tests", false);
        boolean a7 = p0e.a("android-libs-ads-common", "enable_video_leave_behind_android", false);
        boolean a8 = p0e.a("android-libs-ads-common", "title_advertiser_concat_enabled_android", false);
        boolean a9 = p0e.a("android-libs-ads-common", "title_advertiser_concat_enabled_for_video_android", false);
        boolean a10 = p0e.a("android-libs-ads-common", "voice_ads_enabled", false);
        xe.b bVar = new xe.b();
        bVar.a(false);
        bVar.b(155);
        bVar.c(adsAudioPlusFormat);
        bVar.d(adsAudioPlusVersion);
        bVar.e(adsBookmarkableFormatsAndroid);
        bVar.f(false);
        bVar.g(false);
        bVar.h(false);
        bVar.i(adsInAppBrowserAndroid);
        bVar.k(false);
        bVar.l(false);
        bVar.m(false);
        bVar.n(false);
        bVar.o(false);
        bVar.a(a2);
        bVar.b(c);
        bVar.c((AndroidLibsAdsCommonProperties.AdsAudioPlusFormat) p0e.b("android-libs-ads-common", "ads_audio_plus_format", adsAudioPlusFormat));
        bVar.d((AndroidLibsAdsCommonProperties.AdsAudioPlusVersion) p0e.b("android-libs-ads-common", "ads_audio_plus_version", adsAudioPlusVersion));
        bVar.e((AndroidLibsAdsCommonProperties.AdsBookmarkableFormatsAndroid) p0e.b("android-libs-ads-common", "ads_bookmarkable_formats_android", adsBookmarkableFormatsAndroid));
        bVar.f(a3);
        bVar.g(a4);
        bVar.h(a5);
        bVar.i(adsInAppBrowserAndroid2);
        bVar.k(a6);
        bVar.l(a7);
        bVar.m(a8);
        bVar.n(a9);
        bVar.o(a10);
        AndroidLibsAdsCommonProperties j = bVar.j();
        if (j.b() >= 120 && j.b() <= 300) {
            return j;
        }
        throw new IllegalArgumentException("Value for adsAudioPlusFetchTimer() out of bounds");
    }
}

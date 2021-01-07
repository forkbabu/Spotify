package defpackage;

import com.spotify.remoteconfig.AndroidLibsAdsCommonProperties;

/* renamed from: ws3  reason: default package */
public class ws3 {
    private final AndroidLibsAdsCommonProperties a;

    public ws3(AndroidLibsAdsCommonProperties androidLibsAdsCommonProperties) {
        this.a = androidLibsAdsCommonProperties;
    }

    public boolean a() {
        return this.a.e() == AndroidLibsAdsCommonProperties.AdsBookmarkableFormatsAndroid.BASE_WITH_AUDIOPLUS;
    }

    public boolean b() {
        return this.a.e() == AndroidLibsAdsCommonProperties.AdsBookmarkableFormatsAndroid.BASE_ADS;
    }

    public boolean c() {
        return this.a.e() != AndroidLibsAdsCommonProperties.AdsBookmarkableFormatsAndroid.NONE;
    }
}

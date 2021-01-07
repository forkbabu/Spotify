package defpackage;

import com.spotify.remoteconfig.AndroidLibsAdsCommonProperties;

/* renamed from: jp3  reason: default package */
public class jp3 {
    private final AndroidLibsAdsCommonProperties a;

    public jp3(AndroidLibsAdsCommonProperties androidLibsAdsCommonProperties) {
        this.a = androidLibsAdsCommonProperties;
    }

    public int a() {
        return this.a.b();
    }

    public boolean b() {
        return this.a.c() != AndroidLibsAdsCommonProperties.AdsAudioPlusFormat.NONE;
    }

    public boolean c() {
        return this.a.c() == AndroidLibsAdsCommonProperties.AdsAudioPlusFormat.OVERLAY;
    }

    public boolean d() {
        return this.a.c() == AndroidLibsAdsCommonProperties.AdsAudioPlusFormat.TOP_BANNER;
    }

    public boolean e() {
        return this.a.d() == AndroidLibsAdsCommonProperties.AdsAudioPlusVersion.V2;
    }

    public boolean f() {
        return this.a.k();
    }
}

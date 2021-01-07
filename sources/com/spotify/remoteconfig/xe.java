package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidLibsAdsCommonProperties;

/* access modifiers changed from: package-private */
public final class xe extends AndroidLibsAdsCommonProperties {
    private final boolean a;
    private final int b;
    private final AndroidLibsAdsCommonProperties.AdsAudioPlusFormat c;
    private final AndroidLibsAdsCommonProperties.AdsAudioPlusVersion d;
    private final AndroidLibsAdsCommonProperties.AdsBookmarkableFormatsAndroid e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final AndroidLibsAdsCommonProperties.AdsInAppBrowserAndroid i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final boolean m;
    private final boolean n;

    static final class b extends AndroidLibsAdsCommonProperties.a {
        private Boolean a;
        private Integer b;
        private AndroidLibsAdsCommonProperties.AdsAudioPlusFormat c;
        private AndroidLibsAdsCommonProperties.AdsAudioPlusVersion d;
        private AndroidLibsAdsCommonProperties.AdsBookmarkableFormatsAndroid e;
        private Boolean f;
        private Boolean g;
        private Boolean h;
        private AndroidLibsAdsCommonProperties.AdsInAppBrowserAndroid i;
        private Boolean j;
        private Boolean k;
        private Boolean l;
        private Boolean m;
        private Boolean n;

        b() {
        }

        public AndroidLibsAdsCommonProperties.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public AndroidLibsAdsCommonProperties.a b(int i2) {
            this.b = Integer.valueOf(i2);
            return this;
        }

        public AndroidLibsAdsCommonProperties.a c(AndroidLibsAdsCommonProperties.AdsAudioPlusFormat adsAudioPlusFormat) {
            if (adsAudioPlusFormat != null) {
                this.c = adsAudioPlusFormat;
                return this;
            }
            throw new NullPointerException("Null adsAudioPlusFormat");
        }

        public AndroidLibsAdsCommonProperties.a d(AndroidLibsAdsCommonProperties.AdsAudioPlusVersion adsAudioPlusVersion) {
            if (adsAudioPlusVersion != null) {
                this.d = adsAudioPlusVersion;
                return this;
            }
            throw new NullPointerException("Null adsAudioPlusVersion");
        }

        public AndroidLibsAdsCommonProperties.a e(AndroidLibsAdsCommonProperties.AdsBookmarkableFormatsAndroid adsBookmarkableFormatsAndroid) {
            if (adsBookmarkableFormatsAndroid != null) {
                this.e = adsBookmarkableFormatsAndroid;
                return this;
            }
            throw new NullPointerException("Null adsBookmarkableFormatsAndroid");
        }

        public AndroidLibsAdsCommonProperties.a f(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        public AndroidLibsAdsCommonProperties.a g(boolean z) {
            this.g = Boolean.valueOf(z);
            return this;
        }

        public AndroidLibsAdsCommonProperties.a h(boolean z) {
            this.h = Boolean.valueOf(z);
            return this;
        }

        public AndroidLibsAdsCommonProperties.a i(AndroidLibsAdsCommonProperties.AdsInAppBrowserAndroid adsInAppBrowserAndroid) {
            if (adsInAppBrowserAndroid != null) {
                this.i = adsInAppBrowserAndroid;
                return this;
            }
            throw new NullPointerException("Null adsInAppBrowserAndroid");
        }

        /* access modifiers changed from: package-private */
        public AndroidLibsAdsCommonProperties j() {
            String str = this.a == null ? " adsAndroidTurnOnComscore" : "";
            if (this.b == null) {
                str = je.x0(str, " adsAudioPlusFetchTimer");
            }
            if (this.c == null) {
                str = je.x0(str, " adsAudioPlusFormat");
            }
            if (this.d == null) {
                str = je.x0(str, " adsAudioPlusVersion");
            }
            if (this.e == null) {
                str = je.x0(str, " adsBookmarkableFormatsAndroid");
            }
            if (this.f == null) {
                str = je.x0(str, " adsCoreSponsoredSessions");
            }
            if (this.g == null) {
                str = je.x0(str, " adsEnableCarouselTopbannerAndroid");
            }
            if (this.h == null) {
                str = je.x0(str, " adsEnableOneTrustCmpAndroid");
            }
            if (this.i == null) {
                str = je.x0(str, " adsInAppBrowserAndroid");
            }
            if (this.j == null) {
                str = je.x0(str, " enableImageLoadingForEspressoTests");
            }
            if (this.k == null) {
                str = je.x0(str, " enableVideoLeaveBehindAndroid");
            }
            if (this.l == null) {
                str = je.x0(str, " titleAdvertiserConcatEnabledAndroid");
            }
            if (this.m == null) {
                str = je.x0(str, " titleAdvertiserConcatEnabledForVideoAndroid");
            }
            if (this.n == null) {
                str = je.x0(str, " voiceAdsEnabled");
            }
            if (str.isEmpty()) {
                return new xe(this.a.booleanValue(), this.b.intValue(), this.c, this.d, this.e, this.f.booleanValue(), this.g.booleanValue(), this.h.booleanValue(), this.i, this.j.booleanValue(), this.k.booleanValue(), this.l.booleanValue(), this.m.booleanValue(), this.n.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public AndroidLibsAdsCommonProperties.a k(boolean z) {
            this.j = Boolean.valueOf(z);
            return this;
        }

        public AndroidLibsAdsCommonProperties.a l(boolean z) {
            this.k = Boolean.valueOf(z);
            return this;
        }

        public AndroidLibsAdsCommonProperties.a m(boolean z) {
            this.l = Boolean.valueOf(z);
            return this;
        }

        public AndroidLibsAdsCommonProperties.a n(boolean z) {
            this.m = Boolean.valueOf(z);
            return this;
        }

        public AndroidLibsAdsCommonProperties.a o(boolean z) {
            this.n = Boolean.valueOf(z);
            return this;
        }
    }

    xe(boolean z, int i2, AndroidLibsAdsCommonProperties.AdsAudioPlusFormat adsAudioPlusFormat, AndroidLibsAdsCommonProperties.AdsAudioPlusVersion adsAudioPlusVersion, AndroidLibsAdsCommonProperties.AdsBookmarkableFormatsAndroid adsBookmarkableFormatsAndroid, boolean z2, boolean z3, boolean z4, AndroidLibsAdsCommonProperties.AdsInAppBrowserAndroid adsInAppBrowserAndroid, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, a aVar) {
        this.a = z;
        this.b = i2;
        this.c = adsAudioPlusFormat;
        this.d = adsAudioPlusVersion;
        this.e = adsBookmarkableFormatsAndroid;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = adsInAppBrowserAndroid;
        this.j = z5;
        this.k = z6;
        this.l = z7;
        this.m = z8;
        this.n = z9;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsAdsCommonProperties
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsAdsCommonProperties
    public int b() {
        return this.b;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsAdsCommonProperties
    public AndroidLibsAdsCommonProperties.AdsAudioPlusFormat c() {
        return this.c;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsAdsCommonProperties
    public AndroidLibsAdsCommonProperties.AdsAudioPlusVersion d() {
        return this.d;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsAdsCommonProperties
    public AndroidLibsAdsCommonProperties.AdsBookmarkableFormatsAndroid e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AndroidLibsAdsCommonProperties)) {
            return false;
        }
        AndroidLibsAdsCommonProperties androidLibsAdsCommonProperties = (AndroidLibsAdsCommonProperties) obj;
        if (this.a == androidLibsAdsCommonProperties.a() && this.b == androidLibsAdsCommonProperties.b() && this.c.equals(androidLibsAdsCommonProperties.c()) && this.d.equals(androidLibsAdsCommonProperties.d()) && this.e.equals(androidLibsAdsCommonProperties.e()) && this.f == androidLibsAdsCommonProperties.f() && this.g == androidLibsAdsCommonProperties.g() && this.h == androidLibsAdsCommonProperties.h() && this.i.equals(androidLibsAdsCommonProperties.i()) && this.j == androidLibsAdsCommonProperties.j() && this.k == androidLibsAdsCommonProperties.k() && this.l == androidLibsAdsCommonProperties.l() && this.m == androidLibsAdsCommonProperties.m() && this.n == androidLibsAdsCommonProperties.n()) {
            return true;
        }
        return false;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsAdsCommonProperties
    public boolean f() {
        return this.f;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsAdsCommonProperties
    public boolean g() {
        return this.g;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsAdsCommonProperties
    public boolean h() {
        return this.h;
    }

    public int hashCode() {
        int i2 = 1231;
        int hashCode = ((((((((((((((((((((((((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ (this.g ? 1231 : 1237)) * 1000003) ^ (this.h ? 1231 : 1237)) * 1000003) ^ this.i.hashCode()) * 1000003) ^ (this.j ? 1231 : 1237)) * 1000003) ^ (this.k ? 1231 : 1237)) * 1000003) ^ (this.l ? 1231 : 1237)) * 1000003) ^ (this.m ? 1231 : 1237)) * 1000003;
        if (!this.n) {
            i2 = 1237;
        }
        return hashCode ^ i2;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsAdsCommonProperties
    public AndroidLibsAdsCommonProperties.AdsInAppBrowserAndroid i() {
        return this.i;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsAdsCommonProperties
    public boolean j() {
        return this.j;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsAdsCommonProperties
    public boolean k() {
        return this.k;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsAdsCommonProperties
    public boolean l() {
        return this.l;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsAdsCommonProperties
    public boolean m() {
        return this.m;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsAdsCommonProperties
    public boolean n() {
        return this.n;
    }

    public String toString() {
        StringBuilder V0 = je.V0("AndroidLibsAdsCommonProperties{adsAndroidTurnOnComscore=");
        V0.append(this.a);
        V0.append(", adsAudioPlusFetchTimer=");
        V0.append(this.b);
        V0.append(", adsAudioPlusFormat=");
        V0.append(this.c);
        V0.append(", adsAudioPlusVersion=");
        V0.append(this.d);
        V0.append(", adsBookmarkableFormatsAndroid=");
        V0.append(this.e);
        V0.append(", adsCoreSponsoredSessions=");
        V0.append(this.f);
        V0.append(", adsEnableCarouselTopbannerAndroid=");
        V0.append(this.g);
        V0.append(", adsEnableOneTrustCmpAndroid=");
        V0.append(this.h);
        V0.append(", adsInAppBrowserAndroid=");
        V0.append(this.i);
        V0.append(", enableImageLoadingForEspressoTests=");
        V0.append(this.j);
        V0.append(", enableVideoLeaveBehindAndroid=");
        V0.append(this.k);
        V0.append(", titleAdvertiserConcatEnabledAndroid=");
        V0.append(this.l);
        V0.append(", titleAdvertiserConcatEnabledForVideoAndroid=");
        V0.append(this.m);
        V0.append(", voiceAdsEnabled=");
        return je.P0(V0, this.n, "}");
    }
}

package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidFeatureSpotonProperties;

final class me extends AndroidFeatureSpotonProperties {
    private final boolean a;
    private final AndroidFeatureSpotonProperties.SpotonOnboardingTts b;
    private final AndroidFeatureSpotonProperties.SpotonPlaylistWhatsPlayingTts c;

    static final class b extends AndroidFeatureSpotonProperties.a {
        private Boolean a;
        private AndroidFeatureSpotonProperties.SpotonOnboardingTts b;
        private AndroidFeatureSpotonProperties.SpotonPlaylistWhatsPlayingTts c;

        b() {
        }

        public AndroidFeatureSpotonProperties a() {
            String str = this.a == null ? " spotonFeatureEnabled" : "";
            if (this.b == null) {
                str = je.x0(str, " spotonOnboardingTts");
            }
            if (this.c == null) {
                str = je.x0(str, " spotonPlaylistWhatsPlayingTts");
            }
            if (str.isEmpty()) {
                return new me(this.a.booleanValue(), this.b, this.c, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public AndroidFeatureSpotonProperties.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public AndroidFeatureSpotonProperties.a c(AndroidFeatureSpotonProperties.SpotonOnboardingTts spotonOnboardingTts) {
            if (spotonOnboardingTts != null) {
                this.b = spotonOnboardingTts;
                return this;
            }
            throw new NullPointerException("Null spotonOnboardingTts");
        }

        public AndroidFeatureSpotonProperties.a d(AndroidFeatureSpotonProperties.SpotonPlaylistWhatsPlayingTts spotonPlaylistWhatsPlayingTts) {
            if (spotonPlaylistWhatsPlayingTts != null) {
                this.c = spotonPlaylistWhatsPlayingTts;
                return this;
            }
            throw new NullPointerException("Null spotonPlaylistWhatsPlayingTts");
        }
    }

    me(boolean z, AndroidFeatureSpotonProperties.SpotonOnboardingTts spotonOnboardingTts, AndroidFeatureSpotonProperties.SpotonPlaylistWhatsPlayingTts spotonPlaylistWhatsPlayingTts, a aVar) {
        this.a = z;
        this.b = spotonOnboardingTts;
        this.c = spotonPlaylistWhatsPlayingTts;
    }

    @Override // com.spotify.remoteconfig.AndroidFeatureSpotonProperties
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.AndroidFeatureSpotonProperties
    public AndroidFeatureSpotonProperties.SpotonOnboardingTts b() {
        return this.b;
    }

    @Override // com.spotify.remoteconfig.AndroidFeatureSpotonProperties
    public AndroidFeatureSpotonProperties.SpotonPlaylistWhatsPlayingTts c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AndroidFeatureSpotonProperties)) {
            return false;
        }
        AndroidFeatureSpotonProperties androidFeatureSpotonProperties = (AndroidFeatureSpotonProperties) obj;
        if (this.a != androidFeatureSpotonProperties.a() || !this.b.equals(androidFeatureSpotonProperties.b()) || !this.c.equals(androidFeatureSpotonProperties.c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("AndroidFeatureSpotonProperties{spotonFeatureEnabled=");
        V0.append(this.a);
        V0.append(", spotonOnboardingTts=");
        V0.append(this.b);
        V0.append(", spotonPlaylistWhatsPlayingTts=");
        V0.append(this.c);
        V0.append("}");
        return V0.toString();
    }
}

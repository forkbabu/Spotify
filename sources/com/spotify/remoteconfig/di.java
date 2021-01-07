package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AppsMusicFeaturesRemoteconfigurationProperties;

final class di extends AppsMusicFeaturesRemoteconfigurationProperties {
    private final boolean a;
    private final AppsMusicFeaturesRemoteconfigurationProperties.ButtonColor b;
    private final AppsMusicFeaturesRemoteconfigurationProperties.Message c;

    static final class b extends AppsMusicFeaturesRemoteconfigurationProperties.a {
        private Boolean a;
        private AppsMusicFeaturesRemoteconfigurationProperties.ButtonColor b;
        private AppsMusicFeaturesRemoteconfigurationProperties.Message c;

        b() {
        }

        public AppsMusicFeaturesRemoteconfigurationProperties a() {
            String str = this.a == null ? " buttonBig" : "";
            if (this.b == null) {
                str = je.x0(str, " buttonColor");
            }
            if (this.c == null) {
                str = je.x0(str, " message");
            }
            if (str.isEmpty()) {
                return new di(this.a.booleanValue(), this.b, this.c, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public AppsMusicFeaturesRemoteconfigurationProperties.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public AppsMusicFeaturesRemoteconfigurationProperties.a c(AppsMusicFeaturesRemoteconfigurationProperties.ButtonColor buttonColor) {
            if (buttonColor != null) {
                this.b = buttonColor;
                return this;
            }
            throw new NullPointerException("Null buttonColor");
        }

        public AppsMusicFeaturesRemoteconfigurationProperties.a d(AppsMusicFeaturesRemoteconfigurationProperties.Message message) {
            if (message != null) {
                this.c = message;
                return this;
            }
            throw new NullPointerException("Null message");
        }
    }

    di(boolean z, AppsMusicFeaturesRemoteconfigurationProperties.ButtonColor buttonColor, AppsMusicFeaturesRemoteconfigurationProperties.Message message, a aVar) {
        this.a = z;
        this.b = buttonColor;
        this.c = message;
    }

    @Override // com.spotify.remoteconfig.AppsMusicFeaturesRemoteconfigurationProperties
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.AppsMusicFeaturesRemoteconfigurationProperties
    public AppsMusicFeaturesRemoteconfigurationProperties.ButtonColor b() {
        return this.b;
    }

    @Override // com.spotify.remoteconfig.AppsMusicFeaturesRemoteconfigurationProperties
    public AppsMusicFeaturesRemoteconfigurationProperties.Message c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AppsMusicFeaturesRemoteconfigurationProperties)) {
            return false;
        }
        AppsMusicFeaturesRemoteconfigurationProperties appsMusicFeaturesRemoteconfigurationProperties = (AppsMusicFeaturesRemoteconfigurationProperties) obj;
        if (this.a != appsMusicFeaturesRemoteconfigurationProperties.a() || !this.b.equals(appsMusicFeaturesRemoteconfigurationProperties.b()) || !this.c.equals(appsMusicFeaturesRemoteconfigurationProperties.c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("AppsMusicFeaturesRemoteconfigurationProperties{buttonBig=");
        V0.append(this.a);
        V0.append(", buttonColor=");
        V0.append(this.b);
        V0.append(", message=");
        V0.append(this.c);
        V0.append("}");
        return V0.toString();
    }
}

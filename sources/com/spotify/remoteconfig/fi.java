package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AppsMusicLibsRemoteconfigProperties;

/* access modifiers changed from: package-private */
public final class fi extends AppsMusicLibsRemoteconfigProperties {
    private final AppsMusicLibsRemoteconfigProperties.RcAaTestProperty a;
    private final AppsMusicLibsRemoteconfigProperties.SettingsDebugLabel b;
    private final AppsMusicLibsRemoteconfigProperties.SimpleMessageTest c;

    static final class b extends AppsMusicLibsRemoteconfigProperties.a {
        private AppsMusicLibsRemoteconfigProperties.RcAaTestProperty a;
        private AppsMusicLibsRemoteconfigProperties.SettingsDebugLabel b;
        private AppsMusicLibsRemoteconfigProperties.SimpleMessageTest c;

        b() {
        }

        public AppsMusicLibsRemoteconfigProperties a() {
            String str = this.a == null ? " rcAaTestProperty" : "";
            if (this.b == null) {
                str = je.x0(str, " settingsDebugLabel");
            }
            if (this.c == null) {
                str = je.x0(str, " simpleMessageTest");
            }
            if (str.isEmpty()) {
                return new fi(this.a, this.b, this.c, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public AppsMusicLibsRemoteconfigProperties.a b(AppsMusicLibsRemoteconfigProperties.RcAaTestProperty rcAaTestProperty) {
            if (rcAaTestProperty != null) {
                this.a = rcAaTestProperty;
                return this;
            }
            throw new NullPointerException("Null rcAaTestProperty");
        }

        public AppsMusicLibsRemoteconfigProperties.a c(AppsMusicLibsRemoteconfigProperties.SettingsDebugLabel settingsDebugLabel) {
            if (settingsDebugLabel != null) {
                this.b = settingsDebugLabel;
                return this;
            }
            throw new NullPointerException("Null settingsDebugLabel");
        }

        public AppsMusicLibsRemoteconfigProperties.a d(AppsMusicLibsRemoteconfigProperties.SimpleMessageTest simpleMessageTest) {
            if (simpleMessageTest != null) {
                this.c = simpleMessageTest;
                return this;
            }
            throw new NullPointerException("Null simpleMessageTest");
        }
    }

    fi(AppsMusicLibsRemoteconfigProperties.RcAaTestProperty rcAaTestProperty, AppsMusicLibsRemoteconfigProperties.SettingsDebugLabel settingsDebugLabel, AppsMusicLibsRemoteconfigProperties.SimpleMessageTest simpleMessageTest, a aVar) {
        this.a = rcAaTestProperty;
        this.b = settingsDebugLabel;
        this.c = simpleMessageTest;
    }

    @Override // com.spotify.remoteconfig.AppsMusicLibsRemoteconfigProperties
    public AppsMusicLibsRemoteconfigProperties.RcAaTestProperty a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.AppsMusicLibsRemoteconfigProperties
    public AppsMusicLibsRemoteconfigProperties.SettingsDebugLabel b() {
        return this.b;
    }

    @Override // com.spotify.remoteconfig.AppsMusicLibsRemoteconfigProperties
    public AppsMusicLibsRemoteconfigProperties.SimpleMessageTest c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AppsMusicLibsRemoteconfigProperties)) {
            return false;
        }
        AppsMusicLibsRemoteconfigProperties appsMusicLibsRemoteconfigProperties = (AppsMusicLibsRemoteconfigProperties) obj;
        if (!this.a.equals(appsMusicLibsRemoteconfigProperties.a()) || !this.b.equals(appsMusicLibsRemoteconfigProperties.b()) || !this.c.equals(appsMusicLibsRemoteconfigProperties.c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("AppsMusicLibsRemoteconfigProperties{rcAaTestProperty=");
        V0.append(this.a);
        V0.append(", settingsDebugLabel=");
        V0.append(this.b);
        V0.append(", simpleMessageTest=");
        V0.append(this.c);
        V0.append("}");
        return V0.toString();
    }
}

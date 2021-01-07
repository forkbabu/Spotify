package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidLibsOfflineTrialsProperties;

/* access modifiers changed from: package-private */
public final class xf extends AndroidLibsOfflineTrialsProperties {
    private final AndroidLibsOfflineTrialsProperties.OfflineDailyCap a;
    private final boolean b;
    private final boolean c;

    static final class b extends AndroidLibsOfflineTrialsProperties.a {
        private AndroidLibsOfflineTrialsProperties.OfflineDailyCap a;
        private Boolean b;
        private Boolean c;

        b() {
        }

        public AndroidLibsOfflineTrialsProperties a() {
            String str = this.a == null ? " offlineDailyCap" : "";
            if (this.b == null) {
                str = je.x0(str, " spotifyCuratedOfflineMixEnabled");
            }
            if (this.c == null) {
                str = je.x0(str, " userCuratedOfflineMixEnabled");
            }
            if (str.isEmpty()) {
                return new xf(this.a, this.b.booleanValue(), this.c.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public AndroidLibsOfflineTrialsProperties.a b(AndroidLibsOfflineTrialsProperties.OfflineDailyCap offlineDailyCap) {
            if (offlineDailyCap != null) {
                this.a = offlineDailyCap;
                return this;
            }
            throw new NullPointerException("Null offlineDailyCap");
        }

        public AndroidLibsOfflineTrialsProperties.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public AndroidLibsOfflineTrialsProperties.a d(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }
    }

    xf(AndroidLibsOfflineTrialsProperties.OfflineDailyCap offlineDailyCap, boolean z, boolean z2, a aVar) {
        this.a = offlineDailyCap;
        this.b = z;
        this.c = z2;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsOfflineTrialsProperties
    public AndroidLibsOfflineTrialsProperties.OfflineDailyCap a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsOfflineTrialsProperties
    public boolean b() {
        return this.b;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsOfflineTrialsProperties
    public boolean c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AndroidLibsOfflineTrialsProperties)) {
            return false;
        }
        AndroidLibsOfflineTrialsProperties androidLibsOfflineTrialsProperties = (AndroidLibsOfflineTrialsProperties) obj;
        if (this.a.equals(androidLibsOfflineTrialsProperties.a()) && this.b == androidLibsOfflineTrialsProperties.b() && this.c == androidLibsOfflineTrialsProperties.c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 1231;
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003;
        if (!this.c) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("AndroidLibsOfflineTrialsProperties{offlineDailyCap=");
        V0.append(this.a);
        V0.append(", spotifyCuratedOfflineMixEnabled=");
        V0.append(this.b);
        V0.append(", userCuratedOfflineMixEnabled=");
        return je.P0(V0, this.c, "}");
    }
}

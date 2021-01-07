package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidLibsYourEpisodesFlagsProperties;

final class jh extends AndroidLibsYourEpisodesFlagsProperties {
    private final boolean a;
    private final AndroidLibsYourEpisodesFlagsProperties.EnableContextDownload b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final AndroidLibsYourEpisodesFlagsProperties.EnableYourEpisodes f;
    private final boolean g;

    static final class b extends AndroidLibsYourEpisodesFlagsProperties.a {
        private Boolean a;
        private AndroidLibsYourEpisodesFlagsProperties.EnableContextDownload b;
        private Boolean c;
        private Boolean d;
        private Boolean e;
        private AndroidLibsYourEpisodesFlagsProperties.EnableYourEpisodes f;
        private Boolean g;

        b() {
        }

        public AndroidLibsYourEpisodesFlagsProperties.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public AndroidLibsYourEpisodesFlagsProperties b() {
            String str = this.a == null ? " autoAddDownloadedEpisodesEnabled" : "";
            if (this.b == null) {
                str = je.x0(str, " enableContextDownload");
            }
            if (this.c == null) {
                str = je.x0(str, " enableDownloadAll");
            }
            if (this.d == null) {
                str = je.x0(str, " enableRecentlyPlayed");
            }
            if (this.e == null) {
                str = je.x0(str, " enableTooltip");
            }
            if (this.f == null) {
                str = je.x0(str, " enableYourEpisodes");
            }
            if (this.g == null) {
                str = je.x0(str, " rolloutNewPlayerApiInYourEpisodes");
            }
            if (str.isEmpty()) {
                return new jh(this.a.booleanValue(), this.b, this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), this.f, this.g.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public AndroidLibsYourEpisodesFlagsProperties.a c(AndroidLibsYourEpisodesFlagsProperties.EnableContextDownload enableContextDownload) {
            if (enableContextDownload != null) {
                this.b = enableContextDownload;
                return this;
            }
            throw new NullPointerException("Null enableContextDownload");
        }

        public AndroidLibsYourEpisodesFlagsProperties.a d(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public AndroidLibsYourEpisodesFlagsProperties.a e(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public AndroidLibsYourEpisodesFlagsProperties.a f(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        public AndroidLibsYourEpisodesFlagsProperties.a g(AndroidLibsYourEpisodesFlagsProperties.EnableYourEpisodes enableYourEpisodes) {
            if (enableYourEpisodes != null) {
                this.f = enableYourEpisodes;
                return this;
            }
            throw new NullPointerException("Null enableYourEpisodes");
        }

        public AndroidLibsYourEpisodesFlagsProperties.a h(boolean z) {
            this.g = Boolean.valueOf(z);
            return this;
        }
    }

    jh(boolean z, AndroidLibsYourEpisodesFlagsProperties.EnableContextDownload enableContextDownload, boolean z2, boolean z3, boolean z4, AndroidLibsYourEpisodesFlagsProperties.EnableYourEpisodes enableYourEpisodes, boolean z5, a aVar) {
        this.a = z;
        this.b = enableContextDownload;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = enableYourEpisodes;
        this.g = z5;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsYourEpisodesFlagsProperties
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsYourEpisodesFlagsProperties
    public AndroidLibsYourEpisodesFlagsProperties.EnableContextDownload b() {
        return this.b;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsYourEpisodesFlagsProperties
    public boolean c() {
        return this.c;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsYourEpisodesFlagsProperties
    public boolean d() {
        return this.d;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsYourEpisodesFlagsProperties
    public boolean e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AndroidLibsYourEpisodesFlagsProperties)) {
            return false;
        }
        AndroidLibsYourEpisodesFlagsProperties androidLibsYourEpisodesFlagsProperties = (AndroidLibsYourEpisodesFlagsProperties) obj;
        if (this.a == androidLibsYourEpisodesFlagsProperties.a() && this.b.equals(androidLibsYourEpisodesFlagsProperties.b()) && this.c == androidLibsYourEpisodesFlagsProperties.c() && this.d == androidLibsYourEpisodesFlagsProperties.d() && this.e == androidLibsYourEpisodesFlagsProperties.e() && this.f.equals(androidLibsYourEpisodesFlagsProperties.f()) && this.g == androidLibsYourEpisodesFlagsProperties.g()) {
            return true;
        }
        return false;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsYourEpisodesFlagsProperties
    public AndroidLibsYourEpisodesFlagsProperties.EnableYourEpisodes f() {
        return this.f;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsYourEpisodesFlagsProperties
    public boolean g() {
        return this.g;
    }

    public int hashCode() {
        int i = 1231;
        int hashCode = ((((((((((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003) ^ this.f.hashCode()) * 1000003;
        if (!this.g) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("AndroidLibsYourEpisodesFlagsProperties{autoAddDownloadedEpisodesEnabled=");
        V0.append(this.a);
        V0.append(", enableContextDownload=");
        V0.append(this.b);
        V0.append(", enableDownloadAll=");
        V0.append(this.c);
        V0.append(", enableRecentlyPlayed=");
        V0.append(this.d);
        V0.append(", enableTooltip=");
        V0.append(this.e);
        V0.append(", enableYourEpisodes=");
        V0.append(this.f);
        V0.append(", rolloutNewPlayerApiInYourEpisodes=");
        return je.P0(V0, this.g, "}");
    }
}

package com.spotify.remoteconfig;

import com.spotify.remoteconfig.m6;

final class de extends m6 {
    private final boolean a;
    private final boolean b;

    static final class b extends m6.a {
        private Boolean a;
        private Boolean b;

        b() {
        }

        public m6 a() {
            String str = this.a == null ? " episodeTranscriptEnabled" : "";
            if (this.b == null) {
                str = je.x0(str, " episodeTranscriptMetadataEnabled");
            }
            if (str.isEmpty()) {
                return new de(this.a.booleanValue(), this.b.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public m6.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public m6.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }
    }

    de(boolean z, boolean z2, a aVar) {
        this.a = z;
        this.b = z2;
    }

    @Override // com.spotify.remoteconfig.m6
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.m6
    public boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m6)) {
            return false;
        }
        m6 m6Var = (m6) obj;
        if (this.a == m6Var.a() && this.b == m6Var.b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 1231;
        int i2 = ((this.a ? 1231 : 1237) ^ 1000003) * 1000003;
        if (!this.b) {
            i = 1237;
        }
        return i2 ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("AndroidFeaturePodcastEpisodetranscriptProperties{episodeTranscriptEnabled=");
        V0.append(this.a);
        V0.append(", episodeTranscriptMetadataEnabled=");
        return je.P0(V0, this.b, "}");
    }
}

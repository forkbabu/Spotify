package com.spotify.remoteconfig;

import com.spotify.remoteconfig.nb;

final class eh extends nb {
    private final boolean a;
    private final boolean b;

    static final class b extends nb.a {
        private Boolean a;
        private Boolean b;

        b() {
        }

        public nb a() {
            String str = this.a == null ? " voiceEnableFeature" : "";
            if (this.b == null) {
                str = je.x0(str, " voiceEnableLanguageExpansion");
            }
            if (str.isEmpty()) {
                return new eh(this.a.booleanValue(), this.b.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public nb.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public nb.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }
    }

    eh(boolean z, boolean z2, a aVar) {
        this.a = z;
        this.b = z2;
    }

    @Override // com.spotify.remoteconfig.nb
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.nb
    public boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nb)) {
            return false;
        }
        nb nbVar = (nb) obj;
        if (this.a == nbVar.a() && this.b == nbVar.b()) {
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
        StringBuilder V0 = je.V0("AndroidLibsVoiceCommonProperties{voiceEnableFeature=");
        V0.append(this.a);
        V0.append(", voiceEnableLanguageExpansion=");
        return je.P0(V0, this.b, "}");
    }
}

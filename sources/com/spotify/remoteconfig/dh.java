package com.spotify.remoteconfig;

import com.spotify.remoteconfig.lb;

final class dh extends lb {
    private final boolean a;

    static final class b extends lb.a {
        private Boolean a;

        b() {
        }

        public lb a() {
            String str = this.a == null ? " voiceEnableGrpc" : "";
            if (str.isEmpty()) {
                return new dh(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public lb.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    dh(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.lb
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lb) || this.a != ((lb) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("AndroidLibsVoiceApiProperties{voiceEnableGrpc="), this.a, "}");
    }
}

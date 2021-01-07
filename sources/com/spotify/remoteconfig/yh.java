package com.spotify.remoteconfig;

import com.spotify.remoteconfig.qc;

final class yh extends qc {
    private final boolean a;

    static final class b extends qc.a {
        private Boolean a;

        b() {
        }

        public qc a() {
            String str = this.a == null ? " enableUtteranceSuggestionsInSearch" : "";
            if (str.isEmpty()) {
                return new yh(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public qc.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    yh(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.qc
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qc) || this.a != ((qc) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("AndroidMusicLibsUtteranceSuggestionsProperties{enableUtteranceSuggestionsInSearch="), this.a, "}");
    }
}

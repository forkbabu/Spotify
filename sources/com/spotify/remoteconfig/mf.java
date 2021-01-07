package com.spotify.remoteconfig;

import com.spotify.remoteconfig.o8;

final class mf extends o8 {
    private final boolean a;

    static final class b extends o8.a {
        private Boolean a;

        b() {
        }

        public o8 a() {
            String str = this.a == null ? " enableShare" : "";
            if (str.isEmpty()) {
                return new mf(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public o8.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    mf(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.o8
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o8) || this.a != ((o8) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("AndroidLibsLyricsShareProperties{enableShare="), this.a, "}");
    }
}

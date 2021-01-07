package com.spotify.remoteconfig;

import com.spotify.remoteconfig.dc;

/* access modifiers changed from: package-private */
public final class rh extends dc {
    private final boolean a;

    static final class b extends dc.a {
        private Boolean a;

        b() {
        }

        public dc a() {
            String str = this.a == null ? " productStateDisableFromUcs" : "";
            if (str.isEmpty()) {
                return new rh(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public dc.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    rh(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.dc
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dc) || this.a != ((dc) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("AndroidMusicLibsHttpProperties{productStateDisableFromUcs="), this.a, "}");
    }
}

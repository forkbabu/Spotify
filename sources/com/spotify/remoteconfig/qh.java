package com.spotify.remoteconfig;

import com.spotify.remoteconfig.bc;

/* access modifiers changed from: package-private */
public final class qh extends bc {
    private final boolean a;

    static final class b extends bc.a {
        private Boolean a;

        b() {
        }

        public bc a() {
            String str = this.a == null ? " employeePodcastsEnableFeature" : "";
            if (str.isEmpty()) {
                return new qh(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public bc.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    qh(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.bc
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bc) || this.a != ((bc) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("AndroidMusicLibsEmployeePodcastsFlagsProperties{employeePodcastsEnableFeature="), this.a, "}");
    }
}

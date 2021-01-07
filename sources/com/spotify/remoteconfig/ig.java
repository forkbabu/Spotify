package com.spotify.remoteconfig;

import com.spotify.remoteconfig.z9;

/* access modifiers changed from: package-private */
public final class ig extends z9 {
    private final boolean a;

    static final class b extends z9.a {
        private Boolean a;

        b() {
        }

        public z9 a() {
            String str = this.a == null ? " enableEncoreTrackrows" : "";
            if (str.isEmpty()) {
                return new ig(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public z9.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    ig(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.z9
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z9) || this.a != ((z9) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("AndroidLibsPlaylistExtenderProperties{enableEncoreTrackrows="), this.a, "}");
    }
}

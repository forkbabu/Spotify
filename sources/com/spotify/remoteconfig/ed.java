package com.spotify.remoteconfig;

import com.spotify.remoteconfig.z4;

final class ed extends z4 {
    private final boolean a;

    static final class b extends z4.a {
        private Boolean a;

        b() {
        }

        public z4 a() {
            String str = this.a == null ? " enableSynchronousImageLoading" : "";
            if (str.isEmpty()) {
                return new ed(this.a.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public z4.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    ed(boolean z, a aVar) {
        this.a = z;
    }

    @Override // com.spotify.remoteconfig.z4
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z4) || this.a != ((z4) obj).a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.a ? 1231 : 1237) ^ 1000003;
    }

    public String toString() {
        return je.P0(je.V0("AndroidExternalIntegrationServiceProperties{enableSynchronousImageLoading="), this.a, "}");
    }
}

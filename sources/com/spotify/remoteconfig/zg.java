package com.spotify.remoteconfig;

import com.spotify.remoteconfig.db;

/* access modifiers changed from: package-private */
public final class zg extends db {
    private final boolean a;
    private final boolean b;

    static final class b extends db.a {
        private Boolean a;
        private Boolean b;

        b() {
        }

        public db a() {
            String str = this.a == null ? " enableStorylines" : "";
            if (this.b == null) {
                str = je.x0(str, " useContextTrackExtensions");
            }
            if (str.isEmpty()) {
                return new zg(this.a.booleanValue(), this.b.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public db.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public db.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }
    }

    zg(boolean z, boolean z2, a aVar) {
        this.a = z;
        this.b = z2;
    }

    @Override // com.spotify.remoteconfig.db
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.db
    public boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof db)) {
            return false;
        }
        db dbVar = (db) obj;
        if (this.a == dbVar.a() && this.b == dbVar.b()) {
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
        StringBuilder V0 = je.V0("AndroidLibsStorylinesProperties{enableStorylines=");
        V0.append(this.a);
        V0.append(", useContextTrackExtensions=");
        return je.P0(V0, this.b, "}");
    }
}

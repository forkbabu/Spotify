package com.spotify.remoteconfig;

import com.spotify.remoteconfig.pj;

final class pi extends pj {
    private final boolean a;
    private final boolean b;
    private final boolean c;

    static final class b extends pj.a {
        private Boolean a;
        private Boolean b;
        private Boolean c;

        b() {
        }

        public pj a() {
            String str = this.a == null ? " enableDownloadPreferredResourceType" : "";
            if (this.b == null) {
                str = je.x0(str, " enableLocalFilesLibrary");
            }
            if (this.c == null) {
                str = je.x0(str, " enableStreamNonMeteredQuality");
            }
            if (str.isEmpty()) {
                return new pi(this.a.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public pj.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public pj.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public pj.a d(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }
    }

    pi(boolean z, boolean z2, boolean z3, a aVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    @Override // com.spotify.remoteconfig.pj
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.pj
    public boolean b() {
        return this.b;
    }

    @Override // com.spotify.remoteconfig.pj
    public boolean c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pj)) {
            return false;
        }
        pj pjVar = (pj) obj;
        if (this.a == pjVar.a() && this.b == pjVar.b() && this.c == pjVar.c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 1231;
        int i2 = ((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003;
        if (!this.c) {
            i = 1237;
        }
        return i2 ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("FetchSettingsProperties{enableDownloadPreferredResourceType=");
        V0.append(this.a);
        V0.append(", enableLocalFilesLibrary=");
        V0.append(this.b);
        V0.append(", enableStreamNonMeteredQuality=");
        return je.P0(V0, this.c, "}");
    }
}

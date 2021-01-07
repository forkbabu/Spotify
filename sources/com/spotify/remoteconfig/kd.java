package com.spotify.remoteconfig;

import com.spotify.remoteconfig.i5;

final class kd extends i5 {
    private final boolean a;
    private final boolean b;
    private final boolean c;

    static final class b extends i5.a {
        private Boolean a;
        private Boolean b;
        private Boolean c;

        b() {
        }

        public i5 a() {
            String str = this.a == null ? " enableEncoreGenreHubHeader" : "";
            if (this.b == null) {
                str = je.x0(str, " enableNewFindHeaderInBrowse");
            }
            if (this.c == null) {
                str = je.x0(str, " useNewFindCardOnly");
            }
            if (str.isEmpty()) {
                return new kd(this.a.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public i5.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public i5.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public i5.a d(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }
    }

    kd(boolean z, boolean z2, boolean z3, a aVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    @Override // com.spotify.remoteconfig.i5
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.i5
    public boolean b() {
        return this.b;
    }

    @Override // com.spotify.remoteconfig.i5
    public boolean c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i5)) {
            return false;
        }
        i5 i5Var = (i5) obj;
        if (this.a == i5Var.a() && this.b == i5Var.b() && this.c == i5Var.c()) {
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
        StringBuilder V0 = je.V0("AndroidFeatureBrowseProperties{enableEncoreGenreHubHeader=");
        V0.append(this.a);
        V0.append(", enableNewFindHeaderInBrowse=");
        V0.append(this.b);
        V0.append(", useNewFindCardOnly=");
        return je.P0(V0, this.c, "}");
    }
}

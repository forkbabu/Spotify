package com.spotify.remoteconfig;

import com.spotify.remoteconfig.a5;

/* access modifiers changed from: package-private */
public final class fd extends a5 {
    private final boolean a;
    private final int b;
    private final boolean c;

    static final class b extends a5.a {
        private Boolean a;
        private Integer b;
        private Boolean c;

        b() {
        }

        /* access modifiers changed from: package-private */
        public a5 a() {
            String str = this.a == null ? " enableFilter" : "";
            if (this.b == null) {
                str = je.x0(str, " filterTreshold");
            }
            if (this.c == null) {
                str = je.x0(str, " useShimmering");
            }
            if (str.isEmpty()) {
                return new fd(this.a.booleanValue(), this.b.intValue(), this.c.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public a5.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public a5.a c(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        public a5.a d(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }
    }

    fd(boolean z, int i, boolean z2, a aVar) {
        this.a = z;
        this.b = i;
        this.c = z2;
    }

    @Override // com.spotify.remoteconfig.a5
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.a5
    public int b() {
        return this.b;
    }

    @Override // com.spotify.remoteconfig.a5
    public boolean c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a5)) {
            return false;
        }
        a5 a5Var = (a5) obj;
        if (this.a == a5Var.a() && this.b == a5Var.b() && this.c == a5Var.c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 1231;
        int i2 = ((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.b) * 1000003;
        if (!this.c) {
            i = 1237;
        }
        return i2 ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("AndroidFeatureAddToPlaylistProperties{enableFilter=");
        V0.append(this.a);
        V0.append(", filterTreshold=");
        V0.append(this.b);
        V0.append(", useShimmering=");
        return je.P0(V0, this.c, "}");
    }
}

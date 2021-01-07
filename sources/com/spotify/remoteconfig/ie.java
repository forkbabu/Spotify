package com.spotify.remoteconfig;

import com.spotify.remoteconfig.s6;

final class ie extends s6 {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;

    static final class b extends s6.a {
        private Boolean a;
        private Boolean b;
        private Boolean c;
        private Boolean d;
        private Boolean e;

        b() {
        }

        public s6 a() {
            String str = this.a == null ? " changePhotoEnabled" : "";
            if (this.b == null) {
                str = je.x0(str, " editProfileEnabled");
            }
            if (this.c == null) {
                str = je.x0(str, " newProfilePageEnabled");
            }
            if (this.d == null) {
                str = je.x0(str, " oldProfilePageEnabled");
            }
            if (this.e == null) {
                str = je.x0(str, " usePageApi");
            }
            if (str.isEmpty()) {
                return new ie(this.a.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public s6.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public s6.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public s6.a d(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public s6.a e(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public s6.a f(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }
    }

    ie(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, a aVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
    }

    @Override // com.spotify.remoteconfig.s6
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.s6
    public boolean b() {
        return this.b;
    }

    @Override // com.spotify.remoteconfig.s6
    public boolean c() {
        return this.c;
    }

    @Override // com.spotify.remoteconfig.s6
    public boolean d() {
        return this.d;
    }

    @Override // com.spotify.remoteconfig.s6
    public boolean e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s6)) {
            return false;
        }
        s6 s6Var = (s6) obj;
        if (this.a == s6Var.a() && this.b == s6Var.b() && this.c == s6Var.c() && this.d == s6Var.d() && this.e == s6Var.e()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 1231;
        int i2 = ((((((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003;
        if (!this.e) {
            i = 1237;
        }
        return i2 ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("AndroidFeatureProfileProperties{changePhotoEnabled=");
        V0.append(this.a);
        V0.append(", editProfileEnabled=");
        V0.append(this.b);
        V0.append(", newProfilePageEnabled=");
        V0.append(this.c);
        V0.append(", oldProfilePageEnabled=");
        V0.append(this.d);
        V0.append(", usePageApi=");
        return je.P0(V0, this.e, "}");
    }
}

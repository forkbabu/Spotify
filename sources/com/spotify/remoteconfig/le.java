package com.spotify.remoteconfig;

import com.spotify.remoteconfig.x6;

final class le extends x6 {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;

    static final class b extends x6.a {
        private Boolean a;
        private Boolean b;
        private Boolean c;
        private Boolean d;
        private Boolean e;
        private Boolean f;
        private Boolean g;
        private Boolean h;
        private Boolean i;

        b() {
        }

        public x6 a() {
            String str = this.a == null ? " spotifyGoAccessControl" : "";
            if (this.b == null) {
                str = je.x0(str, " spotifyGoBoseEnabled");
            }
            if (this.c == null) {
                str = je.x0(str, " spotifyGoConnectedTtsEnabled");
            }
            if (this.d == null) {
                str = je.x0(str, " spotifyGoDebugToastsEnabled");
            }
            if (this.e == null) {
                str = je.x0(str, " spotifyGoFeatureEnabled");
            }
            if (this.f == null) {
                str = je.x0(str, " spotifyGoIkeaEnabled");
            }
            if (this.g == null) {
                str = je.x0(str, " spotifyGoJblEnabled");
            }
            if (this.h == null) {
                str = je.x0(str, " spotifyGoMicrosoftEnabled");
            }
            if (this.i == null) {
                str = je.x0(str, " spotifyGoUserLoggedOutTtsEnabled");
            }
            if (str.isEmpty()) {
                return new le(this.a.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), this.f.booleanValue(), this.g.booleanValue(), this.h.booleanValue(), this.i.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public x6.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public x6.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public x6.a d(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public x6.a e(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public x6.a f(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        public x6.a g(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        public x6.a h(boolean z) {
            this.g = Boolean.valueOf(z);
            return this;
        }

        public x6.a i(boolean z) {
            this.h = Boolean.valueOf(z);
            return this;
        }

        public x6.a j(boolean z) {
            this.i = Boolean.valueOf(z);
            return this;
        }
    }

    le(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, a aVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.i = z9;
    }

    @Override // com.spotify.remoteconfig.x6
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.x6
    public boolean b() {
        return this.b;
    }

    @Override // com.spotify.remoteconfig.x6
    public boolean c() {
        return this.c;
    }

    @Override // com.spotify.remoteconfig.x6
    public boolean d() {
        return this.d;
    }

    @Override // com.spotify.remoteconfig.x6
    public boolean e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x6)) {
            return false;
        }
        x6 x6Var = (x6) obj;
        if (this.a == x6Var.a() && this.b == x6Var.b() && this.c == x6Var.c() && this.d == x6Var.d() && this.e == x6Var.e() && this.f == x6Var.f() && this.g == x6Var.g() && this.h == x6Var.h() && this.i == x6Var.i()) {
            return true;
        }
        return false;
    }

    @Override // com.spotify.remoteconfig.x6
    public boolean f() {
        return this.f;
    }

    @Override // com.spotify.remoteconfig.x6
    public boolean g() {
        return this.g;
    }

    @Override // com.spotify.remoteconfig.x6
    public boolean h() {
        return this.h;
    }

    public int hashCode() {
        int i2 = 1231;
        int i3 = ((((((((((((((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ (this.g ? 1231 : 1237)) * 1000003) ^ (this.h ? 1231 : 1237)) * 1000003;
        if (!this.i) {
            i2 = 1237;
        }
        return i3 ^ i2;
    }

    @Override // com.spotify.remoteconfig.x6
    public boolean i() {
        return this.i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("AndroidFeatureSpotifyGoProperties{spotifyGoAccessControl=");
        V0.append(this.a);
        V0.append(", spotifyGoBoseEnabled=");
        V0.append(this.b);
        V0.append(", spotifyGoConnectedTtsEnabled=");
        V0.append(this.c);
        V0.append(", spotifyGoDebugToastsEnabled=");
        V0.append(this.d);
        V0.append(", spotifyGoFeatureEnabled=");
        V0.append(this.e);
        V0.append(", spotifyGoIkeaEnabled=");
        V0.append(this.f);
        V0.append(", spotifyGoJblEnabled=");
        V0.append(this.g);
        V0.append(", spotifyGoMicrosoftEnabled=");
        V0.append(this.h);
        V0.append(", spotifyGoUserLoggedOutTtsEnabled=");
        return je.P0(V0, this.i, "}");
    }
}

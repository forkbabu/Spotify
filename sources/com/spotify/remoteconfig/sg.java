package com.spotify.remoteconfig;

import com.spotify.remoteconfig.sa;

final class sg extends sa {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;

    static final class b extends sa.a {
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

        public sa a() {
            String str = this.a == null ? " deeplinkOpenLogAllDeeplinks" : "";
            if (this.b == null) {
                str = je.x0(str, " enableBackendGeneratedShareUrl");
            }
            if (this.c == null) {
                str = je.x0(str, " enableDeeplinkOpenLogging");
            }
            if (this.d == null) {
                str = je.x0(str, " enableFbVideoSharing");
            }
            if (this.e == null) {
                str = je.x0(str, " enableIgVideoSharing");
            }
            if (this.f == null) {
                str = je.x0(str, " enableUtmSources");
            }
            if (this.g == null) {
                str = je.x0(str, " shareConcertsToStories");
            }
            if (this.h == null) {
                str = je.x0(str, " showShareMenuV2");
            }
            if (this.i == null) {
                str = je.x0(str, " showUpdatedIconsInShareMenuV2");
            }
            if (str.isEmpty()) {
                return new sg(this.a.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), this.f.booleanValue(), this.g.booleanValue(), this.h.booleanValue(), this.i.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public sa.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public sa.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public sa.a d(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public sa.a e(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public sa.a f(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        public sa.a g(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        public sa.a h(boolean z) {
            this.g = Boolean.valueOf(z);
            return this;
        }

        public sa.a i(boolean z) {
            this.h = Boolean.valueOf(z);
            return this;
        }

        public sa.a j(boolean z) {
            this.i = Boolean.valueOf(z);
            return this;
        }
    }

    sg(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, a aVar) {
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

    @Override // com.spotify.remoteconfig.sa
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.sa
    public boolean b() {
        return this.b;
    }

    @Override // com.spotify.remoteconfig.sa
    public boolean c() {
        return this.c;
    }

    @Override // com.spotify.remoteconfig.sa
    public boolean d() {
        return this.d;
    }

    @Override // com.spotify.remoteconfig.sa
    public boolean e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sa)) {
            return false;
        }
        sa saVar = (sa) obj;
        if (this.a == saVar.a() && this.b == saVar.b() && this.c == saVar.c() && this.d == saVar.d() && this.e == saVar.e() && this.f == saVar.f() && this.g == saVar.g() && this.h == saVar.h() && this.i == saVar.i()) {
            return true;
        }
        return false;
    }

    @Override // com.spotify.remoteconfig.sa
    public boolean f() {
        return this.f;
    }

    @Override // com.spotify.remoteconfig.sa
    public boolean g() {
        return this.g;
    }

    @Override // com.spotify.remoteconfig.sa
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

    @Override // com.spotify.remoteconfig.sa
    public boolean i() {
        return this.i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("AndroidLibsShareImplProperties{deeplinkOpenLogAllDeeplinks=");
        V0.append(this.a);
        V0.append(", enableBackendGeneratedShareUrl=");
        V0.append(this.b);
        V0.append(", enableDeeplinkOpenLogging=");
        V0.append(this.c);
        V0.append(", enableFbVideoSharing=");
        V0.append(this.d);
        V0.append(", enableIgVideoSharing=");
        V0.append(this.e);
        V0.append(", enableUtmSources=");
        V0.append(this.f);
        V0.append(", shareConcertsToStories=");
        V0.append(this.g);
        V0.append(", showShareMenuV2=");
        V0.append(this.h);
        V0.append(", showUpdatedIconsInShareMenuV2=");
        return je.P0(V0, this.i, "}");
    }
}

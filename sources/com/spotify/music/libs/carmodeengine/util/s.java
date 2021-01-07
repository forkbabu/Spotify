package com.spotify.music.libs.carmodeengine.util;

import com.spotify.music.libs.carmodeengine.util.b0;

final class s extends b0 {
    private final d7a b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final y6a f;
    private final String g;
    private final int h;
    private final boolean i;

    static final class b extends b0.a {
        private d7a a;
        private Boolean b;
        private Boolean c;
        private Boolean d;
        private y6a e;
        private String f;
        private Integer g;
        private Boolean h;

        b() {
        }

        @Override // com.spotify.music.libs.carmodeengine.util.b0.a
        public b0.a a(int i) {
            this.g = Integer.valueOf(i);
            return this;
        }

        @Override // com.spotify.music.libs.carmodeengine.util.b0.a
        public b0.a b(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.libs.carmodeengine.util.b0.a
        public b0.a c(y6a y6a) {
            if (y6a != null) {
                this.e = y6a;
                return this;
            }
            throw new NullPointerException("Null availabilitySetting");
        }

        @Override // com.spotify.music.libs.carmodeengine.util.b0.a
        public b0 d() {
            String str = this.a == null ? " carModeState" : "";
            if (this.b == null) {
                str = je.x0(str, " carDetected");
            }
            if (this.c == null) {
                str = je.x0(str, " screenAlwaysOnSetting");
            }
            if (this.d == null) {
                str = je.x0(str, " autoActivationSetting");
            }
            if (this.e == null) {
                str = je.x0(str, " availabilitySetting");
            }
            if (this.f == null) {
                str = je.x0(str, " deviceLanguage");
            }
            if (this.g == null) {
                str = je.x0(str, " apiLevel");
            }
            if (this.h == null) {
                str = je.x0(str, " hasMicPermission");
            }
            if (str.isEmpty()) {
                return new s(this.a, this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), this.e, this.f, this.g.intValue(), this.h.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.music.libs.carmodeengine.util.b0.a
        public b0.a e(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.libs.carmodeengine.util.b0.a
        public b0.a f(d7a d7a) {
            if (d7a != null) {
                this.a = d7a;
                return this;
            }
            throw new NullPointerException("Null carModeState");
        }

        @Override // com.spotify.music.libs.carmodeengine.util.b0.a
        public b0.a g(String str) {
            this.f = str;
            return this;
        }

        @Override // com.spotify.music.libs.carmodeengine.util.b0.a
        public b0.a h(boolean z) {
            this.h = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.libs.carmodeengine.util.b0.a
        public b0.a i(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        b(b0 b0Var, a aVar) {
            this.a = b0Var.e();
            this.b = Boolean.valueOf(b0Var.d());
            this.c = Boolean.valueOf(b0Var.h());
            this.d = Boolean.valueOf(b0Var.b());
            this.e = b0Var.c();
            this.f = b0Var.f();
            this.g = Integer.valueOf(b0Var.a());
            this.h = Boolean.valueOf(b0Var.g());
        }
    }

    s(d7a d7a, boolean z, boolean z2, boolean z3, y6a y6a, String str, int i2, boolean z4, a aVar) {
        this.b = d7a;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = y6a;
        this.g = str;
        this.h = i2;
        this.i = z4;
    }

    @Override // com.spotify.music.libs.carmodeengine.util.b0
    public int a() {
        return this.h;
    }

    @Override // com.spotify.music.libs.carmodeengine.util.b0
    public boolean b() {
        return this.e;
    }

    @Override // com.spotify.music.libs.carmodeengine.util.b0
    public y6a c() {
        return this.f;
    }

    @Override // com.spotify.music.libs.carmodeengine.util.b0
    public boolean d() {
        return this.c;
    }

    @Override // com.spotify.music.libs.carmodeengine.util.b0
    public d7a e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (this.b.equals(b0Var.e()) && this.c == b0Var.d() && this.d == b0Var.h() && this.e == b0Var.b() && this.f.equals(b0Var.c()) && this.g.equals(b0Var.f()) && this.h == b0Var.a() && this.i == b0Var.g()) {
            return true;
        }
        return false;
    }

    @Override // com.spotify.music.libs.carmodeengine.util.b0
    public String f() {
        return this.g;
    }

    @Override // com.spotify.music.libs.carmodeengine.util.b0
    public boolean g() {
        return this.i;
    }

    @Override // com.spotify.music.libs.carmodeengine.util.b0
    public boolean h() {
        return this.d;
    }

    public int hashCode() {
        int i2 = 1231;
        int hashCode = (((((((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h) * 1000003;
        if (!this.i) {
            i2 = 1237;
        }
        return hashCode ^ i2;
    }

    @Override // com.spotify.music.libs.carmodeengine.util.b0
    public b0.a i() {
        return new b(this, null);
    }

    public String toString() {
        StringBuilder V0 = je.V0("CarModeStateLogData{carModeState=");
        V0.append(this.b);
        V0.append(", carDetected=");
        V0.append(this.c);
        V0.append(", screenAlwaysOnSetting=");
        V0.append(this.d);
        V0.append(", autoActivationSetting=");
        V0.append(this.e);
        V0.append(", availabilitySetting=");
        V0.append(this.f);
        V0.append(", deviceLanguage=");
        V0.append(this.g);
        V0.append(", apiLevel=");
        V0.append(this.h);
        V0.append(", hasMicPermission=");
        return je.P0(V0, this.i, "}");
    }
}

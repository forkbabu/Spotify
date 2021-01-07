package com.spotify.music.navigation;

import com.spotify.music.navigation.n;

final class e extends n {
    private final String a;
    private final String b;
    private final boolean c;
    private final boolean d;
    private final int e;
    private final int f;
    private final boolean g;
    private final String h;
    private final String i;

    /* access modifiers changed from: package-private */
    public static final class b extends n.a {
        private String a;
        private String b;
        private Boolean c;
        private Boolean d;
        private Integer e;
        private Integer f;
        private Boolean g;
        private String h;
        private String i;

        b() {
        }

        @Override // com.spotify.music.navigation.n.a
        public n a() {
            String str = this.a == null ? " uri" : "";
            if (this.b == null) {
                str = je.x0(str, " title");
            }
            if (this.c == null) {
                str = je.x0(str, " clearBackstack");
            }
            if (this.d == null) {
                str = je.x0(str, " crossfade");
            }
            if (this.e == null) {
                str = je.x0(str, " customEnterAnimation");
            }
            if (this.f == null) {
                str = je.x0(str, " customExitAnimation");
            }
            if (this.g == null) {
                str = je.x0(str, " popCurrent");
            }
            if (this.h == null) {
                str = je.x0(str, " popToTag");
            }
            if (str.isEmpty()) {
                return new e(this.a, this.b, null, this.c.booleanValue(), this.d.booleanValue(), this.e.intValue(), this.f.intValue(), this.g.booleanValue(), this.h, this.i, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.music.navigation.n.a
        public n.a b(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.navigation.n.a
        public n.a c(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.navigation.n.a
        public n.a d(int i2) {
            this.e = Integer.valueOf(i2);
            return this;
        }

        @Override // com.spotify.music.navigation.n.a
        public n.a e(int i2) {
            this.f = Integer.valueOf(i2);
            return this;
        }

        @Override // com.spotify.music.navigation.n.a
        public n.a f(boolean z) {
            this.g = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.navigation.n.a
        public n.a g(String str) {
            this.h = str;
            return this;
        }

        @Override // com.spotify.music.navigation.n.a
        public n.a h(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null title");
        }

        @Override // com.spotify.music.navigation.n.a
        public n.a i(String str) {
            this.i = str;
            return this;
        }

        public n.a j(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null uri");
        }
    }

    e(String str, String str2, String str3, boolean z, boolean z2, int i2, int i3, boolean z3, String str4, String str5, a aVar) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = i2;
        this.f = i3;
        this.g = z3;
        this.h = str4;
        this.i = str5;
    }

    @Override // com.spotify.music.navigation.n
    public boolean b() {
        return this.c;
    }

    @Override // com.spotify.music.navigation.n
    public boolean c() {
        return this.d;
    }

    @Override // com.spotify.music.navigation.n
    public int d() {
        return this.e;
    }

    @Override // com.spotify.music.navigation.n
    public int e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.a.equals(nVar.j()) && this.b.equals(nVar.i()) && nVar.h() == null && this.c == nVar.b() && this.d == nVar.c() && this.e == nVar.d() && this.f == nVar.e() && this.g == nVar.f() && this.h.equals(nVar.g())) {
            String str = this.i;
            if (str == null) {
                if (nVar.k() == null) {
                    return true;
                }
            } else if (str.equals(nVar.k())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.spotify.music.navigation.n
    public boolean f() {
        return this.g;
    }

    @Override // com.spotify.music.navigation.n
    public String g() {
        return this.h;
    }

    @Override // com.spotify.music.navigation.n
    public String h() {
        return null;
    }

    public int hashCode() {
        int i2 = 0;
        int i3 = 1237;
        int hashCode = (((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ 0) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003;
        if (this.g) {
            i3 = 1231;
        }
        int hashCode2 = (((hashCode ^ i3) * 1000003) ^ this.h.hashCode()) * 1000003;
        String str = this.i;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode2 ^ i2;
    }

    @Override // com.spotify.music.navigation.n
    public String i() {
        return this.b;
    }

    @Override // com.spotify.music.navigation.n
    public String j() {
        return this.a;
    }

    @Override // com.spotify.music.navigation.n
    public String k() {
        return this.i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("NavigationIntent{uri=");
        V0.append(this.a);
        V0.append(", title=");
        V0.append(this.b);
        V0.append(", tag=");
        V0.append((String) null);
        V0.append(", clearBackstack=");
        V0.append(this.c);
        V0.append(", crossfade=");
        V0.append(this.d);
        V0.append(", customEnterAnimation=");
        V0.append(this.e);
        V0.append(", customExitAnimation=");
        V0.append(this.f);
        V0.append(", popCurrent=");
        V0.append(this.g);
        V0.append(", popToTag=");
        V0.append(this.h);
        V0.append(", userInteractionId=");
        return je.I0(V0, this.i, "}");
    }
}

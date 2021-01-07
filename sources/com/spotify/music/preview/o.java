package com.spotify.music.preview;

import com.spotify.music.preview.z;

/* access modifiers changed from: package-private */
public final class o extends z {
    private final String c;
    private final String d;
    private final boolean e;
    private final boolean f;
    private final Long g;
    private final Long h;
    private final Long i;

    /* access modifiers changed from: package-private */
    public static final class b implements z.a {
        private String a;
        private String b;
        private Boolean c;
        private Boolean d;
        private Long e;
        private Long f;
        private Long g;

        b() {
        }

        public z a() {
            String str = this.a == null ? " previewId" : "";
            if (this.b == null) {
                str = je.x0(str, " previewKey");
            }
            if (this.c == null) {
                str = je.x0(str, " isLoading");
            }
            if (this.d == null) {
                str = je.x0(str, " isError");
            }
            if (this.e == null) {
                str = je.x0(str, " position");
            }
            if (this.f == null) {
                str = je.x0(str, " duration");
            }
            if (this.g == null) {
                str = je.x0(str, " timestamp");
            }
            if (str.isEmpty()) {
                return new o(this.a, this.b, this.c.booleanValue(), this.d.booleanValue(), this.e, this.f, this.g, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public z.a b(Long l) {
            if (l != null) {
                this.f = l;
                return this;
            }
            throw new NullPointerException("Null duration");
        }

        public z.a c(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public z.a d(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public z.a e(Long l) {
            if (l != null) {
                this.e = l;
                return this;
            }
            throw new NullPointerException("Null position");
        }

        public z.a f(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null previewId");
        }

        public z.a g(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null previewKey");
        }

        public z.a h(Long l) {
            if (l != null) {
                this.g = l;
                return this;
            }
            throw new NullPointerException("Null timestamp");
        }

        b(z zVar, a aVar) {
            this.a = zVar.g();
            this.b = zVar.h();
            this.c = Boolean.valueOf(zVar.d());
            this.d = Boolean.valueOf(zVar.c());
            this.e = zVar.f();
            this.f = zVar.a();
            this.g = zVar.i();
        }
    }

    o(String str, String str2, boolean z, boolean z2, Long l, Long l2, Long l3, a aVar) {
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = z2;
        this.g = l;
        this.h = l2;
        this.i = l3;
    }

    @Override // com.spotify.music.preview.z
    public Long a() {
        return this.h;
    }

    @Override // com.spotify.music.preview.z
    public boolean c() {
        return this.f;
    }

    @Override // com.spotify.music.preview.z
    public boolean d() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (!this.c.equals(zVar.g()) || !this.d.equals(zVar.h()) || this.e != zVar.d() || this.f != zVar.c() || !this.g.equals(zVar.f()) || !this.h.equals(zVar.a()) || !this.i.equals(zVar.i())) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.music.preview.z
    public Long f() {
        return this.g;
    }

    @Override // com.spotify.music.preview.z
    public String g() {
        return this.c;
    }

    @Override // com.spotify.music.preview.z
    public String h() {
        return this.d;
    }

    public int hashCode() {
        int i2 = 1231;
        int hashCode = (((((this.c.hashCode() ^ 1000003) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003;
        if (!this.f) {
            i2 = 1237;
        }
        return ((((((hashCode ^ i2) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    @Override // com.spotify.music.preview.z
    public Long i() {
        return this.i;
    }

    @Override // com.spotify.music.preview.z
    public z.a j() {
        return new b(this, null);
    }

    public String toString() {
        StringBuilder V0 = je.V0("PreviewPlayerState{previewId=");
        V0.append(this.c);
        V0.append(", previewKey=");
        V0.append(this.d);
        V0.append(", isLoading=");
        V0.append(this.e);
        V0.append(", isError=");
        V0.append(this.f);
        V0.append(", position=");
        V0.append(this.g);
        V0.append(", duration=");
        V0.append(this.h);
        V0.append(", timestamp=");
        V0.append(this.i);
        V0.append("}");
        return V0.toString();
    }
}

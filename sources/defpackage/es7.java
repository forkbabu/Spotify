package defpackage;

import defpackage.hs7;

/* renamed from: es7  reason: default package */
final class es7 extends hs7 {
    private final np7 b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;

    /* renamed from: es7$b */
    static final class b extends hs7.a {
        private np7 a;
        private Boolean b;
        private Boolean c;
        private Boolean d;
        private Boolean e;
        private Boolean f;
        private Boolean g;

        b() {
        }

        @Override // defpackage.hs7.a
        public hs7 a() {
            String str = this.a == null ? " data" : "";
            if (this.b == null) {
                str = je.x0(str, " canDownloadPlaylists");
            }
            if (this.c == null) {
                str = je.x0(str, " editProfileEnabled");
            }
            if (this.d == null) {
                str = je.x0(str, " editButtonVisible");
            }
            if (this.e == null) {
                str = je.x0(str, " followButtonVisible");
            }
            if (this.f == null) {
                str = je.x0(str, " followButtonChecked");
            }
            if (this.g == null) {
                str = je.x0(str, " showEmptySection");
            }
            if (str.isEmpty()) {
                return new es7(this.a, this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), this.f.booleanValue(), this.g.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.hs7.a
        public hs7.a b(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.hs7.a
        public hs7.a c(np7 np7) {
            if (np7 != null) {
                this.a = np7;
                return this;
            }
            throw new NullPointerException("Null data");
        }

        @Override // defpackage.hs7.a
        public hs7.a d(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.hs7.a
        public hs7.a e(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.hs7.a
        public hs7.a f(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.hs7.a
        public hs7.a g(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.hs7.a
        public hs7.a h(boolean z) {
            this.g = Boolean.valueOf(z);
            return this;
        }

        b(hs7 hs7, a aVar) {
            this.a = hs7.c();
            this.b = Boolean.valueOf(hs7.a());
            this.c = Boolean.valueOf(hs7.f());
            this.d = Boolean.valueOf(hs7.e());
            this.e = Boolean.valueOf(hs7.h());
            this.f = Boolean.valueOf(hs7.g());
            this.g = Boolean.valueOf(hs7.i());
        }
    }

    es7(np7 np7, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, a aVar) {
        this.b = np7;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = z6;
    }

    @Override // defpackage.hs7
    public boolean a() {
        return this.c;
    }

    @Override // defpackage.hs7
    public np7 c() {
        return this.b;
    }

    @Override // defpackage.hs7
    public boolean e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hs7)) {
            return false;
        }
        hs7 hs7 = (hs7) obj;
        if (this.b.equals(hs7.c()) && this.c == hs7.a() && this.d == hs7.f() && this.e == hs7.e() && this.f == hs7.h() && this.g == hs7.g() && this.h == hs7.i()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.hs7
    public boolean f() {
        return this.d;
    }

    @Override // defpackage.hs7
    public boolean g() {
        return this.g;
    }

    @Override // defpackage.hs7
    public boolean h() {
        return this.f;
    }

    public int hashCode() {
        int i = 1231;
        int hashCode = (((((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ (this.g ? 1231 : 1237)) * 1000003;
        if (!this.h) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    @Override // defpackage.hs7
    public boolean i() {
        return this.h;
    }

    @Override // defpackage.hs7
    public hs7.a j() {
        return new b(this, null);
    }

    public String toString() {
        StringBuilder V0 = je.V0("ProfileEntityViewModel{data=");
        V0.append(this.b);
        V0.append(", canDownloadPlaylists=");
        V0.append(this.c);
        V0.append(", editProfileEnabled=");
        V0.append(this.d);
        V0.append(", editButtonVisible=");
        V0.append(this.e);
        V0.append(", followButtonVisible=");
        V0.append(this.f);
        V0.append(", followButtonChecked=");
        V0.append(this.g);
        V0.append(", showEmptySection=");
        return je.P0(V0, this.h, "}");
    }
}

package defpackage;

import defpackage.c7a;

/* access modifiers changed from: package-private */
/* renamed from: x6a  reason: default package */
public final class x6a extends c7a {
    private final d7a b;
    private final boolean c;
    private final y6a d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final boolean l;

    /* renamed from: x6a$b */
    static final class b extends c7a.a {
        private d7a a;
        private Boolean b;
        private y6a c;
        private Boolean d;
        private Boolean e;
        private Boolean f;
        private Boolean g;
        private Boolean h;
        private Boolean i;
        private Boolean j;
        private Boolean k;

        b() {
        }

        @Override // defpackage.c7a.a
        public c7a b() {
            String str = this.a == null ? " carModeState" : "";
            if (this.b == null) {
                str = je.x0(str, " carDetected");
            }
            if (this.c == null) {
                str = je.x0(str, " availabilitySetting");
            }
            if (this.d == null) {
                str = je.x0(str, " autoActivationEnabledSetting");
            }
            if (this.e == null) {
                str = je.x0(str, " manualOptInAvailable");
            }
            if (this.f == null) {
                str = je.x0(str, " carThingConnected");
            }
            if (this.g == null) {
                str = je.x0(str, " availabilitySettingRead");
            }
            if (this.h == null) {
                str = je.x0(str, " autoActivationSettingRead");
            }
            if (this.i == null) {
                str = je.x0(str, " manualOptInRead");
            }
            if (this.j == null) {
                str = je.x0(str, " carDetectedRead");
            }
            if (this.k == null) {
                str = je.x0(str, " carThingConnectedRead");
            }
            if (str.isEmpty()) {
                return new x6a(this.a, this.b.booleanValue(), this.c, this.d.booleanValue(), this.e.booleanValue(), this.f.booleanValue(), this.g.booleanValue(), this.h.booleanValue(), this.i.booleanValue(), this.j.booleanValue(), this.k.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.c7a.a
        public c7a.a c(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.c7a.a
        public c7a.a d(boolean z) {
            this.h = Boolean.valueOf(z);
            return this;
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.c7a.a
        public c7a.a e(y6a y6a) {
            if (y6a != null) {
                this.c = y6a;
                return this;
            }
            throw new NullPointerException("Null availabilitySetting");
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.c7a.a
        public c7a.a f(boolean z) {
            this.g = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.c7a.a
        public c7a.a g(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.c7a.a
        public c7a.a h(boolean z) {
            this.j = Boolean.valueOf(z);
            return this;
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.c7a.a
        public c7a.a i(d7a d7a) {
            if (d7a != null) {
                this.a = d7a;
                return this;
            }
            throw new NullPointerException("Null carModeState");
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.c7a.a
        public c7a.a j(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.c7a.a
        public c7a.a k(boolean z) {
            this.k = Boolean.valueOf(z);
            return this;
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.c7a.a
        public c7a.a l(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        /* access modifiers changed from: package-private */
        @Override // defpackage.c7a.a
        public c7a.a m(boolean z) {
            this.i = Boolean.valueOf(z);
            return this;
        }

        b(c7a c7a, a aVar) {
            this.a = c7a.g();
            this.b = Boolean.valueOf(c7a.e());
            this.c = c7a.c();
            this.d = Boolean.valueOf(c7a.a());
            this.e = Boolean.valueOf(c7a.j());
            this.f = Boolean.valueOf(c7a.h());
            this.g = Boolean.valueOf(c7a.d());
            this.h = Boolean.valueOf(c7a.b());
            this.i = Boolean.valueOf(c7a.k());
            this.j = Boolean.valueOf(c7a.f());
            this.k = Boolean.valueOf(c7a.i());
        }
    }

    x6a(d7a d7a, boolean z, y6a y6a, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, a aVar) {
        this.b = d7a;
        this.c = z;
        this.d = y6a;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = z6;
        this.j = z7;
        this.k = z8;
        this.l = z9;
    }

    @Override // defpackage.c7a
    public boolean a() {
        return this.e;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.c7a
    public boolean b() {
        return this.i;
    }

    @Override // defpackage.c7a
    public y6a c() {
        return this.d;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.c7a
    public boolean d() {
        return this.h;
    }

    @Override // defpackage.c7a
    public boolean e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c7a)) {
            return false;
        }
        c7a c7a = (c7a) obj;
        if (this.b.equals(c7a.g()) && this.c == c7a.e() && this.d.equals(c7a.c()) && this.e == c7a.a() && this.f == c7a.j() && this.g == c7a.h() && this.h == c7a.d() && this.i == c7a.b() && this.j == c7a.k() && this.k == c7a.f() && this.l == c7a.i()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.c7a
    public boolean f() {
        return this.k;
    }

    @Override // defpackage.c7a
    public d7a g() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.c7a
    public boolean h() {
        return this.g;
    }

    public int hashCode() {
        int i2 = 1231;
        int hashCode = (((((((((((((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ (this.g ? 1231 : 1237)) * 1000003) ^ (this.h ? 1231 : 1237)) * 1000003) ^ (this.i ? 1231 : 1237)) * 1000003) ^ (this.j ? 1231 : 1237)) * 1000003) ^ (this.k ? 1231 : 1237)) * 1000003;
        if (!this.l) {
            i2 = 1237;
        }
        return hashCode ^ i2;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.c7a
    public boolean i() {
        return this.l;
    }

    @Override // defpackage.c7a
    public boolean j() {
        return this.f;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.c7a
    public boolean k() {
        return this.j;
    }

    @Override // defpackage.c7a
    public c7a.a l() {
        return new b(this, null);
    }

    public String toString() {
        StringBuilder V0 = je.V0("CarModeEngineModel{carModeState=");
        V0.append(this.b);
        V0.append(", carDetected=");
        V0.append(this.c);
        V0.append(", availabilitySetting=");
        V0.append(this.d);
        V0.append(", autoActivationEnabledSetting=");
        V0.append(this.e);
        V0.append(", manualOptInAvailable=");
        V0.append(this.f);
        V0.append(", carThingConnected=");
        V0.append(this.g);
        V0.append(", availabilitySettingRead=");
        V0.append(this.h);
        V0.append(", autoActivationSettingRead=");
        V0.append(this.i);
        V0.append(", manualOptInRead=");
        V0.append(this.j);
        V0.append(", carDetectedRead=");
        V0.append(this.k);
        V0.append(", carThingConnectedRead=");
        return je.P0(V0, this.l, "}");
    }
}

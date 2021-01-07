package defpackage;

import defpackage.dve;

/* access modifiers changed from: package-private */
/* renamed from: ave  reason: default package */
public final class ave extends dve {
    private final eve a;
    private final String b;
    private final bve c;
    private final cve d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final String k;
    private final boolean l;

    /* access modifiers changed from: package-private */
    /* renamed from: ave$b */
    public static final class b implements dve.a {
        private eve a;
        private String b;
        private bve c;
        private cve d;
        private Boolean e;
        private Boolean f;
        private Boolean g;
        private Boolean h;
        private Boolean i;
        private Boolean j;
        private String k;
        private Boolean l;

        b() {
        }

        public dve a() {
            String str = this.a == null ? " state" : "";
            if (this.b == null) {
                str = je.x0(str, " utteranceId");
            }
            if (this.c == null) {
                str = je.x0(str, " showEducationConfig");
            }
            if (this.d == null) {
                str = je.x0(str, " logModel");
            }
            if (this.e == null) {
                str = je.x0(str, " inline");
            }
            if (this.f == null) {
                str = je.x0(str, " isWakeWordElement");
            }
            if (this.g == null) {
                str = je.x0(str, " isWakeWordSeamless");
            }
            if (this.h == null) {
                str = je.x0(str, " isAccessibilityEnabled");
            }
            if (this.i == null) {
                str = je.x0(str, " isDialog");
            }
            if (this.j == null) {
                str = je.x0(str, " isAltResultsDisabled");
            }
            if (this.l == null) {
                str = je.x0(str, " hasOfflineTracks");
            }
            if (str.isEmpty()) {
                return new ave(this.a, this.b, this.c, this.d, this.e.booleanValue(), this.f.booleanValue(), this.g.booleanValue(), this.h.booleanValue(), this.i.booleanValue(), this.j.booleanValue(), this.k, this.l.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public dve.a b(String str) {
            this.k = str;
            return this;
        }

        public dve.a c(boolean z) {
            this.l = Boolean.valueOf(z);
            return this;
        }

        public dve.a d(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        public dve.a e(boolean z) {
            this.h = Boolean.valueOf(z);
            return this;
        }

        public dve.a f(boolean z) {
            this.j = Boolean.valueOf(z);
            return this;
        }

        public dve.a g(boolean z) {
            this.i = Boolean.valueOf(z);
            return this;
        }

        public dve.a h(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        public dve.a i(boolean z) {
            this.g = Boolean.valueOf(z);
            return this;
        }

        public dve.a j(cve cve) {
            if (cve != null) {
                this.d = cve;
                return this;
            }
            throw new NullPointerException("Null logModel");
        }

        public dve.a k(bve bve) {
            if (bve != null) {
                this.c = bve;
                return this;
            }
            throw new NullPointerException("Null showEducationConfig");
        }

        public dve.a l(eve eve) {
            if (eve != null) {
                this.a = eve;
                return this;
            }
            throw new NullPointerException("Null state");
        }

        public dve.a m(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null utteranceId");
        }

        b(dve dve, a aVar) {
            this.a = dve.l();
            this.b = dve.n();
            this.c = dve.k();
            this.d = dve.j();
            this.e = Boolean.valueOf(dve.d());
            this.f = Boolean.valueOf(dve.h());
            this.g = Boolean.valueOf(dve.i());
            this.h = Boolean.valueOf(dve.e());
            this.i = Boolean.valueOf(dve.g());
            this.j = Boolean.valueOf(dve.f());
            this.k = dve.b();
            this.l = Boolean.valueOf(dve.c());
        }
    }

    ave(eve eve, String str, bve bve, cve cve, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str2, boolean z7, a aVar) {
        this.a = eve;
        this.b = str;
        this.c = bve;
        this.d = cve;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
        this.i = z5;
        this.j = z6;
        this.k = str2;
        this.l = z7;
    }

    @Override // defpackage.dve
    public String b() {
        return this.k;
    }

    @Override // defpackage.dve
    public boolean c() {
        return this.l;
    }

    @Override // defpackage.dve
    public boolean d() {
        return this.e;
    }

    @Override // defpackage.dve
    public boolean e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dve)) {
            return false;
        }
        dve dve = (dve) obj;
        if (this.a.equals(dve.l()) && this.b.equals(dve.n()) && this.c.equals(dve.k()) && this.d.equals(dve.j()) && this.e == dve.d() && this.f == dve.h() && this.g == dve.i() && this.h == dve.e() && this.i == dve.g() && this.j == dve.f() && ((str = this.k) != null ? str.equals(dve.b()) : dve.b() == null) && this.l == dve.c()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.dve
    public boolean f() {
        return this.j;
    }

    @Override // defpackage.dve
    public boolean g() {
        return this.i;
    }

    @Override // defpackage.dve
    public boolean h() {
        return this.f;
    }

    public int hashCode() {
        int i2 = 1231;
        int hashCode = (((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ (this.g ? 1231 : 1237)) * 1000003) ^ (this.h ? 1231 : 1237)) * 1000003) ^ (this.i ? 1231 : 1237)) * 1000003) ^ (this.j ? 1231 : 1237)) * 1000003;
        String str = this.k;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        if (!this.l) {
            i2 = 1237;
        }
        return hashCode2 ^ i2;
    }

    @Override // defpackage.dve
    public boolean i() {
        return this.g;
    }

    @Override // defpackage.dve
    public cve j() {
        return this.d;
    }

    @Override // defpackage.dve
    public bve k() {
        return this.c;
    }

    @Override // defpackage.dve
    public eve l() {
        return this.a;
    }

    @Override // defpackage.dve
    public dve.a m() {
        return new b(this, null);
    }

    @Override // defpackage.dve
    public String n() {
        return this.b;
    }

    public String toString() {
        StringBuilder V0 = je.V0("VoiceModel{state=");
        V0.append(this.a);
        V0.append(", utteranceId=");
        V0.append(this.b);
        V0.append(", showEducationConfig=");
        V0.append(this.c);
        V0.append(", logModel=");
        V0.append(this.d);
        V0.append(", inline=");
        V0.append(this.e);
        V0.append(", isWakeWordElement=");
        V0.append(this.f);
        V0.append(", isWakeWordSeamless=");
        V0.append(this.g);
        V0.append(", isAccessibilityEnabled=");
        V0.append(this.h);
        V0.append(", isDialog=");
        V0.append(this.i);
        V0.append(", isAltResultsDisabled=");
        V0.append(this.j);
        V0.append(", deeplinkOption=");
        V0.append(this.k);
        V0.append(", hasOfflineTracks=");
        return je.P0(V0, this.l, "}");
    }
}

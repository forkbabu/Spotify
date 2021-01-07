package defpackage;

import defpackage.jff;

/* renamed from: uef  reason: default package */
abstract class uef extends jff {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean f;
    private final boolean n;
    private final String o;

    /* access modifiers changed from: package-private */
    /* renamed from: uef$b */
    public static class b implements jff.a {
        private Boolean a;
        private Boolean b;
        private Boolean c;
        private Boolean d;
        private Boolean e;
        private String f;

        b() {
        }

        public jff a() {
            String str = this.a == null ? " wakeWordEnabled" : "";
            if (this.b == null) {
                str = je.x0(str, " micEnabled");
            }
            if (this.c == null) {
                str = je.x0(str, " voiceEducationShown");
            }
            if (this.d == null) {
                str = je.x0(str, " wakeWordFeatureEnabled");
            }
            if (this.e == null) {
                str = je.x0(str, " languageExpansionEnabled");
            }
            if (this.f == null) {
                str = je.x0(str, " countryCode");
            }
            if (str.isEmpty()) {
                return new fff(this.a.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), this.f);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public jff.a b(String str) {
            if (str != null) {
                this.f = str;
                return this;
            }
            throw new NullPointerException("Null countryCode");
        }

        public jff.a c(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        public jff.a d(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public jff.a e(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public jff.a f(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public jff.a g(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        b(jff jff, a aVar) {
            this.a = Boolean.valueOf(jff.h());
            this.b = Boolean.valueOf(jff.e());
            this.c = Boolean.valueOf(jff.g());
            this.d = Boolean.valueOf(jff.i());
            this.e = Boolean.valueOf(jff.c());
            this.f = jff.a();
        }
    }

    uef(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.f = z4;
        this.n = z5;
        if (str != null) {
            this.o = str;
            return;
        }
        throw new NullPointerException("Null countryCode");
    }

    @Override // defpackage.jff
    public String a() {
        return this.o;
    }

    @Override // defpackage.jff
    public boolean c() {
        return this.n;
    }

    @Override // defpackage.jff
    public boolean e() {
        return this.b;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jff)) {
            return false;
        }
        jff jff = (jff) obj;
        if (this.a == jff.h() && this.b == jff.e() && this.c == jff.g() && this.f == jff.i() && this.n == jff.c() && this.o.equals(jff.a())) {
            return true;
        }
        return false;
    }

    @Override // defpackage.jff
    public jff.a f() {
        return new b(this, null);
    }

    @Override // defpackage.jff
    public boolean g() {
        return this.c;
    }

    @Override // defpackage.jff
    public boolean h() {
        return this.a;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int i = 1231;
        int i2 = ((((((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003;
        if (!this.n) {
            i = 1237;
        }
        return ((i2 ^ i) * 1000003) ^ this.o.hashCode();
    }

    @Override // defpackage.jff
    public boolean i() {
        return this.f;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("VoiceOnboardingModel{wakeWordEnabled=");
        V0.append(this.a);
        V0.append(", micEnabled=");
        V0.append(this.b);
        V0.append(", voiceEducationShown=");
        V0.append(this.c);
        V0.append(", wakeWordFeatureEnabled=");
        V0.append(this.f);
        V0.append(", languageExpansionEnabled=");
        V0.append(this.n);
        V0.append(", countryCode=");
        return je.I0(V0, this.o, "}");
    }
}

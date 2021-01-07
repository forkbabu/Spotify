package defpackage;

import defpackage.jv4;

/* renamed from: iv4  reason: default package */
final class iv4 extends jv4 {
    private final boolean a;
    private final boolean b;
    private final boolean c;

    /* access modifiers changed from: package-private */
    /* renamed from: iv4$b */
    public static final class b implements jv4.a {
        private Boolean a;
        private Boolean b;
        private Boolean c;

        b() {
        }

        @Override // defpackage.jv4.a
        public jv4.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.jv4.a
        public jv4.a b(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.jv4.a
        public jv4 build() {
            String str = this.a == null ? " update" : "";
            if (this.b == null) {
                str = je.x0(str, " enabled");
            }
            if (this.c == null) {
                str = je.x0(str, " userSet");
            }
            if (str.isEmpty()) {
                return new iv4(this.a.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.jv4.a
        public jv4.a c(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        b(jv4 jv4, a aVar) {
            this.a = Boolean.valueOf(jv4.c());
            this.b = Boolean.valueOf(jv4.b());
            this.c = Boolean.valueOf(jv4.d());
        }
    }

    iv4(boolean z, boolean z2, boolean z3, a aVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    @Override // defpackage.jv4
    public boolean b() {
        return this.b;
    }

    @Override // defpackage.jv4
    public boolean c() {
        return this.a;
    }

    @Override // defpackage.jv4
    public boolean d() {
        return this.c;
    }

    @Override // defpackage.jv4
    public jv4.a e() {
        return new b(this, null);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jv4)) {
            return false;
        }
        jv4 jv4 = (jv4) obj;
        if (this.a == jv4.c() && this.b == jv4.b() && this.c == jv4.d()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 1231;
        int i2 = ((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003;
        if (!this.c) {
            i = 1237;
        }
        return i2 ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("DataSaverModeConfiguration{update=");
        V0.append(this.a);
        V0.append(", enabled=");
        V0.append(this.b);
        V0.append(", userSet=");
        return je.P0(V0, this.c, "}");
    }
}

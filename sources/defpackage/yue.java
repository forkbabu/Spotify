package defpackage;

import defpackage.bve;

/* access modifiers changed from: package-private */
/* renamed from: yue  reason: default package */
public final class yue extends bve {
    private final boolean a;
    private final boolean b;
    private final boolean c;

    /* access modifiers changed from: package-private */
    /* renamed from: yue$b */
    public static final class b implements bve.a {
        private Boolean a;
        private Boolean b;
        private Boolean c;

        b() {
        }

        @Override // defpackage.bve.a
        public bve.a a(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.bve.a
        public bve.a b(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.bve.a
        public bve build() {
            String str = this.a == null ? " showIntentEnabled" : "";
            if (this.b == null) {
                str = je.x0(str, " userEducationEnabled");
            }
            if (this.c == null) {
                str = je.x0(str, " userEducationShowMessageEnabled");
            }
            if (str.isEmpty()) {
                return new yue(this.a.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.bve.a
        public bve.a c(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }
    }

    yue(boolean z, boolean z2, boolean z3, a aVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    @Override // defpackage.bve
    public boolean b() {
        return this.a;
    }

    @Override // defpackage.bve
    public boolean c() {
        return this.b;
    }

    @Override // defpackage.bve
    public boolean d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bve)) {
            return false;
        }
        bve bve = (bve) obj;
        if (this.a == bve.b() && this.b == bve.c() && this.c == bve.d()) {
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
        StringBuilder V0 = je.V0("ShowEducationConfig{showIntentEnabled=");
        V0.append(this.a);
        V0.append(", userEducationEnabled=");
        V0.append(this.b);
        V0.append(", userEducationShowMessageEnabled=");
        return je.P0(V0, this.c, "}");
    }
}

package defpackage;

import defpackage.t21;

/* access modifiers changed from: package-private */
/* renamed from: n21  reason: default package */
public final class n21 extends t21 {
    private final String b;
    private final p21 c;
    private final o21 d;

    /* access modifiers changed from: package-private */
    /* renamed from: n21$b */
    public static final class b implements t21.a {
        private String a;
        private p21 b;
        private o21 c;

        b() {
        }

        public t21 a() {
            String str = this.a == null ? " oneTimeResetPasswordToken" : "";
            if (this.b == null) {
                str = je.x0(str, " passwordState");
            }
            if (this.c == null) {
                str = je.x0(str, " errorState");
            }
            if (str.isEmpty()) {
                return new n21(this.a, this.b, this.c, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public t21.a b(o21 o21) {
            if (o21 != null) {
                this.c = o21;
                return this;
            }
            throw new NullPointerException("Null errorState");
        }

        public t21.a c(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null oneTimeResetPasswordToken");
        }

        public t21.a d(p21 p21) {
            if (p21 != null) {
                this.b = p21;
                return this;
            }
            throw new NullPointerException("Null passwordState");
        }

        b(t21 t21, a aVar) {
            this.a = t21.c();
            this.b = t21.e();
            this.c = t21.a();
        }
    }

    n21(String str, p21 p21, o21 o21, a aVar) {
        this.b = str;
        this.c = p21;
        this.d = o21;
    }

    @Override // defpackage.t21
    public o21 a() {
        return this.d;
    }

    @Override // defpackage.t21
    public String c() {
        return this.b;
    }

    @Override // defpackage.t21
    public p21 e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t21)) {
            return false;
        }
        t21 t21 = (t21) obj;
        if (!this.b.equals(t21.c()) || !this.c.equals(t21.e()) || !this.d.equals(t21.a())) {
            return false;
        }
        return true;
    }

    @Override // defpackage.t21
    public t21.a f() {
        return new b(this, null);
    }

    public int hashCode() {
        return ((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("SetPasswordModel{oneTimeResetPasswordToken=");
        V0.append(this.b);
        V0.append(", passwordState=");
        V0.append(this.c);
        V0.append(", errorState=");
        V0.append(this.d);
        V0.append("}");
        return V0.toString();
    }
}

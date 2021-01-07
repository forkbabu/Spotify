package defpackage;

import defpackage.tae;

/* access modifiers changed from: package-private */
/* renamed from: nae  reason: default package */
public abstract class nae extends tae {
    private final int b;
    private final int c;
    private final int f;
    private final uae n;
    private final boolean o;

    /* access modifiers changed from: package-private */
    /* renamed from: nae$b */
    public static class b implements tae.a {
        private Integer a;
        private Integer b;
        private Integer c;
        private uae d;
        private Boolean e;

        b() {
        }

        public tae.a a(uae uae) {
            if (uae != null) {
                this.d = uae;
                return this;
            }
            throw new NullPointerException("Null ageState");
        }

        public tae.a b(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }

        public tae.a c(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        public tae.a d(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        public tae e() {
            String str = this.a == null ? " birthDay" : "";
            if (this.b == null) {
                str = je.x0(str, " birthMonth");
            }
            if (this.c == null) {
                str = je.x0(str, " birthYear");
            }
            if (this.d == null) {
                str = je.x0(str, " ageState");
            }
            if (this.e == null) {
                str = je.x0(str, " displayVerificationError");
            }
            if (str.isEmpty()) {
                return new vae(this.a.intValue(), this.b.intValue(), this.c.intValue(), this.d, this.e.booleanValue());
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public tae.a f(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        b(tae tae, a aVar) {
            this.a = Integer.valueOf(tae.b());
            this.b = Integer.valueOf(tae.c());
            this.c = Integer.valueOf(tae.e());
            this.d = tae.a();
            this.e = Boolean.valueOf(tae.f());
        }
    }

    nae(int i, int i2, int i3, uae uae, boolean z) {
        this.b = i;
        this.c = i2;
        this.f = i3;
        if (uae != null) {
            this.n = uae;
            this.o = z;
            return;
        }
        throw new NullPointerException("Null ageState");
    }

    @Override // defpackage.tae
    public uae a() {
        return this.n;
    }

    @Override // defpackage.tae
    public int b() {
        return this.b;
    }

    @Override // defpackage.tae
    public int c() {
        return this.c;
    }

    @Override // defpackage.tae
    public int e() {
        return this.f;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tae)) {
            return false;
        }
        tae tae = (tae) obj;
        if (this.b == tae.b() && this.c == tae.c() && this.f == tae.e() && this.n.equals(tae.a()) && this.o == tae.f()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.tae
    public boolean f() {
        return this.o;
    }

    @Override // defpackage.tae
    public tae.a g() {
        return new b(this, null);
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((((((((this.b ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.f) * 1000003) ^ this.n.hashCode()) * 1000003) ^ (this.o ? 1231 : 1237);
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("AgeModel{birthDay=");
        V0.append(this.b);
        V0.append(", birthMonth=");
        V0.append(this.c);
        V0.append(", birthYear=");
        V0.append(this.f);
        V0.append(", ageState=");
        V0.append(this.n);
        V0.append(", displayVerificationError=");
        return je.P0(V0, this.o, "}");
    }
}

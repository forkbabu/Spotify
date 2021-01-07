package defpackage;

import defpackage.phe;

/* renamed from: rge  reason: default package */
abstract class rge extends phe {
    private final qhe b;
    private final boolean c;
    private final boolean f;

    /* renamed from: rge$b */
    static class b extends phe.a {
        private qhe a;
        private Boolean b;
        private Boolean c;

        b() {
        }

        @Override // defpackage.phe.a
        public phe a() {
            String str = this.a == null ? " emailState" : "";
            if (this.b == null) {
                str = je.x0(str, " hasConnection");
            }
            if (this.c == null) {
                str = je.x0(str, " useHints");
            }
            if (str.isEmpty()) {
                return new mhe(this.a, this.b.booleanValue(), this.c.booleanValue());
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.phe.a
        public phe.a b(qhe qhe) {
            if (qhe != null) {
                this.a = qhe;
                return this;
            }
            throw new NullPointerException("Null emailState");
        }

        @Override // defpackage.phe.a
        public phe.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.phe.a
        public phe.a d(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        b(phe phe, a aVar) {
            this.a = phe.b();
            this.b = Boolean.valueOf(phe.c());
            this.c = Boolean.valueOf(phe.f());
        }
    }

    rge(qhe qhe, boolean z, boolean z2) {
        if (qhe != null) {
            this.b = qhe;
            this.c = z;
            this.f = z2;
            return;
        }
        throw new NullPointerException("Null emailState");
    }

    @Override // defpackage.phe
    public qhe b() {
        return this.b;
    }

    @Override // defpackage.phe
    public boolean c() {
        return this.c;
    }

    @Override // defpackage.phe
    public phe.a e() {
        return new b(this, null);
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof phe)) {
            return false;
        }
        phe phe = (phe) obj;
        if (this.b.equals(phe.b()) && this.c == phe.c() && this.f == phe.f()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.phe
    public boolean f() {
        return this.f;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int i = 1231;
        int hashCode = (((this.b.hashCode() ^ 1000003) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003;
        if (!this.f) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("EmailModel{emailState=");
        V0.append(this.b);
        V0.append(", hasConnection=");
        V0.append(this.c);
        V0.append(", useHints=");
        return je.P0(V0, this.f, "}");
    }
}

package defpackage;

import defpackage.pke;

/* renamed from: yje  reason: default package */
abstract class yje extends pke {
    private final qke b;
    private final boolean c;

    /* renamed from: yje$b */
    static class b extends pke.a {
        private qke a;
        private Boolean b;

        b() {
        }

        @Override // defpackage.pke.a
        public pke a() {
            String str = this.a == null ? " passwordState" : "";
            if (this.b == null) {
                str = je.x0(str, " displayHints");
            }
            if (str.isEmpty()) {
                return new mke(this.a, this.b.booleanValue());
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.pke.a
        public pke.a b(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.pke.a
        public pke.a c(qke qke) {
            if (qke != null) {
                this.a = qke;
                return this;
            }
            throw new NullPointerException("Null passwordState");
        }

        b(pke pke, a aVar) {
            this.a = pke.c();
            this.b = Boolean.valueOf(pke.a());
        }
    }

    yje(qke qke, boolean z) {
        if (qke != null) {
            this.b = qke;
            this.c = z;
            return;
        }
        throw new NullPointerException("Null passwordState");
    }

    @Override // defpackage.pke
    public boolean a() {
        return this.c;
    }

    @Override // defpackage.pke
    public qke c() {
        return this.b;
    }

    @Override // defpackage.pke
    public pke.a e() {
        return new b(this, null);
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pke)) {
            return false;
        }
        pke pke = (pke) obj;
        if (!this.b.equals(pke.c()) || this.c != pke.a()) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ (this.c ? 1231 : 1237);
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("PasswordModel{passwordState=");
        V0.append(this.b);
        V0.append(", displayHints=");
        return je.P0(V0, this.c, "}");
    }
}

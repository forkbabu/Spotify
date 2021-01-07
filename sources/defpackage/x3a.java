package defpackage;

import defpackage.n4a;

/* renamed from: x3a  reason: default package */
final class x3a extends n4a {
    private final String a;
    private final String b;
    private final String c;
    private final boolean d;

    /* access modifiers changed from: package-private */
    /* renamed from: x3a$b */
    public static final class b implements n4a.a {
        private String a;
        private String b;
        private String c;
        private Boolean d;

        b() {
        }

        @Override // defpackage.n4a.a
        public n4a.a a(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null category");
        }

        @Override // defpackage.n4a.a
        public n4a.a b(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null sessionId");
        }

        @Override // defpackage.n4a.a
        public n4a build() {
            String str = this.a == null ? " sessionId" : "";
            if (this.b == null) {
                str = je.x0(str, " category");
            }
            if (this.c == null) {
                str = je.x0(str, " integrationType");
            }
            if (this.d == null) {
                str = je.x0(str, " started");
            }
            if (str.isEmpty()) {
                return new x3a(this.a, this.b, this.c, this.d.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.n4a.a
        public n4a.a c(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.n4a.a
        public n4a.a d(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null integrationType");
        }
    }

    x3a(String str, String str2, String str3, boolean z, a aVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    @Override // defpackage.n4a
    public String b() {
        return this.b;
    }

    @Override // defpackage.n4a
    public String c() {
        return this.c;
    }

    @Override // defpackage.n4a
    public String d() {
        return this.a;
    }

    @Override // defpackage.n4a
    public boolean e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n4a)) {
            return false;
        }
        n4a n4a = (n4a) obj;
        if (!this.a.equals(n4a.d()) || !this.b.equals(n4a.b()) || !this.c.equals(n4a.c()) || this.d != n4a.e()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder V0 = je.V0("ExternalIntegrationServiceSessionEvent{sessionId=");
        V0.append(this.a);
        V0.append(", category=");
        V0.append(this.b);
        V0.append(", integrationType=");
        V0.append(this.c);
        V0.append(", started=");
        return je.P0(V0, this.d, "}");
    }
}

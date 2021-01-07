package defpackage;

import defpackage.xte;

/* renamed from: tte  reason: default package */
final class tte extends xte {
    private final String a;
    private final String b;
    private final boolean c;
    private final boolean d;
    private final String e;

    /* access modifiers changed from: package-private */
    /* renamed from: tte$b */
    public static final class b implements xte.a {
        private String a;
        private String b;
        private Boolean c;
        private Boolean d;
        private String e;

        b() {
        }

        @Override // defpackage.xte.a
        public xte.a a(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null consumer");
        }

        @Override // defpackage.xte.a
        public xte.a b(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null id");
        }

        @Override // defpackage.xte.a
        public xte build() {
            String str = this.a == null ? " id" : "";
            if (this.b == null) {
                str = je.x0(str, " consumer");
            }
            if (this.c == null) {
                str = je.x0(str, " isMicGranted");
            }
            if (this.d == null) {
                str = je.x0(str, " isOffline");
            }
            if (this.e == null) {
                str = je.x0(str, " connectivityType");
            }
            if (str.isEmpty()) {
                return new tte(this.a, this.b, this.c.booleanValue(), this.d.booleanValue(), this.e, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.xte.a
        public xte.a c(String str) {
            if (str != null) {
                this.e = str;
                return this;
            }
            throw new NullPointerException("Null connectivityType");
        }

        @Override // defpackage.xte.a
        public xte.a d(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.xte.a
        public xte.a e(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }
    }

    tte(String str, String str2, boolean z, boolean z2, String str3, a aVar) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = str3;
    }

    @Override // defpackage.xte
    public String b() {
        return this.e;
    }

    @Override // defpackage.xte
    public String c() {
        return this.b;
    }

    @Override // defpackage.xte
    public String d() {
        return this.a;
    }

    @Override // defpackage.xte
    public boolean e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xte)) {
            return false;
        }
        xte xte = (xte) obj;
        if (!this.a.equals(xte.d()) || !this.b.equals(xte.c()) || this.c != xte.e() || this.d != xte.f() || !this.e.equals(xte.b())) {
            return false;
        }
        return true;
    }

    @Override // defpackage.xte
    public boolean f() {
        return this.d;
    }

    public int hashCode() {
        int i = 1231;
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003;
        if (!this.d) {
            i = 1237;
        }
        return ((hashCode ^ i) * 1000003) ^ this.e.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("StatusLogEvent{id=");
        V0.append(this.a);
        V0.append(", consumer=");
        V0.append(this.b);
        V0.append(", isMicGranted=");
        V0.append(this.c);
        V0.append(", isOffline=");
        V0.append(this.d);
        V0.append(", connectivityType=");
        return je.I0(V0, this.e, "}");
    }
}

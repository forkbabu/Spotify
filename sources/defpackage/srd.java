package defpackage;

import defpackage.trd;

/* renamed from: srd  reason: default package */
final class srd extends trd {
    private final String a;
    private final int b;
    private final String c;

    /* access modifiers changed from: package-private */
    /* renamed from: srd$b */
    public static final class b extends trd.a {
        private String a;
        private Integer b;
        private String c;

        b() {
        }

        @Override // defpackage.trd.a
        public trd a() {
            String str = this.a == null ? " callingPackage" : "";
            if (this.b == null) {
                str = je.x0(str, " callingUid");
            }
            if (this.c == null) {
                str = je.x0(str, " resourceName");
            }
            if (str.isEmpty()) {
                return new srd(this.a, this.b.intValue(), this.c, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.trd.a
        public trd.a b(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null callingPackage");
        }

        @Override // defpackage.trd.a
        public trd.a c(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        @Override // defpackage.trd.a
        public trd.a d(String str) {
            this.c = str;
            return this;
        }
    }

    srd(String str, int i, String str2, a aVar) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    @Override // defpackage.trd
    public String b() {
        return this.a;
    }

    @Override // defpackage.trd
    public int c() {
        return this.b;
    }

    @Override // defpackage.trd
    public String d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof trd)) {
            return false;
        }
        trd trd = (trd) obj;
        if (!this.a.equals(trd.b()) || this.b != trd.c() || !this.c.equals(trd.d())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("CallerDescription{callingPackage=");
        V0.append(this.a);
        V0.append(", callingUid=");
        V0.append(this.b);
        V0.append(", resourceName=");
        return je.I0(V0, this.c, "}");
    }
}

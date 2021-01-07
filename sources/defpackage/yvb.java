package defpackage;

import defpackage.awb;

/* renamed from: yvb  reason: default package */
final class yvb extends awb.a {
    private final String a;
    private final String b;
    private final String c;
    private final String d;

    /* renamed from: yvb$b */
    static final class b implements awb.a.AbstractC0056a {
        private String a;
        private String b;
        private String c;
        private String d;

        b() {
        }

        public awb.a a() {
            String str = this.a == null ? " title" : "";
            if (this.b == null) {
                str = je.x0(str, " subtitle");
            }
            if (this.c == null) {
                str = je.x0(str, " imageUri");
            }
            if (this.d == null) {
                str = je.x0(str, " contextUri");
            }
            if (str.isEmpty()) {
                return new yvb(this.a, this.b, this.c, this.d, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public awb.a.AbstractC0056a b(String str) {
            if (str != null) {
                this.d = str;
                return this;
            }
            throw new NullPointerException("Null contextUri");
        }

        public awb.a.AbstractC0056a c(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null imageUri");
        }

        public awb.a.AbstractC0056a d(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null subtitle");
        }

        public awb.a.AbstractC0056a e(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null title");
        }
    }

    yvb(String str, String str2, String str3, String str4, a aVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    @Override // defpackage.awb.a
    public String a() {
        return this.d;
    }

    @Override // defpackage.awb.a
    public String b() {
        return this.c;
    }

    @Override // defpackage.awb.a
    public String c() {
        return this.b;
    }

    @Override // defpackage.awb.a
    public String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof awb.a)) {
            return false;
        }
        awb.a aVar = (awb.a) obj;
        if (!this.a.equals(aVar.d()) || !this.b.equals(aVar.c()) || !this.c.equals(aVar.b()) || !this.d.equals(aVar.a())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("Item{title=");
        V0.append(this.a);
        V0.append(", subtitle=");
        V0.append(this.b);
        V0.append(", imageUri=");
        V0.append(this.c);
        V0.append(", contextUri=");
        return je.I0(V0, this.d, "}");
    }
}

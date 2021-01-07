package defpackage;

import defpackage.cj2;

/* renamed from: qi2  reason: default package */
final class qi2 extends cj2 {
    private final String a;
    private final String b;
    private final String c;

    /* renamed from: qi2$b */
    static final class b implements cj2.a {
        private String a;
        private String b;
        private String c;

        b() {
        }

        public cj2 a() {
            String str = this.a == null ? " uri" : "";
            if (this.b == null) {
                str = je.x0(str, " label");
            }
            if (this.c == null) {
                str = je.x0(str, " imageUri");
            }
            if (str.isEmpty()) {
                return new qi2(this.a, this.b, this.c, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public cj2.a b(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null imageUri");
        }

        public cj2.a c(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null label");
        }

        public cj2.a d(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null uri");
        }
    }

    qi2(String str, String str2, String str3, a aVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cj2
    public String a() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cj2
    public String b() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cj2
    public String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cj2)) {
            return false;
        }
        cj2 cj2 = (cj2) obj;
        if (!this.a.equals(cj2.c()) || !this.b.equals(cj2.b()) || !this.c.equals(cj2.a())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("ShortcutItem{uri=");
        V0.append(this.a);
        V0.append(", label=");
        V0.append(this.b);
        V0.append(", imageUri=");
        return je.I0(V0, this.c, "}");
    }
}

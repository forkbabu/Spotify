package defpackage;

import defpackage.fb9;

/* renamed from: ya9  reason: default package */
abstract class ya9 extends fb9 {
    private final String a;
    private final String b;
    private final boolean c;

    /* access modifiers changed from: package-private */
    /* renamed from: ya9$a */
    public static class a extends fb9.a {
        private String a;
        private String b;
        private Boolean c;

        a() {
        }

        public fb9 a() {
            String str = this.a == null ? " title" : "";
            if (this.b == null) {
                str = je.x0(str, " query");
            }
            if (this.c == null) {
                str = je.x0(str, " value");
            }
            if (str.isEmpty()) {
                return new eb9(this.a, this.b, this.c.booleanValue());
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public fb9.a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null query");
        }

        public fb9.a c(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null title");
        }

        public fb9.a d(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }
    }

    ya9(String str, String str2, boolean z) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                this.c = z;
                return;
            }
            throw new NullPointerException("Null query");
        }
        throw new NullPointerException("Null title");
    }

    @Override // defpackage.fb9
    public String a() {
        return this.b;
    }

    @Override // defpackage.fb9
    public String b() {
        return this.a;
    }

    @Override // defpackage.fb9
    public boolean c() {
        return this.c;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fb9)) {
            return false;
        }
        fb9 fb9 = (fb9) obj;
        if (!this.a.equals(fb9.b()) || !this.b.equals(fb9.a()) || this.c != fb9.c()) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (this.c ? 1231 : 1237);
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("FilterTag{title=");
        V0.append(this.a);
        V0.append(", query=");
        V0.append(this.b);
        V0.append(", value=");
        return je.P0(V0, this.c, "}");
    }
}

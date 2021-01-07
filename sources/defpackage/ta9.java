package defpackage;

import defpackage.va9;

/* access modifiers changed from: package-private */
/* renamed from: ta9  reason: default package */
public abstract class ta9 extends va9 {
    private final String a;
    private final String b;

    /* access modifiers changed from: package-private */
    /* renamed from: ta9$a */
    public static class a extends va9.a {
        private String a;
        private String b;

        a() {
        }

        @Override // defpackage.va9.a
        public va9 a() {
            String str = this.a == null ? " id" : "";
            if (this.b == null) {
                str = je.x0(str, " title");
            }
            if (str.isEmpty()) {
                return new wa9(this.a, this.b);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.va9.a
        public va9.a b(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null id");
        }

        @Override // defpackage.va9.a
        public va9.a c(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null title");
        }
    }

    ta9(String str, String str2) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                return;
            }
            throw new NullPointerException("Null title");
        }
        throw new NullPointerException("Null id");
    }

    @Override // defpackage.va9
    public String b() {
        return this.a;
    }

    @Override // defpackage.va9
    public String c() {
        return this.b;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof va9)) {
            return false;
        }
        va9 va9 = (va9) obj;
        if (!this.a.equals(va9.b()) || !this.b.equals(va9.c())) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("ActiveFilter{id=");
        V0.append(this.a);
        V0.append(", title=");
        return je.I0(V0, this.b, "}");
    }
}

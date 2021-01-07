package defpackage;

import defpackage.wte;

/* renamed from: ste  reason: default package */
final class ste extends wte {
    private final String a;
    private final String b;

    /* access modifiers changed from: package-private */
    /* renamed from: ste$b */
    public static final class b implements wte.a {
        private String a;
        private String b;

        b() {
        }

        @Override // defpackage.wte.a
        public wte.a a(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null consumer");
        }

        @Override // defpackage.wte.a
        public wte.a b(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null id");
        }

        @Override // defpackage.wte.a
        public wte build() {
            String str = this.a == null ? " id" : "";
            if (this.b == null) {
                str = je.x0(str, " consumer");
            }
            if (str.isEmpty()) {
                return new ste(this.a, this.b, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }
    }

    ste(String str, String str2, a aVar) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.wte
    public String b() {
        return this.b;
    }

    @Override // defpackage.wte
    public String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wte)) {
            return false;
        }
        wte wte = (wte) obj;
        if (!this.a.equals(wte.c()) || !this.b.equals(wte.b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("ResultLogEvent{id=");
        V0.append(this.a);
        V0.append(", consumer=");
        return je.I0(V0, this.b, "}");
    }
}

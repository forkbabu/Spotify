package defpackage;

import defpackage.ote;

/* renamed from: pte  reason: default package */
final class pte extends ote {
    private final String a;
    private final String b;
    private final String c;

    /* access modifiers changed from: package-private */
    /* renamed from: pte$b */
    public static final class b implements ote.a {
        private String a;
        private String b;
        private String c;

        b() {
        }

        @Override // defpackage.ote.a
        public ote.a a(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null consumer");
        }

        @Override // defpackage.ote.a
        public ote.a b(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null id");
        }

        @Override // defpackage.ote.a
        public ote build() {
            String str = this.a == null ? " id" : "";
            if (this.b == null) {
                str = je.x0(str, " consumer");
            }
            if (this.c == null) {
                str = je.x0(str, " port");
            }
            if (str.isEmpty()) {
                return new pte(this.a, this.b, this.c, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.ote.a
        public ote.a c(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null port");
        }
    }

    pte(String str, String str2, String str3, a aVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // defpackage.ote
    public String b() {
        return this.b;
    }

    @Override // defpackage.ote
    public String c() {
        return this.a;
    }

    @Override // defpackage.ote
    public String d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ote)) {
            return false;
        }
        ote ote = (ote) obj;
        if (!this.a.equals(ote.c()) || !this.b.equals(ote.b()) || !this.c.equals(ote.d())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("AudioLogEvent{id=");
        V0.append(this.a);
        V0.append(", consumer=");
        V0.append(this.b);
        V0.append(", port=");
        return je.I0(V0, this.c, "}");
    }
}

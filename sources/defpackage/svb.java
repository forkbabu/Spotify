package defpackage;

import defpackage.uvb;

/* renamed from: svb  reason: default package */
final class svb extends uvb {
    private final String a;
    private final String b;
    private final String c;
    private final String d;

    /* access modifiers changed from: package-private */
    /* renamed from: svb$b */
    public static final class b implements uvb.a {
        private String a;
        private String b;
        private String c;
        private String d;

        b() {
        }

        @Override // defpackage.uvb.a
        public uvb.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null title");
        }

        @Override // defpackage.uvb.a
        public uvb.a b(String str) {
            if (str != null) {
                this.d = str;
                return this;
            }
            throw new NullPointerException("Null contextUri");
        }

        @Override // defpackage.uvb.a
        public uvb build() {
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
                return new svb(this.a, this.b, this.c, this.d, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.uvb.a
        public uvb.a c(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null imageUri");
        }

        @Override // defpackage.uvb.a
        public uvb.a d(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null subtitle");
        }
    }

    svb(String str, String str2, String str3, String str4, a aVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    @Override // defpackage.uvb
    public String b() {
        return this.d;
    }

    @Override // defpackage.uvb
    public String c() {
        return this.c;
    }

    @Override // defpackage.uvb
    public String d() {
        return this.b;
    }

    @Override // defpackage.uvb
    public String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uvb)) {
            return false;
        }
        uvb uvb = (uvb) obj;
        if (!this.a.equals(uvb.e()) || !this.b.equals(uvb.d()) || !this.c.equals(uvb.c()) || !this.d.equals(uvb.b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("VoiceResultItem{title=");
        V0.append(this.a);
        V0.append(", subtitle=");
        V0.append(this.b);
        V0.append(", imageUri=");
        V0.append(this.c);
        V0.append(", contextUri=");
        return je.I0(V0, this.d, "}");
    }
}

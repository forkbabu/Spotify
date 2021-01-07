package defpackage;

import defpackage.gl1;

/* renamed from: hl1  reason: default package */
final class hl1 extends gl1 {
    private final String a;
    private final String b;
    private final String c;
    private final Boolean d;
    private final String e;

    /* access modifiers changed from: package-private */
    /* renamed from: hl1$b */
    public static final class b extends gl1.a {
        private String a;
        private String b;
        private String c;
        private Boolean d;
        private String e;

        b() {
        }

        @Override // defpackage.gl1.a
        public gl1.a a(String str) {
            this.e = str;
            return this;
        }

        @Override // defpackage.gl1.a
        public gl1 b() {
            String str = this.a == null ? " name" : "";
            if (this.b == null) {
                str = je.x0(str, " uri");
            }
            if (this.d == null) {
                str = je.x0(str, " explicit");
            }
            if (str.isEmpty()) {
                return new hl1(this.a, this.b, this.c, this.d, this.e, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.gl1.a
        public gl1.a c(Boolean bool) {
            if (bool != null) {
                this.d = bool;
                return this;
            }
            throw new NullPointerException("Null explicit");
        }

        @Override // defpackage.gl1.a
        public gl1.a d(String str) {
            this.c = str;
            return this;
        }

        @Override // defpackage.gl1.a
        public gl1.a e(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }

        @Override // defpackage.gl1.a
        public gl1.a f(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null uri");
        }
    }

    hl1(String str, String str2, String str3, Boolean bool, String str4, a aVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bool;
        this.e = str4;
    }

    @Override // defpackage.gl1
    public String a() {
        return this.e;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gl1)) {
            return false;
        }
        gl1 gl1 = (gl1) obj;
        if (this.a.equals(((hl1) gl1).a)) {
            hl1 hl1 = (hl1) gl1;
            if (this.b.equals(hl1.b) && ((str = this.c) != null ? str.equals(hl1.c) : hl1.c == null) && this.d.equals(hl1.d)) {
                String str2 = this.e;
                if (str2 == null) {
                    if (gl1.a() == null) {
                        return true;
                    }
                } else if (str2.equals(gl1.a())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.ll1
    public Boolean explicit() {
        return this.d;
    }

    public int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int i = 0;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.d.hashCode()) * 1000003;
        String str2 = this.e;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 ^ i;
    }

    @Override // defpackage.ll1
    public String imageUri() {
        return this.c;
    }

    @Override // defpackage.ll1
    public String name() {
        return this.a;
    }

    public String toString() {
        StringBuilder V0 = je.V0("AlbumSearchItem{name=");
        V0.append(this.a);
        V0.append(", uri=");
        V0.append(this.b);
        V0.append(", imageUri=");
        V0.append(this.c);
        V0.append(", explicit=");
        V0.append(this.d);
        V0.append(", artists=");
        return je.I0(V0, this.e, "}");
    }

    @Override // defpackage.ll1
    public String uri() {
        return this.b;
    }
}

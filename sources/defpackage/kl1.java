package defpackage;

import defpackage.ol1;

/* renamed from: kl1  reason: default package */
final class kl1 extends ol1 {
    private final String a;
    private final String b;
    private final String c;
    private final Boolean d;
    private final String e;
    private final gl1 f;

    /* access modifiers changed from: package-private */
    /* renamed from: kl1$b */
    public static final class b extends ol1.a {
        private String a;
        private String b;
        private String c;
        private Boolean d;
        private String e;
        private gl1 f;

        b() {
        }

        @Override // defpackage.ol1.a
        public ol1.a a(gl1 gl1) {
            this.f = gl1;
            return this;
        }

        @Override // defpackage.ol1.a
        public ol1.a b(String str) {
            this.e = str;
            return this;
        }

        @Override // defpackage.ol1.a
        public ol1 c() {
            String str = this.a == null ? " name" : "";
            if (this.b == null) {
                str = je.x0(str, " uri");
            }
            if (this.d == null) {
                str = je.x0(str, " explicit");
            }
            if (str.isEmpty()) {
                return new kl1(this.a, this.b, this.c, this.d, this.e, this.f, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.ol1.a
        public ol1.a d(Boolean bool) {
            if (bool != null) {
                this.d = bool;
                return this;
            }
            throw new NullPointerException("Null explicit");
        }

        @Override // defpackage.ol1.a
        public ol1.a e(String str) {
            this.c = str;
            return this;
        }

        @Override // defpackage.ol1.a
        public ol1.a f(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }

        @Override // defpackage.ol1.a
        public ol1.a g(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null uri");
        }
    }

    kl1(String str, String str2, String str3, Boolean bool, String str4, gl1 gl1, a aVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bool;
        this.e = str4;
        this.f = gl1;
    }

    @Override // defpackage.ol1
    public gl1 a() {
        return this.f;
    }

    @Override // defpackage.ol1
    public String b() {
        return this.e;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ol1)) {
            return false;
        }
        ol1 ol1 = (ol1) obj;
        if (this.a.equals(((kl1) ol1).a)) {
            kl1 kl1 = (kl1) ol1;
            if (this.b.equals(kl1.b) && ((str = this.c) != null ? str.equals(kl1.c) : kl1.c == null) && this.d.equals(kl1.d) && ((str2 = this.e) != null ? str2.equals(ol1.b()) : ol1.b() == null)) {
                gl1 gl1 = this.f;
                if (gl1 == null) {
                    if (ol1.a() == null) {
                        return true;
                    }
                } else if (gl1.equals(ol1.a())) {
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
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        gl1 gl1 = this.f;
        if (gl1 != null) {
            i = gl1.hashCode();
        }
        return hashCode3 ^ i;
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
        StringBuilder V0 = je.V0("TrackSearchItem{name=");
        V0.append(this.a);
        V0.append(", uri=");
        V0.append(this.b);
        V0.append(", imageUri=");
        V0.append(this.c);
        V0.append(", explicit=");
        V0.append(this.d);
        V0.append(", artists=");
        V0.append(this.e);
        V0.append(", album=");
        V0.append(this.f);
        V0.append("}");
        return V0.toString();
    }

    @Override // defpackage.ll1
    public String uri() {
        return this.b;
    }
}

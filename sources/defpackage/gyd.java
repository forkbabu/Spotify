package defpackage;

import defpackage.oyd;

/* renamed from: gyd  reason: default package */
final class gyd extends oyd {
    private final String a;
    private final String b;

    /* access modifiers changed from: package-private */
    /* renamed from: gyd$b */
    public static final class b implements oyd.a {
        private String a;
        private String b;

        b() {
        }

        @Override // defpackage.oyd.a
        public oyd build() {
            String str = this.a == null ? " name" : "";
            if (this.b == null) {
                str = je.x0(str, " uri");
            }
            if (str.isEmpty()) {
                return new gyd(this.a, this.b, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.oyd.a
        public oyd.a d(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }

        @Override // defpackage.oyd.a
        public oyd.a f(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null uri");
        }
    }

    gyd(String str, String str2, a aVar) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.oyd
    public String b() {
        return this.a;
    }

    @Override // defpackage.oyd
    public String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oyd)) {
            return false;
        }
        oyd oyd = (oyd) obj;
        if (!this.a.equals(oyd.b()) || !this.b.equals(oyd.c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("PodcastTopic{name=");
        V0.append(this.a);
        V0.append(", uri=");
        return je.I0(V0, this.b, "}");
    }
}

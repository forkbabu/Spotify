package defpackage;

import defpackage.v2f;

/* access modifiers changed from: package-private */
/* renamed from: s2f  reason: default package */
public abstract class s2f extends v2f {
    private final String a;
    private final String b;
    private final String c;

    /* access modifiers changed from: package-private */
    /* renamed from: s2f$b */
    public static class b implements v2f.a {
        private String a;
        private String b;
        private String c;

        b() {
        }

        public v2f a() {
            String str = this.a == null ? " utteranceId" : "";
            if (this.b == null) {
                str = je.x0(str, " element");
            }
            if (this.c == null) {
                str = je.x0(str, " source");
            }
            if (str.isEmpty()) {
                return new t2f(this.a, this.b, this.c);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public v2f.a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null element");
        }

        public v2f.a c(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null source");
        }

        public v2f.a d(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null utteranceId");
        }

        b(v2f v2f, a aVar) {
            this.a = v2f.g();
            this.b = v2f.c();
            this.c = v2f.e();
        }
    }

    s2f(String str, String str2, String str3) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    return;
                }
                throw new NullPointerException("Null source");
            }
            throw new NullPointerException("Null element");
        }
        throw new NullPointerException("Null utteranceId");
    }

    @Override // defpackage.v2f
    public String c() {
        return this.b;
    }

    @Override // defpackage.v2f
    public String e() {
        return this.c;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v2f)) {
            return false;
        }
        v2f v2f = (v2f) obj;
        if (!this.a.equals(v2f.g()) || !this.b.equals(v2f.c()) || !this.c.equals(v2f.e())) {
            return false;
        }
        return true;
    }

    @Override // defpackage.v2f
    public v2f.a f() {
        return new b(this, null);
    }

    @Override // defpackage.v2f
    public String g() {
        return this.a;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("VoiceExperienceLogModel{utteranceId=");
        V0.append(this.a);
        V0.append(", element=");
        V0.append(this.b);
        V0.append(", source=");
        return je.I0(V0, this.c, "}");
    }
}

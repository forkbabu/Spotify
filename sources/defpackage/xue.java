package defpackage;

import defpackage.cve;

/* renamed from: xue  reason: default package */
abstract class xue extends cve {
    private final String a;
    private final String b;
    private final String c;
    private final String f;

    /* access modifiers changed from: package-private */
    /* renamed from: xue$b */
    public static class b implements cve.a {
        private String a;
        private String b;
        private String c;
        private String d;

        b() {
        }

        public cve a() {
            String str = this.a == null ? " utteranceId" : "";
            if (this.b == null) {
                str = je.x0(str, " element");
            }
            if (this.c == null) {
                str = je.x0(str, " source");
            }
            if (this.d == null) {
                str = je.x0(str, " carModeStatus");
            }
            if (str.isEmpty()) {
                return new zue(this.a, this.b, this.c, this.d);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public cve.a b(String str) {
            if (str != null) {
                this.d = str;
                return this;
            }
            throw new NullPointerException("Null carModeStatus");
        }

        public cve.a c(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null element");
        }

        public cve.a d(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null source");
        }

        public cve.a e(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null utteranceId");
        }

        b(cve cve, a aVar) {
            this.a = cve.h();
            this.b = cve.e();
            this.c = cve.f();
            this.d = cve.a();
        }
    }

    xue(String str, String str2, String str3, String str4) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    if (str4 != null) {
                        this.f = str4;
                        return;
                    }
                    throw new NullPointerException("Null carModeStatus");
                }
                throw new NullPointerException("Null source");
            }
            throw new NullPointerException("Null element");
        }
        throw new NullPointerException("Null utteranceId");
    }

    @Override // defpackage.cve
    public String a() {
        return this.f;
    }

    @Override // defpackage.cve
    public String e() {
        return this.b;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cve)) {
            return false;
        }
        cve cve = (cve) obj;
        if (!this.a.equals(cve.h()) || !this.b.equals(cve.e()) || !this.c.equals(cve.f()) || !this.f.equals(cve.a())) {
            return false;
        }
        return true;
    }

    @Override // defpackage.cve
    public String f() {
        return this.c;
    }

    @Override // defpackage.cve
    public cve.a g() {
        return new b(this, null);
    }

    @Override // defpackage.cve
    public String h() {
        return this.a;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("VoiceExperienceLogModel{utteranceId=");
        V0.append(this.a);
        V0.append(", element=");
        V0.append(this.b);
        V0.append(", source=");
        V0.append(this.c);
        V0.append(", carModeStatus=");
        return je.I0(V0, this.f, "}");
    }
}

package defpackage;

import defpackage.w2f;

/* access modifiers changed from: package-private */
/* renamed from: u2f  reason: default package */
public final class u2f extends w2f {
    private final x2f a;
    private final String b;
    private final String c;
    private final String d;
    private final v2f e;
    private final boolean f;

    /* access modifiers changed from: package-private */
    /* renamed from: u2f$b */
    public static final class b implements w2f.a {
        private x2f a;
        private String b;
        private String c;
        private String d;
        private v2f e;
        private Boolean f;

        b() {
        }

        public w2f a() {
            String str = this.a == null ? " state" : "";
            if (this.b == null) {
                str = je.x0(str, " utteranceId");
            }
            if (this.d == null) {
                str = je.x0(str, " interactionId");
            }
            if (this.e == null) {
                str = je.x0(str, " logModel");
            }
            if (this.f == null) {
                str = je.x0(str, " stopAllOnDismiss");
            }
            if (str.isEmpty()) {
                return new u2f(this.a, this.b, this.c, this.d, this.e, this.f.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public w2f.a b(String str) {
            if (str != null) {
                this.d = str;
                return this;
            }
            throw new NullPointerException("Null interactionId");
        }

        public w2f.a c(v2f v2f) {
            if (v2f != null) {
                this.e = v2f;
                return this;
            }
            throw new NullPointerException("Null logModel");
        }

        public w2f.a d(x2f x2f) {
            if (x2f != null) {
                this.a = x2f;
                return this;
            }
            throw new NullPointerException("Null state");
        }

        public w2f.a e(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        public w2f.a f(String str) {
            this.c = str;
            return this;
        }

        public w2f.a g(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null utteranceId");
        }

        b(w2f w2f, a aVar) {
            this.a = w2f.d();
            this.b = w2f.h();
            this.c = w2f.f();
            this.d = w2f.b();
            this.e = w2f.c();
            this.f = Boolean.valueOf(w2f.e());
        }
    }

    u2f(x2f x2f, String str, String str2, String str3, v2f v2f, boolean z, a aVar) {
        this.a = x2f;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = v2f;
        this.f = z;
    }

    @Override // defpackage.w2f
    public String b() {
        return this.d;
    }

    @Override // defpackage.w2f
    public v2f c() {
        return this.e;
    }

    @Override // defpackage.w2f
    public x2f d() {
        return this.a;
    }

    @Override // defpackage.w2f
    public boolean e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w2f)) {
            return false;
        }
        w2f w2f = (w2f) obj;
        if (!this.a.equals(w2f.d()) || !this.b.equals(w2f.h()) || ((str = this.c) != null ? !str.equals(w2f.f()) : w2f.f() != null) || !this.d.equals(w2f.b()) || !this.e.equals(w2f.c()) || this.f != w2f.e()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.w2f
    public String f() {
        return this.c;
    }

    @Override // defpackage.w2f
    public w2f.a g() {
        return new b(this, null);
    }

    @Override // defpackage.w2f
    public String h() {
        return this.b;
    }

    public int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        return ((((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (this.f ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder V0 = je.V0("VoiceModel{state=");
        V0.append(this.a);
        V0.append(", utteranceId=");
        V0.append(this.b);
        V0.append(", targetUri=");
        V0.append(this.c);
        V0.append(", interactionId=");
        V0.append(this.d);
        V0.append(", logModel=");
        V0.append(this.e);
        V0.append(", stopAllOnDismiss=");
        return je.P0(V0, this.f, "}");
    }
}

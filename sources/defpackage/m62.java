package defpackage;

import defpackage.p62;

/* access modifiers changed from: package-private */
/* renamed from: m62  reason: default package */
public abstract class m62 extends p62 {
    private final String a;
    private final String b;
    private final boolean c;
    private final int f;

    /* access modifiers changed from: package-private */
    /* renamed from: m62$a */
    public static class a extends p62.a {
        private String a;
        private String b;
        private Boolean c;
        private Integer d;

        a() {
        }

        @Override // defpackage.p62.a
        public p62 a() {
            String str = this.a == null ? " manifestUrlTemplate" : "";
            if (this.b == null) {
                str = je.x0(str, " licenseUrl");
            }
            if (this.c == null) {
                str = je.x0(str, " subtitlesEnabled");
            }
            if (this.d == null) {
                str = je.x0(str, " videoCdnSampling");
            }
            if (str.isEmpty()) {
                return new o62(this.a, this.b, this.c.booleanValue(), this.d.intValue());
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.p62.a
        public p62.a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null licenseUrl");
        }

        @Override // defpackage.p62.a
        public p62.a c(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null manifestUrlTemplate");
        }

        @Override // defpackage.p62.a
        public p62.a d(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.p62.a
        public p62.a e(int i) {
            this.d = Integer.valueOf(i);
            return this;
        }
    }

    m62(String str, String str2, boolean z, int i) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                this.c = z;
                this.f = i;
                return;
            }
            throw new NullPointerException("Null licenseUrl");
        }
        throw new NullPointerException("Null manifestUrlTemplate");
    }

    @Override // defpackage.p62
    public String b() {
        return this.b;
    }

    @Override // defpackage.p62
    public String c() {
        return this.a;
    }

    @Override // defpackage.p62
    public boolean e() {
        return this.c;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p62)) {
            return false;
        }
        p62 p62 = (p62) obj;
        if (!this.a.equals(p62.c()) || !this.b.equals(p62.b()) || this.c != p62.e() || this.f != p62.f()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.p62
    public int f() {
        return this.f;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ this.f;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("BetamaxConfiguration{manifestUrlTemplate=");
        V0.append(this.a);
        V0.append(", licenseUrl=");
        V0.append(this.b);
        V0.append(", subtitlesEnabled=");
        V0.append(this.c);
        V0.append(", videoCdnSampling=");
        return je.B0(V0, this.f, "}");
    }
}

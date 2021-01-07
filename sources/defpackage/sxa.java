package defpackage;

import defpackage.txa;

/* access modifiers changed from: package-private */
/* renamed from: sxa  reason: default package */
public final class sxa extends txa {
    private final boolean b;
    private final String c;
    private final boolean d;

    /* access modifiers changed from: package-private */
    /* renamed from: sxa$b */
    public static final class b extends txa.a {
        private Boolean a;
        private String b;
        private Boolean c;

        b() {
        }

        @Override // defpackage.txa.a
        public txa a() {
            String str = this.a == null ? " onDemandEnabled" : "";
            if (this.b == null) {
                str = je.x0(str, " sessionId");
            }
            if (this.c == null) {
                str = je.x0(str, " podcastsInYourLibraryEnabled");
            }
            if (str.isEmpty()) {
                return new sxa(this.a.booleanValue(), this.b, this.c.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.txa.a
        public txa.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.txa.a
        public txa.a c(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.txa.a
        public txa.a d(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null sessionId");
        }
    }

    sxa(boolean z, String str, boolean z2, a aVar) {
        this.b = z;
        this.c = str;
        this.d = z2;
    }

    @Override // defpackage.txa
    public boolean b() {
        return this.b;
    }

    @Override // defpackage.txa
    public boolean c() {
        return this.d;
    }

    @Override // defpackage.txa
    public String d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof txa)) {
            return false;
        }
        txa txa = (txa) obj;
        if (this.b == txa.b() && this.c.equals(txa.d()) && this.d == txa.c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 1231;
        int hashCode = ((((this.b ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003;
        if (!this.d) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("SearchConfig{onDemandEnabled=");
        V0.append(this.b);
        V0.append(", sessionId=");
        V0.append(this.c);
        V0.append(", podcastsInYourLibraryEnabled=");
        return je.P0(V0, this.d, "}");
    }
}

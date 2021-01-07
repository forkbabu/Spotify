package com.spotify.mobile.android.service.media.browser;

import com.spotify.mobile.android.service.media.browser.BrowserParams;

final class l extends BrowserParams {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final BrowserParams.TransportType k;
    private final BrowserParams.Protocol l;

    /* access modifiers changed from: package-private */
    public static final class b implements BrowserParams.a {
        private String a;
        private String b;
        private String c;
        private String d;
        private String e;
        private Boolean f;
        private Boolean g;
        private Boolean h;
        private Boolean i;
        private Boolean j;
        private BrowserParams.TransportType k;
        private BrowserParams.Protocol l;

        b() {
        }

        @Override // com.spotify.mobile.android.service.media.browser.BrowserParams.a
        public BrowserParams.a a(boolean z) {
            this.i = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.mobile.android.service.media.browser.BrowserParams.a
        public BrowserParams.a b(String str) {
            this.a = str;
            return this;
        }

        @Override // com.spotify.mobile.android.service.media.browser.BrowserParams.a
        public BrowserParams build() {
            String str = this.b == null ? " parentId" : "";
            if (this.f == null) {
                str = je.x0(str, " root");
            }
            if (this.g == null) {
                str = je.x0(str, " online");
            }
            if (this.h == null) {
                str = je.x0(str, " loggedIn");
            }
            if (this.i == null) {
                str = je.x0(str, " browseableEntitiesEnabled");
            }
            if (this.j == null) {
                str = je.x0(str, " recent");
            }
            if (this.k == null) {
                str = je.x0(str, " transportType");
            }
            if (this.l == null) {
                str = je.x0(str, " protocol");
            }
            if (str.isEmpty()) {
                return new l(this.a, this.b, this.c, this.d, this.e, this.f.booleanValue(), this.g.booleanValue(), this.h.booleanValue(), this.i.booleanValue(), this.j.booleanValue(), this.k, this.l, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.mobile.android.service.media.browser.BrowserParams.a
        public BrowserParams.a c(String str) {
            this.d = str;
            return this;
        }

        @Override // com.spotify.mobile.android.service.media.browser.BrowserParams.a
        public BrowserParams.a d(String str) {
            this.e = str;
            return this;
        }

        @Override // com.spotify.mobile.android.service.media.browser.BrowserParams.a
        public BrowserParams.a e(boolean z) {
            this.h = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.mobile.android.service.media.browser.BrowserParams.a
        public BrowserParams.a f(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.mobile.android.service.media.browser.BrowserParams.a
        public BrowserParams.a g(String str) {
            this.c = str;
            return this;
        }

        @Override // com.spotify.mobile.android.service.media.browser.BrowserParams.a
        public BrowserParams.a h(boolean z) {
            this.g = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.mobile.android.service.media.browser.BrowserParams.a
        public BrowserParams.a i(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null parentId");
        }

        @Override // com.spotify.mobile.android.service.media.browser.BrowserParams.a
        public BrowserParams.a j(boolean z) {
            this.j = Boolean.valueOf(z);
            return this;
        }

        public BrowserParams.a k(BrowserParams.Protocol protocol) {
            if (protocol != null) {
                this.l = protocol;
                return this;
            }
            throw new NullPointerException("Null protocol");
        }

        public BrowserParams.a l(BrowserParams.TransportType transportType) {
            if (transportType != null) {
                this.k = transportType;
                return this;
            }
            throw new NullPointerException("Null transportType");
        }

        b(BrowserParams browserParams, a aVar) {
            this.a = browserParams.j();
            this.b = browserParams.h();
            this.c = browserParams.g();
            this.d = browserParams.e();
            this.e = browserParams.f();
            this.f = Boolean.valueOf(browserParams.p());
            this.g = Boolean.valueOf(browserParams.n());
            this.h = Boolean.valueOf(browserParams.m());
            this.i = Boolean.valueOf(browserParams.l());
            this.j = Boolean.valueOf(browserParams.o());
            this.k = browserParams.k();
            this.l = browserParams.i();
        }
    }

    l(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, BrowserParams.TransportType transportType, BrowserParams.Protocol protocol, a aVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = z5;
        this.k = transportType;
        this.l = protocol;
    }

    @Override // com.spotify.mobile.android.service.media.browser.BrowserParams
    public String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BrowserParams)) {
            return false;
        }
        BrowserParams browserParams = (BrowserParams) obj;
        String str4 = this.a;
        if (str4 != null ? str4.equals(browserParams.j()) : browserParams.j() == null) {
            if (this.b.equals(browserParams.h()) && ((str = this.c) != null ? str.equals(browserParams.g()) : browserParams.g() == null) && ((str2 = this.d) != null ? str2.equals(browserParams.e()) : browserParams.e() == null) && ((str3 = this.e) != null ? str3.equals(browserParams.f()) : browserParams.f() == null) && this.f == browserParams.p() && this.g == browserParams.n() && this.h == browserParams.m() && this.i == browserParams.l() && this.j == browserParams.o() && this.k.equals(browserParams.k()) && this.l.equals(browserParams.i())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.spotify.mobile.android.service.media.browser.BrowserParams
    public String f() {
        return this.e;
    }

    @Override // com.spotify.mobile.android.service.media.browser.BrowserParams
    public String g() {
        return this.c;
    }

    @Override // com.spotify.mobile.android.service.media.browser.BrowserParams
    public String h() {
        return this.b;
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str2 = this.c;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.d;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.e;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        int i3 = 1231;
        int i4 = (((((((((hashCode3 ^ i2) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ (this.g ? 1231 : 1237)) * 1000003) ^ (this.h ? 1231 : 1237)) * 1000003) ^ (this.i ? 1231 : 1237)) * 1000003;
        if (!this.j) {
            i3 = 1237;
        }
        return ((((i4 ^ i3) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode();
    }

    @Override // com.spotify.mobile.android.service.media.browser.BrowserParams
    public BrowserParams.Protocol i() {
        return this.l;
    }

    @Override // com.spotify.mobile.android.service.media.browser.BrowserParams
    public String j() {
        return this.a;
    }

    @Override // com.spotify.mobile.android.service.media.browser.BrowserParams
    public BrowserParams.TransportType k() {
        return this.k;
    }

    @Override // com.spotify.mobile.android.service.media.browser.BrowserParams
    public boolean l() {
        return this.i;
    }

    @Override // com.spotify.mobile.android.service.media.browser.BrowserParams
    public boolean m() {
        return this.h;
    }

    @Override // com.spotify.mobile.android.service.media.browser.BrowserParams
    public boolean n() {
        return this.g;
    }

    @Override // com.spotify.mobile.android.service.media.browser.BrowserParams
    public boolean o() {
        return this.j;
    }

    @Override // com.spotify.mobile.android.service.media.browser.BrowserParams
    public boolean p() {
        return this.f;
    }

    @Override // com.spotify.mobile.android.service.media.browser.BrowserParams
    public BrowserParams.a r() {
        return new b(this, null);
    }

    public String toString() {
        StringBuilder V0 = je.V0("BrowserParams{rootListType=");
        V0.append(this.a);
        V0.append(", parentId=");
        V0.append(this.b);
        V0.append(", packageName=");
        V0.append(this.c);
        V0.append(", clientId=");
        V0.append(this.d);
        V0.append(", locale=");
        V0.append(this.e);
        V0.append(", root=");
        V0.append(this.f);
        V0.append(", online=");
        V0.append(this.g);
        V0.append(", loggedIn=");
        V0.append(this.h);
        V0.append(", browseableEntitiesEnabled=");
        V0.append(this.i);
        V0.append(", recent=");
        V0.append(this.j);
        V0.append(", transportType=");
        V0.append(this.k);
        V0.append(", protocol=");
        V0.append(this.l);
        V0.append("}");
        return V0.toString();
    }
}

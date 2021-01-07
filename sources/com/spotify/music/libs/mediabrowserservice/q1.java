package com.spotify.music.libs.mediabrowserservice;

import com.spotify.music.libs.mediabrowserservice.RootHintsParams;

/* access modifiers changed from: package-private */
public final class q1 extends RootHintsParams {
    private final String a;
    private final String b;
    private final String c;
    private final boolean d;
    private final boolean e;
    private final RootHintsParams.Mode f;

    /* access modifiers changed from: package-private */
    public static final class b implements RootHintsParams.a {
        private String a;
        private String b;
        private String c;
        private Boolean d;
        private Boolean e;
        private RootHintsParams.Mode f;

        b() {
        }

        @Override // com.spotify.music.libs.mediabrowserservice.RootHintsParams.a
        public RootHintsParams.a a(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.libs.mediabrowserservice.RootHintsParams.a
        public RootHintsParams.a b(String str) {
            this.a = str;
            return this;
        }

        @Override // com.spotify.music.libs.mediabrowserservice.RootHintsParams.a
        public RootHintsParams build() {
            String str = this.d == null ? " browseableEntitiesEnabled" : "";
            if (this.e == null) {
                str = je.x0(str, " recent");
            }
            if (this.f == null) {
                str = je.x0(str, " mode");
            }
            if (str.isEmpty()) {
                return new q1(this.a, this.b, this.c, this.d.booleanValue(), this.e.booleanValue(), this.f, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.music.libs.mediabrowserservice.RootHintsParams.a
        public RootHintsParams.a c(String str) {
            this.b = str;
            return this;
        }

        public RootHintsParams.a d(RootHintsParams.Mode mode) {
            this.f = mode;
            return this;
        }

        public RootHintsParams.a e(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        public RootHintsParams.a f(String str) {
            this.c = str;
            return this;
        }

        b(RootHintsParams rootHintsParams, a aVar) {
            this.a = rootHintsParams.e();
            this.b = rootHintsParams.c();
            this.c = rootHintsParams.f();
            this.d = Boolean.valueOf(rootHintsParams.g());
            this.e = Boolean.valueOf(rootHintsParams.h());
            this.f = rootHintsParams.d();
        }
    }

    q1(String str, String str2, String str3, boolean z, boolean z2, RootHintsParams.Mode mode, a aVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = mode;
    }

    @Override // com.spotify.music.libs.mediabrowserservice.RootHintsParams
    public String c() {
        return this.b;
    }

    @Override // com.spotify.music.libs.mediabrowserservice.RootHintsParams
    public RootHintsParams.Mode d() {
        return this.f;
    }

    @Override // com.spotify.music.libs.mediabrowserservice.RootHintsParams
    public String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RootHintsParams)) {
            return false;
        }
        RootHintsParams rootHintsParams = (RootHintsParams) obj;
        String str = this.a;
        if (str != null ? str.equals(rootHintsParams.e()) : rootHintsParams.e() == null) {
            String str2 = this.b;
            if (str2 != null ? str2.equals(rootHintsParams.c()) : rootHintsParams.c() == null) {
                String str3 = this.c;
                if (str3 != null ? str3.equals(rootHintsParams.f()) : rootHintsParams.f() == null) {
                    if (this.d == rootHintsParams.g() && this.e == rootHintsParams.h() && this.f.equals(rootHintsParams.d())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.spotify.music.libs.mediabrowserservice.RootHintsParams
    public String f() {
        return this.c;
    }

    @Override // com.spotify.music.libs.mediabrowserservice.RootHintsParams
    public boolean g() {
        return this.d;
    }

    @Override // com.spotify.music.libs.mediabrowserservice.RootHintsParams
    public boolean h() {
        return this.e;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        int i2 = 1231;
        int i3 = (((hashCode2 ^ i) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003;
        if (!this.e) {
            i2 = 1237;
        }
        return ((i3 ^ i2) * 1000003) ^ this.f.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("RootHintsParams{rootListType=");
        V0.append(this.a);
        V0.append(", clientId=");
        V0.append(this.b);
        V0.append(", version=");
        V0.append(this.c);
        V0.append(", browseableEntitiesEnabled=");
        V0.append(this.d);
        V0.append(", recent=");
        V0.append(this.e);
        V0.append(", mode=");
        V0.append(this.f);
        V0.append("}");
        return V0.toString();
    }
}

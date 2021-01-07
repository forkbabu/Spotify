package com.spotify.share.sharedata;

import com.spotify.share.sharedata.v;

/* access modifiers changed from: package-private */
public abstract class f extends v {
    private final String a;
    private final String b;
    private final String c;
    private final String f;
    private final String n;

    /* access modifiers changed from: package-private */
    public static class a implements v.a {
        private String a;
        private String b;
        private String c;
        private String d;
        private String e;

        a() {
        }

        @Override // com.spotify.share.sharedata.v.a
        public v.a a(String str) {
            this.d = str;
            return this;
        }

        @Override // com.spotify.share.sharedata.v.a
        public v.a b(String str) {
            this.c = str;
            return this;
        }

        @Override // com.spotify.share.sharedata.v.a
        public v build() {
            return new m(this.a, this.b, this.c, this.d, this.e);
        }

        @Override // com.spotify.share.sharedata.v.a
        public v.a c(String str) {
            this.b = str;
            return this;
        }

        @Override // com.spotify.share.sharedata.v.a
        public v.a d(String str) {
            this.e = str;
            return this;
        }

        @Override // com.spotify.share.sharedata.v.a
        public v.a e(String str) {
            this.a = str;
            return this;
        }
    }

    f(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.f = str4;
        this.n = str5;
    }

    @Override // com.spotify.share.sharedata.v
    public String b() {
        return this.a;
    }

    @Override // com.spotify.share.sharedata.v
    public String c() {
        return this.n;
    }

    @Override // com.spotify.share.sharedata.v
    public String e() {
        return this.c;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        String str = this.a;
        if (str != null ? str.equals(vVar.b()) : vVar.b() == null) {
            String str2 = this.b;
            if (str2 != null ? str2.equals(vVar.f()) : vVar.f() == null) {
                String str3 = this.c;
                if (str3 != null ? str3.equals(vVar.e()) : vVar.e() == null) {
                    String str4 = this.f;
                    if (str4 != null ? str4.equals(vVar.g()) : vVar.g() == null) {
                        String str5 = this.n;
                        if (str5 == null) {
                            if (vVar.c() == null) {
                                return true;
                            }
                        } else if (str5.equals(vVar.c())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.spotify.share.sharedata.v
    public String f() {
        return this.b;
    }

    @Override // com.spotify.share.sharedata.v
    public String g() {
        return this.f;
    }

    @Override // java.lang.Object
    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f;
        int hashCode4 = (hashCode3 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.n;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 ^ i;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("UtmParams{utmCampaign=");
        V0.append(this.a);
        V0.append(", utmSource=");
        V0.append(this.b);
        V0.append(", utmMedium=");
        V0.append(this.c);
        V0.append(", utmTerm=");
        V0.append(this.f);
        V0.append(", utmContent=");
        return je.I0(V0, this.n, "}");
    }
}

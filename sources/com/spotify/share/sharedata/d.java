package com.spotify.share.sharedata;

import com.spotify.share.sharedata.r;
import java.util.Map;

/* access modifiers changed from: package-private */
public abstract class d extends r {
    private final String a;
    private final String b;
    private final String c;
    private final Map<String, String> f;
    private final v n;

    /* access modifiers changed from: package-private */
    public static class a implements r.a {
        private String a;
        private String b;
        private String c;
        private Map<String, String> d;
        private v e;

        a() {
        }

        @Override // com.spotify.share.sharedata.r.a
        public r.a a(Map<String, String> map) {
            this.d = map;
            return this;
        }

        @Override // com.spotify.share.sharedata.r.a
        public r.a b(v vVar) {
            this.e = vVar;
            return this;
        }

        @Override // com.spotify.share.sharedata.r.a
        public r build() {
            String str = this.a == null ? " entityUri" : "";
            if (str.isEmpty()) {
                return new k(this.a, this.b, this.c, this.d, this.e);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.share.sharedata.r.a
        public r.a c(String str) {
            this.b = str;
            return this;
        }

        @Override // com.spotify.share.sharedata.r.a
        public r.a d(String str) {
            this.c = str;
            return this;
        }

        public r.a e(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null entityUri");
        }
    }

    d(String str, String str2, String str3, Map<String, String> map, v vVar) {
        if (str != null) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.f = map;
            this.n = vVar;
            return;
        }
        throw new NullPointerException("Null entityUri");
    }

    @Override // com.spotify.share.sharedata.r, com.spotify.share.sharedata.t
    public String a() {
        return this.b;
    }

    @Override // com.spotify.share.sharedata.r, com.spotify.share.sharedata.t
    public v c() {
        return this.n;
    }

    @Override // com.spotify.share.sharedata.r, com.spotify.share.sharedata.t
    public String e() {
        return this.c;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        String str;
        String str2;
        Map<String, String> map;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.a.equals(rVar.g()) && ((str = this.b) != null ? str.equals(rVar.a()) : rVar.a() == null) && ((str2 = this.c) != null ? str2.equals(rVar.e()) : rVar.e() == null) && ((map = this.f) != null ? map.equals(rVar.f()) : rVar.f() == null)) {
            v vVar = this.n;
            if (vVar == null) {
                if (rVar.c() == null) {
                    return true;
                }
            } else if (vVar.equals(rVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.spotify.share.sharedata.r, com.spotify.share.sharedata.t
    public Map<String, String> f() {
        return this.f;
    }

    @Override // com.spotify.share.sharedata.r, com.spotify.share.sharedata.t
    public String g() {
        return this.a;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        Map<String, String> map = this.f;
        int hashCode4 = (hashCode3 ^ (map == null ? 0 : map.hashCode())) * 1000003;
        v vVar = this.n;
        if (vVar != null) {
            i = vVar.hashCode();
        }
        return hashCode4 ^ i;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("LinkShareData{entityUri=");
        V0.append(this.a);
        V0.append(", contextUri=");
        V0.append(this.b);
        V0.append(", logContext=");
        V0.append(this.c);
        V0.append(", queryParameters=");
        V0.append(this.f);
        V0.append(", utmParameters=");
        V0.append(this.n);
        V0.append("}");
        return V0.toString();
    }
}

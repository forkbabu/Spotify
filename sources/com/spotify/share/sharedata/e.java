package com.spotify.share.sharedata;

import com.spotify.share.sharedata.s;
import java.util.Map;

/* access modifiers changed from: package-private */
public abstract class e extends s {
    private final String a;
    private final String b;
    private final String c;
    private final String f;
    private final v n;
    private final Map<String, String> o;

    /* access modifiers changed from: package-private */
    public static class b implements s.a {
        private String a;
        private String b;
        private String c;
        private String d;
        private v e;
        private Map<String, String> f;

        b() {
        }

        @Override // com.spotify.share.sharedata.s.a
        public s.a a(Map<String, String> map) {
            this.f = map;
            return this;
        }

        @Override // com.spotify.share.sharedata.s.a
        public s.a b(v vVar) {
            this.e = vVar;
            return this;
        }

        @Override // com.spotify.share.sharedata.s.a
        public s build() {
            String str = this.a == null ? " entityUri" : "";
            if (str.isEmpty()) {
                return new l(this.a, this.b, this.c, this.d, this.e, this.f);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public s.a c(String str) {
            this.b = str;
            return this;
        }

        public s.a d(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null entityUri");
        }

        public s.a e(String str) {
            this.d = str;
            return this;
        }

        public s.a f(String str) {
            this.c = str;
            return this;
        }

        b(s sVar, a aVar) {
            this.a = sVar.g();
            this.b = sVar.a();
            this.c = sVar.k();
            this.d = sVar.e();
            this.e = sVar.c();
            this.f = sVar.f();
        }
    }

    e(String str, String str2, String str3, String str4, v vVar, Map<String, String> map) {
        if (str != null) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.f = str4;
            this.n = vVar;
            this.o = map;
            return;
        }
        throw new NullPointerException("Null entityUri");
    }

    @Override // com.spotify.share.sharedata.s, com.spotify.share.sharedata.t
    public String a() {
        return this.b;
    }

    @Override // com.spotify.share.sharedata.s, com.spotify.share.sharedata.t
    public v c() {
        return this.n;
    }

    @Override // com.spotify.share.sharedata.s, com.spotify.share.sharedata.t
    public String e() {
        return this.f;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        v vVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.a.equals(sVar.g()) && ((str = this.b) != null ? str.equals(sVar.a()) : sVar.a() == null) && ((str2 = this.c) != null ? str2.equals(sVar.k()) : sVar.k() == null) && ((str3 = this.f) != null ? str3.equals(sVar.e()) : sVar.e() == null) && ((vVar = this.n) != null ? vVar.equals(sVar.c()) : sVar.c() == null)) {
            Map<String, String> map = this.o;
            if (map == null) {
                if (sVar.f() == null) {
                    return true;
                }
            } else if (map.equals(sVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.spotify.share.sharedata.s, com.spotify.share.sharedata.t
    public Map<String, String> f() {
        return this.o;
    }

    @Override // com.spotify.share.sharedata.s, com.spotify.share.sharedata.t
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
        String str3 = this.f;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        v vVar = this.n;
        int hashCode5 = (hashCode4 ^ (vVar == null ? 0 : vVar.hashCode())) * 1000003;
        Map<String, String> map = this.o;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode5 ^ i;
    }

    @Override // com.spotify.share.sharedata.s
    public String k() {
        return this.c;
    }

    @Override // com.spotify.share.sharedata.s
    public s.a l() {
        return new b(this, null);
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("MessageShareData{entityUri=");
        V0.append(this.a);
        V0.append(", contextUri=");
        V0.append(this.b);
        V0.append(", text=");
        V0.append(this.c);
        V0.append(", logContext=");
        V0.append(this.f);
        V0.append(", utmParameters=");
        V0.append(this.n);
        V0.append(", queryParameters=");
        return je.M0(V0, this.o, "}");
    }
}

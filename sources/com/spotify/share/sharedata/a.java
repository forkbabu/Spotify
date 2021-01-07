package com.spotify.share.sharedata;

import com.spotify.share.sharedata.o;
import java.util.Map;

/* access modifiers changed from: package-private */
public abstract class a extends o {
    private final String a;
    private final String b;
    private final String c;
    private final l8e f;
    private final k8e n;
    private final v o;
    private final Map<String, String> p;

    /* access modifiers changed from: package-private */
    public static class b implements o.a {
        private String a;
        private String b;
        private String c;
        private l8e d;
        private k8e e;
        private v f;
        private Map<String, String> g;

        b() {
        }

        public o.a a(k8e k8e) {
            this.e = k8e;
            return this;
        }

        @Override // com.spotify.share.sharedata.o.a
        public o.a b(v vVar) {
            this.f = vVar;
            return this;
        }

        @Override // com.spotify.share.sharedata.o.a
        public o build() {
            String str = this.a == null ? " entityUri" : "";
            if (this.d == null) {
                str = je.x0(str, " stickerMedia");
            }
            if (this.e == null) {
                str = je.x0(str, " backgroundMedia");
            }
            if (str.isEmpty()) {
                return new h(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public o.a c(String str) {
            this.b = str;
            return this;
        }

        public o.a d(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null entityUri");
        }

        public o.a e(String str) {
            this.c = str;
            return this;
        }

        public o.a f(Map<String, String> map) {
            this.g = map;
            return this;
        }

        public o.a g(l8e l8e) {
            this.d = l8e;
            return this;
        }

        b(o oVar, C0387a aVar) {
            this.a = oVar.g();
            this.b = oVar.a();
            this.c = oVar.e();
            this.d = oVar.b();
            this.e = oVar.h();
            this.f = oVar.c();
            this.g = oVar.f();
        }
    }

    a(String str, String str2, String str3, l8e l8e, k8e k8e, v vVar, Map<String, String> map) {
        if (str != null) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            if (l8e != null) {
                this.f = l8e;
                if (k8e != null) {
                    this.n = k8e;
                    this.o = vVar;
                    this.p = map;
                    return;
                }
                throw new NullPointerException("Null backgroundMedia");
            }
            throw new NullPointerException("Null stickerMedia");
        }
        throw new NullPointerException("Null entityUri");
    }

    @Override // com.spotify.share.sharedata.o, com.spotify.share.sharedata.t
    public String a() {
        return this.b;
    }

    @Override // com.spotify.share.sharedata.o, com.spotify.share.sharedata.u
    public l8e b() {
        return this.f;
    }

    @Override // com.spotify.share.sharedata.o, com.spotify.share.sharedata.t
    public v c() {
        return this.o;
    }

    @Override // com.spotify.share.sharedata.o, com.spotify.share.sharedata.t
    public String e() {
        return this.c;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        String str;
        String str2;
        v vVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.a.equals(oVar.g()) && ((str = this.b) != null ? str.equals(oVar.a()) : oVar.a() == null) && ((str2 = this.c) != null ? str2.equals(oVar.e()) : oVar.e() == null) && this.f.equals(oVar.b()) && this.n.equals(oVar.h()) && ((vVar = this.o) != null ? vVar.equals(oVar.c()) : oVar.c() == null)) {
            Map<String, String> map = this.p;
            if (map == null) {
                if (oVar.f() == null) {
                    return true;
                }
            } else if (map.equals(oVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.spotify.share.sharedata.o, com.spotify.share.sharedata.t
    public Map<String, String> f() {
        return this.p;
    }

    @Override // com.spotify.share.sharedata.o, com.spotify.share.sharedata.t
    public String g() {
        return this.a;
    }

    @Override // com.spotify.share.sharedata.o
    public k8e h() {
        return this.n;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        int hashCode3 = (((((hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003;
        v vVar = this.o;
        int hashCode4 = (hashCode3 ^ (vVar == null ? 0 : vVar.hashCode())) * 1000003;
        Map<String, String> map = this.p;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode4 ^ i;
    }

    @Override // com.spotify.share.sharedata.o
    public o.a k() {
        return new b(this, null);
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("GradientStoryShareData{entityUri=");
        V0.append(this.a);
        V0.append(", contextUri=");
        V0.append(this.b);
        V0.append(", logContext=");
        V0.append(this.c);
        V0.append(", stickerMedia=");
        V0.append(this.f);
        V0.append(", backgroundMedia=");
        V0.append(this.n);
        V0.append(", utmParameters=");
        V0.append(this.o);
        V0.append(", queryParameters=");
        return je.M0(V0, this.p, "}");
    }
}

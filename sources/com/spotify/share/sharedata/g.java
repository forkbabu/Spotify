package com.spotify.share.sharedata;

import com.spotify.share.sharedata.w;
import java.util.Map;

/* access modifiers changed from: package-private */
public abstract class g extends w {
    private final String a;
    private final String b;
    private final String c;
    private final l8e f;
    private final n8e n;
    private final v o;
    private final Map<String, String> p;

    /* access modifiers changed from: package-private */
    public static class b implements w.a {
        private String a;
        private String b;
        private String c;
        private l8e d;
        private n8e e;
        private v f;
        private Map<String, String> g;

        b() {
        }

        public w.a a(n8e n8e) {
            this.e = n8e;
            return this;
        }

        @Override // com.spotify.share.sharedata.w.a
        public w.a b(v vVar) {
            this.f = vVar;
            return this;
        }

        @Override // com.spotify.share.sharedata.w.a
        public w build() {
            String str = this.a == null ? " entityUri" : "";
            if (this.e == null) {
                str = je.x0(str, " backgroundMedia");
            }
            if (str.isEmpty()) {
                return new n(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public w.a c(String str) {
            this.b = str;
            return this;
        }

        public w.a d(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null entityUri");
        }

        public w.a e(String str) {
            this.c = str;
            return this;
        }

        public w.a f(Map<String, String> map) {
            this.g = map;
            return this;
        }

        public w.a g(l8e l8e) {
            this.d = l8e;
            return this;
        }

        b(w wVar, a aVar) {
            this.a = wVar.g();
            this.b = wVar.a();
            this.c = wVar.e();
            this.d = wVar.b();
            this.e = wVar.h();
            this.f = wVar.c();
            this.g = wVar.f();
        }
    }

    g(String str, String str2, String str3, l8e l8e, n8e n8e, v vVar, Map<String, String> map) {
        if (str != null) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.f = l8e;
            if (n8e != null) {
                this.n = n8e;
                this.o = vVar;
                this.p = map;
                return;
            }
            throw new NullPointerException("Null backgroundMedia");
        }
        throw new NullPointerException("Null entityUri");
    }

    @Override // com.spotify.share.sharedata.w, com.spotify.share.sharedata.t
    public String a() {
        return this.b;
    }

    @Override // com.spotify.share.sharedata.w, com.spotify.share.sharedata.u
    public l8e b() {
        return this.f;
    }

    @Override // com.spotify.share.sharedata.w, com.spotify.share.sharedata.t
    public v c() {
        return this.o;
    }

    @Override // com.spotify.share.sharedata.w, com.spotify.share.sharedata.t
    public String e() {
        return this.c;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        String str;
        String str2;
        l8e l8e;
        v vVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (this.a.equals(wVar.g()) && ((str = this.b) != null ? str.equals(wVar.a()) : wVar.a() == null) && ((str2 = this.c) != null ? str2.equals(wVar.e()) : wVar.e() == null) && ((l8e = this.f) != null ? l8e.equals(wVar.b()) : wVar.b() == null) && this.n.equals(wVar.h()) && ((vVar = this.o) != null ? vVar.equals(wVar.c()) : wVar.c() == null)) {
            Map<String, String> map = this.p;
            if (map == null) {
                if (wVar.f() == null) {
                    return true;
                }
            } else if (map.equals(wVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.spotify.share.sharedata.w, com.spotify.share.sharedata.t
    public Map<String, String> f() {
        return this.p;
    }

    @Override // com.spotify.share.sharedata.w, com.spotify.share.sharedata.t
    public String g() {
        return this.a;
    }

    @Override // com.spotify.share.sharedata.w
    public n8e h() {
        return this.n;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        l8e l8e = this.f;
        int hashCode4 = (((hashCode3 ^ (l8e == null ? 0 : l8e.hashCode())) * 1000003) ^ this.n.hashCode()) * 1000003;
        v vVar = this.o;
        int hashCode5 = (hashCode4 ^ (vVar == null ? 0 : vVar.hashCode())) * 1000003;
        Map<String, String> map = this.p;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode5 ^ i;
    }

    @Override // com.spotify.share.sharedata.w
    public w.a k() {
        return new b(this, null);
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("VideoStoryShareData{entityUri=");
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

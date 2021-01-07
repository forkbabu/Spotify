package com.spotify.share.sharedata;

import android.graphics.Bitmap;
import com.spotify.share.sharedata.p;
import java.util.Map;

/* access modifiers changed from: package-private */
public abstract class b extends p {
    private final String a;
    private final String b;
    private final String c;
    private final Bitmap f;
    private final String n;
    private final v o;
    private final Map<String, String> p;

    /* access modifiers changed from: package-private */
    public static class a implements p.a {
        private String a;
        private String b;
        private String c;
        private Bitmap d;
        private String e;
        private v f;
        private Map<String, String> g;

        a() {
        }

        @Override // com.spotify.share.sharedata.p.a
        public p.a a(Map<String, String> map) {
            this.g = map;
            return this;
        }

        public p.a b(Bitmap bitmap) {
            if (bitmap != null) {
                this.d = bitmap;
                return this;
            }
            throw new NullPointerException("Null bitmap");
        }

        @Override // com.spotify.share.sharedata.p.a
        public p build() {
            String str = this.a == null ? " entityUri" : "";
            if (this.d == null) {
                str = je.x0(str, " bitmap");
            }
            if (str.isEmpty()) {
                return new i(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public p.a c(String str) {
            this.b = str;
            return this;
        }

        public p.a d(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null entityUri");
        }

        public p.a e(String str) {
            this.c = str;
            return this;
        }

        public p.a f(v vVar) {
            this.f = vVar;
            return this;
        }

        @Override // com.spotify.share.sharedata.p.a
        public p.a setText(String str) {
            this.e = str;
            return this;
        }
    }

    b(String str, String str2, String str3, Bitmap bitmap, String str4, v vVar, Map<String, String> map) {
        if (str != null) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            if (bitmap != null) {
                this.f = bitmap;
                this.n = str4;
                this.o = vVar;
                this.p = map;
                return;
            }
            throw new NullPointerException("Null bitmap");
        }
        throw new NullPointerException("Null entityUri");
    }

    @Override // com.spotify.share.sharedata.p, com.spotify.share.sharedata.t
    public String a() {
        return this.b;
    }

    @Override // com.spotify.share.sharedata.p, com.spotify.share.sharedata.t
    public v c() {
        return this.o;
    }

    @Override // com.spotify.share.sharedata.p, com.spotify.share.sharedata.t
    public String e() {
        return this.c;
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
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.a.equals(pVar.g()) && ((str = this.b) != null ? str.equals(pVar.a()) : pVar.a() == null) && ((str2 = this.c) != null ? str2.equals(pVar.e()) : pVar.e() == null) && this.f.equals(pVar.h()) && ((str3 = this.n) != null ? str3.equals(pVar.k()) : pVar.k() == null) && ((vVar = this.o) != null ? vVar.equals(pVar.c()) : pVar.c() == null)) {
            Map<String, String> map = this.p;
            if (map == null) {
                if (pVar.f() == null) {
                    return true;
                }
            } else if (map.equals(pVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.spotify.share.sharedata.p, com.spotify.share.sharedata.t
    public Map<String, String> f() {
        return this.p;
    }

    @Override // com.spotify.share.sharedata.p, com.spotify.share.sharedata.t
    public String g() {
        return this.a;
    }

    @Override // com.spotify.share.sharedata.p
    public Bitmap h() {
        return this.f;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        int hashCode3 = (((hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.f.hashCode()) * 1000003;
        String str3 = this.n;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        v vVar = this.o;
        int hashCode5 = (hashCode4 ^ (vVar == null ? 0 : vVar.hashCode())) * 1000003;
        Map<String, String> map = this.p;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode5 ^ i;
    }

    @Override // com.spotify.share.sharedata.p
    public String k() {
        return this.n;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("ImageShareData{entityUri=");
        V0.append(this.a);
        V0.append(", contextUri=");
        V0.append(this.b);
        V0.append(", logContext=");
        V0.append(this.c);
        V0.append(", bitmap=");
        V0.append(this.f);
        V0.append(", text=");
        V0.append(this.n);
        V0.append(", utmParameters=");
        V0.append(this.o);
        V0.append(", queryParameters=");
        return je.M0(V0, this.p, "}");
    }
}

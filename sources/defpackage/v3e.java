package defpackage;

import com.spotify.share.base.linkgeneration.proto.UtmParameters;
import defpackage.b4e;
import java.util.Map;

/* renamed from: v3e  reason: default package */
final class v3e extends b4e {
    private final String a;
    private final String b;
    private final UtmParameters c;
    private final Map<String, String> d;

    /* access modifiers changed from: package-private */
    /* renamed from: v3e$b */
    public static final class b implements b4e.a {
        private String a;
        private String b;
        private UtmParameters c;
        private Map<String, String> d;

        b() {
        }

        @Override // defpackage.b4e.a
        public b4e.a a(Map<String, String> map) {
            this.d = map;
            return this;
        }

        public b4e.a b(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null spotifyUri");
        }

        @Override // defpackage.b4e.a
        public b4e build() {
            String str = this.a == null ? " spotifyUri" : "";
            if (str.isEmpty()) {
                return new v3e(this.a, this.b, this.c, this.d, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.b4e.a
        public b4e.a c(String str) {
            this.b = str;
            return this;
        }

        @Override // defpackage.b4e.a
        public b4e.a d(UtmParameters utmParameters) {
            this.c = utmParameters;
            return this;
        }
    }

    v3e(String str, String str2, UtmParameters utmParameters, Map map, a aVar) {
        this.a = str;
        this.b = str2;
        this.c = utmParameters;
        this.d = map;
    }

    @Override // defpackage.b4e
    public String b() {
        return this.b;
    }

    @Override // defpackage.b4e
    public Map<String, String> c() {
        return this.d;
    }

    @Override // defpackage.b4e
    public String d() {
        return this.a;
    }

    @Override // defpackage.b4e
    public UtmParameters e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        String str;
        UtmParameters utmParameters;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b4e)) {
            return false;
        }
        b4e b4e = (b4e) obj;
        if (this.a.equals(b4e.d()) && ((str = this.b) != null ? str.equals(b4e.b()) : b4e.b() == null) && ((utmParameters = this.c) != null ? utmParameters.equals(b4e.e()) : b4e.e() == null)) {
            Map<String, String> map = this.d;
            if (map == null) {
                if (b4e.c() == null) {
                    return true;
                }
            } else if (map.equals(b4e.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        UtmParameters utmParameters = this.c;
        int hashCode3 = (hashCode2 ^ (utmParameters == null ? 0 : utmParameters.hashCode())) * 1000003;
        Map<String, String> map = this.d;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode3 ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ShareUrlRequest{spotifyUri=");
        V0.append(this.a);
        V0.append(", contextUri=");
        V0.append(this.b);
        V0.append(", utmParameters=");
        V0.append(this.c);
        V0.append(", queryParameters=");
        return je.M0(V0, this.d, "}");
    }
}

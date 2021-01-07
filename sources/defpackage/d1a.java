package defpackage;

import com.spotify.music.libs.assistedcuration.model.e;
import defpackage.z0a;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: d1a  reason: default package */
public final class d1a extends z0a.a {
    private final String a;
    private final String b;
    private final List<e> c;

    /* renamed from: d1a$b */
    static final class b implements z0a.a.AbstractC0704a {
        private String a;
        private String b;
        private List<e> c;

        b() {
        }

        public z0a.a a() {
            String str = this.a == null ? " uri" : "";
            if (this.b == null) {
                str = je.x0(str, " title");
            }
            if (this.c == null) {
                str = je.x0(str, " tracks");
            }
            if (str.isEmpty()) {
                return new d1a(this.a, this.b, this.c, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public z0a.a.AbstractC0704a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null title");
        }

        public z0a.a.AbstractC0704a c(List<e> list) {
            if (list != null) {
                this.c = list;
                return this;
            }
            throw new NullPointerException("Null tracks");
        }

        public z0a.a.AbstractC0704a d(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null uri");
        }
    }

    d1a(String str, String str2, List list, a aVar) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    @Override // defpackage.z0a.a
    public String a() {
        return this.b;
    }

    @Override // defpackage.z0a.a
    public List<e> b() {
        return this.c;
    }

    @Override // defpackage.z0a.a
    public String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z0a.a)) {
            return false;
        }
        z0a.a aVar = (z0a.a) obj;
        if (!this.a.equals(aVar.c()) || !this.b.equals(aVar.a()) || !this.c.equals(aVar.b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("Album{uri=");
        V0.append(this.a);
        V0.append(", title=");
        V0.append(this.b);
        V0.append(", tracks=");
        return je.L0(V0, this.c, "}");
    }
}

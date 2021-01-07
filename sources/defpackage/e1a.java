package defpackage;

import defpackage.z0a;
import java.util.List;

/* renamed from: e1a  reason: default package */
final class e1a extends z0a.b {
    private final String a;
    private final List<String> b;

    /* renamed from: e1a$b */
    static final class b implements z0a.b.a {
        private String a;
        private List<String> b;

        b() {
        }

        public z0a.b a() {
            String str = this.a == null ? " title" : "";
            if (this.b == null) {
                str = je.x0(str, " trackUris");
            }
            if (str.isEmpty()) {
                return new e1a(this.a, this.b, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public z0a.b.a b(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null title");
        }

        public z0a.b.a c(List<String> list) {
            this.b = list;
            return this;
        }
    }

    e1a(String str, List list, a aVar) {
        this.a = str;
        this.b = list;
    }

    @Override // defpackage.z0a.b
    public String a() {
        return this.a;
    }

    @Override // defpackage.z0a.b
    public List<String> b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z0a.b)) {
            return false;
        }
        z0a.b bVar = (z0a.b) obj;
        if (!this.a.equals(bVar.a()) || !this.b.equals(bVar.b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("Data{title=");
        V0.append(this.a);
        V0.append(", trackUris=");
        return je.L0(V0, this.b, "}");
    }
}

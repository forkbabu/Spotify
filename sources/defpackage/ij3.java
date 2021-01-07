package defpackage;

import com.spotify.playlist.endpoints.d;
import defpackage.gj3;
import java.util.List;

/* renamed from: ij3  reason: default package */
final class ij3 extends gj3.a {
    private final d.c a;
    private final List<String> b;

    /* renamed from: ij3$b */
    static final class b implements gj3.a.AbstractC0594a {
        private d.c a;
        private List<String> b;

        b() {
        }

        public gj3.a a() {
            String str = this.b == null ? " urisAdded" : "";
            if (str.isEmpty()) {
                return new ij3(this.a, this.b, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public gj3.a.AbstractC0594a b(d.c cVar) {
            this.a = cVar;
            return this;
        }

        public gj3.a.AbstractC0594a c(List<String> list) {
            if (list != null) {
                this.b = list;
                return this;
            }
            throw new NullPointerException("Null urisAdded");
        }
    }

    ij3(d.c cVar, List list, a aVar) {
        this.a = cVar;
        this.b = list;
    }

    @Override // defpackage.gj3.a
    public d.c a() {
        return this.a;
    }

    @Override // defpackage.gj3.a
    public List<String> b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gj3.a)) {
            return false;
        }
        gj3.a aVar = (gj3.a) obj;
        d.c cVar = this.a;
        if (cVar != null ? cVar.equals(aVar.a()) : aVar.a() == null) {
            if (this.b.equals(aVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        d.c cVar = this.a;
        return (((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("Data{duplicateResult=");
        V0.append(this.a);
        V0.append(", urisAdded=");
        return je.L0(V0, this.b, "}");
    }
}

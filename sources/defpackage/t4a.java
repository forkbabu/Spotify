package defpackage;

import defpackage.w4a;
import java.util.Set;

/* renamed from: t4a  reason: default package */
final class t4a extends w4a {
    private final Set<String> b;

    /* renamed from: t4a$b */
    static final class b extends w4a.a {
        private Set<String> a;

        b() {
        }

        @Override // defpackage.w4a.a
        public w4a a() {
            String str = this.a == null ? " sources" : "";
            if (str.isEmpty()) {
                return new t4a(this.a, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.w4a.a
        public w4a.a b(Set<String> set) {
            if (set != null) {
                this.a = set;
                return this;
            }
            throw new NullPointerException("Null sources");
        }

        b(w4a w4a, a aVar) {
            this.a = w4a.a();
        }
    }

    t4a(Set set, a aVar) {
        this.b = set;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.w4a
    public Set<String> a() {
        return this.b;
    }

    @Override // defpackage.w4a
    public w4a.a b() {
        return new b(this, null);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w4a) {
            return this.b.equals(((w4a) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.b.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder V0 = je.V0("CarDetectionModel{sources=");
        V0.append(this.b);
        V0.append("}");
        return V0.toString();
    }
}

package defpackage;

import defpackage.a48;

/* renamed from: v38  reason: default package */
final class v38 extends a48 {
    private final w38 a;

    /* renamed from: v38$b */
    static final class b implements a48.a {
        private w38 a;

        b() {
        }

        @Override // defpackage.a48.a
        public a48.a a(w38 w38) {
            this.a = w38;
            return this;
        }

        @Override // defpackage.a48.a
        public a48 build() {
            String str = this.a == null ? " loadedState" : "";
            if (str.isEmpty()) {
                return new v38(this.a, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        b(a48 a48, a aVar) {
            this.a = a48.b();
        }
    }

    v38(w38 w38, a aVar) {
        this.a = w38;
    }

    @Override // defpackage.a48
    public w38 b() {
        return this.a;
    }

    @Override // defpackage.a48
    public a48.a c() {
        return new b(this, null);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a48) {
            return this.a.equals(((a48) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder V0 = je.V0("RadioHubModel{loadedState=");
        V0.append(this.a);
        V0.append("}");
        return V0.toString();
    }
}

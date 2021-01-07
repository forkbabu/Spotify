package defpackage;

import com.spotify.mobius.g0;
import defpackage.ba2;

/* renamed from: y92  reason: default package */
final class y92<M, E, F, MI, EI, FI> extends ba2<M, E, F, MI, EI, FI> {
    private final g0<MI, EI, FI> a;
    private final ea2<M, MI> b;
    private final ea2<E, EI> c;
    private final ca2<M, MI, M> d;
    private final z92<M, F, FI> e;

    /* renamed from: y92$b */
    static final class b<M, E, F, MI, EI, FI> extends ba2.a<M, E, F, MI, EI, FI> {
        private g0<MI, EI, FI> a;
        private ea2<M, MI> b;
        private ea2<E, EI> c;
        private ca2<M, MI, M> d;
        private z92<M, F, FI> e;

        b() {
        }

        @Override // defpackage.ba2.a
        public ba2<M, E, F, MI, EI, FI> a() {
            String str = this.a == null ? " innerUpdate" : "";
            if (this.b == null) {
                str = je.x0(str, " modelExtractor");
            }
            if (this.c == null) {
                str = je.x0(str, " eventExtractor");
            }
            if (this.d == null) {
                str = je.x0(str, " modelUpdater");
            }
            if (this.e == null) {
                str = je.x0(str, " innerEffectHandler");
            }
            if (str.isEmpty()) {
                return new y92(this.a, this.b, this.c, this.d, this.e, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.ba2.a
        public ba2.a<M, E, F, MI, EI, FI> b(ea2<E, EI> ea2) {
            this.c = ea2;
            return this;
        }

        @Override // defpackage.ba2.a
        public ba2.a<M, E, F, MI, EI, FI> c(z92<M, F, FI> z92) {
            this.e = z92;
            return this;
        }

        @Override // defpackage.ba2.a
        public ba2.a<M, E, F, MI, EI, FI> d(g0<MI, EI, FI> g0Var) {
            this.a = g0Var;
            return this;
        }

        @Override // defpackage.ba2.a
        public ba2.a<M, E, F, MI, EI, FI> e(ea2<M, MI> ea2) {
            this.b = ea2;
            return this;
        }

        @Override // defpackage.ba2.a
        public ba2.a<M, E, F, MI, EI, FI> f(ca2<M, MI, M> ca2) {
            this.d = ca2;
            return this;
        }
    }

    y92(g0 g0Var, ea2 ea2, ea2 ea22, ca2 ca2, z92 z92, a aVar) {
        this.a = g0Var;
        this.b = ea2;
        this.c = ea22;
        this.d = ca2;
        this.e = z92;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ba2
    public ea2<E, EI> c() {
        return this.c;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ba2
    public z92<M, F, FI> d() {
        return this.e;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ba2
    public g0<MI, EI, FI> e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ba2)) {
            return false;
        }
        ba2 ba2 = (ba2) obj;
        if (!this.a.equals(ba2.e()) || !this.b.equals(ba2.f()) || !this.c.equals(ba2.c()) || !this.d.equals(ba2.g()) || !this.e.equals(ba2.d())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ba2
    public ea2<M, MI> f() {
        return this.b;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ba2
    public ca2<M, MI, M> g() {
        return this.d;
    }

    public int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("InnerUpdate{innerUpdate=");
        V0.append(this.a);
        V0.append(", modelExtractor=");
        V0.append(this.b);
        V0.append(", eventExtractor=");
        V0.append(this.c);
        V0.append(", modelUpdater=");
        V0.append(this.d);
        V0.append(", innerEffectHandler=");
        V0.append(this.e);
        V0.append("}");
        return V0.toString();
    }
}

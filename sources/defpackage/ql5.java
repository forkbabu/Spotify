package defpackage;

import defpackage.rl5;

/* renamed from: ql5  reason: default package */
final class ql5 extends rl5 {
    private final b91 a;
    private final boolean b;
    private final boolean c;

    /* access modifiers changed from: package-private */
    /* renamed from: ql5$b */
    public static final class b implements rl5.a {
        private b91 a;
        private Boolean b;
        private Boolean c;

        b() {
        }

        @Override // defpackage.rl5.a
        public rl5.a a(b91 b91) {
            if (b91 != null) {
                this.a = b91;
                return this;
            }
            throw new NullPointerException("Null hubsViewModel");
        }

        public rl5.a b(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.rl5.a
        public rl5 build() {
            String str = this.a == null ? " hubsViewModel" : "";
            if (this.b == null) {
                str = je.x0(str, " scrollToTop");
            }
            if (this.c == null) {
                str = je.x0(str, " showUpdateButton");
            }
            if (str.isEmpty()) {
                return new ql5(this.a, this.b.booleanValue(), this.c.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public rl5.a c(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        b(rl5 rl5, a aVar) {
            this.a = rl5.b();
            this.b = Boolean.valueOf(rl5.c());
            this.c = Boolean.valueOf(rl5.d());
        }
    }

    ql5(b91 b91, boolean z, boolean z2, a aVar) {
        this.a = b91;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.rl5
    public b91 b() {
        return this.a;
    }

    @Override // defpackage.rl5
    public boolean c() {
        return this.b;
    }

    @Override // defpackage.rl5
    public boolean d() {
        return this.c;
    }

    @Override // defpackage.rl5
    public rl5.a e() {
        return new b(this, null);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rl5)) {
            return false;
        }
        rl5 rl5 = (rl5) obj;
        if (this.a.equals(rl5.b()) && this.b == rl5.c() && this.c == rl5.d()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 1231;
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003;
        if (!this.c) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("HubsViewModelState{hubsViewModel=");
        V0.append(this.a);
        V0.append(", scrollToTop=");
        V0.append(this.b);
        V0.append(", showUpdateButton=");
        return je.P0(V0, this.c, "}");
    }
}

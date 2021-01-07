package defpackage;

import defpackage.qo6;

/* renamed from: ho6  reason: default package */
final class ho6 extends qo6.a {
    private final h76 a;
    private final g76 b;

    /* renamed from: ho6$b */
    static final class b implements qo6.a.AbstractC0672a {
        private h76 a;
        private g76 b;

        b() {
        }

        public qo6.a a() {
            String str = this.a == null ? " playlistMetadata" : "";
            if (this.b == null) {
                str = je.x0(str, " playlistItems");
            }
            if (str.isEmpty()) {
                return new ho6(this.a, this.b, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public qo6.a.AbstractC0672a b(g76 g76) {
            if (g76 != null) {
                this.b = g76;
                return this;
            }
            throw new NullPointerException("Null playlistItems");
        }

        public qo6.a.AbstractC0672a c(h76 h76) {
            if (h76 != null) {
                this.a = h76;
                return this;
            }
            throw new NullPointerException("Null playlistMetadata");
        }
    }

    ho6(h76 h76, g76 g76, a aVar) {
        this.a = h76;
        this.b = g76;
    }

    @Override // defpackage.qo6.a
    public g76 a() {
        return this.b;
    }

    @Override // defpackage.qo6.a
    public h76 b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qo6.a)) {
            return false;
        }
        qo6.a aVar = (qo6.a) obj;
        if (!this.a.equals(aVar.b()) || !this.b.equals(aVar.a())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("State{playlistMetadata=");
        V0.append(this.a);
        V0.append(", playlistItems=");
        V0.append(this.b);
        V0.append("}");
        return V0.toString();
    }
}

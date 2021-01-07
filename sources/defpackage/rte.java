package defpackage;

import defpackage.vte;

/* renamed from: rte  reason: default package */
final class rte extends vte {
    private final String a;
    private final int b;

    /* access modifiers changed from: package-private */
    /* renamed from: rte$b */
    public static final class b implements vte.a {
        private String a;
        private Integer b;

        b() {
        }

        @Override // defpackage.vte.a
        public vte.a a(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        @Override // defpackage.vte.a
        public vte.a b(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null utteranceId");
        }

        @Override // defpackage.vte.a
        public vte build() {
            String str = this.a == null ? " utteranceId" : "";
            if (this.b == null) {
                str = je.x0(str, " fulfillmentLatencyInMillis");
            }
            if (str.isEmpty()) {
                return new rte(this.a, this.b.intValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }
    }

    rte(String str, int i, a aVar) {
        this.a = str;
        this.b = i;
    }

    @Override // defpackage.vte
    public int b() {
        return this.b;
    }

    @Override // defpackage.vte
    public String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vte)) {
            return false;
        }
        vte vte = (vte) obj;
        if (!this.a.equals(vte.c()) || this.b != vte.b()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public String toString() {
        StringBuilder V0 = je.V0("FulfillmentLatencyLogEvent{utteranceId=");
        V0.append(this.a);
        V0.append(", fulfillmentLatencyInMillis=");
        return je.B0(V0, this.b, "}");
    }
}

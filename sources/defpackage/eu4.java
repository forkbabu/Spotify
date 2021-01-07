package defpackage;

import defpackage.gu4;

/* renamed from: eu4  reason: default package */
final class eu4 extends gu4.a {
    private final String a;
    private final String b;

    /* renamed from: eu4$b */
    static final class b implements gu4.a.AbstractC0595a {
        private String a;
        private String b;

        b() {
        }

        public gu4.a a() {
            String str = this.a == null ? " playlistUri" : "";
            if (this.b == null) {
                str = je.x0(str, " playlistName");
            }
            if (str.isEmpty()) {
                return new eu4(this.a, this.b, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public gu4.a.AbstractC0595a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null playlistName");
        }

        public gu4.a.AbstractC0595a c(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null playlistUri");
        }
    }

    eu4(String str, String str2, a aVar) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.gu4.a
    public String a() {
        return this.b;
    }

    @Override // defpackage.gu4.a
    public String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gu4.a)) {
            return false;
        }
        gu4.a aVar = (gu4.a) obj;
        if (!this.a.equals(aVar.b()) || !this.b.equals(aVar.a())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("Data{playlistUri=");
        V0.append(this.a);
        V0.append(", playlistName=");
        return je.I0(V0, this.b, "}");
    }
}

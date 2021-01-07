package defpackage;

import defpackage.rn8;

/* renamed from: an8  reason: default package */
final class an8 extends rn8 {
    private final int a;
    private final int b;

    /* renamed from: an8$b */
    static final class b extends rn8.a {
        private Integer a;
        private Integer b;

        b() {
        }

        @Override // defpackage.rn8.a
        public rn8 a() {
            String str = this.a == null ? " artistPosition" : "";
            if (this.b == null) {
                str = je.x0(str, " shelfPosition");
            }
            if (str.isEmpty()) {
                return new an8(this.a.intValue(), this.b.intValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.rn8.a
        public rn8.a b(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        public rn8.a c(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }
    }

    an8(int i, int i2, a aVar) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.rn8
    public int d() {
        return this.a;
    }

    @Override // defpackage.rn8
    public int e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rn8)) {
            return false;
        }
        rn8 rn8 = (rn8) obj;
        if (this.a == rn8.d() && this.b == rn8.e()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ShelfArtistPosition{artistPosition=");
        V0.append(this.a);
        V0.append(", shelfPosition=");
        return je.B0(V0, this.b, "}");
    }
}

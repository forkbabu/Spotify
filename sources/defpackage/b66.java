package defpackage;

/* renamed from: b66  reason: default package */
public final class b66 {
    public static final b66 e = new b66(false, false, false, false, 15);
    public static final b66 f = null;
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;

    /* renamed from: b66$a */
    public static final class a {
        private boolean a;
        private boolean b;
        private boolean c;
        private boolean d;

        public a() {
            this(false, false, false, false, 15);
        }

        public a(boolean z, boolean z2, boolean z3, boolean z4, int i) {
            z = (i & 1) != 0 ? false : z;
            z2 = (i & 2) != 0 ? false : z2;
            z3 = (i & 4) != 0 ? false : z3;
            z4 = (i & 8) != 0 ? false : z4;
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = z4;
        }

        public final b66 a() {
            return new b66(this.a, this.b, this.c, this.d);
        }

        public final a b(boolean z) {
            this.c = z;
            return this;
        }

        public final a c(boolean z) {
            this.d = z;
            return this;
        }

        public final a d(boolean z) {
            this.a = z;
            return this;
        }

        public final a e(boolean z) {
            this.b = z;
            return this;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d;
        }

        public int hashCode() {
            boolean z = this.a;
            int i = 1;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = i2 * 31;
            boolean z2 = this.b;
            if (z2) {
                z2 = true;
            }
            int i6 = z2 ? 1 : 0;
            int i7 = z2 ? 1 : 0;
            int i8 = z2 ? 1 : 0;
            int i9 = (i5 + i6) * 31;
            boolean z3 = this.c;
            if (z3) {
                z3 = true;
            }
            int i10 = z3 ? 1 : 0;
            int i11 = z3 ? 1 : 0;
            int i12 = z3 ? 1 : 0;
            int i13 = (i9 + i10) * 31;
            boolean z4 = this.d;
            if (!z4) {
                i = z4 ? 1 : 0;
            }
            return i13 + i;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Builder(roundPlayButton=");
            V0.append(this.a);
            V0.append(", singleStateButton=");
            V0.append(this.b);
            V0.append(", playButtonDoShufflePlay=");
            V0.append(this.c);
            V0.append(", playButtonSaysShufflePlay=");
            return je.P0(V0, this.d, ")");
        }
    }

    public b66() {
        this(false, false, false, false, 15);
    }

    public b66(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public static final a a() {
        return new a(false, false, false, false, 15);
    }

    public final boolean b() {
        return this.c;
    }

    public final boolean c() {
        return this.d;
    }

    public final boolean d() {
        return this.a;
    }

    public final boolean e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b66)) {
            return false;
        }
        b66 b66 = (b66) obj;
        return this.a == b66.a && this.b == b66.b && this.c == b66.c && this.d == b66.d;
    }

    public int hashCode() {
        boolean z = this.a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        boolean z2 = this.b;
        if (z2) {
            z2 = true;
        }
        int i6 = z2 ? 1 : 0;
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = (i5 + i6) * 31;
        boolean z3 = this.c;
        if (z3) {
            z3 = true;
        }
        int i10 = z3 ? 1 : 0;
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = (i9 + i10) * 31;
        boolean z4 = this.d;
        if (!z4) {
            i = z4 ? 1 : 0;
        }
        return i13 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("PlayButtonBehavior(roundPlayButton=");
        V0.append(this.a);
        V0.append(", singleStateButton=");
        V0.append(this.b);
        V0.append(", playButtonDoShufflePlay=");
        V0.append(this.c);
        V0.append(", playButtonSaysShufflePlay=");
        return je.P0(V0, this.d, ")");
    }

    public b66(boolean z, boolean z2, boolean z3, boolean z4, int i) {
        z = (i & 1) != 0 ? false : z;
        z2 = (i & 2) != 0 ? false : z2;
        z3 = (i & 4) != 0 ? false : z3;
        z4 = (i & 8) != 0 ? false : z4;
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }
}

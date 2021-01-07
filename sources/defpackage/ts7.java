package defpackage;

import defpackage.ct7;

/* renamed from: ts7  reason: default package */
abstract class ts7 extends ct7 {
    private final boolean b;
    private final boolean c;
    private final int f;
    private final int n;

    /* access modifiers changed from: package-private */
    /* renamed from: ts7$b */
    public static final class b extends ct7.a {
        private Boolean a;
        private Boolean b;
        private Integer c;
        private Integer d;

        b() {
        }

        @Override // defpackage.ct7.a
        public ct7 a() {
            String str = this.a == null ? " following" : "";
            if (this.b == null) {
                str = je.x0(str, " dismissed");
            }
            if (this.c == null) {
                str = je.x0(str, " followersCount");
            }
            if (this.d == null) {
                str = je.x0(str, " followingCount");
            }
            if (str.isEmpty()) {
                return new zs7(this.a.booleanValue(), this.b.booleanValue(), this.c.intValue(), this.d.intValue());
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.ct7.a
        public ct7.a b(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.ct7.a
        public ct7.a c(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        @Override // defpackage.ct7.a
        public ct7.a d(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.ct7.a
        public ct7.a e(int i) {
            this.d = Integer.valueOf(i);
            return this;
        }

        b(ct7 ct7, a aVar) {
            this.a = Boolean.valueOf(ct7.e());
            this.b = Boolean.valueOf(ct7.b());
            this.c = Integer.valueOf(ct7.c());
            this.d = Integer.valueOf(ct7.f());
        }
    }

    ts7(boolean z, boolean z2, int i, int i2) {
        this.b = z;
        this.c = z2;
        this.f = i;
        this.n = i2;
    }

    @Override // defpackage.ct7
    public boolean b() {
        return this.c;
    }

    @Override // defpackage.ct7
    public int c() {
        return this.f;
    }

    @Override // defpackage.ct7
    public boolean e() {
        return this.b;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ct7)) {
            return false;
        }
        ct7 ct7 = (ct7) obj;
        if (this.b == ct7.e() && this.c == ct7.b() && this.f == ct7.c() && this.n == ct7.f()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ct7
    public int f() {
        return this.n;
    }

    @Override // defpackage.ct7
    public ct7.a g() {
        return new b(this, null);
    }

    @Override // java.lang.Object
    public int hashCode() {
        int i = 1231;
        int i2 = ((this.b ? 1231 : 1237) ^ 1000003) * 1000003;
        if (!this.c) {
            i = 1237;
        }
        return ((((i2 ^ i) * 1000003) ^ this.f) * 1000003) ^ this.n;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("FollowState{following=");
        V0.append(this.b);
        V0.append(", dismissed=");
        V0.append(this.c);
        V0.append(", followersCount=");
        V0.append(this.f);
        V0.append(", followingCount=");
        return je.B0(V0, this.n, "}");
    }
}

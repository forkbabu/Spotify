package defpackage;

import defpackage.k3d;

/* access modifiers changed from: package-private */
/* renamed from: e3d  reason: default package */
public abstract class e3d extends k3d.b.AbstractC0631b {
    private final int b;
    private final int c;
    private final int f;
    private final int n;

    /* access modifiers changed from: package-private */
    /* renamed from: e3d$a */
    public static class a extends k3d.b.AbstractC0631b.a {
        private Integer a;
        private Integer b;
        private Integer c;
        private Integer d;

        a() {
        }

        @Override // defpackage.k3d.b.AbstractC0631b.a
        public k3d.b.AbstractC0631b.a a(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        @Override // defpackage.k3d.b.AbstractC0631b.a
        public k3d.b.AbstractC0631b b() {
            String str = this.a == null ? " title" : "";
            if (this.b == null) {
                str = je.x0(str, " subtitle");
            }
            if (this.c == null) {
                str = je.x0(str, " action");
            }
            if (this.d == null) {
                str = je.x0(str, " image");
            }
            if (str.isEmpty()) {
                return new h3d(this.a.intValue(), this.b.intValue(), this.c.intValue(), this.d.intValue());
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.k3d.b.AbstractC0631b.a
        public k3d.b.AbstractC0631b.a c(int i) {
            this.d = Integer.valueOf(i);
            return this;
        }

        @Override // defpackage.k3d.b.AbstractC0631b.a
        public k3d.b.AbstractC0631b.a d(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        @Override // defpackage.k3d.b.AbstractC0631b.a
        public k3d.b.AbstractC0631b.a e(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }
    }

    e3d(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.f = i3;
        this.n = i4;
    }

    @Override // defpackage.k3d.b.AbstractC0631b
    public int a() {
        return this.f;
    }

    @Override // defpackage.k3d.b.AbstractC0631b
    public int c() {
        return this.n;
    }

    @Override // defpackage.k3d.b.AbstractC0631b
    public int e() {
        return this.c;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k3d.b.AbstractC0631b)) {
            return false;
        }
        k3d.b.AbstractC0631b bVar = (k3d.b.AbstractC0631b) obj;
        if (this.b == bVar.f() && this.c == bVar.e() && this.f == bVar.a() && this.n == bVar.c()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.k3d.b.AbstractC0631b
    public int f() {
        return this.b;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((((((this.b ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.f) * 1000003) ^ this.n;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("Identifiers{title=");
        V0.append(this.b);
        V0.append(", subtitle=");
        V0.append(this.c);
        V0.append(", action=");
        V0.append(this.f);
        V0.append(", image=");
        return je.B0(V0, this.n, "}");
    }
}

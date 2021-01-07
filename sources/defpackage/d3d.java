package defpackage;

import defpackage.k3d;

/* access modifiers changed from: package-private */
/* renamed from: d3d  reason: default package */
public abstract class d3d extends k3d.b {
    private final int a;
    private final int b;
    private final k3d.b.AbstractC0631b c;

    /* access modifiers changed from: package-private */
    /* renamed from: d3d$a */
    public static class a extends k3d.b.a {
        private Integer a;
        private Integer b;
        private k3d.b.AbstractC0631b c;

        a() {
        }

        @Override // defpackage.k3d.b.a
        public k3d.b a() {
            String str = this.a == null ? " portrait" : "";
            if (this.b == null) {
                str = je.x0(str, " landscape");
            }
            if (this.c == null) {
                str = je.x0(str, " identifiers");
            }
            if (str.isEmpty()) {
                return new g3d(this.a.intValue(), this.b.intValue(), this.c);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.k3d.b.a
        public k3d.b.a b(k3d.b.AbstractC0631b bVar) {
            if (bVar != null) {
                this.c = bVar;
                return this;
            }
            throw new NullPointerException("Null identifiers");
        }

        @Override // defpackage.k3d.b.a
        public k3d.b.a c(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        @Override // defpackage.k3d.b.a
        public k3d.b.a d(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }
    }

    d3d(int i, int i2, k3d.b.AbstractC0631b bVar) {
        this.a = i;
        this.b = i2;
        if (bVar != null) {
            this.c = bVar;
            return;
        }
        throw new NullPointerException("Null identifiers");
    }

    @Override // defpackage.k3d.b
    public k3d.b.AbstractC0631b b() {
        return this.c;
    }

    @Override // defpackage.k3d.b
    public int c() {
        return this.b;
    }

    @Override // defpackage.k3d.b
    public int e() {
        return this.a;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k3d.b)) {
            return false;
        }
        k3d.b bVar = (k3d.b) obj;
        if (this.a == bVar.e() && this.b == bVar.c() && this.c.equals(bVar.b())) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("Layout{portrait=");
        V0.append(this.a);
        V0.append(", landscape=");
        V0.append(this.b);
        V0.append(", identifiers=");
        V0.append(this.c);
        V0.append("}");
        return V0.toString();
    }
}

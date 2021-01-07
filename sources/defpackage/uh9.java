package defpackage;

import defpackage.di9;

/* access modifiers changed from: package-private */
/* renamed from: uh9  reason: default package */
public abstract class uh9 extends di9.d {
    private final ane a;
    private final int b;
    private final boolean c;

    /* access modifiers changed from: package-private */
    /* renamed from: uh9$a */
    public static class a extends di9.d.a {
        private ane a;
        private Integer b;
        private Boolean c;

        a() {
        }

        @Override // defpackage.di9.d.a
        public di9.d a() {
            String str = this.a == null ? " sortOrder" : "";
            if (this.b == null) {
                str = je.x0(str, " titleResourceId");
            }
            if (this.c == null) {
                str = je.x0(str, " isReversible");
            }
            if (str.isEmpty()) {
                return new ci9(this.a, this.b.intValue(), this.c.booleanValue());
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.di9.d.a
        public di9.d.a b(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.di9.d.a
        public di9.d.a c(ane ane) {
            this.a = ane;
            return this;
        }

        @Override // defpackage.di9.d.a
        public di9.d.a d(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }
    }

    uh9(ane ane, int i, boolean z) {
        if (ane != null) {
            this.a = ane;
            this.b = i;
            this.c = z;
            return;
        }
        throw new NullPointerException("Null sortOrder");
    }

    @Override // defpackage.di9.d
    public boolean b() {
        return this.c;
    }

    @Override // defpackage.di9.d
    public ane c() {
        return this.a;
    }

    @Override // defpackage.di9.d
    public int e() {
        return this.b;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof di9.d)) {
            return false;
        }
        di9.d dVar = (di9.d) obj;
        if (this.a.equals(dVar.c()) && this.b == dVar.e() && this.c == dVar.b()) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (this.c ? 1231 : 1237);
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("SortItem{sortOrder=");
        V0.append(this.a);
        V0.append(", titleResourceId=");
        V0.append(this.b);
        V0.append(", isReversible=");
        return je.P0(V0, this.c, "}");
    }
}

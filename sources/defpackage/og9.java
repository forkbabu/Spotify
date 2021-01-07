package defpackage;

import defpackage.rg9;

/* renamed from: og9  reason: default package */
final class og9 extends rg9.b {
    private final int a;
    private final int b;
    private final int c;

    og9(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.rg9.b
    public int a() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.rg9.b
    public int b() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.rg9.b
    public int c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rg9.b)) {
            return false;
        }
        rg9.b bVar = (rg9.b) obj;
        if (this.a == bVar.b() && this.b == bVar.c() && this.c == bVar.a()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public String toString() {
        StringBuilder V0 = je.V0("RenderModel{backgroundColor=");
        V0.append(this.a);
        V0.append(", textColor=");
        V0.append(this.b);
        V0.append(", arrowsColor=");
        return je.B0(V0, this.c, "}");
    }
}

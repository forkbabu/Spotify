package defpackage;

import defpackage.qg9;

/* access modifiers changed from: package-private */
/* renamed from: ng9  reason: default package */
public final class ng9 extends qg9.c {
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final int e;

    ng9(boolean z, boolean z2, boolean z3, int i) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = i;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.qg9.c
    public boolean b() {
        return this.d;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.qg9.c
    public boolean c() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.qg9.c
    public int d() {
        return this.e;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.qg9.c
    public boolean e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qg9.c)) {
            return false;
        }
        qg9.c cVar = (qg9.c) obj;
        if (this.b == cVar.e() && this.c == cVar.c() && this.d == cVar.b() && this.e == cVar.d()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 1231;
        int i2 = ((((this.b ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003;
        if (!this.d) {
            i = 1237;
        }
        return ((i2 ^ i) * 1000003) ^ this.e;
    }

    public String toString() {
        StringBuilder V0 = je.V0("UpdateModel{shouldApply=");
        V0.append(this.b);
        V0.append(", hasValidSortOption=");
        V0.append(this.c);
        V0.append(", hasValidNumberOfPages=");
        V0.append(this.d);
        V0.append(", numberOfIgnoredItems=");
        return je.B0(V0, this.e, "}");
    }
}

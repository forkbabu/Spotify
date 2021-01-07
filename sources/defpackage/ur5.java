package defpackage;

import defpackage.as5;

/* renamed from: ur5  reason: default package */
final class ur5 extends as5.a {
    private final boolean a;
    private final boolean b;
    private final boolean c;

    ur5(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.as5.a
    public boolean a() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.as5.a
    public boolean b() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.as5.a
    public boolean c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof as5.a)) {
            return false;
        }
        as5.a aVar = (as5.a) obj;
        if (this.a == aVar.b() && this.b == aVar.a() && this.c == aVar.c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 1231;
        int i2 = ((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003;
        if (!this.c) {
            i = 1237;
        }
        return i2 ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("BannersState{startTripActive=");
        V0.append(this.a);
        V0.append(", activeSessionActive=");
        V0.append(this.b);
        V0.append(", wazeNavigationActive=");
        return je.P0(V0, this.c, "}");
    }
}

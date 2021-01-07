package com.spotify.libs.onboarding.allboarding.flow;

public final class l {
    private final boolean a;
    private final boolean b;

    public l(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public static l a(l lVar, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = lVar.a;
        }
        if ((i & 2) != 0) {
            z2 = lVar.b;
        }
        return new l(z, z2);
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.a == lVar.a && this.b == lVar.b;
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
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        return i5 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ViewState(isLoading=");
        V0.append(this.a);
        V0.append(", error=");
        return je.P0(V0, this.b, ")");
    }

    public l() {
        this(true, false);
    }
}
